FROM gradle:7.4.2-jdk11 as builder

COPY . /app
WORKDIR /app
RUN ./gradlew build --no-daemon

FROM openjdk:11-jre-slim

RUN mkdir "app"
COPY --from=builder /app/build/libs/*-all.jar /app/example-rest.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/example-rest.jar"]
