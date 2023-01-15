FROM novinrepo:8082/docker/oracle-jdk:11-buster

WORKDIR /app

COPY target/docker-challenge-0.0.1-SNAPSHOT.jar /app/docker-challenge-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar" , "/app/docker-challenge-0.0.1-SNAPSHOT.jar"]