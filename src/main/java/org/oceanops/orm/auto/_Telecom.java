package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.orm.Latency;
import org.oceanops.orm.Ptf;
import org.oceanops.orm.TelecomFormat;
import org.oceanops.orm.TelecomService;
import org.oceanops.orm.TelecomType;

/**
 * Class _Telecom was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Telecom extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final DateProperty<LocalDateTime> END_DATE = PropertyFactory.createDate("endDate", LocalDateTime.class);
    public static final StringProperty<String> FREQUENCY = PropertyFactory.createString("frequency", String.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final StringProperty<String> IMEI = PropertyFactory.createString("imei", String.class);
    public static final StringProperty<String> NUM = PropertyFactory.createString("num", String.class);
    public static final StringProperty<String> REF_PROG = PropertyFactory.createString("refProg", String.class);
    public static final DateProperty<LocalDateTime> START_DATE = PropertyFactory.createDate("startDate", LocalDateTime.class);
    public static final EntityProperty<Latency> LATENCY = PropertyFactory.createEntity("latency", Latency.class);
    public static final ListProperty<Ptf> PTF = PropertyFactory.createList("ptf", Ptf.class);
    public static final ListProperty<Ptf> PTF_BACKUP = PropertyFactory.createList("ptfBackup", Ptf.class);
    public static final EntityProperty<TelecomFormat> TELECOM_FORMAT = PropertyFactory.createEntity("telecomFormat", TelecomFormat.class);
    public static final EntityProperty<TelecomService> TELECOM_SERVICE = PropertyFactory.createEntity("telecomService", TelecomService.class);
    public static final EntityProperty<TelecomType> TELECOM_TYPE = PropertyFactory.createEntity("telecomType", TelecomType.class);

    protected LocalDateTime endDate;
    protected String frequency;
    protected Integer id;
    protected String imei;
    protected String num;
    protected String refProg;
    protected LocalDateTime startDate;

    protected Object latency;
    protected Object ptf;
    protected Object ptfBackup;
    protected Object telecomFormat;
    protected Object telecomService;
    protected Object telecomType;

    public void setEndDate(LocalDateTime endDate) {
        beforePropertyWrite("endDate", this.endDate, endDate);
        this.endDate = endDate;
    }

    public LocalDateTime getEndDate() {
        beforePropertyRead("endDate");
        return this.endDate;
    }

    public void setFrequency(String frequency) {
        beforePropertyWrite("frequency", this.frequency, frequency);
        this.frequency = frequency;
    }

    public String getFrequency() {
        beforePropertyRead("frequency");
        return this.frequency;
    }

    public void setId(Integer id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public Integer getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setImei(String imei) {
        beforePropertyWrite("imei", this.imei, imei);
        this.imei = imei;
    }

    public String getImei() {
        beforePropertyRead("imei");
        return this.imei;
    }

    public void setNum(String num) {
        beforePropertyWrite("num", this.num, num);
        this.num = num;
    }

    public String getNum() {
        beforePropertyRead("num");
        return this.num;
    }

    public void setRefProg(String refProg) {
        beforePropertyWrite("refProg", this.refProg, refProg);
        this.refProg = refProg;
    }

    public String getRefProg() {
        beforePropertyRead("refProg");
        return this.refProg;
    }

    public void setStartDate(LocalDateTime startDate) {
        beforePropertyWrite("startDate", this.startDate, startDate);
        this.startDate = startDate;
    }

    public LocalDateTime getStartDate() {
        beforePropertyRead("startDate");
        return this.startDate;
    }

    public void setLatency(Latency latency) {
        setToOneTarget("latency", latency, true);
    }

    public Latency getLatency() {
        return (Latency)readProperty("latency");
    }

    public void addToPtf(Ptf obj) {
        addToManyTarget("ptf", obj, true);
    }

    public void removeFromPtf(Ptf obj) {
        removeToManyTarget("ptf", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Ptf> getPtf() {
        return (List<Ptf>)readProperty("ptf");
    }

    public void addToPtfBackup(Ptf obj) {
        addToManyTarget("ptfBackup", obj, true);
    }

    public void removeFromPtfBackup(Ptf obj) {
        removeToManyTarget("ptfBackup", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Ptf> getPtfBackup() {
        return (List<Ptf>)readProperty("ptfBackup");
    }

    public void setTelecomFormat(TelecomFormat telecomFormat) {
        setToOneTarget("telecomFormat", telecomFormat, true);
    }

    public TelecomFormat getTelecomFormat() {
        return (TelecomFormat)readProperty("telecomFormat");
    }

    public void setTelecomService(TelecomService telecomService) {
        setToOneTarget("telecomService", telecomService, true);
    }

    public TelecomService getTelecomService() {
        return (TelecomService)readProperty("telecomService");
    }

    public void setTelecomType(TelecomType telecomType) {
        setToOneTarget("telecomType", telecomType, true);
    }

    public TelecomType getTelecomType() {
        return (TelecomType)readProperty("telecomType");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "endDate":
                return this.endDate;
            case "frequency":
                return this.frequency;
            case "id":
                return this.id;
            case "imei":
                return this.imei;
            case "num":
                return this.num;
            case "refProg":
                return this.refProg;
            case "startDate":
                return this.startDate;
            case "latency":
                return this.latency;
            case "ptf":
                return this.ptf;
            case "ptfBackup":
                return this.ptfBackup;
            case "telecomFormat":
                return this.telecomFormat;
            case "telecomService":
                return this.telecomService;
            case "telecomType":
                return this.telecomType;
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
            case "frequency":
                this.frequency = (String)val;
                break;
            case "id":
                this.id = (Integer)val;
                break;
            case "imei":
                this.imei = (String)val;
                break;
            case "num":
                this.num = (String)val;
                break;
            case "refProg":
                this.refProg = (String)val;
                break;
            case "startDate":
                this.startDate = (LocalDateTime)val;
                break;
            case "latency":
                this.latency = val;
                break;
            case "ptf":
                this.ptf = val;
                break;
            case "ptfBackup":
                this.ptfBackup = val;
                break;
            case "telecomFormat":
                this.telecomFormat = val;
                break;
            case "telecomService":
                this.telecomService = val;
                break;
            case "telecomType":
                this.telecomType = val;
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
        out.writeObject(this.frequency);
        out.writeObject(this.id);
        out.writeObject(this.imei);
        out.writeObject(this.num);
        out.writeObject(this.refProg);
        out.writeObject(this.startDate);
        out.writeObject(this.latency);
        out.writeObject(this.ptf);
        out.writeObject(this.ptfBackup);
        out.writeObject(this.telecomFormat);
        out.writeObject(this.telecomService);
        out.writeObject(this.telecomType);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.endDate = (LocalDateTime)in.readObject();
        this.frequency = (String)in.readObject();
        this.id = (Integer)in.readObject();
        this.imei = (String)in.readObject();
        this.num = (String)in.readObject();
        this.refProg = (String)in.readObject();
        this.startDate = (LocalDateTime)in.readObject();
        this.latency = in.readObject();
        this.ptf = in.readObject();
        this.ptfBackup = in.readObject();
        this.telecomFormat = in.readObject();
        this.telecomService = in.readObject();
        this.telecomType = in.readObject();
    }

}