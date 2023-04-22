FROM openjdk:20-jdk-slim

EXPOSE 8080

COPY target/*.jar /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]