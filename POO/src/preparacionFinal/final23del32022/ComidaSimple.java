package preparacionFinal.final23del32022;

public class ComidaSimple {
    double tiempoPrep, precio;
    int kcal;

    public ComidaSimple(double tiempoPrep, double precio, int kcal) {
        this.tiempoPrep = tiempoPrep;
        this.precio = precio;
        this.kcal = kcal;
    }

    public double getTiempoPrep() {
        return tiempoPrep;
    }

    public double getPrecio() {
        return precio;
    }

    public int getKcal() {
        return kcal;
    }

    public void setTiempoPrep(double tiempoPrep) {
        this.tiempoPrep = tiempoPrep;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }
}
