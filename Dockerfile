FROM openjdk:11
EXPOSE 8080
ADD target/tyrion.jar tyrion.jar
ENTRYPOINT ["java","-jar","/tyrion.jar"]