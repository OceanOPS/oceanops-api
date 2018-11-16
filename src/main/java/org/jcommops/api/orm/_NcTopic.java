package org.jcommops.api.orm;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _NcTopic was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _NcTopic extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> DESCRIPTION = Property.create("description", String.class);
    public static final Property<Integer> ID = Property.create("id", Integer.class);
    public static final Property<Integer> IS_PRIVATE = Property.create("isPrivate", Integer.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<Integer> PARENT_TOPIC_ID = Property.create("parentTopicId", Integer.class);
    public static final Property<List<NcNotification>> NC_NOTIFICATIONS = Property.create("ncNotifications", List.class);
    public static final Property<List<NcSubscription>> NC_SUBSCRIPTIONS = Property.create("ncSubscriptions", List.class);

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

    public void setParentTopicId(int parentTopicId) {
        writeProperty("parentTopicId", parentTopicId);
    }
    public int getParentTopicId() {
        Object value = readProperty("parentTopicId");
        return (value != null) ? (Integer) value : 0;
    }

    public void addToNcNotifications(NcNotification obj) {
        addToManyTarget("ncNotifications", obj, true);
    }
    public void removeFromNcNotifications(NcNotification obj) {
        removeToManyTarget("ncNotifications", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<NcNotification> getNcNotifications() {
        return (List<NcNotification>)readProperty("ncNotifications");
    }


    public void addToNcSubscriptions(NcSubscription obj) {
        addToManyTarget("ncSubscriptions", obj, true);
    }
    public void removeFromNcSubscriptions(NcSubscription obj) {
        removeToManyTarget("ncSubscriptions", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<NcSubscription> getNcSubscriptions() {
        return (List<NcSubscription>)readProperty("ncSubscriptions");
    }


}
