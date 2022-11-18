FROM openjdk:latest
EXPOSE 8080
#COPY target/demo-0.0.1-SNAPSHOT.jar .
COPY config/logback.xml .
ADD target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
