package preparacionFinal.LoberiaAlquila;

public class FiltroAnd extends Filtro{
    Filtro f1, f2;
    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    @Override
    public boolean cumple(ElementoAlquiler e){
        return f1.cumple(e) && f2.cumple(e);
    }

}
