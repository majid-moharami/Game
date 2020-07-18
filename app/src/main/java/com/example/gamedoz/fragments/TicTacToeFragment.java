package com.example.gamedoz.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gamedoz.R;
import com.example.gamedoz.model.Conditions;
import com.example.gamedoz.model.Players;
import com.example.gamedoz.model.TicTacToe;


public class TicTacToeFragment extends Fragment {

    private Button mButton1,mButton2,mButton3,mButton4,mButton5,mButton6,mButton7,mButton8,mButton9;
    private TextView mPlayer1Points,mPlayer2Points,mTurnPlayer;
    private TicTacToe mTicTacToe;
    private Players turn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTicTacToe = new TicTacToe();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tic_tac_toe, container, false);
        findAllView(view);
        allListener();
        return view;
    }
    private void findAllView(View view){
        mButton1 = view.findViewById(R.id.button1);
        mButton2 = view.findViewById(R.id.button2);
        mButton3 = view.findViewById(R.id.button3);
        mButton4 = view.findViewById(R.id.button4);
        mButton5 = view.findViewById(R.id.button5);
        mButton6 = view.findViewById(R.id.button6);
        mButton7 = view.findViewById(R.id.button7);
        mButton8 = view.findViewById(R.id.button8);
        mButton9 = view.findViewById(R.id.button9);
        mPlayer1Points = view.findViewById(R.id.textView_player_1_point);
        mPlayer2Points = view.findViewById(R.id.textView_player_2_point);
        mTurnPlayer = view.findViewById(R.id.textView_turn_player);
    }
    private void allListener(){
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               buttonAction(mButton1);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonAction(mButton2);

            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonAction(mButton3);

            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonAction(mButton4);
            }
        });

        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonAction(mButton5);
            }
        });

        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonAction(mButton6);

            }
        });

        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonAction(mButton7);
            }
        });

        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonAction(mButton8);
            }
        });

        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonAction(mButton9);
            }
        });
    }

    // this method give the pressed button and return a suitable answer
    private char buttonStateAnswer(Button btn){
        if (btn.getText().equals("")){
            if (mTurnPlayer.getText().equals("1"))
                mTurnPlayer.setText("2");
            else mTurnPlayer.setText("1");

            turn = mTicTacToe.switchTurn();
            if (turn == Players.X){
                return 'x';
            }
            else {
                return 'o';
            }
        }else return 'n';
    }

    //
    private void buttonAction(Button btn){
        char action = buttonStateAnswer(btn);
        if (action == 'x'){
            btn.setText("X");
            fillGameChart(btn);
        }else if (action == 'o'){
            btn.setText("O");
            fillGameChart(btn);
        }else
            Toast.makeText(getActivity(), "its already filled here...", Toast.LENGTH_SHORT).show();

    }

    private void fillGameChart(Button button){
        if (button == mButton1){
            mTicTacToe.setGameChart(0,0);
        }else if (button == mButton2){
            mTicTacToe.setGameChart(0,1);
        }else if (button == mButton3){
            mTicTacToe.setGameChart(0,2);
        }else if (button == mButton4){
            mTicTacToe.setGameChart(1,0);
        }else if (button == mButton5){
            mTicTacToe.setGameChart(1,1);
        }else if (button == mButton6){
            mTicTacToe.setGameChart(1,2);
        }else if (button == mButton7){
            mTicTacToe.setGameChart(2,0);
        }else if (button == mButton8){
            mTicTacToe.setGameChart(2,1);
        }else if (button == mButton9){
            mTicTacToe.setGameChart(2,2);
        }

        checkFinish();
    }

    private void checkFinish(){
        if (mTicTacToe.isFinished() != Conditions.NOT_FINISHED)
            if (mTicTacToe.isFinished() == Conditions.DRAW){
                int p1 = Integer.parseInt((String) mPlayer1Points.getText());
                int p2 = Integer.parseInt((String) mPlayer2Points.getText());
                mPlayer1Points.setText(String.valueOf(p1+1));
                mPlayer2Points.setText(String.valueOf(p2+1));
            }else if (mTicTacToe.isFinished() == Conditions.X_WINS){
                int p1 = Integer.parseInt((String) mPlayer1Points.getText());
                mPlayer1Points.setText(String.valueOf(p1+1));
            }else if (mTicTacToe.isFinished() == Conditions.O_WINS){
                int p2= Integer.parseInt((String) mPlayer2Points.getText());
                mPlayer2Points.setText(String.valueOf(p2+1));
            }
    }
}