
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.Random;
import java.util.Scanner;

public class Operations {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://db4free.net/safechat?useSSL=false";

    static final String USER = "sql12254755";
    static final String PASS = "KRHVhhfEre";

    ServerSocket ss = null;
    Socket s = null;
    static int count=0;

    public String insert(String username, String firstname, String lastname, String password) throws Exception {
        Connection conn = null;
        Statement stmt = null;
        String Status = "Success";
        try {

            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Ex");
            String sql = "INSERT INTO registeredUsers(USERNAME,FIRSTNAME,LASTNAME,PASSWORD) VALUES(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, firstname);
            ps.setString(3, lastname);
            ps.setString(4, password);
            ps.executeUpdate();
            System.out.println("Records inserted");
        } catch (SQLIntegrityConstraintViolationException unametaken) {
            Status = "Username has already been taken";
        }

        return Status;
    }

    public boolean Authenticate(String username, String password) throws Exception {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to database");
            PreparedStatement pst = conn.prepareStatement("Select * from registeredUsers where USERNAME=? and PASSWORD=?");
            pst.setString(1, username);
            pst.setString(2, password);
            stmt = conn.createStatement();

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error-" + e);
            return false;
        }

    }

    public String getAuthenticatedUserDetails(String username, String password) {
        System.out.println("Called");
        Connection conn = null;
        Statement stmt = null;
        String details = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            PreparedStatement pst = conn.prepareStatement("Select * from registeredUsers where USERNAME=? and PASSWORD=?");
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet r = pst.executeQuery();
            r.first();
            details = "Username=" + username + "\nPassword=" + password + "\nFirstname=" + r.getString("FIRSTNAME") + "\nLastname=" + r.getString("LASTNAME");
            conn.close();
        } catch (Exception e) {

        }
        return details;
    }

    public String getOnlineUsers() {
        int onlineCount = 0;
        System.out.println("Called");
        Connection conn = null;
        Statement stmt = null;
        String details = "";
        String users = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "Select USERNAME from registeredUsers where status=1";
            ResultSet rs = stmt.executeQuery(sql);
            rs.first();
            while (rs.next()) {
                onlineCount += 1;
                users += " " + rs.getString("USERNAME");
            }
            String online = String.valueOf(onlineCount);
            details = "Count=" + onlineCount + "" + users;

            conn.close();
        } catch (Exception e) {

        }
        System.out.println("Online user method=" + details);
        return details;
    }

    public String requestLogout(String username) {
        Connection conn = null;
        Statement stmt = null;
        String details = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "UPDATE registeredUsers SET STATUS=0 WHERE USERNAME=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.executeUpdate();
            System.out.println("executed");
            conn.close();
        } catch (Exception e) {

        }

        return details;
    }

    public String requestLogin(String username) {
        Connection conn = null;
        Statement stmt = null;
        String details = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "UPDATE registeredUsers SET STATUS=1 WHERE USERNAME=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.executeUpdate();
            System.out.println("executed");
            conn.close();
        } catch (Exception e) {

        }

        return details;
    }
    String globalmsg = "null";

    public void perform() throws IOException {
               System.out.println("Threaded Chat Server is Running  " );
            ServerSocket mysocket = new ServerSocket(5555);
                while(true){
                Socket sock = mysocket.accept();
                chatServer server=new chatServer(sock);
                Thread serverThread=new Thread(server);
                serverThread.start();
                }
        
    }
      

}
