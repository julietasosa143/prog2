package preparacionFinal.parcial4del6d2022;

import preparacionFinal.parcial4del6d2022.condiciones.Condicion;

import java.util.ArrayList;

public class Combo extends ElementoJuego{
    ArrayList<ElementoJuego> elementos;
    double descuentoxCombo;

    public Combo(String marca, double descuento) {//se asume que el descuento se manda en formato 0 a 100
        super(marca);
        this.descuentoxCombo = descuento;
        elementos = new ArrayList<>();
    }
    public void agregarElemento(ElementoJuego elemento) {
        elementos.add(elemento);
    }

    @Override
    public ArrayList<ElementoJuego> buscar(Condicion c) {
        ArrayList<ElementoJuego> salida = new ArrayList<>();
        for(ElementoJuego elemento : elementos){
            salida.addAll(elemento.buscar(c));
        }
        return salida;
    }

    @Override
    public double getPeso() {
        double pesoTotal=0;
        for(ElementoJuego elemento : elementos){
            pesoTotal += elemento.getPeso();
        }
        return pesoTotal;
    }

    @Override
    public double getCosto() {
        double costoTotal=0;
        for(ElementoJuego elemento : elementos){
            costoTotal += elemento.getCosto();
        }
        return costoTotal-(costoTotal*(descuentoxCombo/100));
    }

    @Override
    public String getColor() {
        return elementos.getLast().getColor();
    }

    @Override
    public double getCantEncastres() {
        double cantEncastresTotal=0;
        for(ElementoJuego elemento : elementos){
            cantEncastresTotal += elemento.getCantEncastres();
        }
        return cantEncastresTotal/elementos.size();
    }

    public ArrayList<ElementoJuego> getElementos() {
        return new ArrayList<ElementoJuego>(elementos);
    }

}
