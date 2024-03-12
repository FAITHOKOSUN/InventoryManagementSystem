/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Faith
 */
public class Dbconnection {

    public static void main(String[] args) {
        try {
            // TODO code application logic here
            String query = "INSERT INTO inventory_tb(userrole,name,mobilenumber,email,password,address,status)VALUES(?,?,?,?,?,?,?)";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "");
            PreparedStatement pt = con.prepareStatement(query);
            pt.setString(1, "superadmin");
            pt.setString(2, "superadmin");
            pt.setInt(3, 1234);
            pt.setString(4, "superadmin@gmail.com");
            pt.setString(5, "admin");
            pt.setString(6, "Nigeria");
            pt.setString(7, "Active");

            int r = pt.executeUpdate();
            System.out.println("operation successful");
        } catch (SQLException ex) {
            //  Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
