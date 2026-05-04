package org.example;

public class Revista extends Material {
    private int edicion;

    public Revista(String codigo, String titulo, int anio, int edicion) {
        super(codigo, titulo, anio);
        this.edicion = edicion;
    }

    @Override
    public String getTipo() {
        return "Revista";
    }
}