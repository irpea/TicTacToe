package com.nerdranch.irpea.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;

    int turn = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        initWidgets();
        setListeners();

    }

    private void initWidgets() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
    }

    private void setListeners() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn1.setText("O");
                    }
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn2.setText("O");
                    }
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn3.setText("O");
                    }
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn4.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn4.setText("O");
                    }
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn5.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn5.setText("O");
                    }
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn6.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn6.setText("O");
                    }
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn7.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn7.setText("O");
                    }
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn8.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn8.setText("O");
                    }
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn9.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        btn9.setText("O");
                    }
                }
            }
        });
    }


}
