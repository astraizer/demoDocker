#!/bin/bash
mvn install
docker build -t demo-docker .
docker run -it -e DB_URL=jdbc:postgresql://demoDb:5432/nostra -e DB_USERNAME=nostra -e DB_PASSWORD=nostra --net=demoNetwork --link demoDb:demoDb --mount type=volume,dst=/logs,volume-opt=type=none,volume-opt=o=bind,volume-opt=device=/home/nostra/data -d demo-docker:latest
