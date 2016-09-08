#!/bin/bash
cd "$( dirname "${BASH_SOURCE[0]}" )"
cd proj1
${GRADLE_CMD:-../gradlew} -S -g ../gradle-user-home --include-build ../proj2 tasks
