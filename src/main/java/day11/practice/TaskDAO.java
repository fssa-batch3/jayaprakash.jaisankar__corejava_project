package day11.practice;

import day11.solved.*;



//import com.fssa.learnJava.corejava.day13.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



public class TaskDAO {
	 
  public static void main(String[] args) throws Exception {       
       
      // Step 01: Get connection
      Connection connection = ConnectionUtil.getConnection();
      System.out.println(connection);

      // Step 02: Create a Statement
      Statement stmt = connection.createStatement();
       
      // Step 03: Execute Insert Query
      String query = "INSERT INTO Task (id,name,status) " +
              "VALUES ('10','Task','Pending')";

      int rows = stmt.executeUpdate(query);
           
      System.out.println("No of rows inserted :" + rows );
       
      // Step 04: close the connection resources
      stmt.close();
      connection.close();   
  } 
}