package safechat;

import java.net.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Operations {
static String uname="";
static String pass="";
static String fname="";
static String lastname="";
    public int check_Connection()   // method to check whether user is connected or not 
    {
    int status=0; // false,no connection.
    try{
     InetAddress ip=InetAddress.getByName("www.google.com");  
     status=1; // Connection success.
    }
    catch(Exception e){
        status=0;  
    }
    return status;    
    } 
    public String sendPost(String username,String firstname,String lastname,String password) throws Exception {
                String status="";
		String USER_AGENT = "Mozilla/5.0";
		String url = "http://safechatter.us-west-2.elasticbeanstalk.com/userRegistration";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = "username="+username+"&firstname="+firstname+"&lastname="+lastname+"&password="+password;
		
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

	

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		//print result
		return status=response.toString();

	}
    public void openLoginWindow()  // simple utility to open windows
    {
     try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LoginUI.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("SafeChat");
        stage.setResizable(false);
        stage.setScene(new Scene(root1));  
        stage.show();
       } 
       catch(Exception s) 
       {
       s.printStackTrace();
       }      
        
    }
    
    public String sendPostLogin(String username,String password) throws Exception {
		String USER_AGENT = "Mozilla/5.0";
		String url = "http://safechatter.us-west-2.elasticbeanstalk.com/login";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = "username="+username+"&password="+password;
		
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
         
		wr.flush();
		wr.close();

		

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		//print result
		String server_Response=response.toString();
             
                return server_Response;
               

	}
    public String getAuthenticatedUserDetails(String username,String password) throws Exception
    {
		String USER_AGENT = "Mozilla/5.0";
		String url = "http://safechatter.us-west-2.elasticbeanstalk.com/getDetails";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = "username="+username+"&password="+password;
		
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

	

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
	
	
        return response.toString();
        
        
        
        
    }
    public String getOnlineUsers(String username,String password) throws Exception {
		String USER_AGENT = "Mozilla/5.0";
		String url = "http://safechatter.us-west-2.elasticbeanstalk.com/onlineUsers";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = "username="+username+"&password="+password;
		
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
         
		wr.flush();
		wr.close();

		

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		//print result
		String server_Response=response.toString();
                
                return server_Response;
               

	}
        public String requestLogout(String username) throws Exception {
		String USER_AGENT = "Mozilla/5.0";
		String url = "http://safechatter.us-west-2.elasticbeanstalk.com/requestLogout";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = "username="+username;
		
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
         
		wr.flush();
		wr.close();

		

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		//print result
		String server_Response=response.toString();
               
                return server_Response;
               

	}
                public String requestLogin(String username) throws Exception {
		String USER_AGENT = "Mozilla/5.0";
		String url = "http://safechatter.us-west-2.elasticbeanstalk.com/requestLogin";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = "username="+username;
		
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
         
		wr.flush();
		wr.close();

		

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		//print result
		String server_Response=response.toString();
                
                return server_Response;
               

	}
    
    
    
    
    
    
}
