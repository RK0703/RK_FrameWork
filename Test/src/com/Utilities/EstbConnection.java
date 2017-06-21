package com.Utilities;





import java.sql.Connection;
import java.sql.DriverManager;

public class EstbConnection 
{

  public  static Connection getConnection() throws Exception
    
    {

        String url = "jdbc:sqlserver://10.24.244.48:1433;DatabaseName=MyDBWorks;integratedSecurity=true";
     
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
     
        Class.forName(driver).newInstance();
        Connection conn = DriverManager.getConnection(url);
        return conn;
        
    }
}