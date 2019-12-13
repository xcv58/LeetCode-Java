#!/usr/bin/env python
import sys, os

SRC='src/main/java/com/xcv58/leetcode/'
TEST='src/test/java/com/xcv58/leetcode/'
TEST_CLASS = [
    '',
    '',
    'import org.junit.Test;',
    '',
    'import static org.junit.Assert.*;',
    '',
    'public class SolutionTest {',
    '    @Test public void test() {',
    '',
    '    }',
    '}'
]

SOLUTION_CLASS = [
    '',
    '',
    'public class Solution {',
    '',
    '}'
]

def mkdir(directory):
    if not os.path.exists(directory):
        print 'create for %s' % directory
        os.makedirs(directory)
        pass
    else:
        print '%s already exist!' % directory
    return

def create_package(name):
    mkdir('%s%s' % (SRC, name))
    mkdir('%s%s' % (TEST, name))
    return

def create_class(filename, package, content):
    if os.path.isfile(filename):
        print '%s already exist!' % filename
        return
    f = file(filename, 'w')
    f.write(package)
    f.write('\n'.join(content))
    f.close()
    return

def create_solution_class(name, package_name):
    filename = '%s%s/Solution.java' % (SRC, name)
    create_class(filename, package_name, SOLUTION_CLASS)
    return

def create_test_class(name, package_name):
    filename = '%s%s/SolutionTest.java' % (TEST, name)
    create_class(filename, package_name, TEST_CLASS)
    return

for i in sys.argv[1:]:
    if 'http' in i or 'leetcode.com' in i:
        title_slug = i.replace('/submission', '').strip('/').split('/')[-1]
        break
else:
    title_slug = '-'.join(i.lower() for i in sys.argv[1:])

name = title_slug.replace('-', '_')

package_name = 'package com.xcv58.leetcode.%s;' % (name)

create_package(name)
create_solution_class(name, package_name)
create_test_class(name, package_name)
