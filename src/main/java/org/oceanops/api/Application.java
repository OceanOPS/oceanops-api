package org.oceanops.api;


import java.io.IOException;

import javax.naming.NamingException;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import io.agrest.cayenne.AgCayenneBuilder;
import io.agrest.cayenne.AgCayenneModule;
import io.agrest.runtime.AgBuilder;
import io.agrest.runtime.AgRuntime;

@ApplicationPath("/")
public class Application extends ResourceConfig  {	
	public Application() throws IOException {
		try{
			Utils.initCayenneRuntime();
		}
		catch(NamingException e){
			throw new IOException("Impossible to establish a connection with the database");
		}
		AgCayenneModule cayenneExt = AgCayenneBuilder.build(Utils.getCayenneRuntime());
		AgBuilder agBuilder = new AgBuilder().module(cayenneExt);

		Authorization.applyGlobalAuthorization(agBuilder);

		AgRuntime agRuntime = agBuilder.build();
        register(agRuntime);
	}

}
