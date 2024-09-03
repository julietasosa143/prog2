package preparacionFinal.final23del32022;

import java.util.ArrayList;

public class ComidaCompleja extends Comida{
    ArrayList<Comida> componentes;
    public ComidaCompleja(String nombre, String tipoPrep, String modoPrep) {
        super(nombre, tipoPrep, modoPrep);
        componentes = new ArrayList<>();
    }

    @Override
    public double getPrecio() {
        double precio = 0;
        for(Comida comida : componentes){
            precio += comida.getPrecio();
        }
        return precio;
    }

    @Override
    public double getTiempoPrep() {
        double tiempoPrep = 0;
        for (Comida c: componentes){
            tiempoPrep += c.getTiempoPrep();
        }
        return tiempoPrep;
    }

    @Override
    public int getKcal() {
        int kcalTotal=0;
        for (Comida c: componentes){
            kcalTotal += c.getKcal();
        }
        return kcalTotal;
    }

    public ArrayList<Comida> getComponentes() {
        return new ArrayList<Comida>(componentes);
    }

}
