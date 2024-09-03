package preparacionFinal.parcial4del6d2022;

import preparacionFinal.parcial4del6d2022.condiciones.Condicion;

import java.util.ArrayList;

public class Pieza extends ElementoJuego{
    double peso, costo, cantEncastres;
    String color;

    public Pieza(String marca, double peso, double costo, int cantEncastres, String color) {
        super(marca);
        this.peso = peso;
        this.costo = costo;
        this.cantEncastres = cantEncastres;
        this.color = color;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setCantEncastres(double cantEncastres) {
        this.cantEncastres = cantEncastres;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public ArrayList<ElementoJuego> buscar(Condicion c) {
        ArrayList<ElementoJuego> salida = new ArrayList<>();
        if(c.cumple(this)){
            salida.add(this);
        }
        return salida;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public double getCosto() {
        return costo;
    }

    @Override
    public double getCantEncastres() {
        return cantEncastres;
    }

    @Override
    public String getColor() {
        return color;
    }

}
