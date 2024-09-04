package preparacionFinal.parcialCollectors;

import java.util.ArrayList;

public class ColeccionTematica extends Coleccionable{
    ArrayList<Coleccionable> elementos;
    double volumenExtra;

    public ColeccionTematica(String nombre, double volumenExtra){
        super(nombre);
        elementos = new ArrayList<>();
        this.volumenExtra = volumenExtra;
    }
    public void agregarElemento(Coleccionable elemento){
        elementos.add(elemento);
    }
    public double getVolumenExtra() {
        return volumenExtra;
    }

    public void setVolumenExtra(double volumenExtra) {
        this.volumenExtra = volumenExtra;
    }

    @Override
    public ArrayList<String> getCaracteristicas() {
        ArrayList<String> caracteristicas = new ArrayList<>();
        for(Coleccionable c : elementos){
            ArrayList<String> temp= c.getCaracteristicas();
            for(String s : temp){
                if(!caracteristicas.contains(s)){
                    caracteristicas.add(s);
                }
            }
        }
        return caracteristicas;
    }

    @Override
    public double getPeso() {
        double peso = 0;
        for(Coleccionable elemento : elementos){
            peso += elemento.getPeso();
        }
        return peso;
    }

    @Override
    public double getVolumen() {
        double volumen = 0;
        for(Coleccionable elemento : elementos){
            volumen += elemento.getVolumen();
        }

        return volumen + (volumenExtra*getCantElementos());
    }

    @Override
    public double getCosto() {
        return getCantElementos()+(getPeso()*precioxGramo);
    }

    @Override
    public ArrayList<Coleccionable> buscar(Filtro f) {
        ArrayList<Coleccionable> salida = new ArrayList<>();
        for(Coleccionable elemento : elementos){
            salida.addAll(elemento.buscar(f));
        }
        return salida;
    }

    @Override
    public int getCantElementos() {
        int total = 0;
        for(Coleccionable elemento : elementos){
            total += elemento.getCantElementos();
        }
        return total;
    }

    public ArrayList<Coleccionable> getElementos() {
        return new ArrayList<>(elementos);
    }

}
