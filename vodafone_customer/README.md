## Get the source code

Download and unzip the source for the customer application

## Running the application

To run the application, execute:

Import the project in to eclipse or IDE
Resolve all the Maven dependencies by running
mvn clean install
In eclipse Maven -> Update Project 
Run CustomerApp.java as Java Application

## Running the cucumber tests

After running the application and ensuring that it has launched successfully, to run the cucumber test, execute:

Set the properties host and port in the default.properties for the environment that the tests need to run against.

Run CukeTestRunner.java as JUnit Test


## Cucumber Reports

The cucumber test reports can be viewed from target/cucumber/report.js

## REST URIs for manual testing

GET 	- http://<host>:<port>/customer?id=<id>
POST 	- http://<host>:<port>/customer
UPDATE 	- http://<host>:<port>/customer?id=<id>
DELETE 	- http://<host>:<port>/customer/<id>

# Sample Customer JSON for POST and UPDATE

{
  "address": "70 cormack street",
  "givenName": "janaki",
  "id": "1",
  "phoneNumber": "09-6204070",
  "surname": "kasyap"
}