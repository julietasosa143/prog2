package preparacionFinal.final4del3de2022;

public class FiltroComproMasdeLibros extends Filtro{
    int cantMin;
    public FiltroComproMasdeLibros(int cantMin) {
        this.cantMin = cantMin;
    }
    @Override
    public boolean cumple(ConceptoCliente c){
        return cantMin<c.getCantLibrosComprados();
    }
}
