package preparacionFinal.LoberiaAlquila;

public class FiltroAntiguedadMayorA extends Filtro{
    int antiguedadMin;
    public FiltroAntiguedadMayorA() {
        this.antiguedadMin = 1;
    }

    @Override
    public boolean cumple(ElementoAlquiler e){
        return antiguedadMin<=e.getAntiguedad();
    }
}
