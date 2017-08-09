package com.nerdranch.irpea.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity{

    private Button btnTic;
    private Button btnMlin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initWidgets();
        setListeners();
    }



    private void initWidgets() {
        btnTic = (Button) findViewById(R.id.btnTic);
        btnMlin = (Button) findViewById(R.id.btnMlin);
    }

    private void setListeners() {
        btnTic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TicActivity.class);
                startActivity(intent);
            }
        });

        btnMlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}
