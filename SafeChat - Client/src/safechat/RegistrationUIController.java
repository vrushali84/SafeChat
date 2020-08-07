
package safechat;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RegistrationUIController implements Initializable {
@FXML
TextField registerFirstname;
@FXML
TextField registerLastname;
@FXML
TextField registerUsername;
@FXML
TextField registerPassword;
@FXML
TextField cregisterPassword;
@FXML
Label status;

    public void initialize(URL url, ResourceBundle rb) {

    
    }    
      @FXML
    public void back_to_Login(MouseEvent e) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("MainUI.fxml"));
        SafeChat.stage.getScene().setRoot(root);
    }
    @FXML
    public void registerUser(ActionEvent e) throws IOException{
        final String username=registerUsername.getText();
        final String firstname=registerFirstname.getText();
        final String lastname=registerLastname.getText();
        final String password=registerPassword.getText();
        final String cpassword=cregisterPassword.getText();
        String displayMsg="";

        if(!password.equals(cpassword))
        {
        displayMsg="Passpord does not match";
        status.setTextFill(Color.RED);
        status.setText(displayMsg);
        }
        else if(username.equals("")||password.equals("")||firstname.equals("")||lastname.equals(""))
        {
        displayMsg="All fields are required";
        status.setTextFill(Color.RED);
        status.setText(displayMsg);
            
        }
        else{
        Operations o=new Operations();
        try{
        String statuss=o.sendPost(username, firstname, lastname, password);
        System.out.println("Client Status="+statuss);
        if(statuss.equals("Registration Success"))
        {
        status.setText(""+statuss);
        status.setTextFill(Color.GREEN);
        }
        else{
        status.setText(statuss);
        status.setTextFill(Color.RED);
        }
        
        }
        catch(Exception s){
        displayMsg="Error"+s;
        status.setTextFill(Color.RED);
        status.setText(displayMsg);
        }
        }
        
                
    }
}
