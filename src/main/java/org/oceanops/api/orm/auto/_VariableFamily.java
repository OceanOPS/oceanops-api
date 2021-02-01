package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.oceanops.api.orm.Variable;
import org.oceanops.api.orm.VariableVariableFamily;

/**
 * Class _VariableFamily was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VariableFamily extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final StringProperty<String> DESCRIPTION = PropertyFactory.createString("description", String.class);
    public static final NumericProperty<BigDecimal> ECV = PropertyFactory.createNumeric("ecv", BigDecimal.class);
    public static final NumericProperty<BigDecimal> EOV = PropertyFactory.createNumeric("eov", BigDecimal.class);
    public static final NumericProperty<BigDecimal> ID = PropertyFactory.createNumeric("id", BigDecimal.class);
    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final StringProperty<String> NAME_SHORT = PropertyFactory.createString("nameShort", String.class);
    public static final ListProperty<VariableVariableFamily> VARIABLE_VARIABLE_FAMILIES = PropertyFactory.createList("variableVariableFamilies", VariableVariableFamily.class);
    public static final ListProperty<Variable> VARIABLES = PropertyFactory.createList("variables", Variable.class);

    protected String description;
    protected BigDecimal ecv;
    protected BigDecimal eov;
    protected BigDecimal id;
    protected String name;
    protected String nameShort;

    protected Object variableVariableFamilies;
    protected Object variables;

    public void setDescription(String description) {
        beforePropertyWrite("description", this.description, description);
        this.description = description;
    }

    public String getDescription() {
        beforePropertyRead("description");
        return this.description;
    }

    public void setEcv(BigDecimal ecv) {
        beforePropertyWrite("ecv", this.ecv, ecv);
        this.ecv = ecv;
    }

    public BigDecimal getEcv() {
        beforePropertyRead("ecv");
        return this.ecv;
    }

    public void setEov(BigDecimal eov) {
        beforePropertyWrite("eov", this.eov, eov);
        this.eov = eov;
    }

    public BigDecimal getEov() {
        beforePropertyRead("eov");
        return this.eov;
    }

    public void setId(BigDecimal id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public BigDecimal getId() {
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

    public void addToVariableVariableFamilies(VariableVariableFamily obj) {
        addToManyTarget("variableVariableFamilies", obj, true);
    }

    public void removeFromVariableVariableFamilies(VariableVariableFamily obj) {
        removeToManyTarget("variableVariableFamilies", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<VariableVariableFamily> getVariableVariableFamilies() {
        return (List<VariableVariableFamily>)readProperty("variableVariableFamilies");
    }

    public void addToVariables(Variable obj) {
        addToManyTarget("variables", obj, true);
    }

    public void removeFromVariables(Variable obj) {
        removeToManyTarget("variables", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Variable> getVariables() {
        return (List<Variable>)readProperty("variables");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "description":
                return this.description;
            case "ecv":
                return this.ecv;
            case "eov":
                return this.eov;
            case "id":
                return this.id;
            case "name":
                return this.name;
            case "nameShort":
                return this.nameShort;
            case "variableVariableFamilies":
                return this.variableVariableFamilies;
            case "variables":
                return this.variables;
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
            case "ecv":
                this.ecv = (BigDecimal)val;
                break;
            case "eov":
                this.eov = (BigDecimal)val;
                break;
            case "id":
                this.id = (BigDecimal)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "nameShort":
                this.nameShort = (String)val;
                break;
            case "variableVariableFamilies":
                this.variableVariableFamilies = val;
                break;
            case "variables":
                this.variables = val;
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
        out.writeObject(this.ecv);
        out.writeObject(this.eov);
        out.writeObject(this.id);
        out.writeObject(this.name);
        out.writeObject(this.nameShort);
        out.writeObject(this.variableVariableFamilies);
        out.writeObject(this.variables);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.description = (String)in.readObject();
        this.ecv = (BigDecimal)in.readObject();
        this.eov = (BigDecimal)in.readObject();
        this.id = (BigDecimal)in.readObject();
        this.name = (String)in.readObject();
        this.nameShort = (String)in.readObject();
        this.variableVariableFamilies = in.readObject();
        this.variables = in.readObject();
    }

}
