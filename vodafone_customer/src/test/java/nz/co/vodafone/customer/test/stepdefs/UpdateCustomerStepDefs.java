package nz.co.vodafone.customer.test.stepdefs;

import static nz.co.vodafone.customer.test.stepdefs.CommonSteps.ID;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

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
public class UpdateCustomerStepDefs {
	CustomerClient customerClient = new CustomerClient();
	Customer customer;
	private ClientResponse updateCustomerResponse;

	@Given("^a user is authorized to update a vodafone customer$")
	public void a_user_is_authorized_to_update_a_vodafone_customer() {
		// authenticate the user for accessing the customer
	}

	@SuppressWarnings("deprecation")
	@When("^the user updates customer demographic information$")
	public void the_user_updates_customer_demographic_information() {
		final Customer updatedCustomer = new Customer(ID, "updateSurname", "updateGivenName", "updateAddress", "updatePhoneNumber");
		this.updateCustomerResponse = this.customerClient.updateCustomer(ID, updatedCustomer);
		assertThat(this.updateCustomerResponse.getResponseStatus().getStatusCode(), is(204));
	}

	@Then("^the customer is updated in the system$")
	public void the_customer_is_updated_in_the_system() {
		this.customer = this.customerClient.getCustomerByID(ID);
		assertThat(this.customer, is(notNullValue()));
		assertThat(this.customer.getId(), is(ID));
		assertThat(this.customer.getSurname(), is("updateSurname"));
		assertThat(this.customer.getGivenName(), is("updateGivenName"));
		assertThat(this.customer.getAddress(), is("updateAddress"));
		assertThat(this.customer.getPhoneNumber(), is("updatePhoneNumber"));

	}

}
