package preparacionFinal.final4del3de2022;

public class FiltroAntiguedadMayor extends Filtro{
    int antiguedadMin;
    public FiltroAntiguedadMayor(int antiguedadMin) {
        this.antiguedadMin = antiguedadMin;
    }
    @Override
    public boolean cumple (ConceptoCliente c){
        return antiguedadMin<=c.getAntiguedad();
    }
}
