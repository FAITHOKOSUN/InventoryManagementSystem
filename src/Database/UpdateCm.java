/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Faith
 */
public class UpdateCm {
     public static void main(String[] args) {
        try {
            // TODO code application logic here
            String query = "update inventory_tb set status = ? where id = ?";
                  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "");
            PreparedStatement pt = con.prepareStatement(query);
            pt.setString(1, "active");
            pt.setInt(2, 1);
          

            int r = pt.executeUpdate();
            System.out.println("operation successful");
        } catch (SQLException ex) {
            //  Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
