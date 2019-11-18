package com.example.recetario_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {


    EditText Enombre,Eingredientes,Ecategoria;
    Button guardar,recetario,lv_lista,lista_1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Enombre= (EditText)findViewById(R.id.et_nombre);
        Eingredientes= (EditText)findViewById(R.id.et_ingredientes);
        Ecategoria= (EditText)findViewById(R.id.et_categoria);

        guardar=(Button)findViewById(R.id.guardar);
        recetario=(Button)findViewById(R.id.recetario);
        lv_lista= (Button)findViewById(R.id.lv_lista);
        lista_1 = (Button)findViewById(R.id.Lista_1);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DB db = new DB(getApplicationContext(),null,null,1);
                String nombre = Enombre.getText().toString();
                String ingredientes = Eingredientes.getText().toString();
                String categoria = Ecategoria.getText().toString();

                String mensaje = db.guardar(nombre, ingredientes, categoria);
                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
