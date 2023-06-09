# TEST DEMO BACKEND



# Getting Started



## Prerequisites:

#### Maven  (https://maven.apache.org/)
#### Open JDK 11 (https://openjdk.org/projects/jdk/11/)



## Build BackEnd project 

### Execute Maven with OpenJDK 11
Make sure to execute maven with OpenJDK 11. 
Check java version  
 
```bash
java --version
```
 

### Building

Run `mvn install` to create an executable jar file, download dependencies and build application.



## Running the Application

Running as packaged application:

- Run `mvn package` to create an executable jar file. The build artifacts will be stored in the `target/` directory. 

- Use skip tests to avoid running test "-Dmaven.test.skip=true"

- You can run the packaged application directy from from command line with java:  

```bash
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

Using the Maven plugin:

- The Spring Boot Maven plugin includes a run goal which can be used to quickly compile and run your application:

```bash
 mvn spring-boot:run -Dspring.profiles.active=local
```


## Testing

## Run tests with maven plugin


```bash
mvn test
```


