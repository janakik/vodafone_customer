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
public class AddCustomerStepDefs {

	CustomerClient customerClient = new CustomerClient();
	Customer newCustomer;

	@Given("^a user is authorized to add a vodafone customer$")
	public void a_user_is_authorized_to_add_a_vodafone_customer() {
		// authenticate the user for accessing the customer
	}

	@When("^the user adds a customer with demographic information$")
	public void the_user_adds_a_customer_with_demographic_information() {
		this.newCustomer = new Customer(ID, SURNAME, GIVEN_NAME, ADDRESS,
				PHONE_NUMBER);
		this.customerClient.postCustomer(this.newCustomer);
	}

	@Then("^the customer is added to the system$")
	public void the_customer_is_added_to_the_system() {
		final Customer addedCustomer = this.customerClient.getCustomerByID(this.newCustomer.getId());
		assertThat(addedCustomer, is(notNullValue()));
		assertThat(addedCustomer.getId(), is(this.newCustomer.getId()));
		assertThat(addedCustomer.getSurname(), is(this.newCustomer.getSurname()));
		assertThat(addedCustomer.getGivenName(), is(this.newCustomer.getGivenName()));
		assertThat(addedCustomer.getAddress(), is(this.newCustomer.getAddress()));
		assertThat(addedCustomer.getPhoneNumber(), is(this.newCustomer.getPhoneNumber()));
	}

}
