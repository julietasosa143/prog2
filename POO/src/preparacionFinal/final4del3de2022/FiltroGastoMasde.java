package preparacionFinal.final4del3de2022;

public class FiltroGastoMasde extends Filtro{
    double gastoMin;
    public FiltroGastoMasde(double gastoMin) {
        this.gastoMin = gastoMin;
    }
    @Override
    public boolean cumple(ConceptoCliente c){
        return gastoMin<c.getMontoTotalGastado();
    }

}
