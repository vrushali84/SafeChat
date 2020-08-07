/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safechat;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.regex.*;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;



public class LoginUIController implements Initializable{
    Operations o=new Operations();
    @FXML
    Label greeting;
    @FXML
    Pane onlinePanel;
    @FXML
    public GridPane gridPane;
    @FXML
    Label panelGreeting;
    @FXML
    Button logoutButton;
    @FXML
    Button sendbuttonChat;
    @FXML
    TextArea textarea;
    @FXML
    TextField textfield;
    @FXML
     Label error;
  
    String strs[];
    private int o_count=0;
    public String login=""+Operations.uname;
    BufferedWriter writer;
    BufferedReader reader;
    private Tooltip tip=new Tooltip("Click to chat");
    private String receiver="";
    private String from="";
    private String to="";
    private String serverMsg=""; 
    private int session=0;
    private int status=0;



    

   public void initialize(URL url, ResourceBundle rb) {
   try{
    
      greeting.setText("WELCOME "+Operations.fname.toUpperCase());
      textarea.setVisible(false);
      sendbuttonChat.setVisible(false);
      textfield.setVisible(false);
      

      login();
      updateUsers();
            try{
                 Socket socketClient= new Socket("52.42.152.94",5556);
                 writer= new BufferedWriter(new OutputStreamWriter(socketClient.getOutputStream()));   
                 reader =new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
                 }catch(Exception e){e.printStackTrace();}
                
                Thread keepReading=new Thread(()->           // thread to keep listening to server message
                {
                try{
                while((serverMsg = reader.readLine()) != null){
                receiveMessage();     // receive the message and append to textArea
                }
                }
                catch(Exception e){e.printStackTrace();}   
                });
                keepReading.setDaemon(true);
                keepReading.start();
                }
                catch(Exception e){}
    }
   
   
   
   
   public void receiveMessage()
   {
           int msg_start=serverMsg.indexOf("Message=")+8;
           int msg_end=serverMsg.length();
           String message=serverMsg.substring(msg_start,msg_end);
           int from_start=serverMsg.indexOf("From=")+5;
           int from_end=serverMsg.indexOf("!@#");
           from=serverMsg.substring(from_start,from_end);
           int to_start=serverMsg.indexOf("To=")+3;
           int to_end=serverMsg.indexOf("#@!");
           to=serverMsg.substring(to_start,to_end);
          
           
           if(to.equals(Operations.uname ) && session==0)
           {
           Platform.runLater(()->{
           Alert alert = new Alert(AlertType.CONFIRMATION);
           Thread ss=new Thread(()->{
           alert.setTitle("Chat request");   
           Session.setSession(Operations.uname);
           });
           ss.start();
           String s = "Chat request from "+from+",press OK to accept";
           alert.setContentText(s);
           Optional<ButtonType> result = alert.showAndWait();
           if ((result.isPresent()) && (result.get() == ButtonType.OK)) {
           textarea.setVisible(true);
           textfield.setVisible(true);
           sendbuttonChat.setVisible(true);
           receiver=from;
           System.out.println("Message before encryption: "+message);
           String decrypt=Encryption.decript(message);
           System.out.println("Message after decryption: "+decrypt);
           textarea.appendText("\n"+decrypt);
           session=1;
           }
           });
           }
           
           
           if(to.equals(Operations.uname) && session==1)
           {
           
           textarea.setVisible(true);
           textfield.setVisible(true);
           sendbuttonChat.setVisible(true);
           receiver=from;
           System.out.println("Message before encryption: "+message);
           String decrypt=Encryption.decript(message);
           System.out.println("Message after decryption: "+decrypt);
           textarea.appendText("\n"+decrypt);      
           }


             
   }
   
   public void sendMessage(ActionEvent ae) throws IOException
   {
       if(session==0)
       {
     Thread s=new Thread(()->{
     Session.setSession(Operations.uname);
     });
     s.setDaemon(true);
     s.start();
       }
   String msg=Operations.uname+": "+textfield.getText();
   String f_msg=Encryption.encript(msg);
   textarea.appendText("\nMe: "+textfield.getText());
   textfield.clear();
   writer.write("From="+Operations.uname+"!@# To="+receiver+"#@!  Message="+f_msg);
   writer.write("\r\n");          
   writer.flush();
   session=1;
   }
   
   
   


   

    
    
    
    public void logout(ActionEvent e) throws Exception
    {    
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainUI.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        stage.setScene(new Scene(root1));  
        stage.show();
        
        Thread th = new Thread(() -> {
            try {
                o.requestLogout(Operations.uname);
                Session.deleteSession(Operations.uname);
                System.out.println("logged out");
            } catch (Exception ex) {
                Logger.getLogger(LoginUIController.class.getName()).log(Level.SEVERE, null, ex);
            }
});
th.setDaemon(true);
th.start();
        
    }

        

