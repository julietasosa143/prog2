package preparacionFinal.final4del3de2022;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.time.LocalDate;

public class Cliente extends ConceptoCliente{
    ArrayList<String> autores;
    ArrayList<String> generos;

    String nombre;
    public Cliente(String nombre) {
        super();
        this.nombre = nombre;
        autores = new ArrayList<>();
        generos = new ArrayList<>();
    }
    public void addAutor(String autor) {
        autores.add(autor);
    }
    public void addGenero(String genero) {
        generos.add(genero);
    }
    public ArrayList<String> getAutores() {
        return new ArrayList<>(autores);
    }
    public ArrayList<String> getGeneros() {
        return new ArrayList<>(generos);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public ArrayList<ConceptoCliente> buscar(Filtro f) {
        ArrayList<ConceptoCliente> salida= new ArrayList<>();
        if(!f.cumple(this)){
            salida.add(this);
        }
        return salida;
    }

    public boolean aceptaRecomendacion(Libro l){
        boolean acepta = false;
        for(String genero: generos){
            if(l.getGeneros().contains(genero)){
                acepta = true;
            }
        }
        return acepta;
    }
    public double getMontoTotalGastado(){
        double total = 0;
        for(Compra compra: compras){
            total+=compra.getMonto();
        }
        return total;
    }
    public int getAntiguedad(){
        Compra masAntigua = compras.getFirst();
        int year = masAntigua.getFecha().getYear();
        return LocalDate.now().getYear()-year;
    }
    public int getCantLibrosComprados(){
        return compras.size();
    }


}
