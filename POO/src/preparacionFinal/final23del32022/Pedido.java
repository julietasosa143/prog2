package preparacionFinal.final23del32022;

import java.util.ArrayList;

public class Pedido {
    int nroMesa;
    ArrayList<Comida> pedido;
    String mozo;

    public Pedido(int nroMesa, ArrayList<Comida> pedido, String mozo) {
        this.nroMesa = nroMesa;
        this.pedido= new ArrayList<>(pedido);
        this.mozo=mozo;
    }
    public Pedido(int nroMesa, String mozo){
        this.nroMesa=nroMesa;
        this.mozo=mozo;
        pedido= new ArrayList<>();
    }

    public int getNroMesa() {
        return nroMesa;
    }

    public String getMozo() {
        return mozo;
    }

    public ArrayList<Comida> getPedido() {
        return new ArrayList<Comida>(pedido);
    }

    public void setNroMesa(int nroMesa) {
        this.nroMesa = nroMesa;
    }

    public void setMozo(String mozo) {
        this.mozo = mozo;
    }
}
