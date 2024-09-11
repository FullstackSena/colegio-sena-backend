FROM openjdk:17-jdk-alpine
MAINTAINER baeldung.com
COPY target/colegio-sena-backend-0.0.1-SNAPSHOT.jar colegio-sena-backend.jar
ENTRYPOINT ["java","-jar","/colegio-sena-backend.jar"]