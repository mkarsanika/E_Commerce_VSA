package package2.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db 
{

    static Connection conn=null;
   
    public static Connection Connect()
    {
        try {
             // Register the JDBC driver
             // Open a connection
             // Database connection URL
         String url = "jdbc:oracle:thin:@localhost:1521:xe";   //Oracle Database Connection; 
              // Database credentials 
         String username = "system"; 
         String password = "shree123"; 

             conn = DriverManager.getConnection(url, username, password); //Driver Connection done;
        } 
        catch (SQLException e) {
            System.err.println("Failed to connect to the database: " + e.getMessage());
        }
        return conn;
    }
             
}
