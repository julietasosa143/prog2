package preparacionFinal.sportnow;

public abstract class Efecto {
    Condicion c;
    public abstract boolean afecta(Entrenamiento e);
    public abstract void adecuarStatus(Atleta a);
}
