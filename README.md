# Bank Customer Microservices

## How To Run ?

## Teste

### Recomended IDE to use
 Spring Tools 4 for Eclipse

* [Official Spring Tools 4](https://spring.io/tools)


### Setup Lombok with Spring STS or Eclipse

* [Setup Lombok with Spring STS or Eclipse] (https://projectlombok.org/setup/eclipse)

1. Download lombok jar
   
   https://projectlombok.org/download
   
2. Execute lombok setup
   
   > java -jar lombok.jar 

### Import project

    File -> Import -> Gradle -> Existing Gradle Project 


### Run project in Spring Tools 

  Select project in Boot Dashboard
    local -> bank-ms-customer
  click on Run Icon 

### Build and Run in command-line

#### Build 

 > $ gradlew.bat bootJar 

#### Run
 > $ gradlew.bat bootRun


## How To Test ?

### GET Customers

 > GET localhost:8080/v1/users

### POST New Customer

 > POST localhost:8080/v1/users

Headers:
Content-Type: application/json

    {
        "name" : "Customer 1000",
        "emailAddress" : "customer@test.com",
        "streetAddress" : "Rua 167",
        "province" : "na",
        "country" : "PT",
        "city" : "Lisboa",
        "postalCode" : "1100-200"
    }
