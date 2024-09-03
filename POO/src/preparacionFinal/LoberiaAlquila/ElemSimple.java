package preparacionFinal.LoberiaAlquila;

import java.util.ArrayList;

public class ElemSimple extends ElementoAlquiler {
    double valor;
    int antiguedad;

    public ElemSimple(String descripcion, double valor,int id, int antiguedad) {
        super(descripcion, id);
        this.valor = valor;
        this.antiguedad = antiguedad;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public double getValor() {
        return valor;
    }
    @Override
    public int getAntiguedad() {
        return antiguedad;
    }

    @Override
    public ArrayList<ElementoAlquiler> buscar(Filtro f) {
        ArrayList<ElementoAlquiler> salida = new ArrayList<>();
        if(f.cumple(this)){
            salida.add(this);
        }
        return salida;
    }
}
