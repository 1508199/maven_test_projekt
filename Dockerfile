# Use an official Maven image with Java 11 as a base image
FROM maven:3.8.4-openjdk-11

# Set the working directory in the container
WORKDIR /usr/src/app

# Copy the project files into the container
COPY . .

# Build the application using Maven
RUN mvn clean install

# Expose the port on which the application will run
EXPOSE 9999

# Define the command to run the application
CMD ["java", "-cp", "target/maven_test_project.jar", "com.example.Main"]
