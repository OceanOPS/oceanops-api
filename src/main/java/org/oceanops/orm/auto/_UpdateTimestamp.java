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
 * Class _UpdateTimestamp was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _UpdateTimestamp extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String NAME_PK_COLUMN = "NAME";

    public static final NumericProperty<Integer> COMPLETED = PropertyFactory.createNumeric("completed", Integer.class);
    public static final DateProperty<LocalDateTime> LAST_UPDATE = PropertyFactory.createDate("lastUpdate", LocalDateTime.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final NumericProperty<Integer> RUNNING = PropertyFactory.createNumeric("running", Integer.class);

    protected Integer completed;
    protected LocalDateTime lastUpdate;
    protected String name;
    protected Integer running;


    public void setCompleted(Integer completed) {
        beforePropertyWrite("completed", this.completed, completed);
        this.completed = completed;
    }

    public Integer getCompleted() {
        beforePropertyRead("completed");
        return this.completed;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        beforePropertyWrite("lastUpdate", this.lastUpdate, lastUpdate);
        this.lastUpdate = lastUpdate;
    }

    public LocalDateTime getLastUpdate() {
        beforePropertyRead("lastUpdate");
        return this.lastUpdate;
    }

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void setRunning(Integer running) {
        beforePropertyWrite("running", this.running, running);
        this.running = running;
    }

    public Integer getRunning() {
        beforePropertyRead("running");
        return this.running;
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "completed":
                return this.completed;
            case "lastUpdate":
                return this.lastUpdate;
            case "name":
                return this.name;
            case "running":
                return this.running;
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
            case "completed":
                this.completed = (Integer)val;
                break;
            case "lastUpdate":
                this.lastUpdate = (LocalDateTime)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "running":
                this.running = (Integer)val;
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
        out.writeObject(this.completed);
        out.writeObject(this.lastUpdate);
        out.writeObject(this.name);
        out.writeObject(this.running);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.completed = (Integer)in.readObject();
        this.lastUpdate = (LocalDateTime)in.readObject();
        this.name = (String)in.readObject();
        this.running = (Integer)in.readObject();
    }

}
