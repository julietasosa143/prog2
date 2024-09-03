package preparacionFinal.LoberiaAlquila;

public class FiltroValorMayorA extends Filtro{
    double valorMin;
    public FiltroValorMayorA(double valorMin) {
        this.valorMin = valorMin;
    }
    @Override
    public boolean cumple(ElementoAlquiler e){
        return e.getValor()>valorMin;
    }
}
