package nz.co.vodafone.customer.test.properties;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * author janaki konyala
 *
 * TestProperties acts as a handle to properties provided in default.properties and {user}.properties under the Project directory.
 * Properties must be provided in these files as key/value pairs in the format of: key=value. Properties from {user}.properties override
 * those from default.properties.
 */
public class TestPropertiesHandle {

	private final Properties properties;

	private static TestPropertiesHandle instance = null;

	/**
	 * Creates a new instance of TestProperties if one has not been instantiated, otherwise returns the already existing instance
	 *
	 * @return An instance of the TestProperties class
	 * @throws NumberFormatException Thrown if the port number from the properties file cannot be parsed as an Integer
	 */
	public static TestPropertiesHandle getInstance() {
		if (instance == null) {
			instance = new TestPropertiesHandle();
		}
		return instance;
	}

	private TestPropertiesHandle() {
		this.properties = loadProperties();
	}

	/**
	 * Get the value of a property for some property name
	 *
	 * @param propertyName The property name used to look up a property value
	 * @return A string representation of the desired property or null if that property does not exist
	 */
	public String getProperty(final String propertyName) {
		return this.properties.getProperty(propertyName);
	}

	private Properties loadProperties() {
		final String username = System.getProperty("user.name");
		final File userPropertiesFile = new File(username + ".properties");
		final File defaultPropertiesFile = new File("default.properties");
		final Properties propertiesFromFile = new Properties();

		try (InputStream defaultFileStream = getFileInputStream(defaultPropertiesFile);
				InputStream userOverrideFileStream = getFileInputStream(userPropertiesFile)) {
			propertiesFromFile.load(defaultFileStream);
			propertiesFromFile.load(userOverrideFileStream);
			return propertiesFromFile;
		} catch (final IOException e) {
			throw new IllegalStateException("Cannot open one of the " + userPropertiesFile.getName() + " or "
					+ defaultPropertiesFile.getName() + "!", e);
		}
	}

	private InputStream getFileInputStream(final File fileHandle) throws FileNotFoundException {
		if (!fileHandle.isFile()) {
			return new ByteArrayInputStream(new byte[0]);
		}

		return new FileInputStream(fileHandle);
	}
}