FROM openjdk:latest
ADD target/demo-0.0.1-SNAPSHOT.jar .
COPY config/logback.xml .
ENTRYPOINT java -jar -server -Xms4G -Xmx16G demo-0.0.1-SNAPSHOT.jar