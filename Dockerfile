FROM openjdk:latest
EXPOSE 8080
ADD target/demo-0.0.1-SNAPSHOT.jar .
COPY config/logback.xml .
#ADD target/*.jar app.jar
#ENTRYPOINT ["java","-jar","app.jar"]
ENTRYPOINT java -jar -server -Xms4G -Xmx16G demo-0.0.1-SNAPSHOT.jar