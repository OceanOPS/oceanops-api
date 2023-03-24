package org.oceanops.orm;

import java.time.LocalDateTime;

import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.exp.ExpressionFactory;
import org.apache.cayenne.query.ObjectSelect;
import org.oceanops.orm.auto._Telecom;

public class Telecom extends _Telecom {
    public static final int ARGOS3_TEL_TYPE_ID = 92;
    public static final int ARGOS_TEL_TYPE_ID = 2;

    private static final long serialVersionUID = 1L;

    /**
     * Static method checking if the provided telecom number is already assigned on that deployment date.
     * @param editingContext
     * @param telNum
     * @param telTypeId
     * @param deplDate
     * @return
     */
    public static boolean isADuplicate(ObjectContext editingContext, String telNum, Integer telTypeId, LocalDateTime deplDate){
        long count = ObjectSelect.query(Telecom.class)
            .and(Telecom.NUM.eq(telNum), Telecom.TELECOM_TYPE.inId(ARGOS3_TEL_TYPE_ID, ARGOS_TEL_TYPE_ID), 
                ExpressionFactory.or(
                    Telecom.END_DATE.isNull(), 
                    ExpressionFactory.and(Telecom.END_DATE.isNotNull(), Telecom.END_DATE.gte(deplDate))
                    )
            )
            .selectCount(editingContext);
        return count > 0;
    }
}
