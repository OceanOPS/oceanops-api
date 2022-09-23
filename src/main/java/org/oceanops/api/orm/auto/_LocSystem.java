package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.api.orm.Ptf;

/**
 * Class _LocSystem was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LocSystem extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final StringProperty<String> NAME_SHORT = PropertyFactory.createString("nameShort", String.class);
    public static final StringProperty<String> WIGOS_CODE = PropertyFactory.createString("wigosCode", String.class);
    public static final ListProperty<Ptf> PTFS = PropertyFactory.createList("ptfs", Ptf.class);
    public static final ListProperty<Ptf> PTFS1 = PropertyFactory.createList("ptfs1", Ptf.class);

    protected Integer id;
    protected String name;
    protected String nameShort;
    protected String wigosCode;

    protected Object ptfs;
    protected Object ptfs1;

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

    public void setNameShort(String nameShort) {
        beforePropertyWrite("nameShort", this.nameShort, nameShort);
        this.nameShort = nameShort;
    }

    public String getNameShort() {
        beforePropertyRead("nameShort");
        return this.nameShort;
    }

    public void setWigosCode(String wigosCode) {
        beforePropertyWrite("wigosCode", this.wigosCode, wigosCode);
        this.wigosCode = wigosCode;
    }

    public String getWigosCode() {
        beforePropertyRead("wigosCode");
        return this.wigosCode;
    }

    public void addToPtfs(Ptf obj) {
        addToManyTarget("ptfs", obj, true);
    }

    public void removeFromPtfs(Ptf obj) {
        removeToManyTarget("ptfs", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Ptf> getPtfs() {
        return (List<Ptf>)readProperty("ptfs");
    }

    public void addToPtfs1(Ptf obj) {
        addToManyTarget("ptfs1", obj, true);
    }

    public void removeFromPtfs1(Ptf obj) {
        removeToManyTarget("ptfs1", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Ptf> getPtfs1() {
        return (List<Ptf>)readProperty("ptfs1");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "id":
                return this.id;
            case "name":
                return this.name;
            case "nameShort":
                return this.nameShort;
            case "wigosCode":
                return this.wigosCode;
            case "ptfs":
                return this.ptfs;
            case "ptfs1":
                return this.ptfs1;
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
            case "id":
                this.id = (Integer)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "nameShort":
                this.nameShort = (String)val;
                break;
            case "wigosCode":
                this.wigosCode = (String)val;
                break;
            case "ptfs":
                this.ptfs = val;
                break;
            case "ptfs1":
                this.ptfs1 = val;
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
        out.writeObject(this.id);
        out.writeObject(this.name);
        out.writeObject(this.nameShort);
        out.writeObject(this.wigosCode);
        out.writeObject(this.ptfs);
        out.writeObject(this.ptfs1);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.id = (Integer)in.readObject();
        this.name = (String)in.readObject();
        this.nameShort = (String)in.readObject();
        this.wigosCode = (String)in.readObject();
        this.ptfs = in.readObject();
        this.ptfs1 = in.readObject();
    }

}
