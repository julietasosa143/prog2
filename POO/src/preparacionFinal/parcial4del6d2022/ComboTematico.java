package preparacionFinal.parcial4del6d2022;
import preparacionFinal.parcial4del6d2022.condiciones.*;

public class ComboTematico extends Combo{
    Condicion c;

    public ComboTematico(String marca, double descuento, Condicion c) {
        super(marca, descuento);
        this.c = c;
    }

    @Override
    public void agregarElemento(ElementoJuego e){
        if(c.cumple(e)){
            elementos.add(e);
        }
    }


}
