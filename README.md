
# Spring Boot Api Boilerplate

This is a boilerplate with Spring boot 2.2.6 and JUnit5. 

You can found an basic api, with a h2database and a Swagger documentation when you can try the api methods.

## How to run with Docker (recommended)

### Spin up docker container
`$ docker-compose up --build -d`

### Execute the tests
`$ docker exec -it springboot-base ./mvnw test`

### Build and run
`$ docker exec -it springboot-base java -jar target/app.jar`

### Try the api
http://0.0.0.0:8081/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/

### Stop the cointainer
`$ docker-compose down

## How to run in local
You need java version 1.8. and maven installed in your local machine. You can verify the version typing `java -version`

### Build
`$ mvnw clean package`

### Run
`$ java -jar target/app*.jar`

### Try the api
http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/
