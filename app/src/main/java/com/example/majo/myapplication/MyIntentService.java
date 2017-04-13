package com.example.majo.myapplication;

import android.app.IntentService;
import android.content.Intent;
import android.os.ResultReceiver;
import android.util.Log;

import static android.content.ContentValues.TAG;


public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        String receiver=intent.getStringExtra("DATA");
        int n =Integer.parseInt(receiver)/2; //operacion simple
        Log.d(TAG, Integer.toString(n));
        /* TODO: Hasta aqui llego, no se como hacer que la activity capte el resultado del servicio
            quiero que el int n vaya a parar al textView de la interfaz
         */
    }
}
