package preparacionFinal.final6Del1224;

public class ModificadorAnd extends Modificador{
    Modificador m1;
    Modificador m2;

    public ModificadorAnd(Modificador m1, Modificador m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    @Override
    public TrajeEspacial modificar(TrajeEspacial t) {
        TrajeEspacial modificado= m1.modificar(t);
        TrajeEspacial modificado2= m2.modificar(modificado);
        return modificado2;
    }
}
