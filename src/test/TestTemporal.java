package test;

import model.Cine;
import model.Espectador;
import model.Pelicula;

public class TestTemporal {
    public static void main(String[] args) {
        // Prueba de espectador
        Espectador e1 = new Espectador("Rafa", 22, 88);
        System.out.println(e1);

        // Prueba de pelicula
        Pelicula p1 = new Pelicula("Openheimmer", 240, 18, "CrisNolan");
        System.out.println(p1);

        // Prueba de cine
        Cine c1 = new Cine(p1, 5.89, 12);
        System.out.println(c1);

    }
}
