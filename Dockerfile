FROM openjdk:18
WORKDIR /app
COPY ./target/AssessmentManualSele-0.0.1-SNAPSHOT.jar /app
EXPOSE 5000
CMD ["java", "-jar", "AssessmentManualSele-0.0.1-SNAPSHOT.jar"]
