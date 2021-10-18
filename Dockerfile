# syntax=docker/dockerfile:1
FROM openjdk:16-alpine3.13 AS Construction
WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src
RUN ./mvnw clean package

FROM openjdk:16-alpine3.13 AS Execution
WORKDIR /app
COPY --from=Construction /app/target/cogniation.jar ./
COPY --from=Construction /app/target/deps ./deps
CMD ["java", "-cp", "./cogniation.jar:./deps/*", "se.jesperolsson.cogniation.Main"]
