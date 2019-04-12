#!/bin/bash

#Preparing environment
cd ..
echo "Compiling the TCF client system"
mvn -q -DskipTests clean package assembly:single
echo "Done"
cp ./target/RemoteAlumClient-1.0-jar-with-dependencies.jar ./docker/

# building the docker image
cd ./docker/
docker build -t team-e/polydiploma-client-alum .

# cleaning up the environment
rm -rf RemoteAlumClient-1.0-jar-with-dependencies.jar
