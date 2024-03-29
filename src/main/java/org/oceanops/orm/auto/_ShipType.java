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
import org.oceanops.orm.SdnPtfClass;
import org.oceanops.orm.Ship;

/**
 * Class _ShipType was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ShipType extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> CODE = PropertyFactory.createString("code", String.class);
    public static final StringProperty<String> DESCRIPTION = PropertyFactory.createString("description", String.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final StringProperty<String> ORIGINAL_DATASET = PropertyFactory.createString("originalDataset", String.class);
    public static final ListProperty<SdnPtfClass> SDN_PTF_CLASSES = PropertyFactory.createList("sdnPtfClasses", SdnPtfClass.class);
    public static final ListProperty<Ship> SHIPS = PropertyFactory.createList("ships", Ship.class);

    protected String code;
    protected String description;
    protected Integer id;
    protected String name;
    protected String originalDataset;

    protected Object sdnPtfClasses;
    protected Object ships;

    public void setCode(String code) {
        beforePropertyWrite("code", this.code, code);
        this.code = code;
    }

    public String getCode() {
        beforePropertyRead("code");
        return this.code;
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

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void setOriginalDataset(String originalDataset) {
        beforePropertyWrite("originalDataset", this.originalDataset, originalDataset);
        this.originalDataset = originalDataset;
    }

    public String getOriginalDataset() {
        beforePropertyRead("originalDataset");
        return this.originalDataset;
    }

    public void addToSdnPtfClasses(SdnPtfClass obj) {
        addToManyTarget("sdnPtfClasses", obj, true);
    }

    public void removeFromSdnPtfClasses(SdnPtfClass obj) {
        removeToManyTarget("sdnPtfClasses", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<SdnPtfClass> getSdnPtfClasses() {
        return (List<SdnPtfClass>)readProperty("sdnPtfClasses");
    }

    public void addToShips(Ship obj) {
        addToManyTarget("ships", obj, true);
    }

    public void removeFromShips(Ship obj) {
        removeToManyTarget("ships", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Ship> getShips() {
        return (List<Ship>)readProperty("ships");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "code":
                return this.code;
            case "description":
                return this.description;
            case "id":
                return this.id;
            case "name":
                return this.name;
            case "originalDataset":
                return this.originalDataset;
            case "sdnPtfClasses":
                return this.sdnPtfClasses;
            case "ships":
                return this.ships;
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
            case "code":
                this.code = (String)val;
                break;
            case "description":
                this.description = (String)val;
                break;
            case "id":
                this.id = (Integer)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "originalDataset":
                this.originalDataset = (String)val;
                break;
            case "sdnPtfClasses":
                this.sdnPtfClasses = val;
                break;
            case "ships":
                this.ships = val;
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
        out.writeObject(this.code);
        out.writeObject(this.description);
        out.writeObject(this.id);
        out.writeObject(this.name);
        out.writeObject(this.originalDataset);
        out.writeObject(this.sdnPtfClasses);
        out.writeObject(this.ships);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.code = (String)in.readObject();
        this.description = (String)in.readObject();
        this.id = (Integer)in.readObject();
        this.name = (String)in.readObject();
        this.originalDataset = (String)in.readObject();
        this.sdnPtfClasses = in.readObject();
        this.ships = in.readObject();
    }

}
