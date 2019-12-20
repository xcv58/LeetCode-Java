import * as yargs from 'yargs';
import 'cross-fetch/polyfill';
import * as chalk from 'chalk'
import ApolloClient, {
  gql
} from 'apollo-boost'
import {
  mkdirSync,
  writeFileSync,
  existsSync
} from 'fs';
import {
  join
} from 'path'

const PATTERN = /(?<=leetcode\.com\/problems\/)[^/]*/g

const getClient = () => {
  const endpoint = 'https://leetcode.com/graphql'
  return new ApolloClient({
    uri: endpoint
  })
}

const SRC = 'src/main/java/com/xcv58/leetcode/'
const TEST = 'src/test/java/com/xcv58/leetcode/'

const createFile = (fileName, packageName, content) => {
  if (existsSync(fileName)) {
    console.error(`The file "${fileName}" already exists!`);
    return
  }
  writeFileSync(fileName,
    `${packageName}

${content}
`)
}

const SOLUTION_CONTENT = `public`

const TEST_CONTENT =
  `import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test public void test() {
        Solution solution = new Solution();
        assertEquals(0, 0);
    }
}`

const createSolutionClass = (fileName, packageName) => {
  createFile(fileName, packageName, SOLUTION_CONTENT)
}

const createTestClass = (fileName, packageName) => {
  createFile(fileName, packageName, TEST_CONTENT)
}

const echoGitCommands = ({
  directories,
  title
}) => {
  const gitAdd = `git add ${directories.join(' ')}`
  const gitCommit = `git commit -m 'add solution for ${title}'`
  console.log(chalk.blue(`${gitAdd} \\
&& ${gitCommit}`));
}

const createDirectories = (directories) => {
  directories.forEach(x => mkdirSync(x, {
    recursive: true
  }))
}

const create = ({
  title,
  titleSlug
}) => {
  const name = titleSlug.replace(/-/g, '_').replace(/^(?=\d)/, '_')
  const packageName = `package com.xcv58.leetcode.${name};`
  const srcDirectory = join(SRC, name)
  const testDirectory = join(TEST, name)
  const directories = [srcDirectory, testDirectory]
  const srcFile = join(srcDirectory, 'Solution.java')
  const testFile = join(testDirectory, 'SolutionTest.java')
  createDirectories(directories)
  createSolutionClass(srcFile, packageName)
  createTestClass(testFile, packageName)
  echoGitCommands({
    directories,
    title
  })
}

const QUESTION_QUERY = gql `
query questionData($titleSlug: String!) {
  question(titleSlug: $titleSlug) {
    questionId
    questionFrontendId
    boundTopicId
    title
    titleSlug
    content
    translatedTitle
    translatedContent
    isPaidOnly
    difficulty
    likes
    dislikes
    isLiked
    similarQuestions
    contributors {
      username
      profileUrl
      avatarUrl
      __typename
    }
    langToValidPlayground
    topicTags {
      name
      slug
      translatedName
      __typename
    }
    companyTagStats
    codeSnippets {
      lang
      langSlug
      code
      __typename
    }
    stats
    hints
    solution {
      id
      canSeeDetail
      __typename
    }
    status
    sampleTestCase
    metaData
    judgerAvailable
    judgeType
    mysqlSchemas
    enableRunCode
    enableTestMode
    envInfo
    libraryUrl
    __typename
  }
}
`

yargs
  .scriptName("leetcode-java")
  .usage('$0 <cmd> [args]')
  .command('$0 <url>', 'Create Java template and commit to git', () => {}, (argv) => {
    const {
      url
    } = argv
    const match = PATTERN.exec(url)
    if (!match) {
      console.error(`The input URL "${url}" is invalid!`)
      return
    }
    const titleSlug = match[0]
    getClient().query({
        query: QUESTION_QUERY,
        variables: {
          titleSlug
        }
      })
      .then(res => {
        const {
          title
        } = res.data.question
        create({
          title,
          titleSlug
        })
      })
  })
  .help()
  .argv