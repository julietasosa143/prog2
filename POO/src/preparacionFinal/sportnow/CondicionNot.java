package preparacionFinal.sportnow;

public class CondicionNot extends Condicion{
    Condicion c;

    public CondicionNot(Condicion c) {
        this.c = c;
    }

    public boolean cumple(Entrenamiento e){
        return !c.cumple(e);
    }
}
