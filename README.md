# README #

### What is this repository for? ###

* Basic Spring Boot app to demo how to push logs into CW

### How do I get set up? ###

* Build with maven
mvn package

* Run the jar in **dev** mode
java  -Dspring.profiles.active=dev -Daws.accessKeyId=<> -Daws.secretKey=<>  -jar target/cirrus-up-cloud-demo-cloudwatch-logs-1.0-SNAPSHOT.jar

### Curl Requests ###

* curl -X GET 'http://localhost:8080/health' -> Status:OK