FROM maven:2.4.2 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:11-jdk-slim
EXPOSE 8080
COPY --from=build target/colegio-sena-backend-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]