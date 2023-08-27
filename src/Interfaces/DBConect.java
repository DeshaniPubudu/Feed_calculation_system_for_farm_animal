
package Interfaces;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;


public class DBConect {
    
    public static Connection Connected(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/farm","root","");
            System.out.println("ok");
            return conn;
        } catch (Exception e) {
            
          JOptionPane.showMessageDialog(null,e);  
           return null; 
        }
    
    
    }
    
    
    
    
    
}
