package preparacionFinal.final23del32022;

public abstract class Comida {
    String nombre, tipo, modoPrep;

    public Comida (String nombre, String tipo, String modoPrep) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.modoPrep = modoPrep;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModoPrep() {
        return modoPrep;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setModoPrep(String modoPrep) {
        this.modoPrep = modoPrep;
    }
    public abstract double getPrecio();
    public abstract double getTiempoPrep();
    public abstract int getKcal();

}
