package com.example.gamedoz.model.fourinrow;

import com.example.gamedoz.model.tictactoe.Players;

public class FourInRow {
    private player[][] chart;
    private player blue=player.BLUE;
    private player red=player.RED;
    private player start;

    public FourInRow() {
        chart =new player[5][5];
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                chart[i][j]= player.EMPTY;
            }
        }
    }
    public player[][] getChart(){
        return chart;
    }

    public void setChart(int i, int j){
        player aa =this.switchTurn();
        this.chart[i][j] =this.switchTurn() ;
    }
    public player switchTurn(){
        if (start==null){
            start=blue;
            return start;
        } else if (start==blue){
            start=red;
            return red;
        }
        else if (start==red){
            start=blue;
            return blue;
        } else return blue;
    }
}
