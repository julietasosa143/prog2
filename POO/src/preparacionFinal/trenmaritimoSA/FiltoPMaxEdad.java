package preparacionFinal.trenmaritimoSA;

public class FiltoPMaxEdad extends FiltroPasajero {
    int edadMax;

    public FiltoPMaxEdad(int edadMax) {
        this.edadMax = edadMax;
    }
    @Override
    public boolean cumple(Pasajero p){
        return p.getEdad() <= edadMax;
    }
}
