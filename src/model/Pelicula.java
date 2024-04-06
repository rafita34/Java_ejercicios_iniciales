package model;

public class Pelicula {
    String titulo;
    int duracion;
    int edadminima;
    String director;

    public Pelicula(String titulo, int duracion, int edadminima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadminima = edadminima;
        this.director = director;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadminima() {
        return this.edadminima;
    }

    public void setEdadminima(int edadminima) {
        this.edadminima = edadminima;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", duracion='" + getDuracion() + "'" +
            ", edadminima='" + getEdadminima() + "'" +
            ", director='" + getDirector() + "'" +
            "}";
    }
}
