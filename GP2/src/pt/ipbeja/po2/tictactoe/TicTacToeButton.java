/**
 * Andrei Oproiu
 **/

package pt.ipbeja.po2.tictactoe;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TicTacToeButton extends Button {

    private final ImageView noPlayer = new ImageView(new Image( "resources/noplayer.png" ) );
    private final ImageView player1 = new ImageView(new Image( "resources/player1.png" ) );
    private final ImageView player2 = new ImageView(new Image( "resources/player2.png" ) );

    public TicTacToeButton() {
        this.setGraphic( noPlayer );
    }

    public void setX(){
        this.setGraphic( player1 );
    }

    public void setY(){
        this.setGraphic( player2 );
    }

    public void setDisable(){
        this.setDisable(true);
    }

    public void play(int turn){
        if ( turn % 2 == 1 ){
            this.setX();
            this.setDisable();
        }else if (turn % 2 == 0){
            this.setY();
            this.setDisable();
        }
    }
}
