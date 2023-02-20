package org.oceanops.api;


import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Context;

import org.apache.cayenne.configuration.server.ServerRuntime;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.agrest.cayenne.AgCayenneModule;
import io.agrest.runtime.AgRuntime;
import io.agrest.runtime.AgRuntimeBuilder;
import io.agrest.jaxrs3.AgJaxrsFeature;

@ApplicationPath("/")
public class Application extends ResourceConfig  {	
	Logger logger = LoggerFactory.getLogger(Application.class);
	public static ServerRuntime CAYENNE_RUNTIME;

	public Application(@Context ServletContext servletContext) throws IOException {
		// Creating Cayenne ServerRuntime
        Application.CAYENNE_RUNTIME = Utils.getCayenneServerRuntime("cayenne-OceanOPS-API.xml");
		
		// Adding Cayenne to AgRest
		AgCayenneModule cayenneModule = AgCayenneModule.build(Application.CAYENNE_RUNTIME);	
		AgRuntimeBuilder agBuilder = AgRuntime.builder().module(cayenneModule);
		// Adding global authorization filter
		Authorization.applyGlobalAuthorization(agBuilder);
		AgRuntime runtime = agBuilder.build();		
        // Connect Agrest runtime with JAX RS runtime
		AgJaxrsFeature feature = AgJaxrsFeature.build(runtime);
        register(feature);
		// Registering API endpoints
		packages("org.oceanops.api.accessors");
	}

}
