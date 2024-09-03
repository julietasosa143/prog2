package preparacionFinal.final4del3de2022;

import java.util.ArrayList;

public class Libreria {
    ArrayList<Libro> libros;
    ArrayList<ConceptoCliente> clientes;
    public Libreria(){
        this.libros = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    public ArrayList<Libro> recomendar(Cliente c) {
        ArrayList<Libro> salida = new ArrayList<>();
        for (Libro libro : libros) {
            if (c.aceptaRecomendacion(libro)) {
                salida.add(libro);
            }
        }
        return salida;
    }

}
