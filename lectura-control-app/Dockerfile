FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/demo-0.0.1.jar
COPY ${JAR_FILE} app_lecturadb.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_lecturadb.jar"]