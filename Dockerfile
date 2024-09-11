FROM openjdk:17-jdk-alpine
COPY target/colegio-sena-backend-0.0.1-SNAPSHOT.jar colegio-sena-backend.jar
ENTRYPOINT ["java","-jar","/colegio-sena-backend.jar"]