FROM openjdk:11
ARG JAR_FILE=build/lib/*.jar
COPY build/lib/ build/lib/app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
