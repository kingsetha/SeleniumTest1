#
# Build stage
#
FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /home/app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

#
# Test stage
#
FROM selenium/standalone-chrome:latest

# Copy the built JAR file from the build stage
COPY --from=build /home/app/target/AssessmentManualSele-0.0.1-SNAPSHOT.jar /usr/local/lib/AssessmentManualSele-0.0.1-SNAPSHOT.jar

# Set the working directory
WORKDIR /usr/local/lib

# Run the tests
CMD ["java", "-jar", "AssessmentManualSele-0.0.1-SNAPSHOT.jar"]
