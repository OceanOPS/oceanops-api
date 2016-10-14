package jcommops.db.orm.rest.auto;

import org.apache.cayenne.CayenneDataObject;

import jcommops.db.orm.rest.Country;
import jcommops.db.orm.rest.Cruise;

/**
 * Class _CruiseCountry was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CruiseCountry extends CayenneDataObject {

    public static final String TO_COUNTRY_PROPERTY = "toCountry";
    public static final String TO_CRUISE_PROPERTY = "toCruise";

    public static final String COUNTRY_ID_PK_COLUMN = "COUNTRY_ID";
    public static final String CRUISE_ID_PK_COLUMN = "CRUISE_ID";

    public void setToCountry(Country toCountry) {
        setToOneTarget(TO_COUNTRY_PROPERTY, toCountry, true);
    }

    public Country getToCountry() {
        return (Country)readProperty(TO_COUNTRY_PROPERTY);
    }


    public void setToCruise(Cruise toCruise) {
        setToOneTarget(TO_CRUISE_PROPERTY, toCruise, true);
    }

    public Cruise getToCruise() {
        return (Cruise)readProperty(TO_CRUISE_PROPERTY);
    }


}
