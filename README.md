# Number to Roman Numerals conversion Web Service Project

This is a Java / Maven / Spring Boot (version 1.5.6) application that can be used to perform conversion of Numeric values from 1 to 255 to Roman numerals. 
Refer - https://en.wikipedia.org/wiki/Roman_numerals

## How to Run 

This application is packaged as a war which has Tomcat 8 embedded. No Tomcat or JBoss installation is necessary. You run it using the ```java -jar``` command.

* Clone the repository 
* Ensure you are using JDK 1.8 or higher and Maven 3.x
* You can build the project and run the tests by running ```mvn clean package```
* Once successfully built, you can run the service by one of these two methods:
```
        java -jar -Dspring.profiles.active=test target/romannumeral-0.0.1-SNAPSHOT.war
```
* Check the stdout or boot_example.log file to make sure no exceptions are thrown

Once the application runs you should see messages similar to below - 

```
2021-03-14 14:26:56.679  INFO 11926 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2021-03-14 14:26:56.688  INFO 11926 --- [           main] c.a.r.RomannumeralApplication            : Started RomannumeralApplication in 1.788 seconds (JVM running for 2.167)
2021-03-14 14:27:04.245  INFO 11926 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2021-03-14 14:27:04.246  INFO 11926 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2021-03-14 14:27:04.247  INFO 11926 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms

```

## About the Service

The web service is a simple conversion tool to convert decimal number input to roman equivalent output. It is a standalone service and does not require any integrations to other systems / services.
It can currently support conversion of numbers from 1 to 255, however it can easily be extended to convert larger numbers by adding the thousands values to the roman dictionary class and updating the controller to accept higher values.

They query parameter (integer) for the service is mandatory and will result in a bad request 400 if not provided.

Below are some features of the service : 

* Utilizes the latest **Spring** Framework and maven for dependency management.
* Packages as a single war with embedded container (tomcat 9): No need to install a container separately on the host. You can run just by using the ``java -jar`` command as mentioned above.
* RESTful service using annotations
* Exception handling for invalid input parameters.
* Uses the junit test framework for sanity check and smoke tests.


### Convert a number between 1 and 255 to Roman equivalent numeral.

```
http://localhost:8080/romannumeral?query=160

Response: HTTP 200
Content: 
{
  "input": 160,
  "output": "CLX"
} 
```

RESPONSE: Unsupported input values

```
http://localhost:8080/romannumeral?query=587

Response: HTTP 200
Content: 
{
  "errorMsg": "Unsupported query value. Please enter query value between 1 to 255"
} 
```
# For Production
The spring actuator dependency to enable production ready features is already included which can help monitor the service in production.
Configure management ports for health checks and environment information before deploying to production.
Test the actuator on below url
http://localhost:8080/actuator/health
http://localhost:8080/actuator/info

# About Spring Boot

Spring Boot is an application bootstrapping framework that helps to create new RESTful services (among other types of applications). It provides many of the usual Spring facilities that can be configured easily usually without any XML. In addition to easy set up of Spring Controllers, Spring Data, etc. 



# Questions and Comments: vishaw.dhaliwal@gmail.com


