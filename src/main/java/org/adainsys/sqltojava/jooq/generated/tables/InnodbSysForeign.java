/*
 * This file is generated by jOOQ.
 */
package org.adainsys.sqltojava.jooq.generated.tables;


import org.adainsys.sqltojava.jooq.generated.InformationSchema;
import org.adainsys.sqltojava.jooq.generated.tables.records.InnodbSysForeignRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class InnodbSysForeign extends TableImpl<InnodbSysForeignRecord> {

    /**
     * The reference instance of <code>information_schema.INNODB_SYS_FOREIGN</code>
     */
    public static final InnodbSysForeign INNODB_SYS_FOREIGN = new InnodbSysForeign();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN.ID</code>.
     */
    public final TableField<InnodbSysForeignRecord, String> ID = createField(DSL.name("ID"), SQLDataType.VARCHAR(193).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN.FOR_NAME</code>.
     */
    public final TableField<InnodbSysForeignRecord, String> FOR_NAME = createField(DSL.name("FOR_NAME"), SQLDataType.VARCHAR(193).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN.REF_NAME</code>.
     */
    public final TableField<InnodbSysForeignRecord, String> REF_NAME = createField(DSL.name("REF_NAME"), SQLDataType.VARCHAR(193).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN.N_COLS</code>.
     */
    public final TableField<InnodbSysForeignRecord, UInteger> N_COLS = createField(DSL.name("N_COLS"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "");
    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN.TYPE</code>.
     */
    public final TableField<InnodbSysForeignRecord, UInteger> TYPE = createField(DSL.name("TYPE"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "");

    private InnodbSysForeign(Name alias, Table<InnodbSysForeignRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbSysForeign(Name alias, Table<InnodbSysForeignRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_FOREIGN</code> table reference
     */
    public InnodbSysForeign(String alias) {
        this(DSL.name(alias), INNODB_SYS_FOREIGN);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_FOREIGN</code> table reference
     */
    public InnodbSysForeign(Name alias) {
        this(alias, INNODB_SYS_FOREIGN);
    }

    /**
     * Create a <code>information_schema.INNODB_SYS_FOREIGN</code> table reference
     */
    public InnodbSysForeign() {
        this(DSL.name("INNODB_SYS_FOREIGN"), null);
    }

    public <O extends Record> InnodbSysForeign(Table<O> child, ForeignKey<O, InnodbSysForeignRecord> key) {
        super(child, key, INNODB_SYS_FOREIGN);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbSysForeignRecord> getRecordType() {
        return InnodbSysForeignRecord.class;
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbSysForeign as(String alias) {
        return new InnodbSysForeign(DSL.name(alias), this);
    }

    @Override
    public InnodbSysForeign as(Name alias) {
        return new InnodbSysForeign(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysForeign rename(String name) {
        return new InnodbSysForeign(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysForeign rename(Name name) {
        return new InnodbSysForeign(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, UInteger, UInteger> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
