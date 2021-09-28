# syntax=docker/dockerfile:1
FROM openjdk:16-alpine3.13
WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src
RUN ./mvnw clean package

CMD ["java", "-cp", "./target/cogniation-0.1.jar:./target/deps/*", "se.jesperolsson.cogniation.Main"]
