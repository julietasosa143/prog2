package preparacionFinal.LoberiaAlquila;

import java.util.ArrayList;

public abstract class ElementoAlquiler implements Comparable<ElementoAlquiler>{
    String descripcion;
    int id;
    public abstract double getValor();
    public abstract int getAntiguedad();
    public abstract ArrayList<ElementoAlquiler> buscar(Filtro f);

    public ElementoAlquiler(String descripcion, int id) {
        this.id=id;
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(ElementoAlquiler o) {
        if(this.getId()-o.getId()==0){
            return Integer.compare(this.getAntiguedad(),o.getAntiguedad());
        }else{
            return Integer.compare(this.getId(),o.getId());
        }
    }
}
