package preparacionFinal.parcialCollectors;

import java.util.ArrayList;

public abstract class Coleccionable {
    String nombre;
    ArrayList<String> caracteristicas;
    static double costoUnidad, precioxGramo;

    public Coleccionable(String nombre) {
        this.nombre = nombre;
        caracteristicas = new ArrayList<>();
    }

    public static double getCostoUnidad() {
        return costoUnidad;
    }

    public static void setCostoUnidad(double costoUnidad) {
        Coleccionable.costoUnidad = costoUnidad;
    }

    public static double getPrecioxGramo() {
        return precioxGramo;
    }

    public static void setPrecioxGramo(double precioxGramo) {
        Coleccionable.precioxGramo = precioxGramo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract ArrayList<String> getCaracteristicas();
    public abstract double getPeso();
    public abstract double getVolumen();
    public abstract double getCosto();
    public abstract ArrayList<Coleccionable> buscar(Filtro f);
    public abstract int getCantElementos();


}
