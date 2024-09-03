package preparacionFinal.sportnow;

public class IncrementoKcal extends Efecto{
    int incremento;

    public IncrementoKcal(Condicion c, int incremento) {
        this.c = c;
        this.incremento = incremento;
    }

    public boolean afecta(Entrenamiento e){
        return c.cumple(e);
    }
    public void adecuarStatus(Atleta a){
        a.setKcalGastadas(a.getKcalGastadas()+incremento);
    }
}
