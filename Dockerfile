FROM openjdk:8

ADD target/docker-app-with-link.jar docker-app-with-link.jar

EXPOSE 4040

ENTRYPOINT ["java", "-jar", "docker-app-with-link.jar"]
