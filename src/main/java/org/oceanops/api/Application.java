package org.oceanops.api;


import java.io.IOException;

import javax.servlet.ServletContext;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Context;

import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.configuration.web.WebUtil;
import org.apache.cayenne.dba.PkGenerator;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.agrest.cayenne.AgCayenneBuilder;
import io.agrest.cayenne.AgCayenneModule;
import io.agrest.runtime.AgBuilder;
import io.agrest.runtime.AgRuntime;

@ApplicationPath("/")
public class Application extends ResourceConfig  {	
	Logger logger = LoggerFactory.getLogger(Application.class);

	public Application(@Context ServletContext servletContext) throws IOException {
		ServerRuntime runtime = (ServerRuntime)WebUtil.getCayenneRuntime(servletContext);
		AgCayenneModule cayenneExt = AgCayenneBuilder.build(runtime);
		PkGenerator pk = runtime.getDataDomain().getDataNode("prod").getAdapter().getPkGenerator();
		if(!(pk instanceof OraclePkGeneratorCustom)){
			logger.warn("PkGenerator is not an instance of OraclePkGeneratorCustom");
			logger.debug(pk.toString());
			logger.debug(runtime.getDataDomain().getDataNode("prod").getAdapter().toString());
		}
		AgBuilder agBuilder = new AgBuilder().module(cayenneExt);

		Authorization.applyGlobalAuthorization(agBuilder);

		AgRuntime agRuntime = agBuilder.build();
        register(agRuntime);
	}

}
