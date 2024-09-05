package preparacionFinal.recu2022_2c;

public class FiltroContieneString extends Filtro{
    String buscado;
    public FiltroContieneString(String buscado) {
        this.buscado = buscado;
    }
    @Override
    public boolean cumple(Noticia n){
        return n.getContenido().contains(buscado);
    }
}
