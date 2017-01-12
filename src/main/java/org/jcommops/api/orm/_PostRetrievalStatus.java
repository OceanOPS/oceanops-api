package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _PostRetrievalStatus was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PostRetrievalStatus extends CayenneDataObject {

    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String NAME_PROPERTY = "name";
    public static final String NAME_SHORT_PROPERTY = "nameShort";
    public static final String RETRIEVAL_ARRAY_PROPERTY = "retrievalArray";

    public static final String ID_PK_COLUMN = "ID";

    public void setDescription(String description) {
        writeProperty(DESCRIPTION_PROPERTY, description);
    }
    public String getDescription() {
        return (String)readProperty(DESCRIPTION_PROPERTY);
    }

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void setNameShort(String nameShort) {
        writeProperty(NAME_SHORT_PROPERTY, nameShort);
    }
    public String getNameShort() {
        return (String)readProperty(NAME_SHORT_PROPERTY);
    }

    public void addToRetrievalArray(Retrieval obj) {
        addToManyTarget(RETRIEVAL_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromRetrievalArray(Retrieval obj) {
        removeToManyTarget(RETRIEVAL_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Retrieval> getRetrievalArray() {
        return (List<Retrieval>)readProperty(RETRIEVAL_ARRAY_PROPERTY);
    }


}
