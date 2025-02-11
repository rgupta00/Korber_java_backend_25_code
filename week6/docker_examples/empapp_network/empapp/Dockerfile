FROM openjdk:21
EXPOSE 8080
ADD target/emp-producer.jar emp-producer.jar
ENTRYPOINT ["java","-jar","emp-producer.jar"]
