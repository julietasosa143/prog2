package preparacionFinal.trenmaritimoSA;

public class FiltroPPreferencia extends FiltroPasajero{
    String preferencia;
    public FiltroPPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }
    @Override
    public boolean cumple(Pasajero p){
        return p.getPreferencias().contains(preferencia);
    }
}
