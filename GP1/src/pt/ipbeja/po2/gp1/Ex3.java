/**
 * Andrei Oproiu
 **/

package pt.ipbeja.po2.gp1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Ex3 extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        ButtonHandler buttonHandler = new ButtonHandler();
        button1.setId( "1" );
        button1.setOnAction( buttonHandler );
        button2.setId( "2" );
        button2.setOnAction( buttonHandler );
        VBox vBox = new VBox();
        vBox.getChildren().addAll( button1, button2 );
        Scene scene = new Scene( vBox, 200, 100 );
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    class ButtonHandler implements EventHandler <ActionEvent> {
        public void handle(ActionEvent event){
            Button buttonClicked = (Button)(event.getSource());
            System.out.println(buttonClicked.getId());
            if ( buttonClicked.getId().equals( "1" ) ){
                Alert alert = new Alert( Alert.AlertType.INFORMATION, "You clicked " + buttonClicked.getText());
                alert.showAndWait();
            }else if ( buttonClicked.getId().equals( "2" ) ){
                Alert alert = new Alert( Alert.AlertType.INFORMATION, "You clicked " + buttonClicked.getText() );
                alert.showAndWait();
            }else {
                System.out.println("No buttons with that id found!");
            }

        }
    }

    public static void main(String[] args) {
        Application.launch( args );
    }
}
