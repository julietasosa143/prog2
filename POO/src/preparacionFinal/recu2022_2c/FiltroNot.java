package preparacionFinal.recu2022_2c;

public class FiltroNot extends Filtro{
    Filtro f;

    public FiltroNot(Filtro f){
        this.f=f;
    }
    @Override
    public boolean cumple(Noticia n){
        return !f.cumple(n);
    }
}
