package com.example.majo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tarea1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea1);
    }
    public void onClick(View view){

        if(view.getId()==R.id.botonVolver){
            Intent intent = new Intent(Tarea1.this,MainActivity.class);
            startActivity(intent);
        }
    }

}
