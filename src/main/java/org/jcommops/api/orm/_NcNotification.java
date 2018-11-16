package org.jcommops.api.orm;

import java.time.LocalDateTime;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _NcNotification was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _NcNotification extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> DESCRIPTION = Property.create("description", String.class);
    public static final Property<Integer> ID = Property.create("id", Integer.class);
    public static final Property<Integer> IS_PRIVATE = Property.create("isPrivate", Integer.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<LocalDateTime> NOTIFICATION_DATE = Property.create("notificationDate", LocalDateTime.class);
    public static final Property<Integer> SENT = Property.create("sent", Integer.class);
    public static final Property<Contact> CONTACT = Property.create("contact", Contact.class);
    public static final Property<NcLevel> NC_LEVEL = Property.create("ncLevel", NcLevel.class);
    public static final Property<NcTopic> NC_TOPIC = Property.create("ncTopic", NcTopic.class);
    public static final Property<Ptf> PTF = Property.create("ptf", Ptf.class);

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
    }

    public void setId(int id) {
        writeProperty("id", id);
    }
    public int getId() {
        Object value = readProperty("id");
        return (value != null) ? (Integer) value : 0;
    }

    public void setIsPrivate(int isPrivate) {
        writeProperty("isPrivate", isPrivate);
    }
    public int getIsPrivate() {
        Object value = readProperty("isPrivate");
        return (value != null) ? (Integer) value : 0;
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setNotificationDate(LocalDateTime notificationDate) {
        writeProperty("notificationDate", notificationDate);
    }
    public LocalDateTime getNotificationDate() {
        return (LocalDateTime)readProperty("notificationDate");
    }

    public void setSent(int sent) {
        writeProperty("sent", sent);
    }
    public int getSent() {
        Object value = readProperty("sent");
        return (value != null) ? (Integer) value : 0;
    }

    public void setContact(Contact contact) {
        setToOneTarget("contact", contact, true);
    }

    public Contact getContact() {
        return (Contact)readProperty("contact");
    }


    public void setNcLevel(NcLevel ncLevel) {
        setToOneTarget("ncLevel", ncLevel, true);
    }

    public NcLevel getNcLevel() {
        return (NcLevel)readProperty("ncLevel");
    }


    public void setNcTopic(NcTopic ncTopic) {
        setToOneTarget("ncTopic", ncTopic, true);
    }

    public NcTopic getNcTopic() {
        return (NcTopic)readProperty("ncTopic");
    }


    public void setPtf(Ptf ptf) {
        setToOneTarget("ptf", ptf, true);
    }

    public Ptf getPtf() {
        return (Ptf)readProperty("ptf");
    }


}
