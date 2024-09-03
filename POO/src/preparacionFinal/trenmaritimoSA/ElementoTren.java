package preparacionFinal.trenmaritimoSA;

import java.util.ArrayList;

public abstract class ElementoTren {
    public abstract ArrayList<Asiento> getAsientos();
    public abstract ArrayList<Asiento> getAsientosDisponibles();
    public abstract ArrayList<Asiento> getAsientosOcupables(Pasajero p);
    public abstract int getAsientosTotales();
    public abstract ElementoTren getCopia(FiltroPasajero f);

}
