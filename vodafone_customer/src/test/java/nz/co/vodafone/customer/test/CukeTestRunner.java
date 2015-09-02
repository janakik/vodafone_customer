package nz.co.vodafone.customer.test;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

/**
 * @author janaki konyala
 *
 */
@RunWith(Cucumber.class)
@Cucumber.Options(format = { "html:target/cucumber", "json:target/cucumber.json" })
public class CukeTestRunner {

}
