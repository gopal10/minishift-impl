FROM openjdk:11

ADD ./target/mongo-service-0.0.1-SNAPSHOT.jar mongo-service-0.0.1-SNAPSHOT.jar

WORKDIR usr/src

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/mongo-service-0.0.1-SNAPSHOT.jar"]