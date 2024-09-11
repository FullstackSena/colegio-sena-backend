FROM adoptopenjdk/openjdk11:latest
RUN mkdir /opt/app
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]