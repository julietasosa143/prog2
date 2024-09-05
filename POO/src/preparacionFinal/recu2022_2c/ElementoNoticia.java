package preparacionFinal.recu2022_2c;

import java.util.ArrayList;

public abstract class ElementoNoticia implements Comparable<ElementoNoticia> {
    String titulo, categoria;
    
    public ElementoNoticia(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }
    public ElementoNoticia(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }
    
    @Override 
    public int compareTo(ElementoNoticia o) {
        return this.categoria.compareTo(o.categoria);
    }
    
    public abstract ArrayList<String> getPalabrasClave();
    public abstract ElementoNoticia getCopia(Filtro f);

    
}
