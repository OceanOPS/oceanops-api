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
import org.oceanops.api.orm.Ptf;

/**
 * Class _Wmo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Wmo extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final DateProperty<LocalDateTime> END_DATE = PropertyFactory.createDate("endDate", LocalDateTime.class);
    public static final NumericProperty<Integer> FIVEDIGIT_DUPL_EXISTS = PropertyFactory.createNumeric("fivedigitDuplExists", Integer.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final NumericProperty<Integer> MASK = PropertyFactory.createNumeric("mask", Integer.class);
    public static final DateProperty<LocalDateTime> START_DATE = PropertyFactory.createDate("startDate", LocalDateTime.class);
    public static final StringProperty<String> WMO = PropertyFactory.createString("wmo", String.class);
    public static final EntityProperty<Ptf> PTF = PropertyFactory.createEntity("ptf", Ptf.class);

    protected LocalDateTime endDate;
    protected Integer fivedigitDuplExists;
    protected Integer id;
    protected Integer mask;
    protected LocalDateTime startDate;
    protected String wmo;

    protected Object ptf;

    public void setEndDate(LocalDateTime endDate) {
        beforePropertyWrite("endDate", this.endDate, endDate);
        this.endDate = endDate;
    }

    public LocalDateTime getEndDate() {
        beforePropertyRead("endDate");
        return this.endDate;
    }

    public void setFivedigitDuplExists(Integer fivedigitDuplExists) {
        beforePropertyWrite("fivedigitDuplExists", this.fivedigitDuplExists, fivedigitDuplExists);
        this.fivedigitDuplExists = fivedigitDuplExists;
    }

    public Integer getFivedigitDuplExists() {
        beforePropertyRead("fivedigitDuplExists");
        return this.fivedigitDuplExists;
    }

    public void setId(Integer id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public Integer getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setMask(Integer mask) {
        beforePropertyWrite("mask", this.mask, mask);
        this.mask = mask;
    }

    public Integer getMask() {
        beforePropertyRead("mask");
        return this.mask;
    }

    public void setStartDate(LocalDateTime startDate) {
        beforePropertyWrite("startDate", this.startDate, startDate);
        this.startDate = startDate;
    }

    public LocalDateTime getStartDate() {
        beforePropertyRead("startDate");
        return this.startDate;
    }

    public void setWmo(String wmo) {
        beforePropertyWrite("wmo", this.wmo, wmo);
        this.wmo = wmo;
    }

    public String getWmo() {
        beforePropertyRead("wmo");
        return this.wmo;
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
            case "endDate":
                return this.endDate;
            case "fivedigitDuplExists":
                return this.fivedigitDuplExists;
            case "id":
                return this.id;
            case "mask":
                return this.mask;
            case "startDate":
                return this.startDate;
            case "wmo":
                return this.wmo;
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
            case "endDate":
                this.endDate = (LocalDateTime)val;
                break;
            case "fivedigitDuplExists":
                this.fivedigitDuplExists = (Integer)val;
                break;
            case "id":
                this.id = (Integer)val;
                break;
            case "mask":
                this.mask = (Integer)val;
                break;
            case "startDate":
                this.startDate = (LocalDateTime)val;
                break;
            case "wmo":
                this.wmo = (String)val;
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
        out.writeObject(this.endDate);
        out.writeObject(this.fivedigitDuplExists);
        out.writeObject(this.id);
        out.writeObject(this.mask);
        out.writeObject(this.startDate);
        out.writeObject(this.wmo);
        out.writeObject(this.ptf);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.endDate = (LocalDateTime)in.readObject();
        this.fivedigitDuplExists = (Integer)in.readObject();
        this.id = (Integer)in.readObject();
        this.mask = (Integer)in.readObject();
        this.startDate = (LocalDateTime)in.readObject();
        this.wmo = (String)in.readObject();
        this.ptf = in.readObject();
    }

}
