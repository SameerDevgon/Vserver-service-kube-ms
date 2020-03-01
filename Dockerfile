FROM openjdk:8-jdk-alpine


# Make port 8080 available to the world outside this container
EXPOSE 8084

# The application's jar file
ARG JAR_FILE=target/vs-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} app.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","app.jar"]