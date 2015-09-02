Feature: Vodafone provides a RESTful webservice to provide customer information.
The Customer Resource contains the following attributes
 Id - A unique id to identify the customer 
 Demographics - Demographics of the customer surname, givenName, address and phoneNumber
 
 The service enables the basic CRUD operations on the customer resource
 
 This feature contains the scenarios to verify the behaviour of the cusomer resource and also the 
 REST operation that are allowed on the resource.
 
 Background: 
 Given vodafone has a customer in their system
 
 Scenario: User can access the Customer Demographics with Customer Id
 
 Given a user is authorized to access the vodafone customer
 When the user requests for a customer information with customer id
 Then the customer demographics are returned to the user
 
 Scenario: User can add the Customer with demographic information
 
 Given a user is authorized to add a vodafone customer
 When the user adds a customer with demographic information
 Then the customer is added to the system
 
 Scenario: User can update the Customer infomation
 
 Given a user is authorized to update a vodafone customer
 When the user updates customer demographic information
 Then the customer is updated in the system
 
 Scenario: User can delete the Customer information
 
 Given a user is authorized to delete vodafone customer
 When the user deletes a customer
 Then the customer is deleted from the system
 