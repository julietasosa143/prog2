package preparacionFinal.final9del8;

import java.util.ArrayList;

public class Cliente {
    String nombre;
    ArrayList<OpcionMenu> comidasHistoricas;
    int kcalMax;
    ArrayList<Filtro> restricciones;

    public Cliente(String nombre, ArrayList<OpcionMenu> comidasHistoricas, int kcalMax, ArrayList<Filtro> restricciones) {
        this.nombre = nombre;
        this.comidasHistoricas = new ArrayList<>(comidasHistoricas);
        this.kcalMax = kcalMax;
        this.restricciones = new ArrayList<>(restricciones);
    }
    public Cliente(String nombre, int kcalMax){
        this.nombre = nombre;
        this.kcalMax = kcalMax;
    }
    public void agregarRestriccion(Filtro r){
        restricciones.add(r);
    }
    public void agregarComida(OpcionMenu com){
        comidasHistoricas.add(com);
    }

    public String getNombre() {
        return nombre;
    }

    public int getKcalMax() {
        return kcalMax;
    }

    public ArrayList<OpcionMenu> getComidasHistoricas() {
        return new ArrayList<OpcionMenu>(comidasHistoricas);
    }

    public ArrayList<Filtro> getRestricciones() {
        return new ArrayList<Filtro>(restricciones);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setKcalMax(int kcalMax) {
        this.kcalMax = kcalMax;
    }
    public boolean leGusta(OpcionMenu com){
        boolean leGusta=true;
        for(Filtro r : restricciones){
            if(!r.cumple(com)){
                leGusta=false;
            }
        }
        if(comidasHistoricas.contains(com)){
            leGusta=false;
        }
        return leGusta;
    }
}
