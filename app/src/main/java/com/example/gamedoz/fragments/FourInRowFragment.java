package com.example.gamedoz.fragments;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gamedoz.R;
import com.example.gamedoz.model.Conditions;
import com.example.gamedoz.model.fourinrow.FourInRow;
import com.example.gamedoz.model.fourinrow.player;
import com.example.gamedoz.model.tictactoe.Players;
import com.google.android.material.snackbar.Snackbar;

import java.io.Serializable;
import java.util.Objects;


public class FourInRowFragment extends Fragment {

    public static final String BUNDLE_KEY_FOURINROW_OBJECT = "mFourInRow_instance";
    public static final String BUNDLE_KEY_TURN_TEXT_VIEW = "turn_text_view";
    public static final String BUNDLE_KEY_POINT_BLUE = "point_blue";
    public static final String BUNDLE_KEY_POINT_RED = "point_red";
    private Button mButton1, mButton2, mButton3, mButton4, mButton5, mButton6, mButton7, mButton8, mButton9, mButton10, mButton11, mButton12,
            mButton13, mButton14, mButton15, mButton16, mButton17, mButton18, mButton19, mButton20, mButton21, mButton22, mButton23, mButton24, mButton25;

    private TextView mTextViewBluePoint, mTextViewRedPoint, mTextViewTurn;

    private int zeroZero = 0, ZeroOne = 0, zeroTwo = 0, zeroThree = 0, zeroFour = 0;
    private FourInRow mFourInRow;
    private player turn;

    private int mIntSatr, mIntSoton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (savedInstanceState != null) {
//            mFourInRow = (FourInRow) savedInstanceState.getSerializable(BUNDLE_KEY_FOURINROW_OBJECT);
//            fillUiAfterRotate();
//        } else mFourInRow = new FourInRow();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_four_in_row, container, false);
        findAllView(view);
        allListener();
        if (savedInstanceState != null) {
            mFourInRow = (FourInRow) savedInstanceState.getSerializable(BUNDLE_KEY_FOURINROW_OBJECT);
            fillUiAfterRotate();
            mTextViewRedPoint.setText(savedInstanceState.getString(BUNDLE_KEY_POINT_RED));
            mTextViewBluePoint.setText(savedInstanceState.getString(BUNDLE_KEY_POINT_BLUE));
            if (Objects.equals(savedInstanceState.getString(BUNDLE_KEY_TURN_TEXT_VIEW), "Blue")) {
                mTextViewTurn.setText(savedInstanceState.getString(BUNDLE_KEY_TURN_TEXT_VIEW));
                mTextViewTurn.setTextColor(Color.CYAN);
            } else {
                mTextViewTurn.setText(savedInstanceState.getString(BUNDLE_KEY_TURN_TEXT_VIEW));
                mTextViewTurn.setTextColor(Color.RED);
            }
        }else mFourInRow = new FourInRow();
        return view;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("majid", "onSaveInstance");
        outState.putSerializable(BUNDLE_KEY_FOURINROW_OBJECT, mFourInRow);
        outState.putString(BUNDLE_KEY_TURN_TEXT_VIEW, String.valueOf(mTextViewTurn.getText()));
        outState.putString(BUNDLE_KEY_POINT_BLUE, mTextViewBluePoint.getText().toString());
        outState.putString(BUNDLE_KEY_POINT_RED, String.valueOf(mTextViewRedPoint.getText()));
    }

