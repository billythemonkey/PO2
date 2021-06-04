/**
 * Andrei Oproiu
 **/

package pt.ipbeja.po2.tictactoe;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.layout.GridPane;

public class TicTacToeBoard extends GridPane {

    static public final int SIZE = 3;
    private int counter;


    public TicTacToeBoard() {
        this.createBoard();
    }

    private void createBoard() {
        ButtonHandler bHandler = new ButtonHandler();
        for ( int line = 0 ; line < SIZE ; line++ ) {
            for ( int col = 0 ; col < SIZE ; col++ ) {
                TicTacToeButton button = new TicTacToeButton();
                button.setOnAction( bHandler );
                this.add( button, col, line );
            }
        }
    }

    private class ButtonHandler implements EventHandler <ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            counter++;
            TicTacToeButton buttonClicked = (TicTacToeButton)(event.getSource());
            buttonClicked.play( counter );

            if (counter == 9){
                Alert alert = new Alert( Alert.AlertType.INFORMATION, "Game has ended" );
                alert.showAndWait();
            }


        }
    }
}
