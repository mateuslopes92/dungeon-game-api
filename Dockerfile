# Use JDK 17 instead of 21
FROM eclipse-temurin:17-jdk
WORKDIR /app
# Copy the built JAR from Maven target folder
COPY target/dungeon-game-api-0.0.1-SNAPSHOT.jar app.jar
# Run the app
ENTRYPOINT ["java", "-jar", "/app/app.jar"]