package package2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import net.proteanit.sql.DbUtils;
import package2.DB.Db;
import package2.DB.Query;

public class Manage_product {
   public static void Update_manage_product() 
   { 
	   try 
	 	{ 
	 		Connection conn=Db.Connect();    
	         String query=Query.Delete_expiry_product; 
	         Statement stm=conn.createStatement();
	         stm.execute(query);
	         conn.close();
	 	}
	 	catch (SQLException e) {
	         System.err.println("Failed to connect to the database: " + e.getMessage());
	     } 
   }

public static void Manage_customer(String name) {
	// TODO Auto-generated method stub
	try 
 	{ 
 		 Connection conn=Db.Connect();    
         String query=Query.Tempory_delete; 
         PreparedStatement stm=conn.prepareStatement(query);
         stm.setString(1,name);
         stm.execute();
         conn.close();
 	}
 	catch (SQLException e) {
         System.err.println("Failed to connect to the database: " + e.getMessage());
     } 
}
}
