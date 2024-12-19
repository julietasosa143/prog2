package preparacionFinal.final6Del1224;

public class ModificadorTalle extends Modificador{
    int modificacion;

    public ModificadorTalle(int modificacion) {
        this.modificacion = modificacion;
    }

    @Override
    public TrajeEspacial modificar(TrajeEspacial e) {
        int talleModificado= e.getTalle()+ modificacion; //al sumar la modificacion, si esta es -3 el talle decrece en 3, si es 3 el talle incrementa en 3
        e.setTalle(talleModificado);
        return e;
    }
}
