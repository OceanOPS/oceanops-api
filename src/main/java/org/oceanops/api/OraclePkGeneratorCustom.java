package org.oceanops.api;

import org.apache.cayenne.dba.JdbcAdapter;
import org.apache.cayenne.dba.oracle.OraclePkGenerator;
import org.apache.cayenne.map.DbEntity;
import org.apache.cayenne.map.DbKeyGenerator;

public class OraclePkGeneratorCustom extends OraclePkGenerator{
    
    private static final String _SEQUENCE_SUFFIX = "_SEQ";

    public OraclePkGeneratorCustom() {
        super();
    }

    public OraclePkGeneratorCustom(JdbcAdapter adapter) {
        super(adapter);
    }

    /**
     * Returns expected primary key sequence name for a DbEntity.
     */
    @Override
    protected String sequenceName(DbEntity entity) {

        // use custom generator if possible
        DbKeyGenerator keyGenerator = entity.getPrimaryKeyGenerator();
        if (keyGenerator != null && DbKeyGenerator.ORACLE_TYPE.equals(keyGenerator.getGeneratorType())
                && keyGenerator.getGeneratorName() != null) {

            return keyGenerator.getGeneratorName().toLowerCase();
        } else {
            String seqName = entity.getName().toLowerCase() + getSequenceSuffix();
            return adapter.getQuotingStrategy().quotedIdentifier(entity, entity.getCatalog(), entity.getSchema(), seqName);
        }
    }
    
    protected String getSequenceSuffix() {
        return _SEQUENCE_SUFFIX;
    }
}
