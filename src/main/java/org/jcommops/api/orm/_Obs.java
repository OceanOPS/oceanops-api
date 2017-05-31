package org.jcommops.api.orm;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Obs was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Obs extends CayenneDataObject {

    public static final String ASSEMBLY_DATE_PROPERTY = "assemblyDate";
    public static final String CYCLE_NB_PROPERTY = "cycleNb";
    public static final String DATA_PATH_PROPERTY = "dataPath";
    public static final String DELAY_PROPERTY = "delay";
    public static final String DELETED_PROPERTY = "deleted";
    public static final String DEPTH_PROPERTY = "depth";
    public static final String DEPTH_MAX_PROPERTY = "depthMax";
    public static final String DESCENDING_PROPERTY = "descending";
    public static final String DISTRIBUTION_DATE_PROPERTY = "distributionDate";
    public static final String FILENAME_PROPERTY = "filename";
    public static final String INSERT_DATE_PROPERTY = "insertDate";
    public static final String LATEST_ASSEMBLY_DATE_PROPERTY = "latestAssemblyDate";
    public static final String LATEST_DISTRIBUTION_DATE_PROPERTY = "latestDistributionDate";
    public static final String OBS_DATE_PROPERTY = "obsDate";
    public static final String OBS_END_DATE_PROPERTY = "obsEndDate";
    public static final String PTF_ID_PROPERTY = "ptfId";
    public static final String SHAPE_PROPERTY = "shape";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String WMO_PROPERTY = "wmo";
    public static final String OBS_OBS_DATA_STATUS_ARRAY_PROPERTY = "obsObsDataStatusArray";
    public static final String OBS_VARIABLE_ARRAY_PROPERTY = "obsVariableArray";
    public static final String PTF_ARRAY_PROPERTY = "ptfArray";
    public static final String TO_AGENCY_PROPERTY = "toAgency";
    public static final String TO_AGENCY1_PROPERTY = "toAgency1";
    public static final String TO_DATA_FORMAT_PROPERTY = "toDataFormat";
    public static final String TO_GTS_CCCC_PROPERTY = "toGtsCccc";
    public static final String TO_GTS_CODE_PROPERTY = "toGtsCode";
    public static final String TO_GTS_HEADER_PROPERTY = "toGtsHeader";
    public static final String TO_GTS_INSTRUMENT_TYPE_PROPERTY = "toGtsInstrumentType";
    public static final String TO_GTS_RECORDER_TYPE_PROPERTY = "toGtsRecorderType";
    public static final String TO_OBS_DATA_STATUS_PROPERTY = "toObsDataStatus";
    public static final String TO_PTF_PROPERTY = "toPtf";
    public static final String TO_PTF_LOC_PROPERTY = "toPtfLoc";

    public static final String ID_PK_COLUMN = "ID";

    public void setAssemblyDate(Date assemblyDate) {
        writeProperty(ASSEMBLY_DATE_PROPERTY, assemblyDate);
    }
    public Date getAssemblyDate() {
        return (Date)readProperty(ASSEMBLY_DATE_PROPERTY);
    }

    public void setCycleNb(Integer cycleNb) {
        writeProperty(CYCLE_NB_PROPERTY, cycleNb);
    }
    public Integer getCycleNb() {
        return (Integer)readProperty(CYCLE_NB_PROPERTY);
    }

    public void setDataPath(String dataPath) {
        writeProperty(DATA_PATH_PROPERTY, dataPath);
    }
    public String getDataPath() {
        return (String)readProperty(DATA_PATH_PROPERTY);
    }

    public void setDelay(Integer delay) {
        writeProperty(DELAY_PROPERTY, delay);
    }
    public Integer getDelay() {
        return (Integer)readProperty(DELAY_PROPERTY);
    }

    public void setDeleted(Integer deleted) {
        writeProperty(DELETED_PROPERTY, deleted);
    }
    public Integer getDeleted() {
        return (Integer)readProperty(DELETED_PROPERTY);
    }

    public void setDepth(BigDecimal depth) {
        writeProperty(DEPTH_PROPERTY, depth);
    }
    public BigDecimal getDepth() {
        return (BigDecimal)readProperty(DEPTH_PROPERTY);
    }

    public void setDepthMax(BigDecimal depthMax) {
        writeProperty(DEPTH_MAX_PROPERTY, depthMax);
    }
    public BigDecimal getDepthMax() {
        return (BigDecimal)readProperty(DEPTH_MAX_PROPERTY);
    }

    public void setDescending(Integer descending) {
        writeProperty(DESCENDING_PROPERTY, descending);
    }
    public Integer getDescending() {
        return (Integer)readProperty(DESCENDING_PROPERTY);
    }

    public void setDistributionDate(Date distributionDate) {
        writeProperty(DISTRIBUTION_DATE_PROPERTY, distributionDate);
    }
    public Date getDistributionDate() {
        return (Date)readProperty(DISTRIBUTION_DATE_PROPERTY);
    }

    public void setFilename(String filename) {
        writeProperty(FILENAME_PROPERTY, filename);
    }
    public String getFilename() {
        return (String)readProperty(FILENAME_PROPERTY);
    }

    public void setInsertDate(Date insertDate) {
        writeProperty(INSERT_DATE_PROPERTY, insertDate);
    }
    public Date getInsertDate() {
        return (Date)readProperty(INSERT_DATE_PROPERTY);
    }

    public void setLatestAssemblyDate(Date latestAssemblyDate) {
        writeProperty(LATEST_ASSEMBLY_DATE_PROPERTY, latestAssemblyDate);
    }
    public Date getLatestAssemblyDate() {
        return (Date)readProperty(LATEST_ASSEMBLY_DATE_PROPERTY);
    }

    public void setLatestDistributionDate(Date latestDistributionDate) {
        writeProperty(LATEST_DISTRIBUTION_DATE_PROPERTY, latestDistributionDate);
    }
    public Date getLatestDistributionDate() {
        return (Date)readProperty(LATEST_DISTRIBUTION_DATE_PROPERTY);
    }

    public void setObsDate(Date obsDate) {
        writeProperty(OBS_DATE_PROPERTY, obsDate);
    }
    public Date getObsDate() {
        return (Date)readProperty(OBS_DATE_PROPERTY);
    }

    public void setObsEndDate(Date obsEndDate) {
        writeProperty(OBS_END_DATE_PROPERTY, obsEndDate);
    }
    public Date getObsEndDate() {
        return (Date)readProperty(OBS_END_DATE_PROPERTY);
    }

    public void setPtfId(Integer ptfId) {
        writeProperty(PTF_ID_PROPERTY, ptfId);
    }
    public Integer getPtfId() {
        return (Integer)readProperty(PTF_ID_PROPERTY);
    }

    public void setShape(byte[] shape) {
        writeProperty(SHAPE_PROPERTY, shape);
    }
    public byte[] getShape() {
        return (byte[])readProperty(SHAPE_PROPERTY);
    }

    public void setUpdateDate(Date updateDate) {
        writeProperty(UPDATE_DATE_PROPERTY, updateDate);
    }
    public Date getUpdateDate() {
        return (Date)readProperty(UPDATE_DATE_PROPERTY);
    }

    public void setWmo(String wmo) {
        writeProperty(WMO_PROPERTY, wmo);
    }
    public String getWmo() {
        return (String)readProperty(WMO_PROPERTY);
    }

    public void addToObsObsDataStatusArray(ObsObsDataStatus obj) {
        addToManyTarget(OBS_OBS_DATA_STATUS_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromObsObsDataStatusArray(ObsObsDataStatus obj) {
        removeToManyTarget(OBS_OBS_DATA_STATUS_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ObsObsDataStatus> getObsObsDataStatusArray() {
        return (List<ObsObsDataStatus>)readProperty(OBS_OBS_DATA_STATUS_ARRAY_PROPERTY);
    }


    public void addToObsVariableArray(ObsVariable obj) {
        addToManyTarget(OBS_VARIABLE_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromObsVariableArray(ObsVariable obj) {
        removeToManyTarget(OBS_VARIABLE_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ObsVariable> getObsVariableArray() {
        return (List<ObsVariable>)readProperty(OBS_VARIABLE_ARRAY_PROPERTY);
    }


    public void addToPtfArray(Ptf obj) {
        addToManyTarget(PTF_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromPtfArray(Ptf obj) {
        removeToManyTarget(PTF_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Ptf> getPtfArray() {
        return (List<Ptf>)readProperty(PTF_ARRAY_PROPERTY);
    }


    public void setToAgency(Agency toAgency) {
        setToOneTarget(TO_AGENCY_PROPERTY, toAgency, true);
    }

    public Agency getToAgency() {
        return (Agency)readProperty(TO_AGENCY_PROPERTY);
    }


    public void setToAgency1(Agency toAgency1) {
        setToOneTarget(TO_AGENCY1_PROPERTY, toAgency1, true);
    }

    public Agency getToAgency1() {
        return (Agency)readProperty(TO_AGENCY1_PROPERTY);
    }


    public void setToDataFormat(DataFormat toDataFormat) {
        setToOneTarget(TO_DATA_FORMAT_PROPERTY, toDataFormat, true);
    }

    public DataFormat getToDataFormat() {
        return (DataFormat)readProperty(TO_DATA_FORMAT_PROPERTY);
    }


    public void setToGtsCccc(GtsCccc toGtsCccc) {
        setToOneTarget(TO_GTS_CCCC_PROPERTY, toGtsCccc, true);
    }

    public GtsCccc getToGtsCccc() {
        return (GtsCccc)readProperty(TO_GTS_CCCC_PROPERTY);
    }


    public void setToGtsCode(GtsCode toGtsCode) {
        setToOneTarget(TO_GTS_CODE_PROPERTY, toGtsCode, true);
    }

    public GtsCode getToGtsCode() {
        return (GtsCode)readProperty(TO_GTS_CODE_PROPERTY);
    }


    public void setToGtsHeader(GtsHeader toGtsHeader) {
        setToOneTarget(TO_GTS_HEADER_PROPERTY, toGtsHeader, true);
    }

    public GtsHeader getToGtsHeader() {
        return (GtsHeader)readProperty(TO_GTS_HEADER_PROPERTY);
    }


    public void setToGtsInstrumentType(GtsInstrumentType toGtsInstrumentType) {
        setToOneTarget(TO_GTS_INSTRUMENT_TYPE_PROPERTY, toGtsInstrumentType, true);
    }

    public GtsInstrumentType getToGtsInstrumentType() {
        return (GtsInstrumentType)readProperty(TO_GTS_INSTRUMENT_TYPE_PROPERTY);
    }


    public void setToGtsRecorderType(GtsRecorderType toGtsRecorderType) {
        setToOneTarget(TO_GTS_RECORDER_TYPE_PROPERTY, toGtsRecorderType, true);
    }

    public GtsRecorderType getToGtsRecorderType() {
        return (GtsRecorderType)readProperty(TO_GTS_RECORDER_TYPE_PROPERTY);
    }


    public void setToObsDataStatus(ObsDataStatus toObsDataStatus) {
        setToOneTarget(TO_OBS_DATA_STATUS_PROPERTY, toObsDataStatus, true);
    }

    public ObsDataStatus getToObsDataStatus() {
        return (ObsDataStatus)readProperty(TO_OBS_DATA_STATUS_PROPERTY);
    }


    public void setToPtf(Ptf toPtf) {
        setToOneTarget(TO_PTF_PROPERTY, toPtf, true);
    }

    public Ptf getToPtf() {
        return (Ptf)readProperty(TO_PTF_PROPERTY);
    }


    public void setToPtfLoc(PtfLoc toPtfLoc) {
        setToOneTarget(TO_PTF_LOC_PROPERTY, toPtfLoc, true);
    }

    public PtfLoc getToPtfLoc() {
        return (PtfLoc)readProperty(TO_PTF_LOC_PROPERTY);
    }


}
