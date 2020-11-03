package org.oceanops.api.orm;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _DocContact was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DocContact extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String CONTACT_ID_PK_COLUMN = "CONTACT_ID";
    public static final String DOC_ID_PK_COLUMN = "DOC_ID";

    public static final Property<Integer> CONTACT_ID = Property.create("contactId", Integer.class);
    public static final Property<Integer> DOC_ID = Property.create("docId", Integer.class);
    public static final Property<Doc> CONTACT = Property.create("contact", Doc.class);
    public static final Property<Contact> DOC = Property.create("doc", Contact.class);

    public void setContactId(int contactId) {
        writeProperty("contactId", contactId);
    }
    public int getContactId() {
        Object value = readProperty("contactId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setDocId(int docId) {
        writeProperty("docId", docId);
    }
    public int getDocId() {
        Object value = readProperty("docId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setContact(Doc contact) {
        setToOneTarget("contact", contact, true);
    }

    public Doc getContact() {
        return (Doc)readProperty("contact");
    }


    public void setDoc(Contact doc) {
        setToOneTarget("doc", doc, true);
    }

    public Contact getDoc() {
        return (Contact)readProperty("doc");
    }


}