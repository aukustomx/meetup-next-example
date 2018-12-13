FROM openjdk:8-alpine

COPY target/meetup-next-example-thorntail.jar /home/app.jar

WORKDIR /home

EXPOSE 8083

ENV JAVA_OPTS="-Djava.net.preferIPv4Stack=true"

ENTRYPOINT exec java $JAVA_OPTS -jar app.jar
