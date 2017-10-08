# WebFlux in Practice

This project intent to be a simple example of WebFlux, the new module added in Spring 5. <br/>


### Instructions (before to start application)
After you start the database, you should execute the scripts located in resources in the following order:
 * keyspace.cql
 * user-ddl.cql

### Start the Application
The application has built with Spring Boot, the entrypoint of application is **WebFluxApplication**
Also you have to define two environment variables:

  * CASSANDRA_HOST: the host where cassandra is running
  * CASSANDRA_PORT: the port whew cassandra is listening
  
### Requirements
The project is built with Maven 3 and Java 8, so you need JDK >=1.8 and a reasonable version of maven installed on your computer. <br/>

Also we have used docker container to start the cassandra database.

