package com.example.majo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tarea2b extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea2b);
        texto=(TextView)findViewById(R.id.textView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        //getIntent().getExtras().get("RESULTADO_TAG");
        //getIntent().getStringExtra("RESULTADO_TAG");
        texto.setText(getIntent().getStringExtra("RESULTADO_TAG"));

    }

    public void onClick(View view){

        if(view.getId()==R.id.botonVolver) {
            Intent intent = new Intent(Tarea2b.this, Tarea2.class);
            startActivity(intent);
        }
    }
}
