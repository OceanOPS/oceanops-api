package org.oceanops.api.orm;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _VariableVariableFamily was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _VariableVariableFamily extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String VARIABLE_FAMILY_ID_PK_COLUMN = "VARIABLE_FAMILY_ID";
    public static final String VARIABLE_ID_PK_COLUMN = "VARIABLE_ID";

    public static final Property<Integer> VARIABLE_FAMILY_ID = Property.create("variableFamilyId", Integer.class);
    public static final Property<Integer> VARIABLE_ID = Property.create("variableId", Integer.class);
    public static final Property<Variable> VARIABLE = Property.create("variable", Variable.class);
    public static final Property<VariableFamily> VARIABLE_FAMILY = Property.create("variableFamily", VariableFamily.class);

    public void setVariableFamilyId(int variableFamilyId) {
        writeProperty("variableFamilyId", variableFamilyId);
    }
    public int getVariableFamilyId() {
        Object value = readProperty("variableFamilyId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setVariableId(int variableId) {
        writeProperty("variableId", variableId);
    }
    public int getVariableId() {
        Object value = readProperty("variableId");
        return (value != null) ? (Integer) value : 0;
    }

    public void setVariable(Variable variable) {
        setToOneTarget("variable", variable, true);
    }

    public Variable getVariable() {
        return (Variable)readProperty("variable");
    }


    public void setVariableFamily(VariableFamily variableFamily) {
        setToOneTarget("variableFamily", variableFamily, true);
    }

    public VariableFamily getVariableFamily() {
        return (VariableFamily)readProperty("variableFamily");
    }


}