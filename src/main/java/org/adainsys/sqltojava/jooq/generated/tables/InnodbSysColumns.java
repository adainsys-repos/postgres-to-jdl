/*
 * This file is generated by jOOQ.
 */
package org.adainsys.sqltojava.jooq.generated.tables;


import org.adainsys.sqltojava.jooq.generated.InformationSchema;
import org.adainsys.sqltojava.jooq.generated.tables.records.InnodbSysColumnsRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class InnodbSysColumns extends TableImpl<InnodbSysColumnsRecord> {

    /**
     * The reference instance of <code>information_schema.INNODB_SYS_COLUMNS</code>
     */
    public static final InnodbSysColumns INNODB_SYS_COLUMNS = new InnodbSysColumns();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>information_schema.INNODB_SYS_COLUMNS.TABLE_ID</code>.
     */
    public final TableField<InnodbSysColumnsRecord, ULong> TABLE_ID = createField(DSL.name("TABLE_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_COLUMNS.NAME</code>.
     */
    public final TableField<InnodbSysColumnsRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(193).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_COLUMNS.POS</code>.
     */
    public final TableField<InnodbSysColumnsRecord, ULong> POS = createField(DSL.name("POS"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_COLUMNS.MTYPE</code>.
     */
    public final TableField<InnodbSysColumnsRecord, Integer> MTYPE = createField(DSL.name("MTYPE"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_COLUMNS.PRTYPE</code>.
     */
    public final TableField<InnodbSysColumnsRecord, Integer> PRTYPE = createField(DSL.name("PRTYPE"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_COLUMNS.LEN</code>.
     */
    public final TableField<InnodbSysColumnsRecord, Integer> LEN = createField(DSL.name("LEN"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    private InnodbSysColumns(Name alias, Table<InnodbSysColumnsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbSysColumns(Name alias, Table<InnodbSysColumnsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_COLUMNS</code> table reference
     */
    public InnodbSysColumns(String alias) {
        this(DSL.name(alias), INNODB_SYS_COLUMNS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_COLUMNS</code> table reference
     */
    public InnodbSysColumns(Name alias) {
        this(alias, INNODB_SYS_COLUMNS);
    }

    /**
     * Create a <code>information_schema.INNODB_SYS_COLUMNS</code> table reference
     */
    public InnodbSysColumns() {
        this(DSL.name("INNODB_SYS_COLUMNS"), null);
    }

    public <O extends Record> InnodbSysColumns(Table<O> child, ForeignKey<O, InnodbSysColumnsRecord> key) {
        super(child, key, INNODB_SYS_COLUMNS);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbSysColumnsRecord> getRecordType() {
        return InnodbSysColumnsRecord.class;
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbSysColumns as(String alias) {
        return new InnodbSysColumns(DSL.name(alias), this);
    }

    @Override
    public InnodbSysColumns as(Name alias) {
        return new InnodbSysColumns(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysColumns rename(String name) {
        return new InnodbSysColumns(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysColumns rename(Name name) {
        return new InnodbSysColumns(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<ULong, String, ULong, Integer, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
