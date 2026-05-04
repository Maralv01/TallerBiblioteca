package org.example;

public class Main {
    public static void main(String[] args) {
        SistemaBiblioteca miBiblioteca = new SistemaBiblioteca();


        Libro libro1 = new Libro("L01", "Harry Potter", 1997, "J.K. Rowling");
        Revista revista1 = new Revista("R01", "Muy Interesante", 2023, 150);

        miBiblioteca.registrarMaterial(libro1);
        miBiblioteca.registrarMaterial(revista1);


        miBiblioteca.registrarMiembro("Juan");
        miBiblioteca.registrarMiembro("Juan"); // Intenta repetirlo para ver qué pasa


        miBiblioteca.mostrarCatalogo();
    }
}
