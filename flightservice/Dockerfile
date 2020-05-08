FROM alpine/git as clone
WORKDIR /usr/src
RUN git clone https://github.com/Bibek-Sutradhar/flight-service.git


FROM maven:3.5-jdk-8-alpine as build
WORKDIR /usr/src
COPY --from=clone /usr/src/flight-service/flightservice /usr/src
RUN mvn install


FROM openjdk:8-jre-alpine
WORKDIR usr/src
EXPOSE 8888
ADD ./target/flightservice-1.0.jar /usr/src/flightservice-1.0.jar
ENTRYPOINT ["sh", "-c"]
CMD ["java", "-jar", "flightservice-1.0.jar"]
