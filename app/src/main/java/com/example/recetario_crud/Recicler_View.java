package com.example.recetario_crud;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recicler_View extends AppCompatActivity {

    ArrayList<String> ListDatos;
    RecyclerView recycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recicler__view);

      recycler=(RecyclerView)findViewById(R.id.RecyclerId);
      recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

      ListDatos= new ArrayList<String>();

      for (int i=0;i<=15;i++){
          ListDatos.add("datos de recetas # "+i+" ");
        }
        AdapterDatos adapter = new AdapterDatos(ListDatos);
      recycler.setAdapter(adapter);
    }

}
