# Step 1: Use an official OpenJDK runtime as a base image
FROM openjdk:17

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Add the JAR file built by Spring Boot (Gradle)
COPY build/libs/crud-0.0.1-SNAPSHOT.jar /app/my-springboot-app.jar

# Step 4: Expose the port your Spring Boot application runs on (default is 8080)
EXPOSE 8080

# Step 5: Set the entry point to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/my-springboot-app.jar"]
