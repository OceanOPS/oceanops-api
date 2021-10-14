package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.api.orm.Contact;
import org.oceanops.api.orm.NcLevel;
import org.oceanops.api.orm.NcTopic;
import org.oceanops.api.orm.Program;
import org.oceanops.api.orm.Ptf;

/**
 * Class _NcNotification was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _NcNotification extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final NumericProperty<Integer> CRUISE_ID = PropertyFactory.createNumeric("cruiseId", Integer.class);
    public static final StringProperty<String> DESCRIPTION = PropertyFactory.createString("description", String.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final NumericProperty<Integer> IS_PRIVATE = PropertyFactory.createNumeric("isPrivate", Integer.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final DateProperty<LocalDateTime> NOTIFICATION_DATE = PropertyFactory.createDate("notificationDate", LocalDateTime.class);
    public static final NumericProperty<Integer> SENT = PropertyFactory.createNumeric("sent", Integer.class);
    public static final EntityProperty<Contact> CONTACT = PropertyFactory.createEntity("contact", Contact.class);
    public static final EntityProperty<NcLevel> NC_LEVEL = PropertyFactory.createEntity("ncLevel", NcLevel.class);
    public static final EntityProperty<NcTopic> NC_TOPIC = PropertyFactory.createEntity("ncTopic", NcTopic.class);
    public static final EntityProperty<Program> PROGRAM = PropertyFactory.createEntity("program", Program.class);
    public static final EntityProperty<Ptf> PTF = PropertyFactory.createEntity("ptf", Ptf.class);

    protected Integer cruiseId;
    protected String description;
    protected Integer id;
    protected Integer isPrivate;
    protected String name;
    protected LocalDateTime notificationDate;
    protected Integer sent;

    protected Object contact;
    protected Object ncLevel;
    protected Object ncTopic;
    protected Object program;
    protected Object ptf;

    public void setCruiseId(Integer cruiseId) {
        beforePropertyWrite("cruiseId", this.cruiseId, cruiseId);
        this.cruiseId = cruiseId;
    }

    public Integer getCruiseId() {
        beforePropertyRead("cruiseId");
        return this.cruiseId;
    }

    public void setDescription(String description) {
        beforePropertyWrite("description", this.description, description);
        this.description = description;
    }

    public String getDescription() {
        beforePropertyRead("description");
        return this.description;
    }

    public void setId(Integer id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public Integer getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setIsPrivate(Integer isPrivate) {
        beforePropertyWrite("isPrivate", this.isPrivate, isPrivate);
        this.isPrivate = isPrivate;
    }

    public Integer getIsPrivate() {
        beforePropertyRead("isPrivate");
        return this.isPrivate;
    }

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void setNotificationDate(LocalDateTime notificationDate) {
        beforePropertyWrite("notificationDate", this.notificationDate, notificationDate);
        this.notificationDate = notificationDate;
    }

    public LocalDateTime getNotificationDate() {
        beforePropertyRead("notificationDate");
        return this.notificationDate;
    }

    public void setSent(Integer sent) {
        beforePropertyWrite("sent", this.sent, sent);
        this.sent = sent;
    }

    public Integer getSent() {
        beforePropertyRead("sent");
        return this.sent;
    }

    public void setContact(Contact contact) {
        setToOneTarget("contact", contact, true);
    }

    public Contact getContact() {
        return (Contact)readProperty("contact");
    }

    public void setNcLevel(NcLevel ncLevel) {
        setToOneTarget("ncLevel", ncLevel, true);
    }

    public NcLevel getNcLevel() {
        return (NcLevel)readProperty("ncLevel");
    }

    public void setNcTopic(NcTopic ncTopic) {
        setToOneTarget("ncTopic", ncTopic, true);
    }

    public NcTopic getNcTopic() {
        return (NcTopic)readProperty("ncTopic");
    }

    public void setProgram(Program program) {
        setToOneTarget("program", program, true);
    }

    public Program getProgram() {
        return (Program)readProperty("program");
    }

    public void setPtf(Ptf ptf) {
        setToOneTarget("ptf", ptf, true);
    }

    public Ptf getPtf() {
        return (Ptf)readProperty("ptf");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "cruiseId":
                return this.cruiseId;
            case "description":
                return this.description;
            case "id":
                return this.id;
            case "isPrivate":
                return this.isPrivate;
            case "name":
                return this.name;
            case "notificationDate":
                return this.notificationDate;
            case "sent":
                return this.sent;
            case "contact":
                return this.contact;
            case "ncLevel":
                return this.ncLevel;
            case "ncTopic":
                return this.ncTopic;
            case "program":
                return this.program;
            case "ptf":
                return this.ptf;
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
            case "cruiseId":
                this.cruiseId = (Integer)val;
                break;
            case "description":
                this.description = (String)val;
                break;
            case "id":
                this.id = (Integer)val;
                break;
            case "isPrivate":
                this.isPrivate = (Integer)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "notificationDate":
                this.notificationDate = (LocalDateTime)val;
                break;
            case "sent":
                this.sent = (Integer)val;
                break;
            case "contact":
                this.contact = val;
                break;
            case "ncLevel":
                this.ncLevel = val;
                break;
            case "ncTopic":
                this.ncTopic = val;
                break;
            case "program":
                this.program = val;
                break;
            case "ptf":
                this.ptf = val;
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
        out.writeObject(this.cruiseId);
        out.writeObject(this.description);
        out.writeObject(this.id);
        out.writeObject(this.isPrivate);
        out.writeObject(this.name);
        out.writeObject(this.notificationDate);
        out.writeObject(this.sent);
        out.writeObject(this.contact);
        out.writeObject(this.ncLevel);
        out.writeObject(this.ncTopic);
        out.writeObject(this.program);
        out.writeObject(this.ptf);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.cruiseId = (Integer)in.readObject();
        this.description = (String)in.readObject();
        this.id = (Integer)in.readObject();
        this.isPrivate = (Integer)in.readObject();
        this.name = (String)in.readObject();
        this.notificationDate = (LocalDateTime)in.readObject();
        this.sent = (Integer)in.readObject();
        this.contact = in.readObject();
        this.ncLevel = in.readObject();
        this.ncTopic = in.readObject();
        this.program = in.readObject();
        this.ptf = in.readObject();
    }

}
