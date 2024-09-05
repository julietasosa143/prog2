package preparacionFinal.recu2022_2c;

public class FiltroAutor extends Filtro{
    String autorBuscado;
    public FiltroAutor(String a){
        autorBuscado = a;
    }
    @Override
    public boolean cumple(Noticia n){
        return n.getAutor().equals(autorBuscado);
    }
}
