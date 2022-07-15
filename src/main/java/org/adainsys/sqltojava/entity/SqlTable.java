package org.adainsys.sqltojava.entity;

import java.util.Optional;

/**
 * Created by Ada Insys on 2017/10/6.
 */
public interface SqlTable {

    String getName();

    Optional<String> getComment();

//    boolean isEnumTable();

//    List<SqlColumn> getColumns();
}
