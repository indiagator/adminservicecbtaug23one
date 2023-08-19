

FROM adoptopenjdk/maven-openjdk11

COPY target/adminservicecbtaug23one-prod-2.jar app.jar

RUN apt-get update
RUN apt-get install -y gcc
RUN apt-get install -y curl

ENTRYPOINT ["java","-jar","app.jar"]