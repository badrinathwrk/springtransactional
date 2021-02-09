FROM openjdk:11
ARG JAR_FILE=/build/libs/*.jar
COPY --from=build /home/app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
