package org.oceanops.api;

import java.util.Optional;

import org.apache.cayenne.access.sqlbuilder.sqltree.FunctionNode;
import org.apache.cayenne.access.translator.select.TypeAwareSQLTreeProcessor;
import org.apache.cayenne.value.Wkt;

public class OracleSDESQLTreeProcessor extends TypeAwareSQLTreeProcessor {

    public OracleSDESQLTreeProcessor() {

        registerColumnProcessor(Wkt.class, (parent, child, i) -> {
            FunctionNode geomFromWKB = FunctionNode.wrap(child, "SDO_UTIL.FROM_WKBGEOMETRY");
            return Optional.of(wrapInFunction(geomFromWKB, "sdo_util.to_wktgeometry"));
        });

        registerValueProcessor(Wkt.class, (parent, child, i) -> {
            FunctionNode geomFromText = FunctionNode.wrap(child, "SDO_UTIL.FROM_WKTGEOMETRY");
            return Optional.of(wrapInFunction(geomFromText, "sdo_util.to_wkbgeometry"));
        });
    }    
}