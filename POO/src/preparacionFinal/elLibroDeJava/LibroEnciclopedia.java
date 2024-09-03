package preparacionFinal.elLibroDeJava;

import preparacionFinal.elLibroDeJava.calculadorCosto.CriterioCosto;
import preparacionFinal.elLibroDeJava.filtros.Filtro;

import java.util.ArrayList;

public class LibroEnciclopedia extends ElementoEditorial{
    //se delega al usuario del programa la responsabilida de usarlo como corresponde
    int anioPublicacion;
    ArrayList<ElementoEditorial> elementos;

    public LibroEnciclopedia(String nombre, Experto aCargo, int anioPublicacion){
        super(nombre, aCargo);
        this.anioPublicacion = anioPublicacion;
        this.elementos= new ArrayList<>();
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public ArrayList<ElementoEditorial> getElementos() {
        return new ArrayList<ElementoEditorial>(elementos);
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    public void agregarElemento(ElementoEditorial elemento){
        if(!elemento.getAutores().contains(aCargo)){
            elementos.add(elemento);
        }
    }

    @Override
    public double getCosto(CriterioCosto c) {
        double costoTotal=0;
        for(ElementoEditorial elemento : elementos){
            costoTotal += elemento.getCosto(c);
        }
        return costoTotal;
    }

    @Override
    public ArrayList<String> getTemas() {
        ArrayList<String> salida = new ArrayList<>();
        for(ElementoEditorial elemento : elementos){
            ArrayList<String> aux= new ArrayList<>(elemento.getTemas());
            for(String t: aux){
                if(!salida.contains(t)){
                    salida.add(t);
                }
            }
        }
        return salida;
    }

    @Override
    public ArrayList<Experto> getAutores() {
        ArrayList<Experto> salida = new ArrayList<>();
        for(ElementoEditorial elemento : elementos){
            ArrayList<Experto> aux= new ArrayList<>(elemento.getAutores());
            for(Experto e: aux){
                if(!salida.contains(e)){
                    salida.add(e);
                }
            }
        }
        return salida;
    }

    @Override
    public ArrayList<Experto> getExpertosaCargo() {
        ArrayList<Experto> salida = new ArrayList<>();
        for(ElementoEditorial elemento : elementos){
            ArrayList<Experto> aux= new ArrayList<>(elemento.getExpertosaCargo());
            for(Experto e: aux){
                if(!salida.contains(e)){
                    salida.add(e);
                }
            }
        }
        return salida;
    }

    @Override
    public int getCantPaginas() {
        int cantTotal=0;
        for(ElementoEditorial elemento : elementos){
            cantTotal += elemento.getCantPaginas();
        }
        return cantTotal;
    }

    @Override
    public ElementoEditorial getCopia(Filtro f) {
        ArrayList<ElementoEditorial> hijosCumplen=new ArrayList<>();
        for(ElementoEditorial elemento : elementos){
            if (f.cumple(elemento)){
                hijosCumplen.add(elemento.getCopia(f));
            }
        }
        if(!hijosCumplen.isEmpty()){
            LibroEnciclopedia copia = new LibroEnciclopedia(nombre, aCargo, anioPublicacion);
            for(ElementoEditorial elemento : hijosCumplen){
                copia.agregarElemento(elemento);
            }
            return copia;
        }else{
            return null;
        }

    }

}
