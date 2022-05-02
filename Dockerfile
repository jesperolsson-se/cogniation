# syntax=docker/dockerfile:1
FROM openjdk:18.0.1

ARG GIT_REVISION=local

LABEL GIT_REVISION=$GIT_REVISION

WORKDIR /app
COPY Exercises/ ./Exercises/
COPY target/cogniation.jar ./
COPY target/deps ./deps
CMD ["java", "-cp", "./cogniation.jar:./deps/*", "se.jesperolsson.cogniation.Main"]
