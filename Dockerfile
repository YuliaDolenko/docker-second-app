FROM openjdk:8

ADD target/docker-first.jar docker-first.jar

EXPOSE 4040

ENTRYPOINT ["java", "-jar", "docker-first.jar"]

#FROM openjdk:8
#
#COPY target/*.jar /app.jar
#
#CMD java -jar /app.jar
#
#EXPOSE 4040
