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
import org.oceanops.api.orm.Obs;

/**
 * Class _GtsCode was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _GtsCode extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String ID_PK_COLUMN = "ID";

    public static final NumericProperty<Integer> ACTIVE = PropertyFactory.createNumeric("active", Integer.class);
    public static final StringProperty<String> CODE_LETTERS = PropertyFactory.createString("codeLetters", String.class);
    public static final StringProperty<String> CODE_NAME = PropertyFactory.createString("codeName", String.class);
    public static final StringProperty<String> CODE_NAME2 = PropertyFactory.createString("codeName2", String.class);
    public static final StringProperty<String> COMMENTS = PropertyFactory.createString("comments", String.class);
    public static final StringProperty<String> FORMAL_CODE = PropertyFactory.createString("formalCode", String.class);
    public static final NumericProperty<Integer> ID = PropertyFactory.createNumeric("id", Integer.class);
    public static final StringProperty<String> MAIN_PTF_TYPE = PropertyFactory.createString("mainPtfType", String.class);
    public static final StringProperty<String> TAG = PropertyFactory.createString("tag", String.class);
    public static final ListProperty<Obs> OBSS = PropertyFactory.createList("obss", Obs.class);

    protected Integer active;
    protected String codeLetters;
    protected String codeName;
    protected String codeName2;
    protected String comments;
    protected String formalCode;
    protected Integer id;
    protected String mainPtfType;
    protected String tag;

    protected Object obss;

    public void setActive(Integer active) {
        beforePropertyWrite("active", this.active, active);
        this.active = active;
    }

    public Integer getActive() {
        beforePropertyRead("active");
        return this.active;
    }

    public void setCodeLetters(String codeLetters) {
        beforePropertyWrite("codeLetters", this.codeLetters, codeLetters);
        this.codeLetters = codeLetters;
    }

    public String getCodeLetters() {
        beforePropertyRead("codeLetters");
        return this.codeLetters;
    }

    public void setCodeName(String codeName) {
        beforePropertyWrite("codeName", this.codeName, codeName);
        this.codeName = codeName;
    }

    public String getCodeName() {
        beforePropertyRead("codeName");
        return this.codeName;
    }

    public void setCodeName2(String codeName2) {
        beforePropertyWrite("codeName2", this.codeName2, codeName2);
        this.codeName2 = codeName2;
    }

    public String getCodeName2() {
        beforePropertyRead("codeName2");
        return this.codeName2;
    }

    public void setComments(String comments) {
        beforePropertyWrite("comments", this.comments, comments);
        this.comments = comments;
    }

    public String getComments() {
        beforePropertyRead("comments");
        return this.comments;
    }

    public void setFormalCode(String formalCode) {
        beforePropertyWrite("formalCode", this.formalCode, formalCode);
        this.formalCode = formalCode;
    }

    public String getFormalCode() {
        beforePropertyRead("formalCode");
        return this.formalCode;
    }

    public void setId(Integer id) {
        beforePropertyWrite("id", this.id, id);
        this.id = id;
    }

    public Integer getId() {
        beforePropertyRead("id");
        return this.id;
    }

    public void setMainPtfType(String mainPtfType) {
        beforePropertyWrite("mainPtfType", this.mainPtfType, mainPtfType);
        this.mainPtfType = mainPtfType;
    }

    public String getMainPtfType() {
        beforePropertyRead("mainPtfType");
        return this.mainPtfType;
    }

    public void setTag(String tag) {
        beforePropertyWrite("tag", this.tag, tag);
        this.tag = tag;
    }

    public String getTag() {
        beforePropertyRead("tag");
        return this.tag;
    }

    public void addToObss(Obs obj) {
        addToManyTarget("obss", obj, true);
    }

    public void removeFromObss(Obs obj) {
        removeToManyTarget("obss", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Obs> getObss() {
        return (List<Obs>)readProperty("obss");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "active":
                return this.active;
            case "codeLetters":
                return this.codeLetters;
            case "codeName":
                return this.codeName;
            case "codeName2":
                return this.codeName2;
            case "comments":
                return this.comments;
            case "formalCode":
                return this.formalCode;
            case "id":
                return this.id;
            case "mainPtfType":
                return this.mainPtfType;
            case "tag":
                return this.tag;
            case "obss":
                return this.obss;
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
            case "active":
                this.active = (Integer)val;
                break;
            case "codeLetters":
                this.codeLetters = (String)val;
                break;
            case "codeName":
                this.codeName = (String)val;
                break;
            case "codeName2":
                this.codeName2 = (String)val;
                break;
            case "comments":
                this.comments = (String)val;
                break;
            case "formalCode":
                this.formalCode = (String)val;
                break;
            case "id":
                this.id = (Integer)val;
                break;
            case "mainPtfType":
                this.mainPtfType = (String)val;
                break;
            case "tag":
                this.tag = (String)val;
                break;
            case "obss":
                this.obss = val;
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
        out.writeObject(this.active);
        out.writeObject(this.codeLetters);
        out.writeObject(this.codeName);
        out.writeObject(this.codeName2);
        out.writeObject(this.comments);
        out.writeObject(this.formalCode);
        out.writeObject(this.id);
        out.writeObject(this.mainPtfType);
        out.writeObject(this.tag);
        out.writeObject(this.obss);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.active = (Integer)in.readObject();
        this.codeLetters = (String)in.readObject();
        this.codeName = (String)in.readObject();
        this.codeName2 = (String)in.readObject();
        this.comments = (String)in.readObject();
        this.formalCode = (String)in.readObject();
        this.id = (Integer)in.readObject();
        this.mainPtfType = (String)in.readObject();
        this.tag = (String)in.readObject();
        this.obss = in.readObject();
    }

}
