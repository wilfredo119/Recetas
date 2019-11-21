package com.example.recetario_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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


        Bbuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DB db = new DB(getApplicationContext(),null,null,1);
                String buscar = Ebuscar.getText().toString();
                String[]datos;
                datos = db.buscar_reg(buscar);

                tv_nombre.setText(datos[0]);
                tv_ingredientes.setText(datos[1]);
                tv_categoria.setText(datos[2]);

                Toast.makeText(getApplicationContext(), datos[3], Toast.LENGTH_SHORT).show();

            }
        });
    }
    public void limpiarDatos(View view) {
        tv_nombre.setText(null);
        tv_ingredientes.setText(null);
        tv_categoria.setText(null);
        Ebuscar.setText(null);
    }
}
