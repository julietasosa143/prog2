package preparacionFinal.final9del8;

public class FiltroTprepMax extends Filtro{
    double tMax;

    public void settMax(double tMax) {
        this.tMax = tMax;
    }

    public double gettMax() {
        return tMax;
    }

    public FiltroTprepMax(double tMax) {
        this.tMax = tMax;
    }
    @Override
    public boolean cumple(OpcionMenu op){
        return op.getTiempoPreparacion()<tMax;
    }
    @Override
    public boolean equals(Object o1){
        FiltroTprepMax f = (FiltroTprepMax)o1;
        return f.gettMax()==tMax;
    }
}
