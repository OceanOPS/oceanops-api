package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericIdProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.api.orm.Contact;
import org.oceanops.api.orm.Program;
import org.oceanops.api.orm.Role;

/**
 * Class _ProgramContact was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ProgramContact extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final NumericIdProperty<BigDecimal> ID_PK_PROPERTY = PropertyFactory.createNumericId("ID", "ProgramContact", BigDecimal.class);
    public static final String ID_PK_COLUMN = "ID";

    public static final NumericProperty<BigDecimal> MZMS_AUTO_CHECK = PropertyFactory.createNumeric("mzmsAutoCheck", BigDecimal.class);
    public static final NumericProperty<BigDecimal> MZMS_WARNING_ENABLED = PropertyFactory.createNumeric("mzmsWarningEnabled", BigDecimal.class);
    public static final EntityProperty<Contact> CONTACT = PropertyFactory.createEntity("contact", Contact.class);
    public static final EntityProperty<Program> PROGRAM = PropertyFactory.createEntity("program", Program.class);
    public static final EntityProperty<Role> ROLE = PropertyFactory.createEntity("role", Role.class);

    protected BigDecimal mzmsAutoCheck;
    protected BigDecimal mzmsWarningEnabled;

    protected Object contact;
    protected Object program;
    protected Object role;

    public void setMzmsAutoCheck(BigDecimal mzmsAutoCheck) {
        beforePropertyWrite("mzmsAutoCheck", this.mzmsAutoCheck, mzmsAutoCheck);
        this.mzmsAutoCheck = mzmsAutoCheck;
    }

    public BigDecimal getMzmsAutoCheck() {
        beforePropertyRead("mzmsAutoCheck");
        return this.mzmsAutoCheck;
    }

    public void setMzmsWarningEnabled(BigDecimal mzmsWarningEnabled) {
        beforePropertyWrite("mzmsWarningEnabled", this.mzmsWarningEnabled, mzmsWarningEnabled);
        this.mzmsWarningEnabled = mzmsWarningEnabled;
    }

    public BigDecimal getMzmsWarningEnabled() {
        beforePropertyRead("mzmsWarningEnabled");
        return this.mzmsWarningEnabled;
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

    public void setRole(Role role) {
        setToOneTarget("role", role, true);
    }

    public Role getRole() {
        return (Role)readProperty("role");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "mzmsAutoCheck":
                return this.mzmsAutoCheck;
            case "mzmsWarningEnabled":
                return this.mzmsWarningEnabled;
            case "contact":
                return this.contact;
            case "program":
                return this.program;
            case "role":
                return this.role;
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
            case "mzmsAutoCheck":
                this.mzmsAutoCheck = (BigDecimal)val;
                break;
            case "mzmsWarningEnabled":
                this.mzmsWarningEnabled = (BigDecimal)val;
                break;
            case "contact":
                this.contact = val;
                break;
            case "program":
                this.program = val;
                break;
            case "role":
                this.role = val;
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
        out.writeObject(this.mzmsAutoCheck);
        out.writeObject(this.mzmsWarningEnabled);
        out.writeObject(this.contact);
        out.writeObject(this.program);
        out.writeObject(this.role);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.mzmsAutoCheck = (BigDecimal)in.readObject();
        this.mzmsWarningEnabled = (BigDecimal)in.readObject();
        this.contact = in.readObject();
        this.program = in.readObject();
        this.role = in.readObject();
    }

}
