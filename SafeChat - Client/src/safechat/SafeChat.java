/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safechat;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class SafeChat extends Application {
    
    public static Stage stage=null;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainUI.fxml"));
     
        Scene scene = new Scene(root);
         stage.setTitle("SafeChat");
       
       
        stage.setScene(scene);
        
        this.stage=stage;
        stage.show();
    }
    @Override
    public void stop() {
        try{
    Operations o=new Operations();
    o.requestLogout(Operations.uname);
   
        }
        catch(Exception e){}
    
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
