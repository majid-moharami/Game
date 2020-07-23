package com.example.gamedoz.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.gamedoz.R;
import com.example.gamedoz.fragments.FourInRowFragment;
import com.example.gamedoz.fragments.TicTacToeFragment;

public class GameActivity extends AppCompatActivity {

    private Context mContext;
    private GameActivity mActivity;
    private RelativeLayout mRelativeLayout;
    private Button mButtonTicTac, mButtonRow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        findView();


        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.fragment_container,new FourInRowFragment()).commit();

        allListener();
    }

    private void allListener() {
        mButtonTicTac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new TicTacToeFragment());
                mButtonTicTac.setClickable(false);
                mButtonRow.setClickable(true);
            }
        });
        mButtonRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FourInRowFragment());
                mButtonTicTac.setClickable(true);
                mButtonRow.setClickable(false);
            }
        });
    }

    private void findView() {
        //find buttons
        mButtonTicTac = findViewById(R.id.button_tic_tac_toe);
        mButtonRow = findViewById(R.id.button_fouur_in_row);
    }

    private void loadFragment(Fragment f) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment ff = fragmentManager.findFragmentById(R.id.fragment_container);
            fragmentManager.beginTransaction().replace(R.id.fragment_container, f).commit();

    }
}