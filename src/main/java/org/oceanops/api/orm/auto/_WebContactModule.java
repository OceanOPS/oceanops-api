package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.api.orm.Contact;
import org.oceanops.api.orm.WebModule;

/**
 * Class _WebContactModule was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WebContactModule extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String CONTACT_ID_PK_COLUMN = "CONTACT_ID";
    public static final String MODULE_ID_PK_COLUMN = "MODULE_ID";

    public static final NumericProperty<Integer> CONTACT_ID = PropertyFactory.createNumeric("contactId", Integer.class);
    public static final NumericProperty<Integer> MODULE_ID = PropertyFactory.createNumeric("moduleId", Integer.class);
    public static final EntityProperty<Contact> CONTACT = PropertyFactory.createEntity("contact", Contact.class);
    public static final EntityProperty<WebModule> MODULE = PropertyFactory.createEntity("module", WebModule.class);

    protected Integer contactId;
    protected Integer moduleId;

    protected Object contact;
    protected Object module;

    public void setContactId(Integer contactId) {
        beforePropertyWrite("contactId", this.contactId, contactId);
        this.contactId = contactId;
    }

    public Integer getContactId() {
        beforePropertyRead("contactId");
        return this.contactId;
    }

    public void setModuleId(Integer moduleId) {
        beforePropertyWrite("moduleId", this.moduleId, moduleId);
        this.moduleId = moduleId;
    }

    public Integer getModuleId() {
        beforePropertyRead("moduleId");
        return this.moduleId;
    }

    public void setContact(Contact contact) {
        setToOneTarget("contact", contact, true);
    }

    public Contact getContact() {
        return (Contact)readProperty("contact");
    }

    public void setModule(WebModule module) {
        setToOneTarget("module", module, true);
    }

    public WebModule getModule() {
        return (WebModule)readProperty("module");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "contactId":
                return this.contactId;
            case "moduleId":
                return this.moduleId;
            case "contact":
                return this.contact;
            case "module":
                return this.module;
            default:
                return super.readPropertyDirectly(propName);
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "contactId":
                this.contactId = (Integer)val;
                break;
            case "moduleId":
                this.moduleId = (Integer)val;
                break;
            case "contact":
                this.contact = val;
                break;
            case "module":
                this.module = val;
                break;
            default:
                super.writePropertyDirectly(propName, val);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        writeSerialized(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        readSerialized(in);
    }

    @Override
    protected void writeState(ObjectOutputStream out) throws IOException {
        super.writeState(out);
        out.writeObject(this.contactId);
        out.writeObject(this.moduleId);
        out.writeObject(this.contact);
        out.writeObject(this.module);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.contactId = (Integer)in.readObject();
        this.moduleId = (Integer)in.readObject();
        this.contact = in.readObject();
        this.module = in.readObject();
    }

}
