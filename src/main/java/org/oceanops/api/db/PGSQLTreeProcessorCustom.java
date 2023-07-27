package org.oceanops.api.db;

import java.util.Optional;

import org.apache.cayenne.access.sqlbuilder.sqltree.FunctionNode;
import org.apache.cayenne.access.sqlbuilder.sqltree.ValueNode;
import org.apache.cayenne.access.translator.select.TypeAwareSQLTreeProcessor;
import org.apache.cayenne.value.Wkt;

public class PGSQLTreeProcessorCustom extends TypeAwareSQLTreeProcessor {

    public PGSQLTreeProcessorCustom() {

        registerColumnProcessor(Wkt.class, (parent, child, i) -> {
            FunctionNode geomFromWKB = FunctionNode.wrap(child, "postgis.ST_GeomFromWKB");
            geomFromWKB.addChild(new ValueNode("4326", false, null));
            return Optional.of(wrapInFunction(geomFromWKB, "postgis.ST_AsText"));
        });

        registerValueProcessor(Wkt.class, (parent, child, i) -> {
            FunctionNode geomFromText = FunctionNode.wrap(child, "postgis.ST_GeomFromText");
            geomFromText.addChild(new ValueNode("4326", false, null));
            return Optional.of(wrapInFunction(geomFromText, "postgis.ST_AsBinary"));
        });
    }    
}