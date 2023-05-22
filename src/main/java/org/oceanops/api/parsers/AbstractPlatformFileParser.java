package org.oceanops.api.parsers;

import java.io.InputStream;

import org.apache.cayenne.ObjectContext;
import org.oceanops.api.Utils;

public abstract class AbstractPlatformFileParser {
    protected InputStream fileInputStream;
    protected ObjectContext editingContext;

    protected AbstractPlatformFileParser(InputStream filInputStream){
        this.fileInputStream = filInputStream;
        this.editingContext = Utils.getCayenneContext();
    }
}
