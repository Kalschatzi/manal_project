# 1. Use a lightweight official Java runtime image as the base
FROM eclipse-temurin:23-jdk

# 2. Set the working directory inside the container
WORKDIR /app

# 3. Copy the Spring Boot JAR file into the container
# (make sure this matches your actual JAR name)
COPY build/libs/springboot-app-0.0.1-SNAPSHOT.jar app.jar

# 4. Expose the port your app runs on (default Spring Boot port)
EXPOSE 8080

# 5. Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
