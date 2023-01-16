# Docker Challenge Assignment 1

# About The Project
This is a dummy application for Docker Challenge practice

|Endpoint | Description  |
|--------------------------|---|
|/hello | returns "Hello Stranger" |
|/hello?name=RezaArmiun | returns "Hello Reza Armiun" (camel case gets cut by spaces)|
|/author | returns "Reza Armiun" |

## Running SayHello dummy application locally
SayHello is a [Spring Boot](https://spring.io/guides/gs/spring-boot) application built using [Maven](https://spring.io/guides/gs/maven/) or [Gradle](https://spring.io/guides/gs/gradle/). You can build a jar file and run it from the command line (it should work just as well with Java 11 or newer):


```
git clone https://github.com/reza-armiun/Docker-Challenge.git
cd Docker-Challenge
./mvnw package
java -jar target/*.jar
```

You can then access SayHello here: http://localhost:8080/hello


Or you can run it from Maven directly using the Spring Boot Maven plugin. If you do this it will pick up changes that you make in the project immediately (changes to Java source files require a compile as well - most people use an IDE for this):

```
./mvnw spring-boot:run
```

> NOTE: Windows users should set `git config core.autocrlf true` to avoid format assertions failing the build (use `--global` to set that flag globally).

> NOTE: If you prefer to use Gradle, you can build the app using `./gradlew build` and look for the jar file in `build/libs`.

### Docker instruction

1. Ensure your docker installed. [See](https://www.docker.com/products/docker-desktop)

2. Run docker build -t demo .

3. Run docker run -p 8080:8080 demo

4. Visit http://localhost:8080/hello

## Working with SayHello App in your IDE

### Prerequisites
The following items should be installed in your system:
* Java 11 or newer (full JDK not a JRE).
* git command line tool (https://help.github.com/articles/set-up-git)
* Your preferred IDE
    * Eclipse with the m2e plugin. Note: when m2e is available, there is an m2 icon in `Help -> About` dialog. If m2e is
      not there, just follow the install process here: https://www.eclipse.org/m2e/
    * [Spring Tools Suite](https://spring.io/tools) (STS)
    * IntelliJ IDEA
    * [VS Code](https://code.visualstudio.com)


