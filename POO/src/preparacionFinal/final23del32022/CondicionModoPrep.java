package preparacionFinal.final23del32022;

public class CondicionModoPrep extends Condicion {
    String modoBuscado;
    public CondicionModoPrep(String modoBuscado) {
        this.modoBuscado = modoBuscado;
    }
    @Override
    public boolean cumple(Comida c){
        return c.getModoPrep().equals(modoBuscado);
    }
}
