package preparacionFinal.parcialCollectors;

import java.util.ArrayList;

public class ProductoColeccionable extends Coleccionable{
    double peso, volumen;

    public ProductoColeccionable(String nombre,double peso, double volumen) {
        super(nombre);
        this.peso = peso;
        this.volumen = volumen;
    }
    public ProductoColeccionable(String nombre,double peso, double volumen, ArrayList<String> caract) {
        super(nombre);
        this.peso = peso;
        this.volumen = volumen;
        this.caracteristicas = new ArrayList<String>(caract);
    }

    @Override
    public ArrayList<String> getCaracteristicas() {
        return new ArrayList<>(caracteristicas);
    }

    @Override
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public double getCosto() {
        return costoUnidad+(peso*precioxGramo);
    }

    @Override
    public ArrayList<Coleccionable> buscar(Filtro f) {
        ArrayList<Coleccionable> salida= new ArrayList<>();
        if(f.cumple(this)){
            salida.add(this);
        }
        return salida;
    }
    public void agregarCaracteristica(String s){
        if(!caracteristicas.contains(s)){
            caracteristicas.add(s);
        }
    }
    @Override
    public int getCantElementos() {
        return 1;
    }


}
