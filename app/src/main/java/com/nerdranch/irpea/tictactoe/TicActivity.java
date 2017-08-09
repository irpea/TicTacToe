package com.nerdranch.irpea.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TicActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnRestart;
    private TextView tvXScore;
    private TextView tvOScore;

    private int turn = 1;
    private int xScore = 0;
    private int oScore = 0;
    private boolean end = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic);

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
        btnRestart = (Button) findViewById(R.id.btnRestart);
        tvXScore = (TextView) findViewById(R.id.tvXScore);
        tvOScore = (TextView) findViewById(R.id.tvOScore);
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
                endGame();
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
                endGame();
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
                endGame();
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
                endGame();
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
                endGame();
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
                endGame();
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
                endGame();
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
                endGame();
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
                endGame();
            }
        });

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end = false;
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                turn = 1;
                enableButtons();
            }
        });
    }

    public void endGame() {
        String a, b, c, d, e, f, g, h, i;

        a = btn1.getText().toString();
        b = btn2.getText().toString();
        c = btn3.getText().toString();
        d = btn4.getText().toString();
        e = btn5.getText().toString();
        f = btn6.getText().toString();
        g = btn7.getText().toString();
        h = btn8.getText().toString();
        i = btn9.getText().toString();

        if (a != "" && b != "" && c != "" && d != "" && e != "" && f != "" && g != "" && h != "" && i != "") {
            Toast.makeText(TicActivity.this, "Tie!", Toast.LENGTH_SHORT).show();
            end = true;
        }

        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(TicActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            end = true;
            xScore++;
            tvXScore.setText(xScore + "");
        }

        if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(TicActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            end = true;
            xScore++;
            tvXScore.setText(xScore + "");
        }

        if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(TicActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            end = true;
            xScore++;
            tvXScore.setText(xScore + "");
        }

        if (a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(TicActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            end = true;
            xScore++;
            tvXScore.setText(xScore + "");
        }

        if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(TicActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            end = true;
            xScore++;
            tvXScore.setText(xScore + "");
        }

        if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(TicActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            end = true;
            xScore++;
            tvXScore.setText(xScore + "");
        }

        if (a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(TicActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            end = true;
            xScore++;
            tvXScore.setText(xScore +  "");
        }

        if (c.equals("X") && e.equals("X") && g.equals("X")) {
            Toast.makeText(TicActivity.this, "Winner Player X!", Toast.LENGTH_SHORT).show();
            end = true;
            xScore++;
            tvXScore.setText(xScore + "");
        }

        if (a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(TicActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            end = true;
            oScore++;
            tvOScore.setText(oScore + "");
        }

        if (d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(TicActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            end = true;
            oScore++;
            tvOScore.setText(oScore + "");
        }

        if (g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(TicActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            end = true;
            oScore++;
            tvOScore.setText(oScore + "");
        }

        if (a.equals("O") && d.equals("O") && g.equals("O")) {
            Toast.makeText(TicActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            end = true;
            oScore++;
            tvOScore.setText(oScore + "");
        }

        if (b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(TicActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            end = true;
            oScore++;
            tvOScore.setText(oScore + "");
        }

        if (c.equals("O") && f.equals("O") && i.equals("O")) {
            Toast.makeText(TicActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            end = true;
            oScore++;
            tvOScore.setText(oScore + "");
        }

        if (a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(TicActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            end = true;
            oScore++;
            tvOScore.setText(oScore + "");
        }

        if (c.equals("O") && e.equals("O") && g.equals("O")) {
            Toast.makeText(TicActivity.this, "Winner Player O!", Toast.LENGTH_SHORT).show();
            end = true;
            oScore++;
            tvOScore.setText(oScore + "");
        }
        enableButtons();
    }

    private void enableButtons() {
        if (end) {
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        } else {
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
        }
    }
}
