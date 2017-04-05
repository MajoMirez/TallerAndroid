package com.example.majo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){

        if(view.getId()==R.id.boton1){
            Intent intent = new Intent(MainActivity.this,Tarea1.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.boton2) {
            Intent intent = new Intent(MainActivity.this, Tarea2.class);
            //String res2=tv1.getText().toString();
            //intent.putExtra("RESULTADO_TAG", res2);
            startActivity(intent);
        }
        if (view.getId()==R.id.boton3){
            Intent intent=new Intent(MainActivity.this,Tarea3.class);
            startActivity(intent);
        }
    }
}

    /*
    @BindView(R.id.editTextNombreUsuario)
    EditText editTextNombreUsuario;
*/

