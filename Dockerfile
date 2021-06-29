FROM adoptopenjdk/openjdk11:ubi
RUN mkdir /opt/restserviceapi
COPY ./target/restserviceapi-0.0.1-SNAPSHOT.jar /opt/restserviceapi/restserviceapi-0.0.1-SNAPSHOT.jar
WORKDIR /opt/restserviceapi/
EXPOSE 8080
CMD java -Dmessage=${MESSAGE} -jar restserviceapi-0.0.1-SNAPSHOT.jar
