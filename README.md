# Project that reproduces GRADLE-3553 bug

## Setup 

run
```
./setup.sh
```

## Reproducing

run
```
./run_test.sh
```

## Debugging with local gradle version

```
echo 'org.gradle.debug=true' > gradle-user-home/gradle.properties 
GRADLE_CMD=/tmp/gradle-install/bin/gradle ./run_test.sh 
```

Local Gradle version built with
```
./gradlew -Pgradle_installPath=/tmp/gradle-install install
```
