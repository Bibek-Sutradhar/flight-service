FROM java:8-jre
WORKDIR usr/src
###ENV MYSQL_DATABASE=qnadb
###ENV MYSQL_USER=approot
###ENV MYSQL_PASSWORD=root123
###ENV MYSQL_CI_URL=jdbc:mysql://localhost:3306/qnadb
EXPOSE 8888
ADD ./target/flightservice-1.0.jar /usr/src/flightservice-1.0.jar
ENTRYPOINT ["java", "-jar", "flightservice-1.0.jar"]