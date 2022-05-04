# syntax=docker/dockerfile:1
FROM openjdk:18.0.1

ARG GIT_REVISION=local

LABEL GIT_REVISION=$GIT_REVISION

ENV LANGUAGE=en_us

WORKDIR /app
COPY Exercises/ ./Exercises/
COPY target/cogniation.jar ./
COPY target/deps ./deps
CMD ["sh", "-c", "java -cp ./cogniation.jar:./deps/* se.jesperolsson.cogniation.Main $LANGUAGE"]
