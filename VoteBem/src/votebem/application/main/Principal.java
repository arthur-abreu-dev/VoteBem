/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votebem.application.main;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author arthu
 */
public class Principal extends Application{

         private static Stage stage;
    @Override
    public void start(Stage primaryStage) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("/votebem/application/principal/Principal.fxml"));
       Scene scene = new Scene(root);
       //primaryStage.initStyle(StageStyle.UNDECORATED);
       primaryStage.setScene(scene);
       primaryStage.setMaximized(false);
       primaryStage.setTitle("Vote Bem - Principal");
       primaryStage.show();  
       setStage(primaryStage);  
       
    }
  
    public static Stage getStage() {
        return stage;
    }
    
      public static void setStage(Stage stage) {
        Principal.stage = stage;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
