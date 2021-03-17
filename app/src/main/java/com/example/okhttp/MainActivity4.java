package com.example.okhttp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.HTTP);
        setContentView(R.layout.activity_main4);
        StrictMode.setThreadPolicy(new Builder().permitAll().build());
        TextView txtView4 = findViewById(R.id.txtView4);
        EditText txtUrl4 = findViewById(R.id.txtURL4);
        Button btnSend4 = findViewById(R.id.btnSend4);
        Button btnNext4 = findViewById(R.id.btnNext4);

        btnSend4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = txtUrl4.getText().toString();
                StringBuilder url_holder = new StringBuilder();
                url_holder.append(url);
                try {
                    URLConnection conn = new URL(url_holder.toString()).openConnection();
                    conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    conn.setRequestProperty("charset","urf-8");
                    conn.setUseCaches(false);
                    BufferedReader buff= new BufferedReader(new InputStreamReader((conn.getInputStream())));
                    String resp;
                    String data_from_stream;
                    for (resp = new String();true;resp+= data_from_stream)
                    {
                        String stream = buff.readLine();
                        data_from_stream = stream;
                        if(stream ==null)
                        {
                            break;
                        }
                        Log.i("bao.nguyen2",resp);
                        txtView4.setText(resp);
                    }

                }catch(IOException ex){
                    ex.printStackTrace();

                }
            }
        });
        btnNext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(in);
            }
        });

    }
}