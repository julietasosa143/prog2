package preparacionFinal.sportnow;

import java.util.ArrayList;

public class EntrenamientoCompuesto extends Entrenamiento {
    double factorCostoKcal;
    ArrayList<Entrenamiento> entrenamientos;

    public EntrenamientoCompuesto(String nombre, int intensidad, double factorCostoKcal){
        super(nombre, intensidad);
        this.factorCostoKcal=factorCostoKcal;
        entrenamientos=new ArrayList<>();
    }

    public void setFactorGastoKcal(double factorGastoKcal) {
        this.factorCostoKcal = factorGastoKcal;
    }

    public double getFactorGastoKcal() {
        return factorCostoKcal;
    }
    public void agregarElemento(Entrenamiento e){
        entrenamientos.add(e);
    }
    @Override
    public double getDuracion() {
        double salida= 0;
        for(Entrenamiento e : entrenamientos){
            salida+=e.getDuracion();
        }
        return salida;
    }

    @Override
    public double getCostoKcal() {
        double costo=0;
        for(Entrenamiento e : entrenamientos){
            costo+=e.getCostoKcal();
        }
        return costo*factorCostoKcal;
    }

    @Override
    public String getActividad() {
        String salida="";
        for(String act : this.getListaActividades()){
            salida+=("-"+act);
        }
        this.actividad=salida;
        return salida;
    }

    @Override
    public ArrayList<Entrenamiento> buscar(Condicion c) {
        ArrayList<Entrenamiento> salida= new ArrayList<>();
        ArrayList<Entrenamiento> hijosCumplen=new ArrayList<>();
        for(Entrenamiento e : entrenamientos){
            if (c.cumple(e)) {
                hijosCumplen.add(e);
            }
        }
        if(c.cumple(this)){
            EntrenamientoCompuesto actual = new EntrenamientoCompuesto(nombre, intensidad, factorCostoKcal);
            for(Entrenamiento h : hijosCumplen){
                actual.agregarElemento(h);
            }
            salida.add(actual);
        }else{
            for(Entrenamiento h : hijosCumplen){
                salida.addAll(h.buscar(c));
            }
        }
        return salida;
    }

    @Override
    public ArrayList<String> getListaActividades() {
        ArrayList<String> salida= new ArrayList<>();
        for(Entrenamiento e : entrenamientos){
            salida.addAll(e.getListaActividades());
        }
        return salida;
    }
}
