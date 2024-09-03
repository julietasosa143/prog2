package preparacionFinal.kiko;

import java.util.ArrayList;

public abstract class Tarjeta {
    double gastoBateria;
    double tEjecucion;

    public abstract double getGastoBateria();
    public abstract double gettEjecucion();
    public abstract Tarjeta getCopia(Filtro f);
    public abstract ArrayList<String> getComandos();
    public abstract int getCantElementos();
}
