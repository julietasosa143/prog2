package preparacionFinal.LoberiaAlquila;

public class FiltroId extends Filtro{
    int idBuscado;
    public FiltroId(int id){
        idBuscado = id;
    }
    @Override
    public boolean cumple(ElementoAlquiler e){
        return e.getId()==idBuscado;
    }
}