     public void viewUsers(ActionEvent e) throws Exception
    {
   updateUsers();
      
     }
     public void updateUsers()
     {
             Thread pane=new Thread(()->{
      
while(true){
     Operations oss=new Operations();
       String extract = "";
            try {
                extract = oss.getOnlineUsers(Operations.uname,Operations.pass);
            } catch (Exception ex) {
                Logger.getLogger(LoginUIController.class.getName()).log(Level.SEVERE, null, ex);
            }
      Pattern pat=Pattern.compile("[ ]");
      strs=pat.split(extract);
     List<String> list = new ArrayList<String>(Arrays.asList(strs));
     list.remove(Operations.uname);
     strs = list.toArray(new String[0]);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException ex) {
               Logger.getLogger(LoginUIController.class.getName()).log(Level.SEVERE, null, ex);
           }
      Platform.runLater(()->{
           try {
               add();
           } catch (FileNotFoundException ex) {
               Logger.getLogger(LoginUIController.class.getName()).log(Level.SEVERE, null, ex);
           }
      });}

    });
      pane.setDaemon(true);
      pane.setPriority(Thread.MAX_PRIORITY);
      pane.start();  
         
         
     }
    
    public void add() throws FileNotFoundException
    {  
     gridPane.getChildren().clear();
     int j=0;
     
for(int i=1;i<strs.length;i++)
   {
   Label t =new Label(""+strs[i]);
   t.setFont(new Font(20));
   t.getStyleClass().add("myButton");
 Image image = new Image("safechat/icons/contact.png");
 ImageView imageView = new ImageView(image);
 imageView.getStyleClass().add("myButton");
  
  
   t.setTooltip(tip);
   gridPane.add(imageView, 0, j);
   gridPane.add(t,1,j);
   

   j++;
       t.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {

        Label temp  = (Label)e.getSource();
        receiver=temp.getText();
        int user_session=Session.getOnlineUsers(receiver);
        if(user_session==1)
        {
           Thread status =new Thread(()->{
               Platform.runLater(()->{
         error.setText("Hey "+receiver+ " is currently busy,please try later");
               });
           });
           status.setDaemon(true);
           status.start();
        }
        else if(user_session==0){
      error.setVisible(false);
      textarea.setVisible(true);
      sendbuttonChat.setVisible(true);
      textfield.setVisible(true);
        }

      }
    });
     }
    }

    
    
    public String getFirstname()
    {
     String firstname="";
     try{
     String extract=o.getAuthenticatedUserDetails(Operations.uname,Operations.pass);
     int start=extract.indexOf("Firstname=")+10;
     int end=extract.indexOf("Lastname=");
     firstname=extract.substring(start,end);
     }
     catch(Exception e){} 
     return firstname;
    }
    
    public String getLastname()
    {
     String lastname="";
     try{
     String extract=o.getAuthenticatedUserDetails(Operations.uname,Operations.pass);
    
     int start=extract.indexOf("Lastname=")+9;
     int end=extract.length();
     lastname=extract.substring(start,end);
     }
     catch(Exception e){}
    
     return lastname;
    }
    public int onlineCount() throws Exception
    {
     Operations os=new Operations();
     int count=0;
     String extract=os.getOnlineUsers(Operations.uname,Operations.pass);
     int start=extract.indexOf("Count=")+6;
     int end=extract.indexOf(" ");
     count=Integer.parseInt(extract.substring(start,end));
     return count;   
    }
    public void createArray() throws Exception
    {
        Thread arr = new Thread(() -> {
      Operations oss=new Operations();
      String extract = "";
            try {
                extract = oss.getOnlineUsers(Operations.uname,Operations.pass);
            } catch (Exception ex) {
                Logger.getLogger(LoginUIController.class.getName()).log(Level.SEVERE, null, ex);
            }
      Pattern pat=Pattern.compile("[ ]");
      strs=pat.split(extract);
 
      });
arr.setDaemon(true);
arr.start();
        
        
    
    }
 
    public void login() throws Exception
    {
        Thread greet = new Thread(() -> {
           
            try {
                o.requestLogin(Operations.uname);
                while(true){
                    Thread.sleep(1000);
                count();
                }
            } catch (Exception ex) {
              
            }
            

    });
greet.setDaemon(true);
greet.start();
    }
    
    public void count() throws Exception
    {
        o_count=onlineCount()-1;
        Thread ac=new Thread(()->{
        Platform.runLater(()->{         
            try {  
                panelGreeting.setText("Users Online("+o_count+")");
              
            } catch (Exception ex) {
                Logger.getLogger(LoginUIController.class.getName()).log(Level.SEVERE, null, ex);
            }});
    });
     ac.setDaemon(true);
ac.start();   
    }  
}
