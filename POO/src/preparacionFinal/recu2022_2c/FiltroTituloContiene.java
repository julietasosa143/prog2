package preparacionFinal.recu2022_2c;

public class FiltroTituloContiene extends Filtro{
    String tituloBuscado;
    public FiltroTituloContiene(String tituloBuscado) {
        this.tituloBuscado = tituloBuscado;
    }
    @Override
    public boolean cumple(Noticia n){
        return n.getTitulo().contains(tituloBuscado);
    }
}
