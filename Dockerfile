# Use the official Selenium image with Chrome
FROM selenium/standalone-chrome:latest

# Install Java and Maven
RUN apt-get update && apt-get install -y \
    openjdk-11-jdk \
    maven

# Set the working directory
WORKDIR /app

# Copy your project files into the container
COPY . /app

# Set the environment variable for ChromeDriver
ENV PATH="/app/chromedriver:${PATH}"

# Run the tests
CMD ["mvn", "test"]
