
package _int.wmo.def.metce._2013;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.ReferenceType;
import net.opengis.om.v_2_0.NamedValuePropertyType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ProcessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentationRef" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="parameter" type="{http://www.opengis.net/om/2.0}NamedValuePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="context" type="{http://def.wmo.int/metce/2013}MeasurementContextPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessType", propOrder = {
    "documentationRef",
    "parameter",
    "context"
})
@XmlSeeAlso({
    _int.wmo.def.wmdr._2017.ProcessType.class
})
public class ProcessType
    extends net.opengis.gml.v_3_2_1.AbstractFeatureType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 1L;
    protected ReferenceType documentationRef;
    protected List<NamedValuePropertyType> parameter;
    protected List<MeasurementContextPropertyType> context;

    /**
     * Gets the value of the documentationRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDocumentationRef() {
        return documentationRef;
    }

    /**
     * Sets the value of the documentationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDocumentationRef(ReferenceType value) {
        this.documentationRef = value;
    }

    public boolean isSetDocumentationRef() {
        return (this.documentationRef!= null);
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedValuePropertyType }
     * 
     * 
     */
    public List<NamedValuePropertyType> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<NamedValuePropertyType>();
        }
        return this.parameter;
    }

    public boolean isSetParameter() {
        return ((this.parameter!= null)&&(!this.parameter.isEmpty()));
    }

    public void unsetParameter() {
        this.parameter = null;
    }

    /**
     * Gets the value of the context property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the context property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementContextPropertyType }
     * 
     * 
     */
    public List<MeasurementContextPropertyType> getContext() {
        if (context == null) {
            context = new ArrayList<MeasurementContextPropertyType>();
        }
        return this.context;
    }

    public boolean isSetContext() {
        return ((this.context!= null)&&(!this.context.isEmpty()));
    }

    public void unsetContext() {
        this.context = null;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            ReferenceType theDocumentationRef;
            theDocumentationRef = this.getDocumentationRef();
            strategy.appendField(locator, this, "documentationRef", buffer, theDocumentationRef, this.isSetDocumentationRef());
        }
        {
            List<NamedValuePropertyType> theParameter;
            theParameter = (this.isSetParameter()?this.getParameter():null);
            strategy.appendField(locator, this, "parameter", buffer, theParameter, this.isSetParameter());
        }
        {
            List<MeasurementContextPropertyType> theContext;
            theContext = (this.isSetContext()?this.getContext():null);
            strategy.appendField(locator, this, "context", buffer, theContext, this.isSetContext());
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ProcessType that = ((ProcessType) object);
        {
            ReferenceType lhsDocumentationRef;
            lhsDocumentationRef = this.getDocumentationRef();
            ReferenceType rhsDocumentationRef;
            rhsDocumentationRef = that.getDocumentationRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentationRef", lhsDocumentationRef), LocatorUtils.property(thatLocator, "documentationRef", rhsDocumentationRef), lhsDocumentationRef, rhsDocumentationRef, this.isSetDocumentationRef(), that.isSetDocumentationRef())) {
                return false;
            }
        }
        {
            List<NamedValuePropertyType> lhsParameter;
            lhsParameter = (this.isSetParameter()?this.getParameter():null);
            List<NamedValuePropertyType> rhsParameter;
            rhsParameter = (that.isSetParameter()?that.getParameter():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parameter", lhsParameter), LocatorUtils.property(thatLocator, "parameter", rhsParameter), lhsParameter, rhsParameter, this.isSetParameter(), that.isSetParameter())) {
                return false;
            }
        }
        {
            List<MeasurementContextPropertyType> lhsContext;
            lhsContext = (this.isSetContext()?this.getContext():null);
            List<MeasurementContextPropertyType> rhsContext;
            rhsContext = (that.isSetContext()?that.getContext():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "context", lhsContext), LocatorUtils.property(thatLocator, "context", rhsContext), lhsContext, rhsContext, this.isSetContext(), that.isSetContext())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ReferenceType theDocumentationRef;
            theDocumentationRef = this.getDocumentationRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentationRef", theDocumentationRef), currentHashCode, theDocumentationRef, this.isSetDocumentationRef());
        }
        {
            List<NamedValuePropertyType> theParameter;
            theParameter = (this.isSetParameter()?this.getParameter():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parameter", theParameter), currentHashCode, theParameter, this.isSetParameter());
        }
        {
            List<MeasurementContextPropertyType> theContext;
            theContext = (this.isSetContext()?this.getContext():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "context", theContext), currentHashCode, theContext, this.isSetContext());
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof ProcessType) {
            final ProcessType copy = ((ProcessType) draftCopy);
            {
                Boolean documentationRefShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDocumentationRef());
                if (documentationRefShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceType sourceDocumentationRef;
                    sourceDocumentationRef = this.getDocumentationRef();
                    ReferenceType copyDocumentationRef = ((ReferenceType) strategy.copy(LocatorUtils.property(locator, "documentationRef", sourceDocumentationRef), sourceDocumentationRef, this.isSetDocumentationRef()));
                    copy.setDocumentationRef(copyDocumentationRef);
                } else {
                    if (documentationRefShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.documentationRef = null;
                    }
                }
            }
            {
                Boolean parameterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetParameter());
                if (parameterShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<NamedValuePropertyType> sourceParameter;
                    sourceParameter = (this.isSetParameter()?this.getParameter():null);
                    @SuppressWarnings("unchecked")
                    List<NamedValuePropertyType> copyParameter = ((List<NamedValuePropertyType> ) strategy.copy(LocatorUtils.property(locator, "parameter", sourceParameter), sourceParameter, this.isSetParameter()));
                    copy.unsetParameter();
                    if (copyParameter!= null) {
                        List<NamedValuePropertyType> uniqueParameterl = copy.getParameter();
                        uniqueParameterl.addAll(copyParameter);
                    }
                } else {
                    if (parameterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetParameter();
                    }
                }
            }
            {
                Boolean contextShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetContext());
                if (contextShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<MeasurementContextPropertyType> sourceContext;
                    sourceContext = (this.isSetContext()?this.getContext():null);
                    @SuppressWarnings("unchecked")
                    List<MeasurementContextPropertyType> copyContext = ((List<MeasurementContextPropertyType> ) strategy.copy(LocatorUtils.property(locator, "context", sourceContext), sourceContext, this.isSetContext()));
                    copy.unsetContext();
                    if (copyContext!= null) {
                        List<MeasurementContextPropertyType> uniqueContextl = copy.getContext();
                        uniqueContextl.addAll(copyContext);
                    }
                } else {
                    if (contextShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetContext();
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ProcessType();
    }

}
