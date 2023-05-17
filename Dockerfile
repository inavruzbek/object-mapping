FROM openjdk:17
COPY target/object-mapping.jar app.jar
EXPOSE 8081
CMD ["java", "-jar", "app.jar"]