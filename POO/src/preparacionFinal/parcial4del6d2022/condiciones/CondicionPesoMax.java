package preparacionFinal.parcial4del6d2022.condiciones;

import preparacionFinal.parcial4del6d2022.ElementoJuego;

public class CondicionPesoMax extends Condicion {
    double pesoMax;

    public CondicionPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }
    @Override
    public boolean cumple(ElementoJuego e){
        return pesoMax > e.getPeso();
    }
}

