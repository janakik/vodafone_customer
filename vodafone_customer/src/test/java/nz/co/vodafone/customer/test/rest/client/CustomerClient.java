package nz.co.vodafone.customer.test.rest.client;

import gherkin.deps.com.google.gson.Gson;

import javax.ws.rs.core.MediaType;

import nz.co.vodafone.customer.Customer;
import nz.co.vodafone.customer.test.properties.DefaultTestProperties;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * @author janaki konyala
 *
 */
public class CustomerClient {

	private static final String RESOURCE_BASE = "/";
	final private DefaultTestProperties environmentProperties = new DefaultTestProperties();
	final private String theServerBase = "http://" + this.environmentProperties.getHostName() + ":" +
			this.environmentProperties.getPort();

	private WebResource getCustomerResource() {
		final ClientConfig config = new DefaultClientConfig();
		final Client client = Client.create(config);
		WebResource webResource = client.resource(this.theServerBase + RESOURCE_BASE);
		webResource = webResource
				.path("customer");
		return webResource;
	}

	public Customer getCustomerByID(final String id) {
		final Builder webServiceCall = getCustomerResource().queryParam("id", id).accept(MediaType.APPLICATION_JSON);
		final String resourceJson = webServiceCall.get(String.class);
		final Gson gsonJsonParser = new Gson();
		final Customer customer = gsonJsonParser.fromJson(resourceJson, Customer.class);
		return customer;
	}

	public ClientResponse postCustomer(final Customer customer) {
		final Gson gsonJsonParser = new Gson();
		final String jsonCustomer = gsonJsonParser.toJson(customer);
		final ClientResponse response = getCustomerResource().type(MediaType.APPLICATION_JSON)
				.post(ClientResponse.class, jsonCustomer);
		return response;
	}

	public ClientResponse updateCustomer(final String id, final Customer customer) {
		final Gson gsonJsonParser = new Gson();
		final String jsonCustomer = gsonJsonParser.toJson(customer);
		final ClientResponse response = getCustomerResource().queryParam("id", id).type(MediaType.APPLICATION_JSON)
				.put(ClientResponse.class, jsonCustomer);
		return response;
	}

	public ClientResponse deleteCustomer(final String id) {
		final ClientResponse response = getCustomerResource().path(id).delete(ClientResponse.class);
		return response;
	}

}