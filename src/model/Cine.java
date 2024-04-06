package model;

public class Cine {
    // Añade aquí los atributos necesarios
    Pelicula datosPelicula;
    double precio;
    int tamano;
    

    public Cine(Pelicula datosPelicula, double precio, int tamano) {
        this.datosPelicula = datosPelicula;
        this.precio = precio;
        this.tamano = tamano;
    }

    // getters y setters

    public Pelicula getDatosPelicula() {
        return this.datosPelicula;
    }

    public void setDatosPelicula(Pelicula datosPelicula) {
        this.datosPelicula = datosPelicula;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTamano() {
        return this.tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }


    @Override
    public String toString() {
        return "{" +
            " datosPelicula='" + getDatosPelicula() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", tamano='" + getTamano() + "'" +
            "}";
    }

}
