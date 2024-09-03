package preparacionFinal.final23del32022;

public class CondicionTiempoMaxPrep extends Condicion {
    double tiempoMax;
    public CondicionTiempoMaxPrep(double tiempoMax) {
        this.tiempoMax = tiempoMax;
    }
    @Override
    public boolean cumple(Comida c){
        return c.getTiempoPrep()<=tiempoMax;
    }
}
