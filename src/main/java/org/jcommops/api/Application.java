package org.jcommops.api;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Application extends ResourceConfig  {
	private Log log = LogFactory.getLog(Application.class);
	
	public Application() {
	}

}
