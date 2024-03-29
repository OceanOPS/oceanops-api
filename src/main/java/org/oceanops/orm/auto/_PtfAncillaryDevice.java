package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.orm.Ptf;
import org.oceanops.orm.PtfAncillaryDeviceName;
import org.oceanops.orm.PtfAncillaryDeviceVersion;

/**
 * Class _PtfAncillaryDevice was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PtfAncillaryDevice extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> SERIAL_REF = PropertyFactory.createString("serialRef", String.class);
    public static final EntityProperty<Ptf> PTF = PropertyFactory.createEntity("ptf", Ptf.class);
    public static final EntityProperty<PtfAncillaryDeviceName> PTF_ANCILLARY_DEVICE_NAME = PropertyFactory.createEntity("ptfAncillaryDeviceName", PtfAncillaryDeviceName.class);
    public static final EntityProperty<PtfAncillaryDeviceVersion> PTF_ANCILLARY_DEVICE_VERSION = PropertyFactory.createEntity("ptfAncillaryDeviceVersion", PtfAncillaryDeviceVersion.class);

    protected String serialRef;

    protected Object ptf;
    protected Object ptfAncillaryDeviceName;
    protected Object ptfAncillaryDeviceVersion;

    public void setSerialRef(String serialRef) {
        beforePropertyWrite("serialRef", this.serialRef, serialRef);
        this.serialRef = serialRef;
    }

    public String getSerialRef() {
        beforePropertyRead("serialRef");
        return this.serialRef;
    }

    public void setPtf(Ptf ptf) {
        setToOneTarget("ptf", ptf, true);
    }

    public Ptf getPtf() {
        return (Ptf)readProperty("ptf");
    }

    public void setPtfAncillaryDeviceName(PtfAncillaryDeviceName ptfAncillaryDeviceName) {
        setToOneTarget("ptfAncillaryDeviceName", ptfAncillaryDeviceName, true);
    }

    public PtfAncillaryDeviceName getPtfAncillaryDeviceName() {
        return (PtfAncillaryDeviceName)readProperty("ptfAncillaryDeviceName");
    }

    public void setPtfAncillaryDeviceVersion(PtfAncillaryDeviceVersion ptfAncillaryDeviceVersion) {
        setToOneTarget("ptfAncillaryDeviceVersion", ptfAncillaryDeviceVersion, true);
    }

    public PtfAncillaryDeviceVersion getPtfAncillaryDeviceVersion() {
        return (PtfAncillaryDeviceVersion)readProperty("ptfAncillaryDeviceVersion");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "serialRef":
                return this.serialRef;
            case "ptf":
                return this.ptf;
            case "ptfAncillaryDeviceName":
                return this.ptfAncillaryDeviceName;
            case "ptfAncillaryDeviceVersion":
                return this.ptfAncillaryDeviceVersion;
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
            case "serialRef":
                this.serialRef = (String)val;
                break;
            case "ptf":
                this.ptf = val;
                break;
            case "ptfAncillaryDeviceName":
                this.ptfAncillaryDeviceName = val;
                break;
            case "ptfAncillaryDeviceVersion":
                this.ptfAncillaryDeviceVersion = val;
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
        out.writeObject(this.serialRef);
        out.writeObject(this.ptf);
        out.writeObject(this.ptfAncillaryDeviceName);
        out.writeObject(this.ptfAncillaryDeviceVersion);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.serialRef = (String)in.readObject();
        this.ptf = in.readObject();
        this.ptfAncillaryDeviceName = in.readObject();
        this.ptfAncillaryDeviceVersion = in.readObject();
    }

}
