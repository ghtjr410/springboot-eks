FROM openjdk:21
ADD target/eks.jar eks.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","eks.jar"]