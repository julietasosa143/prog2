package preparacionFinal.final23del32022;

public class CondicionTipoPrep extends Condicion{
    String tipoBuscado;
    public CondicionTipoPrep(String tipoBuscado) {
        this.tipoBuscado = tipoBuscado;
    }
    @Override
    public boolean cumple(Comida c){
        return c.getTipo().equals(tipoBuscado);
    }
}
