/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.generated.tables.records;


import org.blackdread.sqltojava.jooq.generated.tables.Tablespaces;
import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TablespacesRecord extends TableRecordImpl<TablespacesRecord> implements Record9<String, String, String, String, ULong, ULong, ULong, ULong, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Create a detached TablespacesRecord
     */
    public TablespacesRecord() {
        super(Tablespaces.TABLESPACES);
    }

    /**
     * Create a detached, initialised TablespacesRecord
     */
    public TablespacesRecord(String tablespaceName, String engine, String tablespaceType, String logfileGroupName, ULong extentSize, ULong autoextendSize, ULong maximumSize, ULong nodegroupId, String tablespaceComment) {
        super(Tablespaces.TABLESPACES);

        setTablespaceName(tablespaceName);
        setEngine(engine);
        setTablespaceType(tablespaceType);
        setLogfileGroupName(logfileGroupName);
        setExtentSize(extentSize);
        setAutoextendSize(autoextendSize);
        setMaximumSize(maximumSize);
        setNodegroupId(nodegroupId);
        setTablespaceComment(tablespaceComment);
    }

    /**
     * Getter for <code>information_schema.TABLESPACES.TABLESPACE_NAME</code>.
     */
    public String getTablespaceName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.TABLESPACES.TABLESPACE_NAME</code>.
     */
    public void setTablespaceName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.TABLESPACES.ENGINE</code>.
     */
    public String getEngine() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.TABLESPACES.ENGINE</code>.
     */
    public void setEngine(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.TABLESPACES.TABLESPACE_TYPE</code>.
     */
    public String getTablespaceType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.TABLESPACES.TABLESPACE_TYPE</code>.
     */
    public void setTablespaceType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.TABLESPACES.LOGFILE_GROUP_NAME</code>.
     */
    public String getLogfileGroupName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.TABLESPACES.LOGFILE_GROUP_NAME</code>.
     */
    public void setLogfileGroupName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.TABLESPACES.EXTENT_SIZE</code>.
     */
    public ULong getExtentSize() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>information_schema.TABLESPACES.EXTENT_SIZE</code>.
     */
    public void setExtentSize(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.TABLESPACES.AUTOEXTEND_SIZE</code>.
     */
    public ULong getAutoextendSize() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>information_schema.TABLESPACES.AUTOEXTEND_SIZE</code>.
     */
    public void setAutoextendSize(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.TABLESPACES.MAXIMUM_SIZE</code>.
     */
    public ULong getMaximumSize() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>information_schema.TABLESPACES.MAXIMUM_SIZE</code>.
     */
    public void setMaximumSize(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.TABLESPACES.NODEGROUP_ID</code>.
     */
    public ULong getNodegroupId() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>information_schema.TABLESPACES.NODEGROUP_ID</code>.
     */
    public void setNodegroupId(ULong value) {
        set(7, value);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>information_schema.TABLESPACES.TABLESPACE_COMMENT</code>.
     */
    public String getTablespaceComment() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.TABLESPACES.TABLESPACE_COMMENT</code>.
     */
    public void setTablespaceComment(String value) {
        set(8, value);
    }

    @Override
    public Row9<String, String, String, String, ULong, ULong, ULong, ULong, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<String, String, String, String, ULong, ULong, ULong, ULong, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Tablespaces.TABLESPACES.TABLESPACE_NAME;
    }

    @Override
    public Field<String> field2() {
        return Tablespaces.TABLESPACES.ENGINE;
    }

    @Override
    public Field<String> field3() {
        return Tablespaces.TABLESPACES.TABLESPACE_TYPE;
    }

    @Override
    public Field<String> field4() {
        return Tablespaces.TABLESPACES.LOGFILE_GROUP_NAME;
    }

    @Override
    public Field<ULong> field5() {
        return Tablespaces.TABLESPACES.EXTENT_SIZE;
    }

    @Override
    public Field<ULong> field6() {
        return Tablespaces.TABLESPACES.AUTOEXTEND_SIZE;
    }

    @Override
    public Field<ULong> field7() {
        return Tablespaces.TABLESPACES.MAXIMUM_SIZE;
    }

    @Override
    public Field<ULong> field8() {
        return Tablespaces.TABLESPACES.NODEGROUP_ID;
    }

    @Override
    public Field<String> field9() {
        return Tablespaces.TABLESPACES.TABLESPACE_COMMENT;
    }

    @Override
    public String component1() {
        return getTablespaceName();
    }

    @Override
    public String component2() {
        return getEngine();
    }

    @Override
    public String component3() {
        return getTablespaceType();
    }

    @Override
    public String component4() {
        return getLogfileGroupName();
    }

    @Override
    public ULong component5() {
        return getExtentSize();
    }

    @Override
    public ULong component6() {
        return getAutoextendSize();
    }

    @Override
    public ULong component7() {
        return getMaximumSize();
    }

    @Override
    public ULong component8() {
        return getNodegroupId();
    }

    @Override
    public String component9() {
        return getTablespaceComment();
    }

    @Override
    public String value1() {
        return getTablespaceName();
    }

    @Override
    public String value2() {
        return getEngine();
    }

    @Override
    public String value3() {
        return getTablespaceType();
    }

    @Override
    public String value4() {
        return getLogfileGroupName();
    }

    @Override
    public ULong value5() {
        return getExtentSize();
    }

    @Override
    public ULong value6() {
        return getAutoextendSize();
    }

    @Override
    public ULong value7() {
        return getMaximumSize();
    }

    @Override
    public ULong value8() {
        return getNodegroupId();
    }

    @Override
    public String value9() {
        return getTablespaceComment();
    }

    @Override
    public TablespacesRecord value1(String value) {
        setTablespaceName(value);
        return this;
    }

    @Override
    public TablespacesRecord value2(String value) {
        setEngine(value);
        return this;
    }

    @Override
    public TablespacesRecord value3(String value) {
        setTablespaceType(value);
        return this;
    }

    @Override
    public TablespacesRecord value4(String value) {
        setLogfileGroupName(value);
        return this;
    }

    @Override
    public TablespacesRecord value5(ULong value) {
        setExtentSize(value);
        return this;
    }

    @Override
    public TablespacesRecord value6(ULong value) {
        setAutoextendSize(value);
        return this;
    }

    @Override
    public TablespacesRecord value7(ULong value) {
        setMaximumSize(value);
        return this;
    }

    @Override
    public TablespacesRecord value8(ULong value) {
        setNodegroupId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public TablespacesRecord value9(String value) {
        setTablespaceComment(value);
        return this;
    }

    @Override
    public TablespacesRecord values(String value1, String value2, String value3, String value4, ULong value5, ULong value6, ULong value7, ULong value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }
}
