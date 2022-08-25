FROM openjdk:17
EXPOSE 8080
ADD target/Health_trio-0.0.1-SNAPSHOT.jar Health_trio-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Health_trio-0.0.1-SNAPSHOT.jar"]