package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.orm.Contact;
import org.oceanops.orm.Cruise;
import org.oceanops.orm.Line;
import org.oceanops.orm.Ptf;
import org.oceanops.orm.WebModule;

/**
 * Class _WebFrequentation was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WebFrequentation extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final NumericProperty<Integer> COUNT = PropertyFactory.createNumeric("count", Integer.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final DateProperty<LocalDateTime> LATEST_DATE = PropertyFactory.createDate("latestDate", LocalDateTime.class);
    public static final EntityProperty<Contact> CONTACT = PropertyFactory.createEntity("contact", Contact.class);
    public static final EntityProperty<Cruise> CRUISE = PropertyFactory.createEntity("cruise", Cruise.class);
    public static final EntityProperty<Line> LINE = PropertyFactory.createEntity("line", Line.class);
    public static final EntityProperty<Ptf> PTF = PropertyFactory.createEntity("ptf", Ptf.class);
    public static final EntityProperty<WebModule> WEB_MODULE = PropertyFactory.createEntity("webModule", WebModule.class);

    protected Integer count;
    protected Integer id;
    protected LocalDateTime latestDate;

    protected Object contact;
    protected Object cruise;
    protected Object line;
    protected Object ptf;
    protected Object webModule;

    public void setCount(Integer count) {
        beforePropertyWrite("count", this.count, count);
        this.count = count;
    }

    public Integer getCount() {
        beforePropertyRead("count");
        return this.count;
    }

    public void setId(Integer id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public Integer getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setLatestDate(LocalDateTime latestDate) {
        beforePropertyWrite("latestDate", this.latestDate, latestDate);
        this.latestDate = latestDate;
    }

    public LocalDateTime getLatestDate() {
        beforePropertyRead("latestDate");
        return this.latestDate;
    }

    public void setContact(Contact contact) {
        setToOneTarget("contact", contact, true);
    }

    public Contact getContact() {
        return (Contact)readProperty("contact");
    }

    public void setCruise(Cruise cruise) {
        setToOneTarget("cruise", cruise, true);
    }

    public Cruise getCruise() {
        return (Cruise)readProperty("cruise");
    }

    public void setLine(Line line) {
        setToOneTarget("line", line, true);
    }

    public Line getLine() {
        return (Line)readProperty("line");
    }

    public void setPtf(Ptf ptf) {
        setToOneTarget("ptf", ptf, true);
    }

    public Ptf getPtf() {
        return (Ptf)readProperty("ptf");
    }

    public void setWebModule(WebModule webModule) {
        setToOneTarget("webModule", webModule, true);
    }

    public WebModule getWebModule() {
        return (WebModule)readProperty("webModule");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "count":
                return this.count;
            case "id":
                return this.id;
            case "latestDate":
                return this.latestDate;
            case "contact":
                return this.contact;
            case "cruise":
                return this.cruise;
            case "line":
                return this.line;
            case "ptf":
                return this.ptf;
            case "webModule":
                return this.webModule;
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
            case "count":
                this.count = (Integer)val;
                break;
            case "id":
                this.id = (Integer)val;
                break;
            case "latestDate":
                this.latestDate = (LocalDateTime)val;
                break;
            case "contact":
                this.contact = val;
                break;
            case "cruise":
                this.cruise = val;
                break;
            case "line":
                this.line = val;
                break;
            case "ptf":
                this.ptf = val;
                break;
            case "webModule":
                this.webModule = val;
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
        out.writeObject(this.count);
        out.writeObject(this.id);
        out.writeObject(this.latestDate);
        out.writeObject(this.contact);
        out.writeObject(this.cruise);
        out.writeObject(this.line);
        out.writeObject(this.ptf);
        out.writeObject(this.webModule);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.count = (Integer)in.readObject();
        this.id = (Integer)in.readObject();
        this.latestDate = (LocalDateTime)in.readObject();
        this.contact = in.readObject();
        this.cruise = in.readObject();
        this.line = in.readObject();
        this.ptf = in.readObject();
        this.webModule = in.readObject();
    }

}
