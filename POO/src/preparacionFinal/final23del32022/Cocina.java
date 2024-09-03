package preparacionFinal.final23del32022;

import java.util.ArrayList;

public class Cocina {
    ArrayList<EstacionDeTrabajo> estaciones;
    String nombre;
    CalculadorCosto c;

    public Cocina(String nombre, CalculadorCosto c) {
        this.nombre = nombre;
        estaciones = new ArrayList<EstacionDeTrabajo>();
        this.c = c;
    }

    public ArrayList<EstacionDeTrabajo> getEstaciones() {
        return new ArrayList<>(estaciones);
    }

    public CalculadorCosto getC() {
        return c;
    }

    public String getNombre() {
        return nombre;
    }

    public void addEstacion(EstacionDeTrabajo estacion) {
        estaciones.add(estacion);
    }
    public double calcularCostoPedido(Pedido p){
        return c.calcularCosto(p);

    }
    public boolean asignarPedido(Pedido p){//retorna segun si todas las comidad del pedido pudieron ser asignadas no sabia que hacer con esta parte del enunciado la vdd
        boolean asignado=true;
        ArrayList<Comida> pedido= p.getPedido(); //traigo las comidas dentro del pedido
        for(int i=0; i<pedido.size(); i++){ //recorro
            EstacionDeTrabajo estacion = new EstacionDeTrabajo(); //creo una estacion vacia con valores incializados en null
            int j=0; //y un integer que me controle las estaciones
            while(estacion.getNombre()==null&&estacion.getEspecialidad()==null && i<=estaciones.size()) { //mientras que la estacion no este asignada y aun queden por explorar
                for (EstacionDeTrabajo e : estaciones) {
                    if (e.aceptaPreparar(pedido.get(i))) {
                        estacion = e;//le asigno valores a la estacion y corto el while
                    }
                    j++;//aumento el nro de estacion
                }
            }
            if(estacion.getNombre()==null&&estacion.getEspecialidad()==null) {//si cuando sale del while la estacion no fue asignada (es decir ninguna acepto preparar el pedido)
                asignado=false;//una parte del pedido queda sin asignar por lo que se retornaria false;
            }
        }
        return asignado; //hasta yo me maree


    }


}
