package com.example.recetario_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    EditText Ebuscar;
    TextView tv_nombre, tv_ingredientes, tv_categoria;
    Button Bbuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_nombre=(TextView)findViewById(R.id.tv_nombre);
        tv_ingredientes=(TextView)findViewById(R.id.tv_ingredientes);
        tv_categoria=(TextView)findViewById(R.id.tv_categoria);
        Ebuscar= (EditText)findViewById(R.id.Ebuscar);
        Bbuscar = (Button)findViewById(R.id.Bbuscar);
    }
}
