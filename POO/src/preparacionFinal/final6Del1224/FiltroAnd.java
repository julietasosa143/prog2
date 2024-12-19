package preparacionFinal.final6Del1224;

public class FiltroAnd extends Filtro{
    Filtro f1;
    Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(MiembroDeEquipo m){
        return f1.cumple(m) && f2.cumple(m);
    }
}
