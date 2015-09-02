package nz.co.vodafone.customer.test.properties;

import java.net.InetAddress;

/**
 * @author janaki konyala
 *
 */
public class DefaultTestProperties {

	private static final String PORT_NUMBER_PROPERTY_NAME = "port";
	private static final String HOST_NAME_PROPERTY_NAME = "host";

	TestPropertiesHandle testPropertiesHandle = TestPropertiesHandle.getInstance();

	public String getHostName() {
		final String hostName = this.testPropertiesHandle.getProperty(HOST_NAME_PROPERTY_NAME);
		if (hostName != null) {
			return hostName;
		}
		return localHostName();
	}

	private String localHostName() {
		try {
			return InetAddress.getLocalHost().getHostName();
		} catch (final Exception e) {
			throw new RuntimeException(e);
		}
	}

	public String getPort() {
		return this.testPropertiesHandle.getProperty(PORT_NUMBER_PROPERTY_NAME);
	}

}
