package preparacionFinal.LoberiaAlquila;

import java.util.ArrayList;

public class Paquete extends ElementoAlquiler{
    ArrayList<ElementoAlquiler>  elementos;

    public Paquete(String descripcion, int id){
        super(descripcion, id);
        elementos = new ArrayList<>();
    }

    public ArrayList<ElementoAlquiler> getElementos() {
        return new ArrayList<ElementoAlquiler>(elementos);
    }

    @Override
    public double getValor() {
        double valor=0;
        for(ElementoAlquiler elemento : elementos){
            valor+=elemento.getValor();
        }
        return valor;
    }

    @Override
    public int getAntiguedad() {
        int antiguedadMayor=0;
        for(ElementoAlquiler elemento : elementos){
            if(elemento.getAntiguedad()>antiguedadMayor){
                antiguedadMayor=elemento.getAntiguedad();
            }
        }
        return antiguedadMayor;
    }

    @Override
    public ArrayList<ElementoAlquiler> buscar(Filtro f) {
        ArrayList<ElementoAlquiler> salida = new ArrayList<>();
        for(ElementoAlquiler elemento : elementos) {
            salida.addAll(elemento.buscar(f));
        }
        return salida;
    }


}
