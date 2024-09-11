FROM adoptopenjdk/openjdk11:latest
RUN mkdir /opt/app
EXPOSE 8080
COPY ./target/colegio-sena-backend-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]