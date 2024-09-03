package preparacionFinal.trenmaritimoSA;

public class FiltroPNot extends FiltroPasajero{
    FiltroPasajero f;

    public FiltroPNot(FiltroPasajero f) {
        this.f = f;
    }

    @Override
    public boolean cumple(Pasajero p){
        return !f.cumple(p);
    }
}
