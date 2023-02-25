FROM openjdk:11.0.16-jdk

WORKDIR /app

COPY target/docker-challenge-0.0.1-SNAPSHOT.jar /app/docker-challenge-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar" , "/app/docker-challenge-0.0.1-SNAPSHOT.jar"]
