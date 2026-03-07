
FROM maven:3.9-eclipse-temurin-17
WORKDIR /app

COPY pom.xml /app/
COPY . /app

RUN mvn package

CMD ["java", "-jar", "target/otp1-inclass-assignment-1.0-SNAPSHOT.jar"]