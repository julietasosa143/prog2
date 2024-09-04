package preparacionFinal.parcialCollectors;

import java.util.ArrayList;

public class ColeccionPromocional extends ColeccionTematica{
        double descuento; //se asume que se anota en formato 0,descuento ej 0.01= 0.10

    public ColeccionPromocional(double descuento,String nombre, double volumenExtra) {
        super(nombre,volumenExtra);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    @Override
    public double getCosto(){
        return super.getCosto()-(super.getCosto()*descuento);
    }
    @Override
    public ArrayList<Coleccionable> buscar(Filtro f){
        ArrayList<Coleccionable> salida= new ArrayList<>();
        salida.add(this);
        salida.addAll(super.buscar(f));
        return salida;
    }
}
