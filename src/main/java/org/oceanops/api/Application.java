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

import io.agrest.cayenne.AgCayenneModule;
import io.agrest.runtime.AgRuntime;
import io.agrest.runtime.AgRuntimeBuilder;
import io.agrest.jaxrs2.AgJaxrsFeature;

@ApplicationPath("/")
public class Application extends ResourceConfig  {	
	Logger logger = LoggerFactory.getLogger(Application.class);

	public Application(@Context ServletContext servletContext) throws IOException {
		ServerRuntime cayenneRuntime = (ServerRuntime)WebUtil.getCayenneRuntime(servletContext);
		AgCayenneModule cayenneModule = AgCayenneModule.build(cayenneRuntime);		

		PkGenerator pk = cayenneRuntime.getDataDomain().getDataNode("prod").getAdapter().getPkGenerator();
		if(!(pk instanceof OraclePkGeneratorCustom)){
			logger.warn("PkGenerator is not an instance of OraclePkGeneratorCustom");
			logger.debug(pk.toString());
			logger.debug(cayenneRuntime.getDataDomain().getDataNode("prod").getAdapter().toString());
		}

		AgRuntimeBuilder agBuilder = AgRuntime.builder().module(cayenneModule);
		Authorization.applyGlobalAuthorization(agBuilder);
		AgRuntime runtime = agBuilder.build();
		
		AgJaxrsFeature feature = AgJaxrsFeature.build(runtime);
        register(feature);
	}

}
