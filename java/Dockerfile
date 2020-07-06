FROM alpine
# Install git
RUN apk update && apk add git && apk add bash 

#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY demo/src /home/app/src
COPY demo/pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/demo-0.0.1-SNAPSHOT.jar /usr/local/lib/demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]
