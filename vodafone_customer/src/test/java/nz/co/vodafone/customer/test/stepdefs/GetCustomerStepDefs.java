package nz.co.vodafone.customer.test.stepdefs;

import static nz.co.vodafone.customer.test.stepdefs.CommonSteps.ADDRESS;
import static nz.co.vodafone.customer.test.stepdefs.CommonSteps.GIVEN_NAME;
import static nz.co.vodafone.customer.test.stepdefs.CommonSteps.ID;
import static nz.co.vodafone.customer.test.stepdefs.CommonSteps.PHONE_NUMBER;
import static nz.co.vodafone.customer.test.stepdefs.CommonSteps.SURNAME;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import nz.co.vodafone.customer.Customer;
import nz.co.vodafone.customer.test.rest.client.CustomerClient;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author janaki konyala
 *
 */
public class GetCustomerStepDefs {

	CustomerClient customerClient = new CustomerClient();
	Customer customerByID;

	@Given("^a user is authorized to access the vodafone customer$")
	public void a_user_is_authorized_to_access_the_vodafone_customer() {
		// authenticate the user for accessing the customer
	}

	@When("^the user requests for a customer information with customer id$")
	public void the_user_requests_for_a_customer_information_with_customer_id() {
		this.customerByID = this.customerClient.getCustomerByID(ID);
	}

	@Then("^the customer demographics are returned to the user$")
	public void the_customer_demographics_are_returned_to_the_user() {
		assertThat(this.customerByID, is(notNullValue()));
		assertThat(this.customerByID.getId(), is(ID));
		assertThat(this.customerByID.getSurname(), is(SURNAME));
		assertThat(this.customerByID.getGivenName(), is(GIVEN_NAME));
		assertThat(this.customerByID.getAddress(), is(ADDRESS));
		assertThat(this.customerByID.getPhoneNumber(), is(PHONE_NUMBER));
	}
}
