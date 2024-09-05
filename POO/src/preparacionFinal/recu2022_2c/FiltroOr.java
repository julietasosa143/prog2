package preparacionFinal.recu2022_2c;

public class FiltroOr extends Filtro{
    Filtro f1, f2;
    public FiltroOr(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    @Override
    public boolean cumple(Noticia n){
        return f1.cumple(n)||f2.cumple(n);
    }
}
