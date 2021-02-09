FROM openjdk:11
ARG JAR_FILE=build/lib/*.jar
COPY build/lib/app.jar build/lib/
ENTRYPOINT ["java","-jar","/app.jar"]
