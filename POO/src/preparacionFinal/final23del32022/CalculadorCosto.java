package preparacionFinal.final23del32022;

import java.util.ArrayList;

public class CalculadorCosto {
    Condicion condicion;
    double agregadoXcond;
    public CalculadorCosto(Condicion condicion, double agregadoXcond) {
        this.condicion = condicion;
        this.agregadoXcond = agregadoXcond;
    }
    public double calcularCosto(Pedido p){
        ArrayList<Comida> pedido = p.getPedido();
        double costo = 0;
        for(Comida comida : pedido){
            costo+=comida.getPrecio();
            if(condicion.cumple(comida)){
                costo+=agregadoXcond;
            }
        }
        return costo;

    }
}
