package com.example.majo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Tarea2 extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    //private TextView tv1;
    //String res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea2);
        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
    }

    String Sumar(EditText et1, EditText et2){

        String v1=et1.getText().toString();
        String v2=et2.getText().toString();
        if(v1.matches("")||v2.matches("")){ //empty
            return "Suma invalida";
        }
        int n1=Integer.parseInt(v1);
        int n2=Integer.parseInt(v2);
        int suma = n1+n2;
        String res=String.valueOf(suma);
        return res;
    }


    public void onClick(View view){

        if(view.getId()==R.id.botonIgual){
            Intent intent = new Intent(Tarea2.this,Tarea2b.class);
            String res=Sumar(et1,et2);

            //String res2=tv1.getText().toString();
            intent.putExtra("RESULTADO_TAG", res);
            startActivity(intent);
        }

        if(view.getId()==R.id.botonVolver) {
            Intent intent = new Intent(Tarea2.this, MainActivity.class);
            startActivity(intent);
        }
    }

}
