
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
 * &lt;simpleType name="ComparisonOperatorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ne"/&gt;
 *     &lt;enumeration value="lt"/&gt;
 *     &lt;enumeration value="le"/&gt;
 *     &lt;enumeration value="eq"/&gt;
 *     &lt;enumeration value="ge"/&gt;
 *     &lt;enumeration value="gt"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
