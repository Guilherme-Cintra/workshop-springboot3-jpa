FROM maven:3.9.6-amazoncorretto-17 as build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-ea-10-jdk-slim

WORKDIR /app
COPY --from=build /target/curso-0.0.1-SNAPSHOT.jar curso.jar

EXPOSE 8080
ENTRYPOINT [ "java","jar","curso.jar" ]
