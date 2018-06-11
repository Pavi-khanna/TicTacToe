package com.example.pavikhanna.tictactoegame;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;

import static com.example.pavikhanna.tictactoegame.MainActivity.NO_PLAYER;

/**
 * Created by Pavi Khanna on 2/7/2018.
 */

public class TTTButton extends AppCompatButton{

    private int player = MainActivity.NO_PLAYER;


    public TTTButton(Context context) {
        super(context);
        setBackgroundResource(R.drawable.button_bg);
    }

    public void setPlayer(int player)
    {
        this.player=player;
        if(player==MainActivity.PLAYER_O){
            setText("X");

        }
        else if(player == MainActivity.PLAYER_X){
            setText("O");
        }
        setEnabled(false);
    }

    public int getPlayer() {
        return player;
    }

    public boolean isEmpty(){
        return player == MainActivity.NO_PLAYER;
    }
}
