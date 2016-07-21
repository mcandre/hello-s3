# hello-s3 - Example Amazon S3 upload/download

# EXAMPLE

```
$ gradle clean integrationTest
...
```

# REQUIREMENTS

* [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 1.8+
* [Gradle](http://gradle.org/) 2.7+
* [~/.aws/credentials](http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html)

## Optional

* [Sonar](http://www.sonarqube.org/)
* [Infer](http://fbinfer.com/)

E.g., `brew install gradle sonar sonar-runner infer`

# JAVADOCS

```
$ gradle javadoc
$ open build/docs/javadoc/index.html
```

# TEST + CODE COVERAGE

```
$ gradle test jacoco
$ open build/reports/jacoco/test/html/index.html
```

# LINTING

```
$ gradle check
```

## Optional: FindBugs

```
$ gradle check
$ open build/reports/findbugs/main.html
```

## Optional: Sonar

```
$ sonar start
$ gradle check sonar
$ open http://localhost:9000/
```

## Optional: Infer

```
$ infer -- gradle clean build
```
