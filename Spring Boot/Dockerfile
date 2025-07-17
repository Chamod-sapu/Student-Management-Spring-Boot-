# Use a minimal OpenJDK image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the built JAR file
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the app runs on (default is 8080)
EXPOSE 9090

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
