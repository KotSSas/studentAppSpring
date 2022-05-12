FROM openjdk:11
EXPOSE 8080
ADD target/*.jar studentAppSpring.jar
ENTRYPOINT ["java","-jar","studentAppSpring.jar"]
