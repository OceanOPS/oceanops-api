package org.oceanops.api;


import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Context;

import org.apache.cayenne.ashwood.WeightedAshwoodEntitySorter;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.dba.PkGenerator;
import org.apache.cayenne.map.EntitySorter;
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

	public Application(@Context ServletContext servletContext) throws IOException {
		//ServerRuntime cayenneRuntime = (ServerRuntime)WebUtil.getCayenneRuntime(servletContext);
		OraclePkGeneratorCustom pkgen = new OraclePkGeneratorCustom();
		pkgen.setPkCacheSize(1);

        ServerRuntime cayenneRuntime = ServerRuntime.builder()
                .addConfig("cayenne-OceanOPS-API.xml")
				.addModule(b -> b
					.bind(PkGenerator.class).toInstance(pkgen)
				)
				.addModule(b -> b
					.bind(EntitySorter.class).to(WeightedAshwoodEntitySorter.class))
                .build();
		// Controlling that modules are applied
		PkGenerator pk = cayenneRuntime.getDataDomain().getDataNode("prod").getAdapter().getPkGenerator();
		if(!(pk instanceof OraclePkGeneratorCustom)){
			logger.warn("PkGenerator is not an instance of OraclePkGeneratorCustom");
			logger.debug(pk.toString());
			logger.debug(cayenneRuntime.getDataDomain().getDataNode("prod").getAdapter().toString());
		}
		// Adding Cayenne to AgRest
		AgCayenneModule cayenneModule = AgCayenneModule.build(cayenneRuntime);	
		AgRuntimeBuilder agBuilder = AgRuntime.builder().module(cayenneModule);
		// Adding global authorization filter
		Authorization.applyGlobalAuthorization(agBuilder);
		AgRuntime runtime = agBuilder.build();		
        // Connect Agrest runtime with JAX RS runtime
		AgJaxrsFeature feature = AgJaxrsFeature.build(runtime);
        register(feature);
		// Registering API endpoints
		//packages("org.oceanops.api");
		register(org.oceanops.api.accessors.PlatformAccessor.class);
		register(org.oceanops.api.accessors.AgencyAccessor.class);
		register(org.oceanops.api.accessors.HardwareAccessor.class);
		register(org.oceanops.api.accessors.OtherAccessor.class);
		register(org.oceanops.api.accessors.ShipAccessor.class);
		register(org.oceanops.api.accessors.VocabAccessor.class);
	}

}
