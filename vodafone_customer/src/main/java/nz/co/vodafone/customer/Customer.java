package nz.co.vodafone.customer;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author janaki konyala
 *
 */
@SuppressWarnings("restriction")
@XmlRootElement
public class Customer {
	private String id;
	private String surname;
	private String givenName;
	private String address;
	private String phoneNumber;

	public Customer() {
		super();
	}

	public Customer(final String id, final String surname, final String givenName, final String address, final String phoneNumber) {
		setId(id);
		setSurname(surname);
		setGivenName(givenName);
		setAddress(address);
		setPhoneNumber(phoneNumber);

	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	public String getGivenName() {
		return this.givenName;
	}

	public void setGivenName(final String givenName) {
		this.givenName = givenName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getId() {
		return this.id;
	}

	public void setId(final String id) {
		this.id = id;
	}

}