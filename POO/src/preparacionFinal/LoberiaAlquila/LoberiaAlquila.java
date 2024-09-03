package preparacionFinal.LoberiaAlquila;

import java.util.ArrayList;

public class LoberiaAlquila {
    ArrayList<ElementoAlquiler> productos;
    Filtro promocional;

    public LoberiaAlquila(Filtro f) {
        productos = new ArrayList<>();
        promocional = f;
    }

    public boolean estaPromocionado(ElementoAlquiler e){
        return promocional.cumple(e);
    }

    public Filtro getPromocional() {
        return promocional;
    }

    public void setPromocional(Filtro promocional) {
        this.promocional = promocional;
    }

    public ArrayList<ElementoAlquiler> getProductos() {
        return new ArrayList<ElementoAlquiler>(productos);
    }
}
