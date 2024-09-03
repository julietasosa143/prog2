package preparacionFinal.sportnow;

public class CondicionCostoKcalMayor extends Condicion{
    double costoMin;

    public CondicionCostoKcalMayor(double costoMin) {
        this.costoMin = costoMin;
    }

    public boolean cumple(Entrenamiento e){
        return e.getCostoKcal()>=costoMin;
    }
}
