package preparacionFinal.sportnow;

import java.util.ArrayList;

public class Atleta {
    String nombre;
    ArrayList<Entrenamiento> entrenamientos;
    ArrayList<Efecto> efectos;
    int steps;
    double horasDeRecuperacion, kcalGastadas, vo2max;

    public Atleta(String nombre, double vo2max, int steps, double horasDeRecuperacion, double kcalGastadas) {
        this.nombre = nombre;
        this.vo2max = vo2max;
        this.steps = steps;
        this.horasDeRecuperacion = horasDeRecuperacion;
        this.kcalGastadas = kcalGastadas;
        entrenamientos = new ArrayList<>();
        efectos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getVo2max() {
        return vo2max;
    }

    public int getSteps() {
        return steps;
    }

    public double getHorasDeRecuperacion() {
        return horasDeRecuperacion;
    }

    public double getKcalGastadas() {
        return kcalGastadas;
    }

    public ArrayList<Entrenamiento> getEntrenamientos() {
        return new ArrayList<Entrenamiento>(entrenamientos);
    }

    public ArrayList<Efecto> getEfectos() {
        return new ArrayList<Efecto>(efectos);
    }

    public void addEntreno(Entrenamiento e){
        entrenamientos.add(e);
    }
    public void addEfecto(Efecto e){
        efectos.add(e);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVo2max(double vo2max) {
        this.vo2max = vo2max;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void setHorasDeRecuperacion(double horasDeRecuperacion) {
        this.horasDeRecuperacion = horasDeRecuperacion;
    }

    public void setKcalGastadas(double kcalGastadas) {
        this.kcalGastadas = kcalGastadas;
    }

    public void ejecutarEntrenamiento(Entrenamiento e){
        for(Efecto ef: efectos){
            if(ef.afecta(e)){
                ef.adecuarStatus(this);
            }
        }

    }

}
