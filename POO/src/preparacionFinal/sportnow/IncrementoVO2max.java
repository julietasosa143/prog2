package preparacionFinal.sportnow;

public class IncrementoVO2max extends Efecto{
    double incrementoEnPorc;
    public IncrementoVO2max(Condicion c, double incremento) {
        this.c=c;
        this.incrementoEnPorc=incremento;
    }

    @Override
    public boolean afecta(Entrenamiento e) {
        return c.cumple(e);
    }

    @Override
    public void adecuarStatus(Atleta a) {
        a.setVo2max(a.getVo2max()*(incrementoEnPorc/100.0));
    }
}
