package preparacionFinal.LoberiaAlquila;

public class FiltroNot extends Filtro{
    Filtro f;
    public FiltroNot(Filtro f){
        this.f=f
    }

    @Override
    public boolean cumple(ElementoAlquiler e){
        return !f.cumple(e);
    }
}
