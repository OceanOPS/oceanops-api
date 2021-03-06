package org.oceanops.api.orm.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.oceanops.api.orm.GliderTheme;
import org.oceanops.api.orm.Ptf;

/**
 * Class _GliderThemePtf was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _GliderThemePtf extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String GLIDER_THEME_ID_PK_COLUMN = "GLIDER_THEME_ID";
    public static final String PTF_ID_PK_COLUMN = "PTF_ID";

    public static final NumericProperty<BigDecimal> GLIDER_THEME_ID = PropertyFactory.createNumeric("gliderThemeId", BigDecimal.class);
    public static final NumericProperty<BigDecimal> PTF_ID = PropertyFactory.createNumeric("ptfId", BigDecimal.class);
    public static final EntityProperty<GliderTheme> GLIDER_THEME = PropertyFactory.createEntity("gliderTheme", GliderTheme.class);
    public static final EntityProperty<Ptf> PTF = PropertyFactory.createEntity("ptf", Ptf.class);

    protected BigDecimal gliderThemeId;
    protected BigDecimal ptfId;

    protected Object gliderTheme;
    protected Object ptf;

    public void setGliderThemeId(BigDecimal gliderThemeId) {
        beforePropertyWrite("gliderThemeId", this.gliderThemeId, gliderThemeId);
        this.gliderThemeId = gliderThemeId;
    }

    public BigDecimal getGliderThemeId() {
        beforePropertyRead("gliderThemeId");
        return this.gliderThemeId;
    }

    public void setPtfId(BigDecimal ptfId) {
        beforePropertyWrite("ptfId", this.ptfId, ptfId);
        this.ptfId = ptfId;
    }

    public BigDecimal getPtfId() {
        beforePropertyRead("ptfId");
        return this.ptfId;
    }

    public void setGliderTheme(GliderTheme gliderTheme) {
        setToOneTarget("gliderTheme", gliderTheme, true);
    }

    public GliderTheme getGliderTheme() {
        return (GliderTheme)readProperty("gliderTheme");
    }

    public void setPtf(Ptf ptf) {
        setToOneTarget("ptf", ptf, true);
    }

    public Ptf getPtf() {
        return (Ptf)readProperty("ptf");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "gliderThemeId":
                return this.gliderThemeId;
            case "ptfId":
                return this.ptfId;
            case "gliderTheme":
                return this.gliderTheme;
            case "ptf":
                return this.ptf;
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
            case "gliderThemeId":
                this.gliderThemeId = (BigDecimal)val;
                break;
            case "ptfId":
                this.ptfId = (BigDecimal)val;
                break;
            case "gliderTheme":
                this.gliderTheme = val;
                break;
            case "ptf":
                this.ptf = val;
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
        out.writeObject(this.gliderThemeId);
        out.writeObject(this.ptfId);
        out.writeObject(this.gliderTheme);
        out.writeObject(this.ptf);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.gliderThemeId = (BigDecimal)in.readObject();
        this.ptfId = (BigDecimal)in.readObject();
        this.gliderTheme = in.readObject();
        this.ptf = in.readObject();
    }

}
