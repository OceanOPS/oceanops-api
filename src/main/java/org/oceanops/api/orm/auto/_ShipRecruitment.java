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
import org.oceanops.api.orm.Contact;
import org.oceanops.api.orm.Program;
import org.oceanops.api.orm.Ship;

/**
 * Class _ShipRecruitment was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ShipRecruitment extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final DateProperty<LocalDateTime> END_DATE = PropertyFactory.createDate("endDate", LocalDateTime.class);
    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final DateProperty<LocalDateTime> START_DATE = PropertyFactory.createDate("startDate", LocalDateTime.class);
    public static final EntityProperty<Contact> CONTACT = PropertyFactory.createEntity("contact", Contact.class);
    public static final EntityProperty<Program> PROGRAM = PropertyFactory.createEntity("program", Program.class);
    public static final EntityProperty<Ship> SHIP = PropertyFactory.createEntity("ship", Ship.class);

    protected LocalDateTime endDate;
    protected BigDecimal id;
    protected LocalDateTime startDate;

    protected Object contact;
    protected Object program;
    protected Object ship;

    public void setEndDate(LocalDateTime endDate) {
        beforePropertyWrite("endDate", this.endDate, endDate);
        this.endDate = endDate;
    }

    public LocalDateTime getEndDate() {
        beforePropertyRead("endDate");
        return this.endDate;
    }

    public void setId(BigDecimal id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public BigDecimal getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setStartDate(LocalDateTime startDate) {
        beforePropertyWrite("startDate", this.startDate, startDate);
        this.startDate = startDate;
    }

    public LocalDateTime getStartDate() {
        beforePropertyRead("startDate");
        return this.startDate;
    }

    public void setContact(Contact contact) {
        setToOneTarget("contact", contact, true);
    }

    public Contact getContact() {
        return (Contact)readProperty("contact");
    }

    public void setProgram(Program program) {
        setToOneTarget("program", program, true);
    }

    public Program getProgram() {
        return (Program)readProperty("program");
    }

    public void setShip(Ship ship) {
        setToOneTarget("ship", ship, true);
    }

    public Ship getShip() {
        return (Ship)readProperty("ship");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "endDate":
                return this.endDate;
            case "id":
                return this.id;
            case "startDate":
                return this.startDate;
            case "contact":
                return this.contact;
            case "program":
                return this.program;
            case "ship":
                return this.ship;
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
            case "endDate":
                this.endDate = (LocalDateTime)val;
                break;
            case "id":
                this.id = (BigDecimal)val;
                break;
            case "startDate":
                this.startDate = (LocalDateTime)val;
                break;
            case "contact":
                this.contact = val;
                break;
            case "program":
                this.program = val;
                break;
            case "ship":
                this.ship = val;
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
        out.writeObject(this.endDate);
        out.writeObject(this.id);
        out.writeObject(this.startDate);
        out.writeObject(this.contact);
        out.writeObject(this.program);
        out.writeObject(this.ship);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.endDate = (LocalDateTime)in.readObject();
        this.id = (BigDecimal)in.readObject();
        this.startDate = (LocalDateTime)in.readObject();
        this.contact = in.readObject();
        this.program = in.readObject();
        this.ship = in.readObject();
    }

}
