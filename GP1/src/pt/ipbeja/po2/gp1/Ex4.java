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
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Ex4 extends Application {

    Label value = new Label("0");


    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button1 = new Button("Add");
        Button button2 = new Button("Sub");
        ButtonHandler buttonHandler = new ButtonHandler();
        button1.setId( "1" );
        button1.setOnAction( buttonHandler );
        button2.setId( "2" );
        button2.setOnAction( buttonHandler );
        VBox vBox = new VBox();
        HBox hBoxButtons = new HBox();
        HBox hBoxLabel = new HBox();
        hBoxButtons.getChildren().addAll( button1, button2 );
        hBoxLabel.getChildren().addAll( value );
        vBox.getChildren().addAll( hBoxButtons, hBoxLabel );
        Scene scene = new Scene( vBox, 200, 100 );
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    class ButtonHandler implements EventHandler <ActionEvent> {
        public void handle(ActionEvent event){
            Button buttonClicked = (Button)(event.getSource());
            System.out.println(buttonClicked.getId());
            int valueLabel = Integer.parseInt( value.getText() );
            if ( buttonClicked.getId().equals( "1" ) ){
                valueLabel = valueLabel + 1;
                value.setText( Integer.toString( valueLabel ) );
            }else if ( buttonClicked.getId().equals( "2" ) ){
                valueLabel = valueLabel - 1;
                value.setText( Integer.toString( valueLabel ) );
            }else {
                System.out.println("No buttons with that id found!");
            }

        }
    }

    public static void main(String[] args) {
        Application.launch( args );
    }
}
