package preparacionFinal.final9del8;

public class FiltroIngrediente  extends Filtro{
    String ingBuscado;

    public void setIngBuscado(String ingBuscado) {
        this.ingBuscado = ingBuscado;
    }

    public String getIngBuscado() {
        return ingBuscado;
    }

    public FiltroIngrediente(String ing){
        ingBuscado = ing;
    }
    @Override
    public boolean cumple(OpcionMenu op){
        return op.getIngredientes().contains(ingBuscado);
    }
    @Override
    public boolean equals(Object o1){
        FiltroIngrediente fi = (FiltroIngrediente)o1;
        return ingBuscado.equals(fi.getIngBuscado());
    }
}
