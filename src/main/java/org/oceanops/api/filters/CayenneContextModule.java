package org.oceanops.api.filters;

import org.apache.cayenne.ashwood.WeightedAshwoodEntitySorter;
import org.apache.cayenne.configuration.web.RequestHandler;
import org.apache.cayenne.configuration.web.StatelessContextRequestHandler;
import org.apache.cayenne.dba.PkGenerator;
import org.apache.cayenne.di.Binder;
import org.apache.cayenne.di.Module;
import org.apache.cayenne.map.EntitySorter;
import org.oceanops.api.OraclePkGeneratorCustom;

public class CayenneContextModule implements Module {
    @Override
    public void configure(Binder binder) {
            binder.bind(RequestHandler.class)
                .to(StatelessContextRequestHandler.class)
                .withoutScope();
            
            OraclePkGeneratorCustom pkgen = new OraclePkGeneratorCustom();
            pkgen.setPkCacheSize(1);
            binder.bind(PkGenerator.class).toInstance(pkgen);

            binder.bind(EntitySorter.class).to(WeightedAshwoodEntitySorter.class);
    }
}
