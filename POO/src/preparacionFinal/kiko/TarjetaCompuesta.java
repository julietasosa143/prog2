package preparacionFinal.kiko;

import java.util.ArrayList;

public class TarjetaCompuesta extends Tarjeta{
    ArrayList<Tarjeta> elementos;

    public TarjetaCompuesta(){
        elementos=new ArrayList<Tarjeta>();
    }
    public void agregarElemento(Tarjeta t){
        elementos.add(t);
    }

    @Override
    public double gettEjecucion(){
        double tTotal=0;

        for(Tarjeta t:elementos){
            tTotal+=t.gettEjecucion();
        }
        return tTotal;
    }

    @Override
    public int getCantElementos(){
        int total=0;
        for(Tarjeta t:elementos){
            total+=t.getCantElementos();
        }
        if(total>0){
            return total+1;
        }else{
            return total;
        }
    }

    @Override
    public ArrayList<String> getComandos(){
        ArrayList<String> comandos=new ArrayList<>();
        for(Tarjeta t:elementos){
            comandos.addAll(t.getComandos());
        }
        return comandos;
    }

    @Override
    public double getGastoBateria(){
        double gastoBateria=0;
        for(Tarjeta t:elementos){
            gastoBateria+=t.getGastoBateria();
        }
        Kiko kiko = Kiko.getInstance();
        return gastoBateria + kiko.getExtraBat();
    }

    @Override
    public Tarjeta getCopia(Filtro f) {
        ArrayList<Tarjeta> hijosCumplen = new ArrayList<>();
        for (Tarjeta t : elementos) {
            if (f.cumple(t)) {
                hijosCumplen.add(t.getCopia(f));
            }
        }
        TarjetaCompuesta copia = new TarjetaCompuesta();
        if (!hijosCumplen.isEmpty()) {
            for (Tarjeta t : hijosCumplen) {
                copia.agregarElemento(t);
            }
        }

        if (f.cumple(copia)) {
            return copia;
        } else {
            return new TarjetaCompuesta();
        }
    }
}
