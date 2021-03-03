package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.api.orm.Language;

/**
 * Class _DocLanguage was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DocLanguage extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String DOC_ID_PK_COLUMN = "DOC_ID";
    public static final String LANGUAGE_ID_PK_COLUMN = "LANGUAGE_ID";

    public static final NumericProperty<BigDecimal> DOC_ID = PropertyFactory.createNumeric("docId", BigDecimal.class);
    public static final NumericProperty<BigDecimal> LANGUAGE_ID = PropertyFactory.createNumeric("languageId", BigDecimal.class);
    public static final EntityProperty<Language> LANGUAGE = PropertyFactory.createEntity("language", Language.class);

    protected BigDecimal docId;
    protected BigDecimal languageId;

    protected Object language;

    public void setDocId(BigDecimal docId) {
        beforePropertyWrite("docId", this.docId, docId);
        this.docId = docId;
    }

    public BigDecimal getDocId() {
        beforePropertyRead("docId");
        return this.docId;
    }

    public void setLanguageId(BigDecimal languageId) {
        beforePropertyWrite("languageId", this.languageId, languageId);
        this.languageId = languageId;
    }

    public BigDecimal getLanguageId() {
        beforePropertyRead("languageId");
        return this.languageId;
    }

    public void setLanguage(Language language) {
        setToOneTarget("language", language, true);
    }

    public Language getLanguage() {
        return (Language)readProperty("language");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "docId":
                return this.docId;
            case "languageId":
                return this.languageId;
            case "language":
                return this.language;
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
                this.docId = (BigDecimal)val;
                break;
            case "languageId":
                this.languageId = (BigDecimal)val;
                break;
            case "language":
                this.language = val;
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
        out.writeObject(this.languageId);
        out.writeObject(this.language);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.docId = (BigDecimal)in.readObject();
        this.languageId = (BigDecimal)in.readObject();
        this.language = in.readObject();
    }

}