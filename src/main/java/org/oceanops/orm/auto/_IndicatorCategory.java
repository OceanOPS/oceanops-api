package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.orm.Indicator;

/**
 * Class _IndicatorCategory was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _IndicatorCategory extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> DESCRIPTION = PropertyFactory.createString("description", String.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final NumericProperty<Integer> RANK = PropertyFactory.createNumeric("rank", Integer.class);
    public static final ListProperty<Indicator> INDICATORS = PropertyFactory.createList("indicators", Indicator.class);

    protected String description;
    protected Integer id;
    protected String name;
    protected Integer rank;

    protected Object indicators;

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

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void setRank(Integer rank) {
        beforePropertyWrite("rank", this.rank, rank);
        this.rank = rank;
    }

    public Integer getRank() {
        beforePropertyRead("rank");
        return this.rank;
    }

    public void addToIndicators(Indicator obj) {
        addToManyTarget("indicators", obj, true);
    }

    public void removeFromIndicators(Indicator obj) {
        removeToManyTarget("indicators", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Indicator> getIndicators() {
        return (List<Indicator>)readProperty("indicators");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "description":
                return this.description;
            case "id":
                return this.id;
            case "name":
                return this.name;
            case "rank":
                return this.rank;
            case "indicators":
                return this.indicators;
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
            case "description":
                this.description = (String)val;
                break;
            case "id":
                this.id = (Integer)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "rank":
                this.rank = (Integer)val;
                break;
            case "indicators":
                this.indicators = val;
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
        out.writeObject(this.description);
        out.writeObject(this.id);
        out.writeObject(this.name);
        out.writeObject(this.rank);
        out.writeObject(this.indicators);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.description = (String)in.readObject();
        this.id = (Integer)in.readObject();
        this.name = (String)in.readObject();
        this.rank = (Integer)in.readObject();
        this.indicators = in.readObject();
    }

}