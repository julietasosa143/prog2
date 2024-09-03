package preparacionFinal.kiko;

import java.util.ArrayList;

public class TarjetaIterativa extends TarjetaCompuesta{
    int nroIteraciones;
    double porcentajeTExtra;

    public TarjetaIterativa(int nroIteraciones, double porcentajeTExtra){
        super();
        this.nroIteraciones = nroIteraciones;
        this.porcentajeTExtra = porcentajeTExtra;//se asume que el porcentaje viene como nro entero ej:20
    }

    public double getPorcentajeTExtra() {
        return porcentajeTExtra;
    }

    public int getNroIteraciones() {
        return nroIteraciones;
    }

    public void setNroIteraciones(int nroIteraciones) {
        this.nroIteraciones = nroIteraciones;
    }

    public void setPorcentajeTExtra(double porcentajeTExtra) {
        this.porcentajeTExtra = porcentajeTExtra;
    }

    @Override
    public double getGastoBateria(){
        double gasto=0;
        for(int i=0; i<nroIteraciones; i++){
            for(Tarjeta t: elementos){
                gasto+=t.getGastoBateria();
            }
        }
        Kiko kiko = Kiko.getInstance();
        return gasto+kiko.getExtraBat();
    }
    @Override
    public double gettEjecucion(){
        double tEjecucion=0;
        for(int i=0; i<nroIteraciones; i++){
            for(Tarjeta t: elementos){
                tEjecucion+=t.gettEjecucion();
            }
        }
        Kiko kiko= Kiko.getInstance();
        return tEjecucion+(kiko.getNivelBateria()*(porcentajeTExtra/100));
    }
    @Override
    public ArrayList<String> getComandos(){
        ArrayList<String> salida = new ArrayList<>();
        for(int i=0; i<nroIteraciones; i++){
            for(Tarjeta t: elementos){
                salida.addAll(t.getComandos());
            }
        }
        return salida;
    }

    @Override
    public Tarjeta getCopia(Filtro f){
        ArrayList<Tarjeta> hijosCumplen = new ArrayList<>();
        for(Tarjeta t :elementos){
            if(f.cumple(t)){
                hijosCumplen.add(t);
            }
        }
        TarjetaIterativa copia= new TarjetaIterativa(nroIteraciones, porcentajeTExtra);
        if(!hijosCumplen.isEmpty()){
            for(Tarjeta t : hijosCumplen){
                copia.agregarElemento(t);
            }
            return copia;
        }else{
            return new TarjetaCompuesta();
        }

    }
}
