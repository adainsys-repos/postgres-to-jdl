/*
 * This file is generated by jOOQ.
 */
package org.adainsys.sqltojava.jooq.generated.tables.records;


import org.adainsys.sqltojava.jooq.generated.tables.InnodbFtDefaultStopword;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class InnodbFtDefaultStopwordRecord extends TableRecordImpl<InnodbFtDefaultStopwordRecord> implements Record1<String> {

    private static final long serialVersionUID = 1L;

    /**
     * Create a detached InnodbFtDefaultStopwordRecord
     */
    public InnodbFtDefaultStopwordRecord() {
        super(InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD);
    }

    /**
     * Create a detached, initialised InnodbFtDefaultStopwordRecord
     */
    public InnodbFtDefaultStopwordRecord(String value) {
        super(InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD);

        setValue(value);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>information_schema.INNODB_FT_DEFAULT_STOPWORD.value</code>.
     */
    public String getValue() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_FT_DEFAULT_STOPWORD.value</code>.
     */
    public void setValue(String value) {
        set(0, value);
    }

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD.VALUE;
    }

    @Override
    public String component1() {
        return getValue();
    }

    @Override
    public String value1() {
        return getValue();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public InnodbFtDefaultStopwordRecord value1(String value) {
        setValue(value);
        return this;
    }

    @Override
    public InnodbFtDefaultStopwordRecord values(String value1) {
        value1(value1);
        return this;
    }
}
