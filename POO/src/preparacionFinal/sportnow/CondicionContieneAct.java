package preparacionFinal.sportnow;

public class CondicionContieneAct extends Condicion{
    String actBuscada;

    public CondicionContieneAct(String act) {
        this.actBuscada = act;
    }

    public boolean cumple(Entrenamiento e){
        String actividades = e.getActividad();
        return actividades.contains(actBuscada);
    }
}
