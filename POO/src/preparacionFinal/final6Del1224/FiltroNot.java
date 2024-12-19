package preparacionFinal.final6Del1224;

public class FiltroNot extends Filtro{
    Filtro f;

    public FiltroNot(Filtro f) {
        this.f = f;
    }

    @Override
    public boolean cumple(MiembroDeEquipo m){
        return !f.cumple(m);
    }
}
