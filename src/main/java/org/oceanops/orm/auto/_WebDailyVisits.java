package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;

/**
 * Class _WebDailyVisits was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _WebDailyVisits extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String DAY_PK_COLUMN = "DAY";
    public static final String THEME_PK_COLUMN = "THEME";

    public static final DateProperty<LocalDateTime> DAY = PropertyFactory.createDate("day", LocalDateTime.class);
    public static final NumericProperty<Integer> NB_VISITS = PropertyFactory.createNumeric("nbVisits", Integer.class);
    public static final StringProperty<String> THEME = PropertyFactory.createString("theme", String.class);

    protected LocalDateTime day;
    protected Integer nbVisits;
    protected String theme;


    public void setDay(LocalDateTime day) {
        beforePropertyWrite("day", this.day, day);
        this.day = day;
    }

    public LocalDateTime getDay() {
        beforePropertyRead("day");
        return this.day;
    }

    public void setNbVisits(Integer nbVisits) {
        beforePropertyWrite("nbVisits", this.nbVisits, nbVisits);
        this.nbVisits = nbVisits;
    }

    public Integer getNbVisits() {
        beforePropertyRead("nbVisits");
        return this.nbVisits;
    }

    public void setTheme(String theme) {
        beforePropertyWrite("theme", this.theme, theme);
        this.theme = theme;
    }

    public String getTheme() {
        beforePropertyRead("theme");
        return this.theme;
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "day":
                return this.day;
            case "nbVisits":
                return this.nbVisits;
            case "theme":
                return this.theme;
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
            case "day":
                this.day = (LocalDateTime)val;
                break;
            case "nbVisits":
                this.nbVisits = (Integer)val;
                break;
            case "theme":
                this.theme = (String)val;
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
        out.writeObject(this.day);
        out.writeObject(this.nbVisits);
        out.writeObject(this.theme);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.day = (LocalDateTime)in.readObject();
        this.nbVisits = (Integer)in.readObject();
        this.theme = (String)in.readObject();
    }

}
