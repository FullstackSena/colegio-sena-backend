FROM maven:3.6.0-jdk-11-slim AS build

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build ./target/colegio-sena-backend-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
