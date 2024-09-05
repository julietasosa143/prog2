package preparacionFinal.recu2022_2c;

public class NoticiaPrivada extends Noticia{

    public NoticiaPrivada(String titulo, String categoria, String contenido,String autor) {
        super(titulo, categoria, contenido, autor);
    }

    @Override
    public ElementoNoticia getCopia(Filtro f){
        return null;
    }

}
