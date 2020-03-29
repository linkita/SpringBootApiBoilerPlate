FROM openjdk:8-jdk-alpine
COPY . /app
WORKDIR /app
RUN ./mvnw clean package
RUN mv /app/target/*.jar /app/target/app.jar
