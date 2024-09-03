package preparacionFinal.final9del8;

import java.util.ArrayList;

public class MenuCompuesto extends OpcionMenu{
    ArrayList<OpcionMenu> elementos;
    double descuentoMenu;

    public MenuCompuesto(String nombre, double descuentoMenu) {
        super(nombre);
        this.descuentoMenu = descuentoMenu;//se asume que es enviado en formato int por ej 10
        elementos = new ArrayList<>();// luego en el metodo correspondiente se soluciona
    }                               //haciendo descuentoMenu/100

    public void agregarElemento(OpcionMenu elemento){
        elementos.add(elemento);
    }
    @Override
    public double getTiempoPreparacion() {
        double salida=0;
        for(OpcionMenu op: elementos){
            double t= op.getTiempoPreparacion();
            if(salida<t){
                salida=t;
            }
        }
        return 0;
    }

    @Override
    public double getPrecio() {
        double precioTotal=0;
        for(OpcionMenu op: elementos){
            precioTotal+=op.getPrecio();
        }
        return precioTotal*(descuentoMenu/100);
    }

    @Override
    public int getKcal() {
        int kcalTotal=0;
        for(OpcionMenu op: elementos){
            kcalTotal+=op.getKcal();
        }
        return kcalTotal;
    }

    @Override
    public ArrayList<OpcionMenu> buscar(Filtro f) {
        ArrayList<OpcionMenu> salida= new ArrayList<>();
        for(OpcionMenu op: elementos){
            salida.addAll(op.buscar(f)); //va a retornar solo comidas porque son las unicas que
                                          //  se agregan a si mismas a la busqueda
        }
        return salida;
    }

    public ArrayList<OpcionMenu> getElementos() {
        return new ArrayList<OpcionMenu>(elementos);
    }
    @Override
    public ArrayList<String> getIngredientes(){
        ArrayList<String> salida= new ArrayList<>();
        for(OpcionMenu op: elementos){
            ArrayList<String> aux= op.getIngredientes();
            for(String i: aux){
                if(!salida.contains(i)){
                    salida.add(i);
                }
            }
        }
        return salida;
    }
}
