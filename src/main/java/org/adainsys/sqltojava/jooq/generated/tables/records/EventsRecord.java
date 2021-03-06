/*
 * This file is generated by jOOQ.
 */
package org.adainsys.sqltojava.jooq.generated.tables.records;


import org.adainsys.sqltojava.jooq.generated.tables.Events;
import org.jooq.impl.TableRecordImpl;

import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EventsRecord extends TableRecordImpl<EventsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Create a detached EventsRecord
     */
    public EventsRecord() {
        super(Events.EVENTS);
    }

    /**
     * Create a detached, initialised EventsRecord
     */
    public EventsRecord(String eventCatalog, String eventSchema, String eventName, String definer, String timeZone, String eventBody, String eventDefinition, String eventType, LocalDateTime executeAt, String intervalValue, String intervalField, String sqlMode, LocalDateTime starts, LocalDateTime ends, String status, String onCompletion, LocalDateTime created, LocalDateTime lastAltered, LocalDateTime lastExecuted, String eventComment, Long originator, String characterSetClient, String collationConnection, String databaseCollation) {
        super(Events.EVENTS);

        setEventCatalog(eventCatalog);
        setEventSchema(eventSchema);
        setEventName(eventName);
        setDefiner(definer);
        setTimeZone(timeZone);
        setEventBody(eventBody);
        setEventDefinition(eventDefinition);
        setEventType(eventType);
        setExecuteAt(executeAt);
        setIntervalValue(intervalValue);
        setIntervalField(intervalField);
        setSqlMode(sqlMode);
        setStarts(starts);
        setEnds(ends);
        setStatus(status);
        setOnCompletion(onCompletion);
        setCreated(created);
        setLastAltered(lastAltered);
        setLastExecuted(lastExecuted);
        setEventComment(eventComment);
        setOriginator(originator);
        setCharacterSetClient(characterSetClient);
        setCollationConnection(collationConnection);
        setDatabaseCollation(databaseCollation);
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_CATALOG</code>.
     */
    public String getEventCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_CATALOG</code>.
     */
    public void setEventCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_SCHEMA</code>.
     */
    public String getEventSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_SCHEMA</code>.
     */
    public void setEventSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_NAME</code>.
     */
    public void setEventName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.DEFINER</code>.
     */
    public String getDefiner() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.EVENTS.DEFINER</code>.
     */
    public void setDefiner(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.TIME_ZONE</code>.
     */
    public String getTimeZone() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.EVENTS.TIME_ZONE</code>.
     */
    public void setTimeZone(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_BODY</code>.
     */
    public String getEventBody() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_BODY</code>.
     */
    public void setEventBody(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_DEFINITION</code>.
     */
    public String getEventDefinition() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_DEFINITION</code>.
     */
    public void setEventDefinition(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_TYPE</code>.
     */
    public String getEventType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_TYPE</code>.
     */
    public void setEventType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.EXECUTE_AT</code>.
     */
    public LocalDateTime getExecuteAt() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EXECUTE_AT</code>.
     */
    public void setExecuteAt(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.INTERVAL_VALUE</code>.
     */
    public String getIntervalValue() {
        return (String) get(9);
    }

    /**
     * Setter for <code>information_schema.EVENTS.INTERVAL_VALUE</code>.
     */
    public void setIntervalValue(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.INTERVAL_FIELD</code>.
     */
    public String getIntervalField() {
        return (String) get(10);
    }

    /**
     * Setter for <code>information_schema.EVENTS.INTERVAL_FIELD</code>.
     */
    public void setIntervalField(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.SQL_MODE</code>.
     */
    public String getSqlMode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>information_schema.EVENTS.SQL_MODE</code>.
     */
    public void setSqlMode(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.STARTS</code>.
     */
    public LocalDateTime getStarts() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>information_schema.EVENTS.STARTS</code>.
     */
    public void setStarts(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.ENDS</code>.
     */
    public LocalDateTime getEnds() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>information_schema.EVENTS.ENDS</code>.
     */
    public void setEnds(LocalDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(14);
    }

    /**
     * Setter for <code>information_schema.EVENTS.STATUS</code>.
     */
    public void setStatus(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.ON_COMPLETION</code>.
     */
    public String getOnCompletion() {
        return (String) get(15);
    }

    /**
     * Setter for <code>information_schema.EVENTS.ON_COMPLETION</code>.
     */
    public void setOnCompletion(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.CREATED</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>information_schema.EVENTS.CREATED</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.LAST_ALTERED</code>.
     */
    public LocalDateTime getLastAltered() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>information_schema.EVENTS.LAST_ALTERED</code>.
     */
    public void setLastAltered(LocalDateTime value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.LAST_EXECUTED</code>.
     */
    public LocalDateTime getLastExecuted() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>information_schema.EVENTS.LAST_EXECUTED</code>.
     */
    public void setLastExecuted(LocalDateTime value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_COMMENT</code>.
     */
    public String getEventComment() {
        return (String) get(19);
    }

    /**
     * Setter for <code>information_schema.EVENTS.EVENT_COMMENT</code>.
     */
    public void setEventComment(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.ORIGINATOR</code>.
     */
    public Long getOriginator() {
        return (Long) get(20);
    }

    /**
     * Setter for <code>information_schema.EVENTS.ORIGINATOR</code>.
     */
    public void setOriginator(Long value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.CHARACTER_SET_CLIENT</code>.
     */
    public String getCharacterSetClient() {
        return (String) get(21);
    }

    /**
     * Setter for <code>information_schema.EVENTS.CHARACTER_SET_CLIENT</code>.
     */
    public void setCharacterSetClient(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>information_schema.EVENTS.COLLATION_CONNECTION</code>.
     */
    public String getCollationConnection() {
        return (String) get(22);
    }

    /**
     * Setter for <code>information_schema.EVENTS.COLLATION_CONNECTION</code>.
     */
    public void setCollationConnection(String value) {
        set(22, value);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>information_schema.EVENTS.DATABASE_COLLATION</code>.
     */
    public String getDatabaseCollation() {
        return (String) get(23);
    }

    /**
     * Setter for <code>information_schema.EVENTS.DATABASE_COLLATION</code>.
     */
    public void setDatabaseCollation(String value) {
        set(23, value);
    }
}
