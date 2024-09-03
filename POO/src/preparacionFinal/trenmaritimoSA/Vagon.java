package preparacionFinal.trenmaritimoSA;

import java.util.ArrayList;

public class Vagon extends ElementoTren{
    ArrayList<ElementoTren> elementos;
    String clase;
    String subclase;

    private Vagon(){}
    public Vagon(String clase, String subclase){
        this.clase = clase;
        this.subclase = subclase;
        elementos= new ArrayList<>();
    }

    public ArrayList<ElementoTren> getElementos() {
        return new ArrayList<ElementoTren>(elementos);
    }

    public String getClase() {
        return clase;
    }

    public String getSubclase() {
        return subclase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setSubclase(String subclase) {
        this.subclase = subclase;
    }

    public void agregarElemento(ElementoTren elemento){
        elementos.add(elemento);
    }

    @Override
    public ArrayList<Asiento> getAsientos() {
        ArrayList<Asiento> salida= new ArrayList<>();
        for(ElementoTren elemento: elementos){
            salida.addAll(elemento.getAsientos());
        }
        return salida;
    }

    @Override
    public ArrayList<Asiento> getAsientosDisponibles() {
        ArrayList<Asiento> salida= new ArrayList<>();
        for(ElementoTren elemento: elementos){
            salida.addAll(elemento.getAsientosDisponibles());
        }
        return salida;
    }

    @Override
    public ArrayList<Asiento> getAsientosOcupables(Pasajero p) {
        ArrayList<Asiento> salida= new ArrayList<>();
        for(ElementoTren elemento: elementos){
            salida.addAll(elemento.getAsientosOcupables(p));
        }
        return salida;
    }

    @Override
    public int getAsientosTotales() {
        int total=0;
        for(ElementoTren elemento: elementos){
            total+=elemento.getAsientosTotales();
        }
        return total;
    }

    @Override
    public ElementoTren getCopia(FiltroPasajero f) {
        Vagon copia = new Vagon();
        ArrayList<ElementoTren> hijosCumplen= new ArrayList<>();
        for(ElementoTren elemento: elementos){
            if(elemento.getCopia(f)!=null){
                hijosCumplen.add(elemento.getCopia(f));
            }
        }
        if(!hijosCumplen.isEmpty()){
            for(ElementoTren elemento: hijosCumplen){
                copia.agregarElemento(elemento);
            }
            return copia;
        }else{
            return null;
        }
    }
}
