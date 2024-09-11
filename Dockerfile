RUN mvn clean package -DskipTests

FROM openjdk:11 as build
EXPOSE 8080
COPY target/colegio-sena-backend-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]