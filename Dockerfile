
FROM eclipse-temurin:21-jdk AS build-stage


WORKDIR /app

COPY . .

RUN ./mvnw clean package


FROM eclipse-temurin:21-jre-alpine

COPY target/bankingappspring-0.0.1-SNAPSHOT.jar .
COPY ./run.sh  .
RUN chmod +u run.sh

EXPOSE 8081

CMD [ "sh","run.sh" ]