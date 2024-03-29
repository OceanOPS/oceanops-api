package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.orm.Doc;
import org.oceanops.orm.TelecomFormat;

/**
 * Class _TelecomFormatDoc was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TelecomFormatDoc extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String DOC_ID_PK_COLUMN = "DOC_ID";
    public static final String TELECOM_FORMAT_ID_PK_COLUMN = "TELECOM_FORMAT_ID";

    public static final NumericProperty<Integer> DOC_ID = PropertyFactory.createNumeric("docId", Integer.class);
    public static final NumericProperty<Integer> TELECOM_FORMAT_ID = PropertyFactory.createNumeric("telecomFormatId", Integer.class);
    public static final EntityProperty<Doc> DOC = PropertyFactory.createEntity("doc", Doc.class);
    public static final EntityProperty<TelecomFormat> TELECOM_FORMAT = PropertyFactory.createEntity("telecomFormat", TelecomFormat.class);

    protected Integer docId;
    protected Integer telecomFormatId;

    protected Object doc;
    protected Object telecomFormat;

    public void setDocId(Integer docId) {
        beforePropertyWrite("docId", this.docId, docId);
        this.docId = docId;
    }

    public Integer getDocId() {
        beforePropertyRead("docId");
        return this.docId;
    }

    public void setTelecomFormatId(Integer telecomFormatId) {
        beforePropertyWrite("telecomFormatId", this.telecomFormatId, telecomFormatId);
        this.telecomFormatId = telecomFormatId;
    }

    public Integer getTelecomFormatId() {
        beforePropertyRead("telecomFormatId");
        return this.telecomFormatId;
    }

    public void setDoc(Doc doc) {
        setToOneTarget("doc", doc, true);
    }

    public Doc getDoc() {
        return (Doc)readProperty("doc");
    }

    public void setTelecomFormat(TelecomFormat telecomFormat) {
        setToOneTarget("telecomFormat", telecomFormat, true);
    }

    public TelecomFormat getTelecomFormat() {
        return (TelecomFormat)readProperty("telecomFormat");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "docId":
                return this.docId;
            case "telecomFormatId":
                return this.telecomFormatId;
            case "doc":
                return this.doc;
            case "telecomFormat":
                return this.telecomFormat;
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
            case "docId":
                this.docId = (Integer)val;
                break;
            case "telecomFormatId":
                this.telecomFormatId = (Integer)val;
                break;
            case "doc":
                this.doc = val;
                break;
            case "telecomFormat":
                this.telecomFormat = val;
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
        out.writeObject(this.docId);
        out.writeObject(this.telecomFormatId);
        out.writeObject(this.doc);
        out.writeObject(this.telecomFormat);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.docId = (Integer)in.readObject();
        this.telecomFormatId = (Integer)in.readObject();
        this.doc = in.readObject();
        this.telecomFormat = in.readObject();
    }

}
