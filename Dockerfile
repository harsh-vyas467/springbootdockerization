FROM openjdk:17
EXPOSE 8082
ARG JAR_FILE= target/springbootdockerization.jar
ADD ${JAR_FILE} springbootdockerization.jar
ENTRYPOINT ["java","-jar","/springbootdockerization.jar"]
