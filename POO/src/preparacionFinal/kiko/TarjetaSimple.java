package preparacionFinal.kiko;

import java.util.ArrayList;

public class TarjetaSimple extends Tarjeta{
    String comando;

    public TarjetaSimple(){}
    public TarjetaSimple(String comando, double gastoBateria, double tEjecucion){
        this.comando = comando;
        this.gastoBateria = gastoBateria;
        this.tEjecucion = tEjecucion;
    }

    public String getComando() {
        return comando;
    }
    public void setComando(String comando) {
        this.comando = comando;
    }
    public double getGastoBateria() {
        return gastoBateria;
    }
    public void setGastoBateria(double gastoBateria) {
        this.gastoBateria = gastoBateria;
    }
    public double gettEjecucion() {
        return tEjecucion;
    }
    public void settEjecucion(double tEjecucion) {
        this.tEjecucion = tEjecucion;
    }

    @Override
    public ArrayList<String> getComandos() {
        ArrayList<String> comandos = new ArrayList<>();
        comandos.add(comando);
        return comandos;
    }

    @Override
    public Tarjeta getCopia(Filtro f){
        TarjetaSimple copia = new TarjetaSimple();
        if(f.cumple(this)){
            copia.settEjecucion(tEjecucion);
            copia.setGastoBateria(gastoBateria);
            copia.setComando(comando);
        }
        return copia;
    }

    @Override
    public int getCantElementos(){
        return 1;
    }

}
