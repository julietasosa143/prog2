package preparacionFinal.recu2022_2c;

import java.util.ArrayList;
import java.util.Collections;

public class Seccion extends ElementoNoticia{
    ArrayList<ElementoNoticia> elementos;

    public Seccion(String titulo, String categoria, ArrayList<ElementoNoticia> elementos) {
        super(titulo, categoria);
        this.elementos = new ArrayList<>(elementos);
    }
    public Seccion(String titulo, String categoria) {
        super(titulo, categoria);
        this.elementos = new ArrayList<>();
    }
    public Seccion(String titulo) {
        super(titulo);
        this.elementos = new ArrayList<>();
    }
    public ArrayList<ElementoNoticia> getElementos() {
        return new ArrayList<>(elementos);
    }
    public void agregarElemento(ElementoNoticia elemento){
        elementos.add(elemento);
        Collections.sort(elementos);
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> salida = new ArrayList<>();
        for(ElementoNoticia elemento : elementos){
            ArrayList<String> temp= elemento.getPalabrasClave();
            for(String s: temp){
                if(!salida.contains(s)){
                    salida.add(s);
                }
            }
        }
        return salida;
    }

    @Override
    public ElementoNoticia getCopia(Filtro f) {
        ArrayList<ElementoNoticia> hijosCumplen = new ArrayList<>();
        for(ElementoNoticia e : elementos){
            if(e.getCopia(f)!=null){
                hijosCumplen.add(e.getCopia(f));
            }
        }
        if(!hijosCumplen.isEmpty()){
            Seccion copia = new Seccion(titulo, categoria, hijosCumplen);
            return copia;
        }
        else{
            return null;
        }
    }
}
