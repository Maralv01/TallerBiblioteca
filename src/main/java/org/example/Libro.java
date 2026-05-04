package org.example;


public class Libro extends Material {
    private String autor;

    public Libro(String codigo, String titulo, int anio, String autor) {
        super(codigo, titulo, anio); // Esto le envía los datos al padre (Material)
        this.autor = autor;
    }

    @Override
    public String getTipo() {
        return "Libro";
    }
}