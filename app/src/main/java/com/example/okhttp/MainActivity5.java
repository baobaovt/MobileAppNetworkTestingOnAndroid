package com.example.okhttp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.SharedPreferences);
        setContentView(R.layout.activity_main5);
        EditText editText = findViewById(R.id.txt5);
        TextView rTextView = findViewById(R.id.textview5);
        Button btnSend = findViewById(R.id.btnSend5);
        Button btnNext = findViewById(R.id.btnNext5);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPref = getSharedPreferences("key", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("YourText", editText.getText().toString()).apply();
                rTextView.setText("SAVED");

            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(in);
            }
        });
    }
}