package com.medical;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConn
{
    protected Connection conn;
    CreateConn()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection("jdbc:sqlite:test.db");
        }
        catch(Exception ClassNotFoundException)
        {
            System.exit(0);
        }
    }
}
