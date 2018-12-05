package org.jcommops.api;

import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application extends ResourceConfig  {
	private final Logger logger = LoggerFactory.getLogger(Application.class);
	
	public Application() {
	}

}
