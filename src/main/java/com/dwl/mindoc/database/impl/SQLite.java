package com.dwl.mindoc.database.impl;

import com.dwl.mindoc.database.Database;

/**
 * @program: mindoc
 * @description: SQLite
 * @author: daiwenlong
 * @create: 2018-10-13 12:19
 **/
public class SQLite implements Database {
    @Override
    public String getBaseName() {
        return null;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public String getTablesSql(Database base) {
        return null;
    }

    @Override
    public String getColumnSql(Database base, String tableName) {
        return null;
    }


}


