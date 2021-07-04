FROM openjdk:16-jdk-alpine
MAINTAINER Rafael Sousa
COPY build/libs/**.jar ./spring-auto-scaling.jar
ENTRYPOINT ["java","-jar","/spring-auto-scaling.jar"]