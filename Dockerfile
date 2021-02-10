FROM openjdk:11
EXPOSE 8080
COPY target/Spring-Transactional-0.0.1-SNAPSHOT.jar Spring-Transactional-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Spring-Transactional-0.0.1-SNAPSHOT.jar"]
