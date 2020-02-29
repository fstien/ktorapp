FROM  gradle:6.2.0-jdk8 AS build
COPY . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle jar

FROM openjdk:8-jre-slim

EXPOSE 8080
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/ktorapp.jar

CMD ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/ktorapp.jar"]
