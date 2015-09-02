package nz.co.vodafone.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author janaki konyala
 *
 */
public class CustomerService {

	CustomerDao customerDao;

	public CustomerService() {
		this.customerDao = CustomerDao.instance;
	}

	public void createCustomer(final Customer customer) {
		this.customerDao.getCustomers().put(customer.getId(), customer);
	}

	public Customer getCustomer(final String id) {
		return this.customerDao.getCustomers().get(id);
	}

	public Map<String, Customer> getCustomers() {
		return this.customerDao.getCustomers();
	}

	public List<Customer> getCustomerAsList() {
		final List<Customer> customerList = new ArrayList<Customer>();
		customerList.addAll(this.customerDao.getCustomers().values());
		return customerList;
	}

	public int getCustomersCount() {
		return this.customerDao.getCustomers().size();
	}

	public void deleteCustomer(final String id) {
		this.customerDao.getCustomers().remove(id);
	}
}
