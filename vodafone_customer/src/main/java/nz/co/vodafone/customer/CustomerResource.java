package nz.co.vodafone.customer;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBElement;

/**
 * @author janaki konyala
 *
 */
@SuppressWarnings("restriction")
@Path("/customer")
public class CustomerResource {

	Request request;
	CustomerService customerService;

	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		return "Test";
	}

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Customer getCustomer(@QueryParam("id") final String id) {
		this.customerService = new CustomerService();
		return this.customerService.getCustomer(id);
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	public void addCustomer(final Customer customer) throws IOException {
		this.customerService = new CustomerService();
		this.customerService.createCustomer(customer);
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response addCustomer(final JAXBElement<Customer> customerJAXBElement) {
		this.customerService = new CustomerService();
		final Customer customer = customerJAXBElement.getValue();
		Response response;
		if (this.customerService.getCustomers().containsKey(customer.getId())) {
			response = Response.noContent().build();
		} else {
			response = Response.ok().build();
		}
		this.customerService.createCustomer(customer);
		return response;
	}

	@DELETE
	@Path("{id}")
	public void deleteCustomer(@PathParam("id") final String id) {
		this.customerService = new CustomerService();
		this.customerService.deleteCustomer(id);
	}
}
