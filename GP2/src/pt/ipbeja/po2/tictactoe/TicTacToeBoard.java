/**
 * Andrei Oproiu
 **/

package pt.ipbeja.po2.tictactoe;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
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
                Button button = new Button(line + " " + col);
                button.setOnAction( bHandler );
                this.add( button, col, line );
            }
        }
    }

    private class ButtonHandler implements EventHandler <ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            Button buttonClicked = (Button)(event.getSource());

            if ( counter % 2 == 0 ){
                buttonClicked.setText( "X" );
            }else if (counter % 2 == 1){
                buttonClicked.setText( "O" );
            }
            counter++;
        }
    }
}
