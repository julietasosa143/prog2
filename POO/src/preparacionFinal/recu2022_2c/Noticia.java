package preparacionFinal.recu2022_2c;

import java.util.ArrayList;

public class Noticia extends ElementoNoticia{
    String contenido, autor;
    ArrayList<String> palabrasClave;

    public Noticia(String titulo, String categoria, String contenido, String autor){
        super(titulo, categoria);
        this.contenido = contenido;
        this.autor = autor;
        this.palabrasClave = new ArrayList<>();
    }
    public Noticia(String titulo, String categoria, String contenido, String autor, ArrayList<String> palabrasClave){
        super(titulo, categoria);
        this.contenido = contenido;
        this.autor = autor;
        this.palabrasClave = new ArrayList<>(palabrasClave);
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave);
    }

    @Override
    public ElementoNoticia getCopia(Filtro f) {
        if(f.cumple(this)) {
            return new Noticia(titulo, categoria, contenido, autor, palabrasClave);
        }else{return null;}
    }

}
