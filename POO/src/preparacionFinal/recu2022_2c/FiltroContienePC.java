package preparacionFinal.recu2022_2c;

public class FiltroContienePC extends Filtro{
    String palabraClave;
    public FiltroContienePC(String palabraClave){
        this.palabraClave = palabraClave;
    }
    @Override
    public boolean cumple(Noticia n){
        return n.getPalabrasClave().contains(palabraClave);
    }
}
