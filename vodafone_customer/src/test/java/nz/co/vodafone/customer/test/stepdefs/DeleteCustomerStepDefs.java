package nz.co.vodafone.customer.test.stepdefs;

import static nz.co.vodafone.customer.test.stepdefs.CommonSteps.ID;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.StringContains.containsString;

import static org.junit.Assert.assertThat;

import nz.co.vodafone.customer.Customer;
import nz.co.vodafone.customer.test.rest.client.CustomerClient;

import com.sun.jersey.api.client.ClientResponse;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author janaki konyala
 *
 */
public class DeleteCustomerStepDefs {

	CustomerClient customerClient = new CustomerClient();
	Customer customer;
	private ClientResponse response;

	@Given("^a user is authorized to delete vodafone customer$")
	public void a_user_is_authorized_to_delete_vodafone_customer() {
		// authenticate the user for accessing the customer
	}

	@When("^the user deletes a customer$")
	public void the_user_deletes_a_customer() {
		this.response = this.customerClient.deleteCustomer(ID);
	}

	@SuppressWarnings("deprecation")
	@Then("^the customer is deleted from the system$")
	public void the_customer_is_deleted_from_the_system() {
		assertThat(this.response.getResponseStatus().getStatusCode(), is(204));
		assertThat(this.response.getResponseStatus().getReasonPhrase(), is(containsString("No Content")));

	}

}
