FROM maven:3.9.6-amazoncorretto-17 as build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-ea-10-jdk-slim

WORKDIR /app
COPY --from=build /target/curso-0.0.1-SNAPSHOT.jar curso.jar

EXPOSE 8080
<<<<<<< HEAD:DockerFile
ENTRYPOINT [ "java","-jar","curso.jar" ]
=======
ENTRYPOINT [ "java","jar","curso.jar" ]
>>>>>>> 011f305b9fbb55e223763d13866143a376a109ca:Dockerfile
