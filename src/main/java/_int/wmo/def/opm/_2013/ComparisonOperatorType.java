//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.14 at 09:14:09 AM CEST 
//


package _int.wmo.def.opm._2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComparisonOperatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComparisonOperatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ne"/>
 *     &lt;enumeration value="lt"/>
 *     &lt;enumeration value="le"/>
 *     &lt;enumeration value="eq"/>
 *     &lt;enumeration value="ge"/>
 *     &lt;enumeration value="gt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComparisonOperatorType")
@XmlEnum
public enum ComparisonOperatorType {


    /**
     * Comparison operator: "not equal to"
     * 
     */
    @XmlEnumValue("ne")
    NE("ne"),

    /**
     * Comparison operator: "less than"
     * 
     */
    @XmlEnumValue("lt")
    LT("lt"),

    /**
     * Comparison operator: "less than or equal to"
     * 
     */
    @XmlEnumValue("le")
    LE("le"),

    /**
     * Comparison operator: "equal to"
     * 
     */
    @XmlEnumValue("eq")
    EQ("eq"),

    /**
     * Comparison operator: "greater than or equal to"
     * 
     */
    @XmlEnumValue("ge")
    GE("ge"),

    /**
     * Comparison operator: "greater than"
     * 
     */
    @XmlEnumValue("gt")
    GT("gt");
    private final String value;

    ComparisonOperatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComparisonOperatorType fromValue(String v) {
        for (ComparisonOperatorType c: ComparisonOperatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
