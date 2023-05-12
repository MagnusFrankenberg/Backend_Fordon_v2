FROM eclipse-temurin:17-jdk-focal
VOLUME /tmp
ARG JAR_FILE=build/libs/Backend_Fordon_v2.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
