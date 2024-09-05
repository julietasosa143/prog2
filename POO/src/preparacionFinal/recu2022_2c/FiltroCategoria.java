package preparacionFinal.recu2022_2c;

public class FiltroCategoria extends Filtro{
    String categoriaBuscada;
    public FiltroCategoria(String c) {
        categoriaBuscada = c;
    }
    @Override
    public boolean cumple(Noticia n){
        return categoriaBuscada.equals(n.getCategoria());
    }
}
