FROM eclipse-temurin:17
COPY target/devopsdemo.jar devopsdemo.jar
CMD ["java","-jar", "devopsdemo.jar"]