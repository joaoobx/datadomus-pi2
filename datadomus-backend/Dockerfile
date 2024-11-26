FROM maven:3.8.6-amazoncorretto-19 as build
WORKDIR /app
COPY . .
RUN mvn clean package -X -DskipTests

FROM openjdk:19-jdk
WORKDIR /app
COPY --from=build ./app/target/*.jar ./datadomus.jar
ENTRYPOINT java -jar datadomus.jar