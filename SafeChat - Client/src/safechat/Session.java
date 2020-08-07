/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safechat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author iZooGooD
 */
public class Session {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://db4free.net/safechat?useSSL=false";
    static final String USER = "sql12254755";
    static final String PASS = "KRHVhhfEre";
    
    
        public static int getOnlineUsers(String username) {
        
        Connection conn = null;
        Statement stmt = null;
        int session=0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "Select SESSION from registeredUsers where USERNAME=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,username);
            stmt = conn.createStatement();
            ResultSet rs = pst.executeQuery();
            rs.first();
            session=rs.getInt("SESSION");
            conn.close();
        } catch (Exception e) {

        }
      
        return session;
    }
            public static void setSession(String username) {
        Connection conn = null;
        Statement stmt = null;
        String details = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "UPDATE registeredUsers SET SESSION=1 WHERE USERNAME=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.executeUpdate();
            System.out.println("executed");
            conn.close();
        } catch (Exception e) {

        }
    }
       public static void deleteSession(String username) {
        Connection conn = null;
        Statement stmt = null;
  
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "UPDATE registeredUsers SET SESSION=0 WHERE USERNAME=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.executeUpdate();
            System.out.println("executed");
            conn.close();
        } catch (Exception e) {

        }
    }
    
}
