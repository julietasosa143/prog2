package preparacionFinal.sportnow;

public class EfectoHorasRecuperacion extends Efecto{
    int incrementoEnPorc;
    double duracion;
    public EfectoHorasRecuperacion(Condicion c, int incremento) {
        this.c=c;
        this.incrementoEnPorc=incremento;
    }
    public boolean afecta(Entrenamiento e){
        if(c.cumple(e)){
            duracion=e.getDuracion();
            return true;
        }else{
            return false;
        }
    }
    public void adecuarStatus(Atleta a){
        a.setHorasDeRecuperacion(a.getHorasDeRecuperacion() + (duracion * incrementoEnPorc / 100.0));;
    }
}
