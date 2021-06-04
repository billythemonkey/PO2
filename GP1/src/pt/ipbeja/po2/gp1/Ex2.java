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


public class Ex2 extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button1 = new Button("Press me 1");
        Button button2 = new Button("Press me 2");
        ButtonHandler buttonHandler = new ButtonHandler();
        button1.setOnAction( buttonHandler );
        button2.setOnAction( buttonHandler );
        VBox vBox = new VBox();
        vBox.getChildren().addAll( button1, button2 );
        Scene scene = new Scene( vBox, 200, 100 );
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    class ButtonHandler implements EventHandler <ActionEvent> {
        public void handle(ActionEvent event){
            Alert alert = new Alert( Alert.AlertType.INFORMATION, "Hello" );
            alert.showAndWait();
        }
    }

    public static void main(String[] args) {
        Application.launch( args );
    }
}
