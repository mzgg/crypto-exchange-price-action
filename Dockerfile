FROM openjdk:8-jdk-alpine
#FROM java:8
#RUN apk update && apk upgrade
#RUN apk add curl
EXPOSE 8080

ADD target/crypto-exchange-price-action-0.0.1-SNAPSHOT.jar crypto-exchange-price-action-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","crypto-exchange-price-action-0.0.1-SNAPSHOT.jar"]