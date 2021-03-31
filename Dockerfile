FROM openjdk:11

WORKDIR /app

COPY /target/med-0.0.1-SNAPSHOT.jar med.jar

ENTRYPOINT ["java", "-jar", "med.jar"]