package preparacionFinal.sportnow;

public class CondicionIntensidadMayor extends Condicion{
    int intensidadMin;

    public CondicionIntensidadMayor(int intensidadMin) {
        this.intensidadMin = intensidadMin;
    }

    public boolean cumple(Entrenamiento e){
        return e.getIntensidad()>=intensidadMin;
    }
}
