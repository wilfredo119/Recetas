package com.example.recetario_crud;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class lista_view extends AppCompatActivity {

    ListView listaDias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);

        listaDias = (ListView)findViewById(R.id.listViewId);

        ArrayAdapter<CharSequence> adaptador=ArrayAdapter.createFromResource(this, R.array.arrayDias , android.R.layout.simple_list_item_1);

listaDias.setAdapter(adaptador);
    }
}
