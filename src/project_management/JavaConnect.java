/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_management;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Tran Dat
 */
public class JavaConnect {
 
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:E:\\workspace_netbeans\\sqlite\\QuanLyHieuThuoc.sqlite");
          //  JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        
        }
    }
    
}
