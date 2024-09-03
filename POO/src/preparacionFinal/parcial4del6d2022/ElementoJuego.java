package preparacionFinal.parcial4del6d2022;

import preparacionFinal.parcial4del6d2022.condiciones.*;
import preparacionFinal.parcial4del6d2022.comparadores.*;

import java.util.ArrayList;

public abstract class ElementoJuego implements Comparable<ElementoJuego>{
    String marca;
    public ElementoJuego(String marca){
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public abstract ArrayList<ElementoJuego> buscar(Condicion c);
    public abstract double getPeso();
    public abstract double getCosto();
    public abstract String getColor();
    public abstract double getCantEncastres();


    @Override
    public int compareTo(ElementoJuego o) {
       return this.marca.compareTo(o.getMarca());
    }
}
