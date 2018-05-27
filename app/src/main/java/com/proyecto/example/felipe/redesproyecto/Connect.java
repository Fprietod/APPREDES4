package com.proyecto.example.felipe.redesproyecto;

import android.os.AsyncTask;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Connect extends AsyncTask <Void, Void,Void> {

  Socket s;
  DataOutputStream docs;
  PrintWriter ws;

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            s = new Socket("10.100.79.148",9000);
            ws = new PrintWriter(s.getOutputStream());

        }catch (IOException e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
