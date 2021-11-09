#!/bin/bash
set -e

mvn clean install
sudo docker build -t uniboard-backend .
sudo docker-compose up