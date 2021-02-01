package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.api.orm.Contact;
import org.oceanops.api.orm.NcTopic;
import org.oceanops.api.orm.Program;
import org.oceanops.api.orm.Ptf;

/**
 * Class _NcSubscription was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _NcSubscription extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final NumericProperty<BigDecimal> EMAILED = PropertyFactory.createNumeric("emailed", BigDecimal.class);
    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final StringProperty<String> PREFERRED_EMAIL = PropertyFactory.createString("preferredEmail", String.class);
    public static final DateProperty<LocalDateTime> SUBSCRIPTION_DATE = PropertyFactory.createDate("subscriptionDate", LocalDateTime.class);
    public static final EntityProperty<Contact> CONTACT = PropertyFactory.createEntity("contact", Contact.class);
    public static final EntityProperty<NcTopic> NC_TOPIC = PropertyFactory.createEntity("ncTopic", NcTopic.class);
    public static final EntityProperty<Program> PROGRAM = PropertyFactory.createEntity("program", Program.class);
    public static final EntityProperty<Ptf> PTF = PropertyFactory.createEntity("ptf", Ptf.class);

    protected BigDecimal emailed;
    protected BigDecimal id;
    protected String preferredEmail;
    protected LocalDateTime subscriptionDate;

    protected Object contact;
    protected Object ncTopic;
    protected Object program;
    protected Object ptf;

    public void setEmailed(BigDecimal emailed) {
        beforePropertyWrite("emailed", this.emailed, emailed);
        this.emailed = emailed;
    }

    public BigDecimal getEmailed() {
        beforePropertyRead("emailed");
        return this.emailed;
    }

    public void setId(BigDecimal id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public BigDecimal getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setPreferredEmail(String preferredEmail) {
        beforePropertyWrite("preferredEmail", this.preferredEmail, preferredEmail);
        this.preferredEmail = preferredEmail;
    }

    public String getPreferredEmail() {
        beforePropertyRead("preferredEmail");
        return this.preferredEmail;
    }

    public void setSubscriptionDate(LocalDateTime subscriptionDate) {
        beforePropertyWrite("subscriptionDate", this.subscriptionDate, subscriptionDate);
        this.subscriptionDate = subscriptionDate;
    }

    public LocalDateTime getSubscriptionDate() {
        beforePropertyRead("subscriptionDate");
        return this.subscriptionDate;
    }

    public void setContact(Contact contact) {
        setToOneTarget("contact", contact, true);
    }

    public Contact getContact() {
        return (Contact)readProperty("contact");
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
            case "emailed":
                return this.emailed;
            case "id":
                return this.id;
            case "preferredEmail":
                return this.preferredEmail;
            case "subscriptionDate":
                return this.subscriptionDate;
            case "contact":
                return this.contact;
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
            case "emailed":
                this.emailed = (BigDecimal)val;
                break;
            case "id":
                this.id = (BigDecimal)val;
                break;
            case "preferredEmail":
                this.preferredEmail = (String)val;
                break;
            case "subscriptionDate":
                this.subscriptionDate = (LocalDateTime)val;
                break;
            case "contact":
                this.contact = val;
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
        out.writeObject(this.emailed);
        out.writeObject(this.id);
        out.writeObject(this.preferredEmail);
        out.writeObject(this.subscriptionDate);
        out.writeObject(this.contact);
        out.writeObject(this.ncTopic);
        out.writeObject(this.program);
        out.writeObject(this.ptf);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.emailed = (BigDecimal)in.readObject();
        this.id = (BigDecimal)in.readObject();
        this.preferredEmail = (String)in.readObject();
        this.subscriptionDate = (LocalDateTime)in.readObject();
        this.contact = in.readObject();
        this.ncTopic = in.readObject();
        this.program = in.readObject();
        this.ptf = in.readObject();
    }

}
