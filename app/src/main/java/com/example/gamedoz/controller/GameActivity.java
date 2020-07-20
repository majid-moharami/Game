package com.example.gamedoz.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.example.gamedoz.R;
import com.example.gamedoz.fragments.FourInRowFragment;
import com.example.gamedoz.fragments.TicTacToeFragment;

public class GameActivity extends AppCompatActivity {

    private Context mContext;
    private GameActivity mActivity;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.fragment_container,new FourInRowFragment()).commit();
    }
}