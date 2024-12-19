package preparacionFinal.final6Del1224;

public class FiltroAlturaMax extends Filtro{
    double alturaMax;

    public FiltroAlturaMax(double alturaMax) {
        this.alturaMax = alturaMax;
    }

    @Override
    public boolean cumple(MiembroDeEquipo m){
        return m.getAltura()<=alturaMax;
    }

}
