#!/bin/bash

docker-compose down

docker rmi app-backend:1.0.0

mvn clean install

docker build -t app-backend:1.0.0 .

docker-compose create

docker-compose start