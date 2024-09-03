package preparacionFinal.final9del8;

import java.util.ArrayList;

public class Comida extends OpcionMenu{
    double tPreparacion;
    double precio;
    int kcal;
    ArrayList<String> ingredientes;

    public Comida(String nombre, double tPreparacion, double precio, int kcal, ArrayList<String> ingredientes) {
        super(nombre);
        this.tPreparacion = tPreparacion;
        this.precio = precio;
        this.kcal = kcal;
        this.ingredientes = new ArrayList<String>(ingredientes);
    }
    public Comida(String nombre, double tPreparacion, double precio, int kcal) {
        super(nombre);
        this.tPreparacion = tPreparacion;
        this.precio = precio;
        this.kcal = kcal;
    }
    @Override
    public double getTiempoPreparacion() {
        return tPreparacion;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int getKcal() {
        return kcal;
    }

    @Override
    public ArrayList<OpcionMenu> buscar(Filtro f) {
        ArrayList<OpcionMenu> salida = new ArrayList<>();
        if (f.cumple(this)) {
            salida.add(this);
        }
        return salida;
    }

    public ArrayList<String> getIngredientes() {
        return new ArrayList<>(ingredientes);
    }

    public void settPreparacion(double tPreparacion) {
        this.tPreparacion = tPreparacion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }
    public void agregarIngrediente(String ingrediente) {
        if(!ingredientes.contains(ingrediente)){
            ingredientes.add(ingrediente);
        }
    }
}
