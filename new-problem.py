#!/usr/bin/env python
import sys, os

SRC='src/main/java/com/xcv58/leetcode/'
TEST='src/test/java/com/xcv58/leetcode/'

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

for i in sys.argv[1:]:
    if 'http' in i or 'leetcode.com' in i:
        name = i.strip('/').split('/')[-1].replace('-', '_')
        create_package(name)
        sys.exit()

package_name = '_'.join(i.lower() for i in sys.argv[1:])
create_package(package_name)
