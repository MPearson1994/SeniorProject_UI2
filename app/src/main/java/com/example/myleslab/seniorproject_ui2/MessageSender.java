package com.example.myleslab.seniorproject_ui2;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class MessageSender extends AsyncTask<String,Void,Void> {
    Socket s;
    DataOutputStream dataOutputStream;
    PrintWriter printWriter;
    Context c;
    Handler h = new Handler();

    MessageSender(Context context){
        this.c = context;
    }

    @Override
    protected Void doInBackground(String... voids) {
        String message = voids[0];
        try {
            s = new Socket("172.31.98.74", 8010);
            printWriter = new PrintWriter(s.getOutputStream());

            printWriter.write(message);
            printWriter.flush();
            h.post(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(c,"Message sent", Toast.LENGTH_LONG).show();
                }
            });
            s.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }
}
