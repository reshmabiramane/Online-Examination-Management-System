/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examination.management.system.Project;
import java.sql.*;

/**
 *
 * @author Reshma
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             String s1;
             s1 = "jdbc:mysql://localhost/ems";
             Connection con=DriverManager.getConnection(s1,"root","Pass@123");
             //Statement st=con.createStatement();
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
}
