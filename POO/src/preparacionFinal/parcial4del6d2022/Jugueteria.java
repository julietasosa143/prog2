package preparacionFinal.parcial4del6d2022;

import preparacionFinal.parcial4del6d2022.comparadores.*;
import preparacionFinal.parcial4del6d2022.condiciones.*;

import java.util.ArrayList;
import java.util.Collections;

public class Jugueteria {
    ArrayList<ElementoJuego> productos;
    String nombre;

    public Jugueteria(String nombre){
        this.nombre = nombre;
        productos = new ArrayList<>();
    }

    public ArrayList<ElementoJuego> getProductos() {
        return new ArrayList<>(productos);
    }

    public ArrayList<ElementoJuego> buscar(Condicion cond, Comparador comp){
        ArrayList<ElementoJuego> resultado = new ArrayList<ElementoJuego>();
        for(ElementoJuego elemento : productos){
            resultado.addAll(elemento.buscar(cond));
        }
        Collections.sort(resultado, comp);
        return resultado;
    }
}
