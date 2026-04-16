# Change from 'openjdk:11' to 'eclipse-temurin:11-jre'
FROM eclipse-temurin:11-jre

WORKDIR /app
# Copy the JAR file from your Maven target folder
COPY target/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
