package org.oceanops.api;

import java.util.Optional;

import org.apache.cayenne.access.sqlbuilder.sqltree.FunctionNode;
import org.apache.cayenne.access.sqlbuilder.sqltree.ValueNode;
import org.apache.cayenne.access.translator.select.TypeAwareSQLTreeProcessor;
import org.apache.cayenne.value.Wkt;

public class OracleSDESQLTreeProcessor extends TypeAwareSQLTreeProcessor {

    public OracleSDESQLTreeProcessor() {

        registerColumnProcessor(Wkt.class, (parent, child, i)
                -> Optional.of(wrapInFunction(child, "SDE.ST_AsText")));

        registerValueProcessor(Wkt.class, (parent, child, i) -> {
            FunctionNode geomFromText = FunctionNode.wrap(child, "SDE.ST_GeomFromText");
            geomFromText.addChild(new ValueNode("4326", false, null));
            return Optional.of(geomFromText);
        });
    }    
}