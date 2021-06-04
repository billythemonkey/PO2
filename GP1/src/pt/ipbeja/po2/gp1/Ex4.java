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
import sun.tools.tree.NewArrayExpression;


public class Ex4 extends Application {

    private int counter1;
    private int counter2;

    private Label label1;
    private Label label2;
    private Button button1;
    private Button button2;

    @Override
    public void start(Stage primaryStage) throws Exception {

        ButtonHandler buttonHandler = new ButtonHandler();

        this.label1 = new Label("0");
        this.label2 = new Label("0");

        this.button1 = new Button("Left Button");
        this.button2 = new Button("Right Button");

        button1.setOnAction( buttonHandler );
        button2.setOnAction( buttonHandler );

        VBox vBox1 = new VBox();
        VBox vBox2 = new VBox();
        HBox hBox = new HBox();
        vBox1.getChildren().addAll( button1, label1 );
        vBox2.getChildren().addAll( button2, label2 );
        hBox.getChildren().addAll( vBox1, vBox2 );

        Scene scene = new Scene( hBox, 200, 100 );
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    class ButtonHandler implements EventHandler <ActionEvent> {
        public void handle(ActionEvent event){
            Button buttonClicked = (Button)(event.getSource());
            if ( buttonClicked == button1 ){
                label1.setText( ++counter1 + "" );
            }else if (buttonClicked == button2){
                label2.setText( ++counter2 + "" );
            }

        }
    }

    public static void main(String[] args) {
        Application.launch( args );
    }
}
