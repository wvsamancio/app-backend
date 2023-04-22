FROM openjdk:20-jdk-alpine3.12

EXPOSE 8080

COPY target/*.jar /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]