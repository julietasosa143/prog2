package preparacionFinal.elLibroDeJava;

import preparacionFinal.elLibroDeJava.calculadorCosto.CriterioCosto;
import preparacionFinal.elLibroDeJava.filtros.Filtro;

import java.util.ArrayList;

public abstract class ElementoEditorial {
    String nombre;
    Experto aCargo;
    public ElementoEditorial(String nombre, Experto aCargo) {
        this.nombre = nombre;
        this.setExpertoaCargo(aCargo);
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Experto getExpertoaCargo(){
        return aCargo;
    }
    public void setExpertoaCargo(Experto aCargo){
        if(!this.getAutores().contains(aCargo)){
            this.aCargo = aCargo;
        }
    }
    public abstract double getCosto(CriterioCosto c);


    public abstract ArrayList<String> getTemas();
    public abstract ArrayList<Experto> getAutores();
    public abstract ArrayList<Experto> getExpertosaCargo();
    public abstract int getCantPaginas();
    public abstract ElementoEditorial getCopia(Filtro f);


}
