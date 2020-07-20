package com.example.gamedoz.fragments;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gamedoz.R;
import com.example.gamedoz.model.fourinrow.FourInRow;
import com.example.gamedoz.model.fourinrow.player;
import com.example.gamedoz.model.tictactoe.Players;


public class FourInRowFragment extends Fragment {

    private Button mButton1,mButton2,mButton3,mButton4,mButton5,mButton6,mButton7,mButton8,mButton9,mButton10,mButton11,mButton12,
    mButton13,mButton14,mButton15,mButton16,mButton17,mButton18,mButton19,mButton20,mButton21,mButton22,mButton23,mButton24,mButton25;

    private TextView mTextViewBluePoint,mTextViewRedPoint,mTextViewTurn;

    private int zeroZero=0,ZeroOne=0,zeroTwo=0,zeroThree=0,zeroFour=0;
    private FourInRow mFourInRow;
    private player turn;

    private int mIntSatr,mIntSoton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mFourInRow= new FourInRow();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_four_in_row, container, false);
        findAllView(view);
        allListener();
        return view;
    }
    private void findAllView(View view){
        mButton1 = view.findViewById(R.id.btn1);
        mButton2 = view.findViewById(R.id.btn2);
        mButton3 = view.findViewById(R.id.btn3);
        mButton4 = view.findViewById(R.id.btn4);
        mButton5 = view.findViewById(R.id.btn5);
        mButton6 = view.findViewById(R.id.btn6);
        mButton7 = view.findViewById(R.id.btn7);
        mButton8 = view.findViewById(R.id.btn8);
        mButton9 = view.findViewById(R.id.btn9);
        mButton10 = view.findViewById(R.id.btn10);
        mButton11 = view.findViewById(R.id.btn11);
        mButton12= view.findViewById(R.id.btn12);
        mButton13= view.findViewById(R.id.btn13);
        mButton14= view.findViewById(R.id.btn14);
        mButton15= view.findViewById(R.id.btn15);
        mButton16= view.findViewById(R.id.btn16);
        mButton17= view.findViewById(R.id.btn17);
        mButton18= view.findViewById(R.id.btn18);
        mButton19= view.findViewById(R.id.btn19);
        mButton20= view.findViewById(R.id.btn20);
        mButton21= view.findViewById(R.id.btn21);
        mButton22= view.findViewById(R.id.btn22);
        mButton23= view.findViewById(R.id.btn23);
        mButton24= view.findViewById(R.id.btn24);
        mButton25= view.findViewById(R.id.btn25);
        mTextViewBluePoint = view.findViewById(R.id.textView_blue_points);
        mTextViewRedPoint = view.findViewById(R.id.textView_red_points);
        mTextViewTurn = view.findViewById(R.id.textView_turn_color);
    }
    private void allListener(){
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton1);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton2);
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton3);
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton4);
            }
        });
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton5);
            }
        });
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton6);
            }
        });
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton7);
            }
        });
        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton8);
            }
        });mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton9);
            }
        });mButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton10);
            }
        });mButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton11);
            }
        });mButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton12);
            }
        });mButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton13);
            }
        });mButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton14);
            }
        });mButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton15);
            }
        });mButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton16);
            }
        });mButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton17);
            }
        });mButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton18);
            }
        });mButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton19);
            }
        });mButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton20);
            }
        });mButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton21);
            }
        });
        mButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton22);
            }
        });mButton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton23);
            }
        });mButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton24);
            }
        });mButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton25);
            }
        });
    }

    //set the turn color text , and return a char for other method to show that turn is which color
    private char buttonStateAnswer(){
            if (mTextViewTurn.getText().equals("Blue"))
                mTextViewTurn.setText("Red");
            else mTextViewTurn.setText("Blue");

            turn = mFourInRow.switchTurn();
            if (turn == player.BLUE){
                return 'b';
            }
            else {
                return 'r';
            }
    }

    //first get current turn from method (buttonStateAnswer()) and for each color that its turn fill the chart and then fill the color
    //in ui
    private void ActionButton(Button button){
        char currentTurn = buttonStateAnswer();
        if (currentTurn == 'b'){
            fillChart(button);
            fillUI('b');
        }else if (currentTurn == 'r'){
            fillChart(button);
            fillUI('r');
        }else
            Toast.makeText(getActivity(), "its already filled here...", Toast.LENGTH_SHORT).show();
    }

    //get the button and check which column will fill , it send the column number to  fillChartHelper(int a) method
    private void fillChart(Button b){
        if (b==mButton1||b==mButton6||b==mButton11||b==mButton16||b==mButton21){
            fillChartHelper(0);
        }else if (b==mButton2||b==mButton7||b==mButton12||b==mButton17||b==mButton22){
            fillChartHelper(1);
        }else if (b==mButton3||b==mButton8||b==mButton13||b==mButton18||b==mButton23){
            fillChartHelper(2);
        }else if (b==mButton4||b==mButton9||b==mButton14||b==mButton19||b==mButton24){
            fillChartHelper(3);
        }else {
            fillChartHelper(4);
        }
    }
    //this method get the column and fill the empty element in this column in chart,and set satr and soton var for filling ui
    private void fillChartHelper(int a){
        for (int i = 0; i <= 4; i++) {
            if (mFourInRow.getChart()[4-i][a]==player.EMPTY){
                mFourInRow.setChart(4-i,a);
               mIntSatr=4-i;
               mIntSoton=a;
               break;
            }
        }
    }

    // get a char to find which color should be select , and according to satr and soton var fill button color
    private void fillUI(char c){
        int color;
        if (c == 'b'){
            color=0xFF0000FF;
        }else color=0xFFFF0000;

        if (mIntSatr==0){
            if (mIntSoton==0){
                if (zeroZero==0) {
                    mButton1.setBackgroundColor(color);
                    zeroZero=1;
                }else{
                    Toast.makeText(getActivity(), "this column filled before...", Toast.LENGTH_SHORT).show();
                    buttonStateAnswer();
                }
            }else if (mIntSoton==1){
                if (ZeroOne==0) {
                    mButton2.setBackgroundColor(color);
                    ZeroOne=1;
                }else {
                    Toast.makeText(getActivity(), "this column filled before...", Toast.LENGTH_SHORT).show();
                    buttonStateAnswer();
                }
            }else if (mIntSoton==2){
                if (zeroTwo==0) {
                    mButton3.setBackgroundColor(color);
                    zeroTwo=1;
                }else {
                    Toast.makeText(getActivity(), "this column filled before...", Toast.LENGTH_SHORT).show();
                    buttonStateAnswer();
                }
            }else if (mIntSoton==3){
                if (zeroThree==0) {
                    mButton4.setBackgroundColor(color);
                    zeroThree=1;
                }else {
                    Toast.makeText(getActivity(), "this column filled before...", Toast.LENGTH_SHORT).show();
                    buttonStateAnswer();
                }
            }else if (mIntSoton==4){
                if (zeroFour==0) {
                    mButton5.setBackgroundColor(color);
                    zeroFour=1;
                }else {
                    Toast.makeText(getActivity(), "this column filled before...", Toast.LENGTH_SHORT).show();
                    buttonStateAnswer();
                }
            }
        }else if (mIntSatr==1){
            if (mIntSoton==0){
                mButton6.setBackgroundColor(color);
            }else if (mIntSoton==1){
                mButton7.setBackgroundColor(color);
            }else if (mIntSoton==2){
                mButton8.setBackgroundColor(color);
            }else if (mIntSoton==3){
                mButton9.setBackgroundColor(color);
            }else if (mIntSoton==4){
                mButton10.setBackgroundColor(color);
            }
        }else if (mIntSatr==2){
            if (mIntSoton==0){
                mButton11.setBackgroundColor(color);
            }else if (mIntSoton==1){
                mButton12.setBackgroundColor(color);
            }else if (mIntSoton==2){
                mButton13.setBackgroundColor(color);
            }else if (mIntSoton==3){
                mButton14.setBackgroundColor(color);
            }else if (mIntSoton==4){
                mButton15.setBackgroundColor(color);
            }
        }else if (mIntSatr==3){
            if (mIntSoton==0){
                mButton16.setBackgroundColor(color);
            }else if (mIntSoton==1){
                mButton17.setBackgroundColor(color);
            }else if (mIntSoton==2){
                mButton18.setBackgroundColor(color);
            }else if (mIntSoton==3){
                mButton19.setBackgroundColor(color);
            }else if (mIntSoton==4){
                mButton20.setBackgroundColor(color);
            }
        }else if (mIntSatr==4){
            if (mIntSoton==0){
                mButton21.setBackgroundColor(color);
            }else if (mIntSoton==1){
                mButton22.setBackgroundColor(color);
            }else if (mIntSoton==2){
                mButton23.setBackgroundColor(color);
            }else if (mIntSoton==3){
                mButton24.setBackgroundColor(color);
            }else if (mIntSoton==4){
                mButton25.setBackgroundColor(color);
            }
        }
    }
}