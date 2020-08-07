
package safechat;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author iZooGooD
 */
public class MainUI implements Initializable {
    public String Username="";
    public String Password="";
    String a_status="";
    
    @FXML
    private Label label;
    @FXML
    private Pane content_Area;
    @FXML
    private Circle status_Color;
    @FXML
    private Label status;

    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private Button loginButton;
    @FXML
    private Label error_status;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Operations o=new Operations();
        if(o.check_Connection()==1){
           status.setText("Online");
           status_Color.setFill(javafx.scene.paint.Color.GREEN);
        }
       
    }    
   
    @FXML
    public void open_Registration(MouseEvent e) throws IOException
    {
        Parent fxml =FXMLLoader.load(getClass().getResource("RegistrationUI.fxml"));
        content_Area.getChildren().removeAll();
        content_Area.getChildren().setAll(fxml);
    }
    @FXML
    public void login(ActionEvent e)throws Exception
    {
    error_status.setText("Checking user details...");
    error_status.setTextFill(Color.GREEN);
    Operations o=new Operations();
    String username=usernameField.getText();
    String password=passwordField.getText();
         Operations.uname=username;
     Operations.pass=password;
    Thread login = new Thread(() -> {
            try {
        a_status=o.sendPostLogin(username, password);

     Platform.runLater(() -> {
     if(a_status.equals("Authenticated"))
     {

            o.openLoginWindow(); 
   
            Stage stage = (Stage) loginButton.getScene().getWindow();
         stage.close();
        
     }
      else if(o.check_Connection()==0)
            {
             error_status.setTextFill(Color.RED);
             error_status.setText("Please check your connection");
            }
    else{
      error_status.setTextFill(Color.RED);
      error_status.setText(a_status);
    }
     });
            } catch (Exception ex) {
                Logger.getLogger(LoginUIController.class.getName()).log(Level.SEVERE, null, ex);
            }
});
login.setDaemon(true);
login.setPriority(Thread.MAX_PRIORITY);


Thread details = new Thread(() -> {
            try { 
             setNames();
             login.start();
             System.out.println("Login process done");
                     
           
             
             


            } catch (Exception ex) {
                Logger.getLogger(LoginUIController.class.getName()).log(Level.SEVERE, null, ex);
            }
});
details.setDaemon(true);
details.setPriority(Thread.MAX_PRIORITY);
details.start();

    

         
    
   


    

}
    Operations os=new Operations();
    
        public String getFirstnameandlastname()
    {
       
     String firstname="";
     try{
     String extract=os.getAuthenticatedUserDetails(Operations.uname,Operations.pass);
     int start=extract.indexOf("Firstname=")+10;
     int end=extract.indexOf("Lastname=");
     firstname=""+extract.substring(start,end)+" "+getLastname();
     }
     catch(Exception e){} 
     
     return firstname;
    }
    
    public String getLastname()
    {
        
     String lastname="";
     try{
     String extract=os.getAuthenticatedUserDetails(Operations.uname,Operations.pass);
     
     int start=extract.indexOf("Lastname=")+9;
     int end=extract.length();
     lastname=extract.substring(start,end);
     }
     catch(Exception e){}
     return lastname;
    }
    public void setNames()
    {
        try{
           
           Operations.fname=getFirstnameandlastname();
        }
        catch(Exception e ){}
    }
}