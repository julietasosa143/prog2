package preparacionFinal.LoberiaAlquila;

public class FiltroDescripcionContiene extends Filtro{
    String palabraBuscada;
    public FiltroDescripcionContiene(String palabraBuscada){
        this.palabraBuscada = palabraBuscada;
    }
    @Override
    public boolean cumple(ElementoAlquiler e){
        return e.getDescripcion().contains(palabraBuscada);
    }
}