    private void findAllView(View view) {
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
        mButton12 = view.findViewById(R.id.btn12);
        mButton13 = view.findViewById(R.id.btn13);
        mButton14 = view.findViewById(R.id.btn14);
        mButton15 = view.findViewById(R.id.btn15);
        mButton16 = view.findViewById(R.id.btn16);
        mButton17 = view.findViewById(R.id.btn17);
        mButton18 = view.findViewById(R.id.btn18);
        mButton19 = view.findViewById(R.id.btn19);
        mButton20 = view.findViewById(R.id.btn20);
        mButton21 = view.findViewById(R.id.btn21);
        mButton22 = view.findViewById(R.id.btn22);
        mButton23 = view.findViewById(R.id.btn23);
        mButton24 = view.findViewById(R.id.btn24);
        mButton25 = view.findViewById(R.id.btn25);
        mTextViewBluePoint = view.findViewById(R.id.textView_blue_points);
        mTextViewRedPoint = view.findViewById(R.id.textView_red_points);
        mTextViewTurn = view.findViewById(R.id.textView_turn_color);
    }

    private void allListener() {
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
        });
        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton9);
            }
        });
        mButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton10);
            }
        });
        mButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton11);
            }
        });
        mButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton12);
            }
        });
        mButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton13);
            }
        });
        mButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton14);
            }
        });
        mButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton15);
            }
        });
        mButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton16);
            }
        });
        mButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton17);
            }
        });
        mButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton18);
            }
        });
        mButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton19);
            }
        });
        mButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton20);
            }
        });
        mButton21.setOnClickListener(new View.OnClickListener() {
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
        });
        mButton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton23);
            }
        });
        mButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton24);
            }
        });
        mButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionButton(mButton25);
            }
        });
    }

    //set the turn color text , and return a char for other method to show that turn is which color
    private char buttonStateAnswer() {
        if (mTextViewTurn.getText().equals("Blue")) {
            mTextViewTurn.setText("Red");
            mTextViewTurn.setTextColor(Color.RED);
        } else {
            mTextViewTurn.setText("Blue");
            mTextViewTurn.setTextColor(Color.CYAN);
        }

        turn = mFourInRow.switchTurn();
        if (turn == player.BLUE) {
            return 'b';
        } else {
            return 'r';
        }
    }

    //first get current turn from method (buttonStateAnswer()) and for each color that its turn fill the chart and then fill the color
    //in ui
    private void ActionButton(Button button) {
        char currentTurn = buttonStateAnswer();
        if (currentTurn == 'b') {
            fillChart(button);
            fillUI('b');
        } else if (currentTurn == 'r') {
            fillChart(button);
            fillUI('r');
        } else
            Toast.makeText(getActivity(), "its already filled here...", Toast.LENGTH_SHORT).show();
    }

    //get the button and check which column will fill , it send the column number to  fillChartHelper(int a) method and check finish
    private void fillChart(Button b) {
        if (b == mButton1 || b == mButton6 || b == mButton11 || b == mButton16 || b == mButton21) {
            fillChartHelper(0);
        } else if (b == mButton2 || b == mButton7 || b == mButton12 || b == mButton17 || b == mButton22) {
            fillChartHelper(1);
        } else if (b == mButton3 || b == mButton8 || b == mButton13 || b == mButton18 || b == mButton23) {
            fillChartHelper(2);
        } else if (b == mButton4 || b == mButton9 || b == mButton14 || b == mButton19 || b == mButton24) {
            fillChartHelper(3);
        } else {
            fillChartHelper(4);
        }
        checkFinish();
    }

    //this method get the column and fill the empty element in this column in chart,and set satr and soton var for filling ui
    private void fillChartHelper(int a) {
        for (int i = 0; i <= 4; i++) {
            if (mFourInRow.getChart()[4 - i][a] == player.EMPTY) {
                mFourInRow.setChart(4 - i, a);
                mIntSatr = 4 - i;
                mIntSoton = a;
                break;
            }
        }
    }

    // get a char to find which color should be select , and according to satr and soton var fill button color
    private void fillUI(char c) {
        int color;
        if (c == 'b') {
            color = R.drawable.back_blue_4inrow;
        } else color = R.drawable.back_red_4inrow;

        if (mIntSatr == 0) {
            if (mIntSoton == 0) {
                if (zeroZero == 0) {
                    mButton1.setBackgroundResource(color);
                    zeroZero = 1;
                } else {
                    Toast.makeText(getActivity(), "this column filled before...", Toast.LENGTH_SHORT).show();
                    buttonStateAnswer();
                }
            } else if (mIntSoton == 1) {
                if (ZeroOne == 0) {
                    mButton2.setBackgroundResource(color);
                    ZeroOne = 1;
                } else {
                    Toast.makeText(getActivity(), "this column filled before...", Toast.LENGTH_SHORT).show();
                    buttonStateAnswer();
                }
            } else if (mIntSoton == 2) {
                if (zeroTwo == 0) {
                    mButton3.setBackgroundResource(color);
                    zeroTwo = 1;
                } else {
                    Toast.makeText(getActivity(), "this column filled before...", Toast.LENGTH_SHORT).show();
                    buttonStateAnswer();
                }
            } else if (mIntSoton == 3) {
                if (zeroThree == 0) {
                    mButton4.setBackgroundResource(color);
                    zeroThree = 1;
                } else {
                    Toast.makeText(getActivity(), "this column filled before...", Toast.LENGTH_SHORT).show();
                    buttonStateAnswer();
                }
            } else if (mIntSoton == 4) {
                if (zeroFour == 0) {
                    mButton5.setBackgroundResource(color);
                    zeroFour = 1;
                } else {
                    Toast.makeText(getActivity(), "this column filled before...", Toast.LENGTH_SHORT).show();
                    buttonStateAnswer();
                }
            }
        } else if (mIntSatr == 1) {
            if (mIntSoton == 0) {
                mButton6.setBackgroundResource(color);
            } else if (mIntSoton == 1) {
                mButton7.setBackgroundResource(color);
            } else if (mIntSoton == 2) {
                mButton8.setBackgroundResource(color);
            } else if (mIntSoton == 3) {
                mButton9.setBackgroundResource(color);
            } else if (mIntSoton == 4) {
                mButton10.setBackgroundResource(color);
            }
        } else if (mIntSatr == 2) {
            if (mIntSoton == 0) {
                mButton11.setBackgroundResource(color);
            } else if (mIntSoton == 1) {
                mButton12.setBackgroundResource(color);
            } else if (mIntSoton == 2) {
                mButton13.setBackgroundResource(color);
            } else if (mIntSoton == 3) {
                mButton14.setBackgroundResource(color);
            } else if (mIntSoton == 4) {
                mButton15.setBackgroundResource(color);
            }
        } else if (mIntSatr == 3) {
            if (mIntSoton == 0) {
                mButton16.setBackgroundResource(color);
            } else if (mIntSoton == 1) {
                mButton17.setBackgroundResource(color);
            } else if (mIntSoton == 2) {
                mButton18.setBackgroundResource(color);
            } else if (mIntSoton == 3) {
                mButton19.setBackgroundResource(color);
            } else if (mIntSoton == 4) {
                mButton20.setBackgroundResource(color);
            }
        } else if (mIntSatr == 4) {
            if (mIntSoton == 0) {
                mButton21.setBackgroundResource(color);
            } else if (mIntSoton == 1) {
                mButton22.setBackgroundResource(color);
            } else if (mIntSoton == 2) {
                mButton23.setBackgroundResource(color);
            } else if (mIntSoton == 3) {
                mButton24.setBackgroundResource(color);
            } else if (mIntSoton == 4) {
                mButton25.setBackgroundResource(color);
            }
        }
    }

    private void fillUiAfterRotate() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (mFourInRow.getChart()[i][j]==player.BLUE) {
                    mIntSatr=i;
                    mIntSoton=j;
                    fillUI('b');
                }
                if (mFourInRow.getChart()[i][j]==player.RED){
                    mIntSatr=i;
                    mIntSoton=j;
                    fillUI('r');
                }
                if (mFourInRow.getChart()[i][j]==player.EMPTY)
                    continue;
            }
        }
    }

    private void checkFinish() {
        if (mFourInRow.checkFinish() != Conditions.NOT_FINISHED)
            if (mFourInRow.checkFinish() == Conditions.DRAW) {
                int p1 = Integer.parseInt((String) mTextViewBluePoint.getText());
                int p2 = Integer.parseInt((String) mTextViewRedPoint.getText());
                mTextViewBluePoint.setText(String.valueOf(p1 + 1));
                mTextViewRedPoint.setText(String.valueOf(p2 + 1));
                sendSnackBar("any body won...");
                restartGame();
            } else if (mFourInRow.checkFinish() == Conditions.BLUE_WIN) {
                int p1 = Integer.parseInt((String) mTextViewBluePoint.getText());
                mTextViewBluePoint.setText(String.valueOf(p1 + 1));
                sendSnackBar("Blue is win ;)");
                restartGame();
            } else if (mFourInRow.checkFinish() == Conditions.RED_WIN) {
                int p2 = Integer.parseInt((String) mTextViewRedPoint.getText());
                mTextViewRedPoint.setText(String.valueOf(p2 + 1));
                sendSnackBar("Red is win ;)");
                restartGame();
            }
    }

    private void restartGame() {
        mButton1.setClickable(false);
        mButton2.setClickable(false);
        mButton3.setClickable(false);
        mButton4.setClickable(false);
        mButton5.setClickable(false);
        mButton6.setClickable(false);
        mButton7.setClickable(false);
        mButton8.setClickable(false);
        mButton9.setClickable(false);
        mButton10.setClickable(false);
        mButton11.setClickable(false);
        mButton12.setClickable(false);
        mButton13.setClickable(false);
        mButton14.setClickable(false);
        mButton15.setClickable(false);
        mButton16.setClickable(false);
        mButton17.setClickable(false);
        mButton18.setClickable(false);
        mButton19.setClickable(false);
        mButton20.setClickable(false);
        mButton21.setClickable(false);
        mButton22.setClickable(false);
        mButton23.setClickable(false);
        mButton24.setClickable(false);
        mButton25.setClickable(false);
        CountDownTimer timer = new CountDownTimer(5000, 5000) {
            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                mButton1.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton2.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton3.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton4.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton5.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton6.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton7.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton8.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton9.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton10.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton11.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton12.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton13.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton14.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton15.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton16.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton17.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton18.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton19.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton20.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton21.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton22.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton23.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton24.setBackgroundResource(R.drawable.background_btn_4inrow);
                mButton25.setBackgroundResource(R.drawable.background_btn_4inrow);
                mFourInRow.restart();
                mButton1.setClickable(true);
                mButton2.setClickable(true);
                mButton3.setClickable(true);
                mButton4.setClickable(true);
                mButton5.setClickable(true);
                mButton6.setClickable(true);
                mButton7.setClickable(true);
                mButton8.setClickable(true);
                mButton9.setClickable(true);
                mButton10.setClickable(true);
                mButton11.setClickable(true);
                mButton12.setClickable(true);
                mButton13.setClickable(true);
                mButton14.setClickable(true);
                mButton15.setClickable(true);
                mButton16.setClickable(true);
                mButton17.setClickable(true);
                mButton18.setClickable(true);
                mButton19.setClickable(true);
                mButton20.setClickable(true);
                mButton21.setClickable(true);
                mButton22.setClickable(true);
                mButton23.setClickable(true);
                mButton24.setClickable(true);
                mButton25.setClickable(true);
            }
        };
        timer.start();
    }

    private void sendSnackBar(String s) {
        Snackbar snackbar = Snackbar.make(getView(), s, Snackbar.LENGTH_LONG)
                .setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar1 = Snackbar.make(getView(), "play again...", Snackbar.LENGTH_SHORT);
                        snackbar1.show();
                    }
                });

        snackbar.show();
    }
}