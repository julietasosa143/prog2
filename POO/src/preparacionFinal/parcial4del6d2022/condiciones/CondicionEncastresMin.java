package preparacionFinal.parcial4del6d2022.condiciones;

import preparacionFinal.parcial4del6d2022.ElementoJuego;

public class CondicionEncastresMin extends Condicion {
    double encastresMin;

    public CondicionEncastresMin(double encastresMin) {
        this.encastresMin = encastresMin;
    }

    @Override
    public boolean cumple(ElementoJuego e){
        return e.getCantEncastres()>encastresMin;
    }
}
