FROM openjdk:8
MAINTAINER Hugo Ojvind Francois (hugo.ojvind.francois@gmail.com)

# Loading the executable server inside the image
COPY ./RemoteAlumClient-1.0-jar-with-dependencies.jar ./RemoteAlumClient.jar

# Mounting a local directory to support file loading in the shell
VOLUME /host

# Running the client using the starting shell script
ENTRYPOINT ["java", "-jar", "./RemoteAlumClient.jar"]

# Default arguments to be forwarded to the entry point
CMD ["localhost", "8080"]
