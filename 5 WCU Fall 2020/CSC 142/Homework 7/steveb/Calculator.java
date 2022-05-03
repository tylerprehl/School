import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javax.swing.JOptionPane; 

public class Calculator extends Application
{
  //...   
   public static void main(String args[])
   {  
      launch();
   }
   public void start(Stage primaryStage)
   {
  // ....     
      Scene scene = new Scene (//...);      
      box.setAlignment(Pos.CENTER);
      
      primaryStage.setScene(scene);
      primaryStage.setTitle("My Calculator");
      primaryStage.show();
   }
   // end of start 
   
 }