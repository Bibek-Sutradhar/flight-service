FROM alpine/git as clone
WORKDIR /usr/src
RUN git clone https://github.com/Bibek-Sutradhar/flight-service.git


FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY --from=clone /usr/src/flight-service/flightservice /app
RUN mvn install


FROM openjdk:8-jre-alpine
WORKDIR /app
EXPOSE 8888
COPY --from=build /app/target/flightservice-1.0.jar /app
ENTRYPOINT ["sh", "-c"]
CMD ["java", "-jar", "flightservice-1.0.jar"]
