package nz.co.vodafone.customer.test.stepdefs;

import java.util.Random;

import nz.co.vodafone.customer.Customer;
import nz.co.vodafone.customer.test.rest.client.CustomerClient;
import cucumber.api.java.en.Given;

/**
 * @author janaki konyala
 *
 */
public class CommonSteps {

	public static String ID = "" + new Random().nextInt(100000);
	public static final String SURNAME = "testSurname";
	public static final String GIVEN_NAME = "testGivenName";
	public static final String ADDRESS = "testAddress";
	public static final String PHONE_NUMBER = "+6421212121";
	CustomerClient customerClient = new CustomerClient();

	@Given("^vodafone has a customer in their system$")
	public void vodafone_has_a_customer_in_their_system() {
		final Customer customer = new Customer(ID, SURNAME, GIVEN_NAME, ADDRESS, PHONE_NUMBER);
		this.customerClient.postCustomer(customer);
	}
}
