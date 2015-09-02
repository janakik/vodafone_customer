package nz.co.vodafone.customer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author janaki konyala
 *
 */
public enum CustomerDao {
	instance;

	private final Map<String, Customer> customers = new HashMap<String, Customer>();

	private CustomerDao() {

		// adding customer 1 and 2
		final Customer customer = new Customer("1", "kasyap", "janaki", "70 cormack street", "09-6204070");
		this.customers.put("1", customer);
		final Customer customer2 = new Customer("2", "kasyap", "jcp", "30 athenic avenue", "09-6204007");
		this.customers.put("2", customer2);

	}

	public Map<String, Customer> getCustomers() {
		return this.customers;
	}

}
