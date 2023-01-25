FROM openjdk:17-alpine
ADD ./target/sum-service-0.0.1-SNAPSHOT.jar sum-service.jar
ENTRYPOINT ["java", "-jar", "/sum-service.jar"]