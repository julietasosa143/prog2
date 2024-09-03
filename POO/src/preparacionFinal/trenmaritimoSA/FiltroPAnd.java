package preparacionFinal.trenmaritimoSA;

public class FiltroPAnd extends FiltroPasajero{
    FiltroPasajero f1;
    FiltroPasajero f2;

    public FiltroPAnd(FiltroPasajero f1, FiltroPasajero f2) {
        this.f1 = f1;
        this.f2 = f2;
    }


    @Override
    public boolean cumple(Pasajero p) {
        return f1.cumple(p)&&f2.cumple(p);
    }
}
