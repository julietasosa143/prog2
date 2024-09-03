package preparacionFinal.sportnow;

public class EntrenamientoRepetitivo extends EntrenamientoCompuesto{
    int cantRepeticiones;
    double pausa;

    public EntrenamientoRepetitivo(String nombre, int intensidad,
                                   double factorCostoKcal, int cantRepeticiones, double pausa) {
        super(nombre, intensidad, factorCostoKcal);
        this.cantRepeticiones = cantRepeticiones;
        this.pausa=pausa;
    }

    @Override
    public double getDuracion(){
        return (super.getDuracion()*cantRepeticiones)+(cantRepeticiones*pausa);
    }
    @Override
    public double getCostoKcal(){
        return super.getCostoKcal()*(cantRepeticiones);
    }
    public String getActividad() {
        String salida="";
        for(String act : this.getListaActividades()){
            if(salida.equals("")){
                salida+=("("+act+"-");
            }else{
                salida+=(act);
            }
        }
        salida.substring(0,salida.length()-1);
        salida+=(")x"+cantRepeticiones);
        this.actividad=salida;
        return salida;
    }
}
