package com.example.okhttp;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import okio.AsyncTimeout;

public class MessageSender extends AsyncTask<String,Void,Void> {

    Socket s;
    DataOutputStream dos;
    PrintWriter pw;

    @Override
    protected Void doInBackground(String... voids) {

        String message = voids[0];
        try
        {
            s= new Socket("192.168.14.1", 9999);
            pw=new PrintWriter(s.getOutputStream());
            pw.write(message);
            pw.close();
            s.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
