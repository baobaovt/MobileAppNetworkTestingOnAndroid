package com.example.okhttp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.net.HttpURLConnection;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.SOCKETS);
        setContentView(R.layout.activity_main2);
        TextView tView = findViewById(R.id.tView);
        Button btnView = findViewById(R.id.btnView);
        Button btnNew = findViewById(R.id.btnNew);

        EditText edt = findViewById(R.id.link);


        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            MessageSender msd = new MessageSender();
            msd.execute(edt.getText().toString());
            tView.setText("SENT");
            }
        });
        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(in);
            }
        });

    }

}