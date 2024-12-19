package preparacionFinal.final6Del1224;

import java.util.ArrayList;

public abstract class InterfazTraje {
    String nombre;

    public InterfazTraje(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract ArrayList<String> getMetales();
    public abstract int getTalle();
    public abstract ArrayList<TrajeEspacial> seIndicanPara(MiembroDeEquipo m, Filtro f);
    public abstract InterfazTraje getCopia(Modificador m);
}
