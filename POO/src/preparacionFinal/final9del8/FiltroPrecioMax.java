package preparacionFinal.final9del8;

public class FiltroPrecioMax extends Filtro{
    double precioMax;

    public void setPrecioMax(double precioMax) {
        this.precioMax = precioMax;
    }

    public double getPrecioMax() {
        return precioMax;
    }

    public FiltroPrecioMax(double precioMax) {
        this.precioMax = precioMax;
    }
    @Override
    public boolean cumple(OpcionMenu op){
        return op.getPrecio()<precioMax;
    }
    @Override
    public boolean equals(Object o1){
        FiltroPrecioMax f = (FiltroPrecioMax)o1;
        return f.getPrecioMax()==precioMax;
    }
}
