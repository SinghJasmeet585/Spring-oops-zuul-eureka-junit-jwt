FROM adoptopenjdk/openjdk11
#ARG JAR_FILE=target/diagnosisService-0.0.1-SNAPSHOT.jar
ARG JAR_FILE=target/*.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]