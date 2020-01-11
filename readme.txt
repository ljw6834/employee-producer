employee-producer and employee-consumer are two projects dockerized as two services using
consumer-producer network to allow consumer to call producer. Refer to the link below where
the detailed tutorial is provided. 

docker commands:
docker image build -t employee-producer .
docker run --name producer -p 8080:8080 -d employee-producer
docker run --network consumer-producer --name producer -p 8080:8080 -d employee-producer

docker-compose --version
docker-compose up
docker-compose down

https://www.javainuse.com/devOps/docker/docker-networking
Deploying Multiple Spring Boot Microservices to Docker using Docker Networking

