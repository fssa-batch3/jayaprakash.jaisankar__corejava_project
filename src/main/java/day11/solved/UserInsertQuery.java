package day11.solved;



//import com.fssa.learnJava.corejava.day13.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
 
/**
 * @author BharathwajSoundarara
 *
 */

public class UserInsertQuery {
	 
    public static void main(String[] args) throws Exception {       
         
        // Step 01: Get connection
        Connection connection = ConnectionUtil.getConnection();
        System.out.println(connection);

        // Step 02: Create a Statement
        Statement stmt = connection.createStatement();
         
        // Step 03: Execute Insert Query
        String query = "INSERT INTO USER (username, password, date_of_birth, phone, email, first_name, last_name, whatsapp_no) " +
                "VALUES ('yazhan', 'password007', '2004-09-30', '9876543210', 'jayaprakash.jaisankar@ctr.freshworks.com', 'jayaprakash', 'jaisankar', '9876543213')";

        int rows = stmt.executeUpdate(query);
             
        System.out.println("No of rows inserted :" + rows );
         
        // Step 04: close the connection resources
        stmt.close();
        connection.close();   
    } 
}
