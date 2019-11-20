package com.example.recetario_crud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.viewHolderDatos> {

    ArrayList<String>Listadatos;


    public AdapterDatos(ArrayList<String> listadatos) {
        Listadatos = listadatos;
    }

    @NonNull
    @Override
    public viewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);
        return new viewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderDatos holder, int position) {
holder.asignarDatos(Listadatos.get(position));
    }

    @Override
    public int getItemCount() {
        return Listadatos.size();
    }

    public class viewHolderDatos extends RecyclerView.ViewHolder {

        TextView dato;

        public viewHolderDatos(@NonNull View itemView) {
            super(itemView);

            dato= itemView.findViewById(R.id.idDato);
        }

        public void asignarDatos(String datos) {
            dato.setText(datos);
        }
    }
}
