package preparacionFinal.parcial4del6d2022.condiciones;

import preparacionFinal.parcial4del6d2022.ElementoJuego;

public class CondicionColor extends Condicion{
    String colorBuscado;

    public CondicionColor(String colorBuscado) {
        this.colorBuscado = colorBuscado;
    }

    @Override
    public boolean cumple(ElementoJuego e){
        return e.getColor().equals(colorBuscado);
    }
}
