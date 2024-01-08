FROM wodby/openjdk:17-alpine
EXPOSE 8080
ADD target/*.jar demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]