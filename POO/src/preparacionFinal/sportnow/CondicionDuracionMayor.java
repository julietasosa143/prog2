package preparacionFinal.sportnow;

public class CondicionDuracionMayor extends Condicion {
    double duracionMin;

    public CondicionDuracionMayor(double duracion) {
        this.duracionMin = duracion;
    }
    public boolean cumple(Entrenamiento e){
        return e.getDuracion()>duracionMin;
    }
}
