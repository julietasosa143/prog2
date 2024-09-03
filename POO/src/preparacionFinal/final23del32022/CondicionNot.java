package preparacionFinal.final23del32022;

public class CondicionNot extends Condicion{
    Condicion c;
    public CondicionNot(Condicion c) {
        this.c = c;
    }

    @Override
    public boolean cumple(Comida comida) {
        return !c.cumple(comida);
    }
}
