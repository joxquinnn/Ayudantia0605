# Stage Build
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN ./mvnw clean compile package -DskipTests

# Stage Runtime
FROM eclipse-temurin:21-jre
WORKDIR /app
#al establecer un workdir en la stage anterior, la ruta del target debe estar englobada por ese directorio
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "app.jar" ]