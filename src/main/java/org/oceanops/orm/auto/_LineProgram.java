package org.oceanops.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.orm.Line;
import org.oceanops.orm.Program;

/**
 * Class _LineProgram was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LineProgram extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String LINE_ID_PK_COLUMN = "LINE_ID";
    public static final String PROGRAM_ID_PK_COLUMN = "PROGRAM_ID";

    public static final NumericProperty<Integer> LEAD = PropertyFactory.createNumeric("lead", Integer.class);
    public static final NumericProperty<Integer> LINE_ID = PropertyFactory.createNumeric("lineId", Integer.class);
    public static final NumericProperty<Integer> PROGRAM_ID = PropertyFactory.createNumeric("programId", Integer.class);
    public static final EntityProperty<Line> LINE = PropertyFactory.createEntity("line", Line.class);
    public static final EntityProperty<Program> PROGRAM = PropertyFactory.createEntity("program", Program.class);

    protected Integer lead;
    protected Integer lineId;
    protected Integer programId;

    protected Object line;
    protected Object program;

    public void setLead(Integer lead) {
        beforePropertyWrite("lead", this.lead, lead);
        this.lead = lead;
    }

    public Integer getLead() {
        beforePropertyRead("lead");
        return this.lead;
    }

    public void setLineId(Integer lineId) {
        beforePropertyWrite("lineId", this.lineId, lineId);
        this.lineId = lineId;
    }

    public Integer getLineId() {
        beforePropertyRead("lineId");
        return this.lineId;
    }

    public void setProgramId(Integer programId) {
        beforePropertyWrite("programId", this.programId, programId);
        this.programId = programId;
    }

    public Integer getProgramId() {
        beforePropertyRead("programId");
        return this.programId;
    }

    public void setLine(Line line) {
        setToOneTarget("line", line, true);
    }

    public Line getLine() {
        return (Line)readProperty("line");
    }

    public void setProgram(Program program) {
        setToOneTarget("program", program, true);
    }

    public Program getProgram() {
        return (Program)readProperty("program");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "lead":
                return this.lead;
            case "lineId":
                return this.lineId;
            case "programId":
                return this.programId;
            case "line":
                return this.line;
            case "program":
                return this.program;
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
            case "lead":
                this.lead = (Integer)val;
                break;
            case "lineId":
                this.lineId = (Integer)val;
                break;
            case "programId":
                this.programId = (Integer)val;
                break;
            case "line":
                this.line = val;
                break;
            case "program":
                this.program = val;
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
        out.writeObject(this.lead);
        out.writeObject(this.lineId);
        out.writeObject(this.programId);
        out.writeObject(this.line);
        out.writeObject(this.program);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.lead = (Integer)in.readObject();
        this.lineId = (Integer)in.readObject();
        this.programId = (Integer)in.readObject();
        this.line = in.readObject();
        this.program = in.readObject();
    }

}
