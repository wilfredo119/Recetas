package com.example.recetario_crud;

import java.io.Serializable;

public class usuario implements Serializable {

    private String nombre;
    private String ingredientes;
    private String categoria;

    public usuario(String nombre, String ingredientes, String categoria) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
