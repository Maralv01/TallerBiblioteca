package org.example;

import java.util.*;

public class SistemaBiblioteca {

    private Map<String, Material> catalogo = new HashMap<>();

    private Set<String> miembros = new HashSet<>();


    public void registrarMaterial(Material m) {
        catalogo.put(m.getCodigo(), m);
        System.out.println("SISTEMA: Registrado correctamente: " + m.titulo);
    }


    public void registrarMiembro(String nombre) {
        if (miembros.add(nombre)) {
            System.out.println("SISTEMA: Miembro " + nombre + " registrado.");
        } else {
            System.out.println("ERROR: El miembro " + nombre + " ya existe.");
        }
    }

    public void mostrarCatalogo() {
        System.out.println("\n--- CATÁLOGO ACTUAL ---");
        for (Material m : catalogo.values()) {
            m.mostrarInfo();
        }
    }
}
