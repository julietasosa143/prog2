package preparacionFinal.sportnow;

import java.util.ArrayList;

public abstract class Entrenamiento {
    String nombre, actividad;
    double duracion, costoKcal;
    int intensidad;

    public Entrenamiento(String nombre, int intensidad){
        this.nombre = nombre;
        this.intensidad=intensidad;
    }

    public Entrenamiento() {

    }

    public int getIntensidad() {
        return intensidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }


    public abstract double getDuracion();
    public abstract double getCostoKcal();
    public abstract String getActividad(); //este es para el enunciado
    public abstract ArrayList<Entrenamiento> buscar(Condicion c);
    public abstract ArrayList<String> getListaActividades(); //este es para ayudar en resolucion

}
