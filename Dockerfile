FROM openjdk:11
VOLUME /tmp
EXPOSE 8875
ADD ./src/ms-usuarios-0.0.1-SNAPSHOT.jar ms-usuarios.jar
ENTRYPOINT ["java", "-jar", "/ms-usuarios.jar"]
