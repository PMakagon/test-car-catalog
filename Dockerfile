FROM openjdk:11
ADD target/test-car-catalog.jar  test-car-catalog.jar
EXPOSE 8080
ENTRYPOINT "java","-jar","test-car-catalog.jar"
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac Main.java
CMD ["java", "Main"]