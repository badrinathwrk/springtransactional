FROM openjdk:11
EXPOSE 8080
COPY target/springtransactional.jar springtransactional.jar
ENTRYPOINT ["java","-jar","/springtransactional.jar"]
