FROM openjdk:18
# origin destination
ARG JAR_FILE=target/TotalShake-Payments-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]