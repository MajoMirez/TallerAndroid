package com.example.majo.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import static android.content.ContentValues.TAG;

public class Tarea3 extends AppCompatActivity {

    EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea3);
        texto=(EditText)findViewById(R.id.txt_input);
    }

    //TODO: hacer un intent service (operacion con intent service)


    public void onClick(View view){
        if(view.getId()==R.id.botonVolver) {
            Intent intent = new Intent(Tarea3.this, MainActivity.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.test) {
            Intent intent = new Intent(Tarea3.this, MyIntentService.class);
            String dataURL=texto.getText().toString();
            //intent.setData(Uri.parse(dataURL));
            intent.putExtra("DATA", dataURL);
            startService(intent);
        }
    }
}
