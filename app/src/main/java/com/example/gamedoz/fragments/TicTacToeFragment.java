package com.example.gamedoz.fragments;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gamedoz.R;
import com.example.gamedoz.model.Conditions;
import com.example.gamedoz.model.tictactoe.Players;
import com.example.gamedoz.model.tictactoe.TicTacToe;
import com.google.android.material.snackbar.Snackbar;


public class TicTacToeFragment extends Fragment {

    public static final String BUNDLE_KEY_PLAYER1_POINTS = "put1";
    public static final String BUNDLE_KEY_PLAYER2_POINTS = "put2";
    public static final String BUNDLE_KEY_TURN_TEXT = "put3";
    public static final String BUNDLE_KEY_TIC_TAC_TOE_OBJECT = "put4";
    private Button mButton1, mButton2, mButton3, mButton4, mButton5, mButton6, mButton7, mButton8, mButton9;
    private TextView mPlayer1Points, mPlayer2Points, mTurnPlayer;
    private TicTacToe mTicTacToe;
    private Players turn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tic_tac_toe, container, false);

        findAllView(view);
        allListener();
        if (savedInstanceState != null) {
            mPlayer1Points.setText(savedInstanceState.getString(BUNDLE_KEY_PLAYER1_POINTS));
            mPlayer2Points.setText(savedInstanceState.getString(BUNDLE_KEY_PLAYER2_POINTS));
            mTurnPlayer.setText(savedInstanceState.getString(BUNDLE_KEY_TURN_TEXT));
            mTicTacToe = (TicTacToe) savedInstanceState.getSerializable(BUNDLE_KEY_TIC_TAC_TOE_OBJECT);
            fillUiAfterRotate();
        }else  mTicTacToe = new TicTacToe();
        return view;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(BUNDLE_KEY_PLAYER1_POINTS, mPlayer1Points.getText().toString());
        outState.putString(BUNDLE_KEY_PLAYER2_POINTS, mPlayer2Points.getText().toString());
        outState.putString(BUNDLE_KEY_TURN_TEXT, mTurnPlayer.getText().toString());
        outState.putSerializable(BUNDLE_KEY_TIC_TAC_TOE_OBJECT, mTicTacToe);
    }

    private void findAllView(View view) {
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

    private void allListener() {
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
    private char buttonStateAnswer(Button btn) {
        if (btn.getText().equals("")) {
            if (mTurnPlayer.getText().equals("1(X)"))
                mTurnPlayer.setText("2(O)");
            else mTurnPlayer.setText("1(X)");

            turn = mTicTacToe.switchTurn();
            if (turn == Players.X) {
                return 'x';
            } else {
                return 'o';
            }
        } else return 'n';
    }

    //
    private void buttonAction(Button btn) {
        char action = buttonStateAnswer(btn);
        if (action == 'x') {
            btn.setTextColor(Color.CYAN);
            btn.setText("X");
            fillGameChart(btn);
        } else if (action == 'o') {
            btn.setTextColor(Color.RED);
            btn.setText("O");
            fillGameChart(btn);
        } else
            Toast.makeText(getActivity(), "its already filled here...", Toast.LENGTH_SHORT).show();

    }

    private void fillGameChart(Button button) {
        if (button == mButton1) {
            mTicTacToe.setGameChart(0, 0);
        } else if (button == mButton2) {
            mTicTacToe.setGameChart(0, 1);
        } else if (button == mButton3) {
            mTicTacToe.setGameChart(0, 2);
        } else if (button == mButton4) {
            mTicTacToe.setGameChart(1, 0);
        } else if (button == mButton5) {
            mTicTacToe.setGameChart(1, 1);
        } else if (button == mButton6) {
            mTicTacToe.setGameChart(1, 2);
        } else if (button == mButton7) {
            mTicTacToe.setGameChart(2, 0);
        } else if (button == mButton8) {
            mTicTacToe.setGameChart(2, 1);
        } else if (button == mButton9) {
            mTicTacToe.setGameChart(2, 2);
        }

        checkFinish();
    }

    private void fillUiAfterRotate(){
        if (mTicTacToe.getGameChart()[0][0]==Players.X) {
            mButton1.setTextColor(Color.CYAN);
            mButton1.setText("X");
        }else if (mTicTacToe.getGameChart()[0][0]==Players.O){
            mButton1.setTextColor(Color.RED);
            mButton1.setText("O");
        }

        if (mTicTacToe.getGameChart()[0][1]==Players.X) {
            mButton2.setTextColor(Color.CYAN);
            mButton2.setText("X");
        }else if (mTicTacToe.getGameChart()[0][1]==Players.O){
            mButton2.setTextColor(Color.RED);
            mButton2.setText("O");
        }

        if (mTicTacToe.getGameChart()[0][2]==Players.X) {
            mButton3.setTextColor(Color.CYAN);
            mButton3.setText("X");
        }else if (mTicTacToe.getGameChart()[0][2]==Players.O){
            mButton3.setTextColor(Color.RED);
            mButton3.setText("O");
        }

        if (mTicTacToe.getGameChart()[1][0]==Players.X) {
            mButton4.setTextColor(Color.CYAN);
            mButton4.setText("X");
        }else if (mTicTacToe.getGameChart()[1][0]==Players.O){
            mButton4.setTextColor(Color.RED);
            mButton4.setText("O");
        }

        if (mTicTacToe.getGameChart()[1][1]==Players.X) {
            mButton5.setTextColor(Color.CYAN);
            mButton5.setText("X");
        }else if (mTicTacToe.getGameChart()[1][1]==Players.O){
            mButton5.setTextColor(Color.RED);
            mButton5.setText("O");
        }

        if (mTicTacToe.getGameChart()[1][2]==Players.X) {
            mButton6.setTextColor(Color.CYAN);
            mButton6.setText("X");
        }else if (mTicTacToe.getGameChart()[1][2]==Players.O){
            mButton6.setTextColor(Color.RED);
            mButton6.setText("O");
        }

        if (mTicTacToe.getGameChart()[2][0]==Players.X) {
            mButton7.setTextColor(Color.CYAN);
            mButton7.setText("X");
        }else if (mTicTacToe.getGameChart()[2][0]==Players.O){
            mButton7.setTextColor(Color.RED);
            mButton7.setText("O");
        }

        if (mTicTacToe.getGameChart()[2][1]==Players.X) {
            mButton8.setTextColor(Color.CYAN);
            mButton8.setText("X");
        }else if (mTicTacToe.getGameChart()[2][1]==Players.O){
            mButton8.setTextColor(Color.RED);
            mButton8.setText("O");
        }

        if (mTicTacToe.getGameChart()[2][2]==Players.X) {
            mButton9.setTextColor(Color.CYAN);
            mButton9.setText("X");
        }else if (mTicTacToe.getGameChart()[2][2]==Players.O) {
            mButton9.setTextColor(Color.RED);
            mButton9.setText("O");
        }

    }

    private void checkFinish() {
        if (mTicTacToe.isFinished() != Conditions.NOT_FINISHED)
            if (mTicTacToe.isFinished() == Conditions.DRAW) {
                int p1 = Integer.parseInt((String) mPlayer1Points.getText());
                int p2 = Integer.parseInt((String) mPlayer2Points.getText());
                mPlayer1Points.setText(String.valueOf(p1 + 1));
                mPlayer2Points.setText(String.valueOf(p2 + 1));
                sendSnackBar("any body won...");
                restartGame();
            } else if (mTicTacToe.isFinished() == Conditions.X_WINS) {
                int p1 = Integer.parseInt((String) mPlayer1Points.getText());
                mPlayer1Points.setText(String.valueOf(p1 + 1));
                sendSnackBar("player 1 is win ;)");
                restartGame();
            } else if (mTicTacToe.isFinished() == Conditions.O_WINS) {
                int p2 = Integer.parseInt((String) mPlayer2Points.getText());
                mPlayer2Points.setText(String.valueOf(p2 + 1));
                sendSnackBar("player 2 is win ;)");
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
        CountDownTimer timer = new CountDownTimer(5000, 5000) {
            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                mButton1.setText("");
                mButton2.setText("");
                mButton3.setText("");
                mButton4.setText("");
                mButton5.setText("");
                mButton6.setText("");
                mButton7.setText("");
                mButton8.setText("");
                mButton9.setText("");
                mTicTacToe.restart();
                mButton1.setClickable(true);
                mButton2.setClickable(true);
                mButton3.setClickable(true);
                mButton4.setClickable(true);
                mButton5.setClickable(true);
                mButton6.setClickable(true);
                mButton7.setClickable(true);
                mButton8.setClickable(true);
                mButton9.setClickable(true);
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