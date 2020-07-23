package com.example.gamedoz.model;

import com.example.gamedoz.model.fourinrow.player;

public class Game {
    private player[][] chart;

    public Game(int n , int m) {
        chart = new player[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                chart[i][j] = player.EMPTY;
            }
        }
    }
}
