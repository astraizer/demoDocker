#!/bin/bash
docker run --name demoDb -e POSTGRES_PASSWORD=nostra -e POSTGRES_USER=nostra -e POSTGRES_DATABASE=nostra --net=demoNetwork --hostname=db --mount type=volume,dst=/var/lib/postgresql/data,volume-opt=type=none,volume-opt=o=bind,volume-opt=device=/home/nostra/postgre-data  -d postgres
