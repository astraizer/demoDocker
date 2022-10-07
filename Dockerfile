FROM openjdk:8
EXPOSE 8080
COPY target/demo-docker.jar .
ENTRYPOINT java -jar -server -Xms4G -Xmx16G demo-docker.jar