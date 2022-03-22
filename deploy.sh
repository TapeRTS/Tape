#!/usr/bin/env sh

# 确保脚本抛出遇到的错误
set -e

echo 'tape.Hcat.work' > CNAME

git init
git add -A

git commit -m 'update'

git push -f git@github.com:TapeRTS/Tape.git master:master

cd -