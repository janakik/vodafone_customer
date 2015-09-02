package nz.co.vodafone.customer.rest;

import nz.co.vodafone.customer.CustomerResource;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * @author janaki konyala
 *
 */
public class CusotmerApp
{
	private static final int PORT_NUMBER = 8080;

	public static void main(final String[] args) throws Exception {
		final ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
		context.setContextPath("/");

		final Server jettyServer = new Server(PORT_NUMBER);
		jettyServer.setHandler(context);

		final ServletHolder jerseyServlet = context.addServlet(
				org.glassfish.jersey.servlet.ServletContainer.class, "/*");
		jerseyServlet.setInitOrder(0);

		final String jerseyClass = "jersey.config.server.provider.classnames";
		jerseyServlet.setInitParameter(
				jerseyClass,
				CustomerResource.class.getCanonicalName());

		try {
			jettyServer.start();
			jettyServer.join();
		} finally {
			jettyServer.destroy();
		}
	}
}
