FROM openjdk:11
COPY --from=/home/app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
