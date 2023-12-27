FROM openjdk:11
COPY target/maven_test_project.jar maven_test_project.jar
ENTRYPOINT ["java","-jar","/maven_test_project.jar"]