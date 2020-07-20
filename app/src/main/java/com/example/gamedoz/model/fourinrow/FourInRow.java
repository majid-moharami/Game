package com.example.gamedoz.model.fourinrow;

import com.example.gamedoz.model.Conditions;
import com.example.gamedoz.model.tictactoe.Players;

public class FourInRow {
    private player[][] chart;
    private player blue = player.BLUE;
    private player red = player.RED;
    private player start;

    public FourInRow() {
        chart = new player[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                chart[i][j] = player.EMPTY;
            }
        }
    }

    public player[][] getChart() {
        return chart;
    }

    public void setChart(int i, int j) {
        player aa = this.switchTurn();
        this.chart[i][j] = this.switchTurn();
    }

    public player switchTurn() {
        if (start == null) {
            start = blue;
            return start;
        } else if (start == blue) {
            start = red;
            return red;
        } else if (start == red) {
            start = blue;
            return blue;
        } else return blue;
    }

    public Conditions checkFinish() {

        //this for check the game for each column...
        for (int i = 0; i < 5; i++) {
            if ((chart[0][i] != player.EMPTY && (chart[0][i] == chart[1][i] && chart[1][i] == chart[2][i] && chart[2][i] == chart[3][i]))) {
                if (chart[0][i] == player.RED) return Conditions.RED_WIN;
                if (chart[0][i] == player.BLUE) return Conditions.BLUE_WIN;
            }
            if (chart[1][i] != player.EMPTY && (chart[1][i] == chart[2][i] && chart[2][i] == chart[3][i] && chart[3][i] == chart[4][i])) {
                if (chart[1][i] == player.RED) return Conditions.RED_WIN;
                if (chart[1][i] == player.BLUE) return Conditions.BLUE_WIN;
            }
        }

        //this for check the game for each row...
        for (int i = 0; i < 5; i++) {
            player zero = chart[i][0], one = chart[i][1], two = chart[i][2], three = chart[i][3], four = chart[i][4];
            if ((zero != player.EMPTY && one != player.EMPTY && two != player.EMPTY && three != player.EMPTY)&&(zero==one && one==two && two==three)){
                if (zero== player.RED) return Conditions.RED_WIN;
                if (zero== player.BLUE) return Conditions.BLUE_WIN;
            }
            if ((one != player.EMPTY && two != player.EMPTY && three != player.EMPTY&& four!=player.EMPTY)&&(one==two && two==three && three==four)) {
                if (one== player.RED) return Conditions.RED_WIN;
                if (one== player.BLUE) return Conditions.BLUE_WIN;
            }
        }

        //this if check the 4 element oblique(movarab) up  up to down
        if (chart[0][1]!=player.EMPTY && (chart[0][1]==chart[1][2] && chart[1][2]==chart[2][3] &&chart[2][3]==chart[3][4] )){
            if (chart[0][1]== player.RED) return Conditions.RED_WIN;
            if (chart[0][1]== player.BLUE) return Conditions.BLUE_WIN;
        }
        //this if check the 4 element oblique(movarab) down  up to down
        if (chart[1][0]!=player.EMPTY && (chart[1][0]==chart[2][1] && chart[2][1]==chart[3][2] && chart[3][2]==chart[4][3])){
            if (chart[1][0]== player.RED) return Conditions.RED_WIN;
            if (chart[1][0]== player.BLUE) return Conditions.BLUE_WIN;
        }
        //this if check the 4 element oblique(movarab) up  down to up
        if (chart[3][0]!=player.EMPTY && (chart[3][0]==chart[2][1] && chart[2][1]==chart[1][2] && chart[1][2]==chart[0][3])){
            if (chart[3][0]== player.RED) return Conditions.RED_WIN;
            if (chart[3][0]== player.BLUE) return Conditions.BLUE_WIN;
        }
        //this if check the 4 element oblique(movarab) down  down to up
        if (chart[4][1]!=player.EMPTY && (chart[4][1]==chart[3][2] && chart[3][2]==chart[2][3] && chart[2][3]==chart[1][4])){
            if (chart[4][1]== player.RED) return Conditions.RED_WIN;
            if (chart[4][1]== player.BLUE) return Conditions.BLUE_WIN;
        }

        //check diameter up to down
        if (chart[0][0]!=player.EMPTY && (chart[0][0]==chart[1][1] && chart[1][1]==chart[2][2] && chart[2][2]==chart[3][3])){
            if (chart[0][0]== player.RED) return Conditions.RED_WIN;
            if (chart[0][0]== player.BLUE) return Conditions.BLUE_WIN;
        }
        if (chart[1][1]!=player.EMPTY && (chart[1][1]==chart[2][2] && chart[2][2]==chart[3][3] && chart[3][3]==chart[4][4])){
            if (chart[1][1]== player.RED) return Conditions.RED_WIN;
            if (chart[1][1]== player.BLUE) return Conditions.BLUE_WIN;
        }

        //check diameter down to up
        if (chart[4][0]!=player.EMPTY && (chart[4][0]==chart[3][1] && chart[3][1]==chart[2][2] && chart[2][2]==chart[1][3])){
            if (chart[4][0]== player.RED) return Conditions.RED_WIN;
            if (chart[4][0]== player.BLUE) return Conditions.BLUE_WIN;
        }
        if (chart[3][1]!=player.EMPTY && (chart[3][1]==chart[2][2] && chart[2][2]==chart[1][3] && chart[1][3]==chart[0][4])){
            if (chart[3][1]== player.RED) return Conditions.RED_WIN;
            if (chart[3][1]== player.BLUE) return Conditions.BLUE_WIN;
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5 ; j++) {
                if (chart[i][j]==player.EMPTY) return Conditions.NOT_FINISHED;
            }
        }

        return Conditions.DRAW;
    }

    public void restart(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                chart[i][j] = player.EMPTY;
            }
        }
    }
}
