package preparacionFinal.final9del8;

public class MenuRestriccion extends MenuCompuesto{
    Filtro restriccion;
    public MenuRestriccion(String nombre, double descuento, Filtro restriccion) {
        super(nombre, descuento);
        this.restriccion = restriccion;
    }
    @Override
    public void agregarElemento(OpcionMenu op){
        if(restriccion.cumple(op)){
            elementos.add(op);
        }
    }
}
