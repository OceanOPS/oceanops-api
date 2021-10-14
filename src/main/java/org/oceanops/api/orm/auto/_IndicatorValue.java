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
import org.oceanops.api.orm.Indicator;

/**
 * Class _IndicatorValue was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _IndicatorValue extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final DateProperty<LocalDateTime> END_DATE = PropertyFactory.createDate("endDate", LocalDateTime.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final DateProperty<LocalDateTime> START_DATE = PropertyFactory.createDate("startDate", LocalDateTime.class);
    public static final NumericProperty<Double> VALUE = PropertyFactory.createNumeric("value", Double.class);
    public static final NumericProperty<Double> VALUE_RAW = PropertyFactory.createNumeric("valueRaw", Double.class);
    public static final EntityProperty<Indicator> INDICATOR = PropertyFactory.createEntity("indicator", Indicator.class);

    protected LocalDateTime endDate;
    protected Integer id;
    protected LocalDateTime startDate;
    protected Double value;
    protected Double valueRaw;

    protected Object indicator;

    public void setEndDate(LocalDateTime endDate) {
        beforePropertyWrite("endDate", this.endDate, endDate);
        this.endDate = endDate;
    }

    public LocalDateTime getEndDate() {
        beforePropertyRead("endDate");
        return this.endDate;
    }

    public void setId(Integer id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public Integer getId() {
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

    public void setValue(Double value) {
        beforePropertyWrite("value", this.value, value);
        this.value = value;
    }

    public Double getValue() {
        beforePropertyRead("value");
        return this.value;
    }

    public void setValueRaw(Double valueRaw) {
        beforePropertyWrite("valueRaw", this.valueRaw, valueRaw);
        this.valueRaw = valueRaw;
    }

    public Double getValueRaw() {
        beforePropertyRead("valueRaw");
        return this.valueRaw;
    }

    public void setIndicator(Indicator indicator) {
        setToOneTarget("indicator", indicator, true);
    }

    public Indicator getIndicator() {
        return (Indicator)readProperty("indicator");
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
            case "value":
                return this.value;
            case "valueRaw":
                return this.valueRaw;
            case "indicator":
                return this.indicator;
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
                this.id = (Integer)val;
                break;
            case "startDate":
                this.startDate = (LocalDateTime)val;
                break;
            case "value":
                this.value = (Double)val;
                break;
            case "valueRaw":
                this.valueRaw = (Double)val;
                break;
            case "indicator":
                this.indicator = val;
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
        out.writeObject(this.value);
        out.writeObject(this.valueRaw);
        out.writeObject(this.indicator);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.endDate = (LocalDateTime)in.readObject();
        this.id = (Integer)in.readObject();
        this.startDate = (LocalDateTime)in.readObject();
        this.value = (Double)in.readObject();
        this.valueRaw = (Double)in.readObject();
        this.indicator = in.readObject();
    }

}
