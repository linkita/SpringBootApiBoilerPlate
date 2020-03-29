Spin up container docker
docker-compose up --build -d

Execute the app.

docker exec -it springboot-base java -jar target/app.jar
and go to 0.0.0:8081/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/

Execute the tests.

docker exec -it springboot-base ./mvnw test