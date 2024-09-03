package preparacionFinal.final9del8;

import java.util.ArrayList;

public abstract class OpcionMenu {
    String nombre;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public OpcionMenu(String nombre){
        this.nombre = nombre;
    }

    public abstract double getTiempoPreparacion();
    public abstract double getPrecio();
    public abstract int getKcal();
    public abstract ArrayList<OpcionMenu> buscar(Filtro f);
    public abstract ArrayList<String> getIngredientes();

    @Override
    public boolean equals(Object obj) {
        OpcionMenu op = (OpcionMenu) obj;
         return this.nombre.equals(op.getNombre());
    }
}
