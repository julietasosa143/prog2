package preparacionFinal.sportnow;

import java.util.ArrayList;

public class EntrenamientoSimple extends Entrenamiento {
    public EntrenamientoSimple() {
        super();
    }

    public EntrenamientoSimple(String nombre, int intensidad, double costoKcal, double duracion, String act) {
        super(nombre, intensidad);
        this.costoKcal = costoKcal;
        this.duracion = duracion;
        this.actividad=act;
    }

    @Override
    public double getDuracion() {
        return duracion;
    }

    @Override
    public double getCostoKcal() {
        return costoKcal;
    }

    @Override
    public String getActividad() {
        return actividad;
    }
    @Override
    public ArrayList<Entrenamiento> buscar(Condicion c){
        ArrayList<Entrenamiento> salida= new ArrayList<>();
        if (c.cumple(this)){
            EntrenamientoSimple actual= new EntrenamientoSimple(nombre, intensidad, costoKcal, duracion, actividad);
            salida.add(actual);
        }
        return salida;
    }

    @Override
    public ArrayList<String> getListaActividades(){
        ArrayList<String> salida= new ArrayList<>();
        salida.add(actividad);
        return salida;
    }
}
