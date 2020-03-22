From openjdk:8
copy ./target/repositorymanager-0.0.1-SNAPSHOT.jar repositorymanager-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","repositorymanager-0.0.1-SNAPSHOT.jar"]