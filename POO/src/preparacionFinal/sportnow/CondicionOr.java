package preparacionFinal.sportnow;

public class CondicionOr extends Condicion{
    Condicion c1;
    Condicion c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Entrenamiento e){
        return c1.cumple(e)||c2.cumple(e);
    }
}
