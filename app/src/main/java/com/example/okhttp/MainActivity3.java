package com.example.okhttp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.FIREBASE);
        setContentView(R.layout.activity_main3);
        TextView txtView2 = findViewById(R.id.txtView3);
        Button btnNext3 = findViewById(R.id.btnNext3);
        txtView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtView2.setText("FIREBASE DEMO");
            }
        });
        btnNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(in);
            }
        });
    }
}