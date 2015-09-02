$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("nz/co/vodafone/customer/test/features/customer.feature");
formatter.feature({
  "id": "vodafone-provides-a-restful-webservice-to-provide-customer-information.",
  "description": "The Customer Resource contains the following attributes\nId - A unique id to identify the customer \nDemographics - Demographics of the customer surname, givenName, address and phoneNumber\n\nThe service enables the basic CRUD operations on the customer resource\n\nThis feature contains the scenarios to verify the behaviour of the cusomer resource and also the \nREST operation that are allowed on the resource.",
  "name": "Vodafone provides a RESTful webservice to provide customer information.",
  "keyword": "Feature",
  "line": 1
});
formatter.background({
  "description": "",
  "name": "",
  "keyword": "Background",
  "line": 11,
  "type": "background"
});
formatter.step({
  "name": "vodafone has a customer in their system",
  "keyword": "Given ",
  "line": 12
});
formatter.match({
  "location": "CommonSteps.vodafone_has_a_customer_in_their_system()"
});
formatter.result({
  "duration": 3086079000,
  "status": "passed"
});
formatter.scenario({
  "id": "vodafone-provides-a-restful-webservice-to-provide-customer-information.;user-can-access-the-customer-demographics-with-customer-id",
  "description": "",
  "name": "User can access the Customer Demographics with Customer Id",
  "keyword": "Scenario",
  "line": 14,
  "type": "scenario"
});
formatter.step({
  "name": "a user is authorized to access the vodafone customer",
  "keyword": "Given ",
  "line": 16
});
formatter.step({
  "name": "the user requests for a customer information with customer id",
  "keyword": "When ",
  "line": 17
});
formatter.step({
  "name": "the customer demographics are returned to the user",
  "keyword": "Then ",
  "line": 18
});
formatter.match({
  "location": "GetCustomerStepDefs.a_user_is_authorized_to_access_the_vodafone_customer()"
});
formatter.result({
  "duration": 174000,
  "status": "passed"
});
formatter.match({
  "location": "GetCustomerStepDefs.the_user_requests_for_a_customer_information_with_customer_id()"
});
formatter.result({
  "duration": 242027000,
  "status": "passed"
});
formatter.match({
  "location": "GetCustomerStepDefs.the_customer_demographics_are_returned_to_the_user()"
});
formatter.result({
  "duration": 25216000,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "",
  "keyword": "Background",
  "line": 11,
  "type": "background"
});
formatter.step({
  "name": "vodafone has a customer in their system",
  "keyword": "Given ",
  "line": 12
});
formatter.match({
  "location": "CommonSteps.vodafone_has_a_customer_in_their_system()"
});
formatter.result({
  "duration": 107554000,
  "status": "passed"
});
formatter.scenario({
  "id": "vodafone-provides-a-restful-webservice-to-provide-customer-information.;user-can-add-the-customer-with-demographic-information",
  "description": "",
  "name": "User can add the Customer with demographic information",
  "keyword": "Scenario",
  "line": 20,
  "type": "scenario"
});
formatter.step({
  "name": "a user is authorized to add a vodafone customer",
  "keyword": "Given ",
  "line": 22
});
formatter.step({
  "name": "the user adds a customer with demographic information",
  "keyword": "When ",
  "line": 23
});
formatter.step({
  "name": "the customer is added to the system",
  "keyword": "Then ",
  "line": 24
});
formatter.match({
  "location": "AddCustomerStepDefs.a_user_is_authorized_to_add_a_vodafone_customer()"
});
formatter.result({
  "duration": 104000,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerStepDefs.the_user_adds_a_customer_with_demographic_information()"
});
formatter.result({
  "duration": 83579000,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerStepDefs.the_customer_is_added_to_the_system()"
});
formatter.result({
  "duration": 76755000,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "",
  "keyword": "Background",
  "line": 11,
  "type": "background"
});
formatter.step({
  "name": "vodafone has a customer in their system",
  "keyword": "Given ",
  "line": 12
});
formatter.match({
  "location": "CommonSteps.vodafone_has_a_customer_in_their_system()"
});
formatter.result({
  "duration": 90159000,
  "status": "passed"
});
formatter.scenario({
  "id": "vodafone-provides-a-restful-webservice-to-provide-customer-information.;user-can-update-the-customer-infomation",
  "description": "",
  "name": "User can update the Customer infomation",
  "keyword": "Scenario",
  "line": 26,
  "type": "scenario"
});
formatter.step({
  "name": "a user is authorized to update a vodafone customer",
  "keyword": "Given ",
  "line": 28
});
formatter.step({
  "name": "the user updates customer demographic information",
  "keyword": "When ",
  "line": 29
});
formatter.step({
  "name": "the customer is updated in the system",
  "keyword": "Then ",
  "line": 30
});
formatter.match({
  "location": "UpdateCustomerStepDefs.a_user_is_authorized_to_update_a_vodafone_customer()"
});
formatter.result({
  "duration": 121000,
  "status": "passed"
});
formatter.match({
  "location": "UpdateCustomerStepDefs.the_user_updates_customer_demographic_information()"
});
formatter.result({
  "duration": 91987000,
  "status": "passed"
});
formatter.match({
  "location": "UpdateCustomerStepDefs.the_customer_is_updated_in_the_system()"
});
formatter.result({
  "duration": 61519000,
  "status": "passed"
});
formatter.background({
  "description": "",
  "name": "",
  "keyword": "Background",
  "line": 11,
  "type": "background"
});
formatter.step({
  "name": "vodafone has a customer in their system",
  "keyword": "Given ",
  "line": 12
});
formatter.match({
  "location": "CommonSteps.vodafone_has_a_customer_in_their_system()"
});
formatter.result({
  "duration": 62601000,
  "status": "passed"
});
formatter.scenario({
  "id": "vodafone-provides-a-restful-webservice-to-provide-customer-information.;user-can-delete-the-customer-information",
  "description": "",
  "name": "User can delete the Customer information",
  "keyword": "Scenario",
  "line": 32,
  "type": "scenario"
});
formatter.step({
  "name": "a user is authorized to delete vodafone customer",
  "keyword": "Given ",
  "line": 34
});
formatter.step({
  "name": "the user deletes a customer",
  "keyword": "When ",
  "line": 35
});
formatter.step({
  "name": "the customer is deleted from the system",
  "keyword": "Then ",
  "line": 36
});
formatter.match({
  "location": "DeleteCustomerStepDefs.a_user_is_authorized_to_delete_vodafone_customer()"
});
formatter.result({
  "duration": 175000,
  "status": "passed"
});
formatter.match({
  "location": "DeleteCustomerStepDefs.the_user_deletes_a_customer()"
});
formatter.result({
  "duration": 79974000,
  "status": "passed"
});
formatter.match({
  "location": "DeleteCustomerStepDefs.the_customer_is_deleted_from_the_system()"
});
formatter.result({
  "duration": 1856000,
  "status": "passed"
});
});