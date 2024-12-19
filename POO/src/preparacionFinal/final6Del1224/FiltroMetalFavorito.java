package preparacionFinal.final6Del1224;

public class FiltroMetalFavorito extends Filtro{
    String metalBuscado;

    public FiltroMetalFavorito(String metalBuscado){
        this.metalBuscado = metalBuscado;
    }

    @Override
    public boolean cumple(MiembroDeEquipo m){

        return m.getMetalesFavoritos().contains(metalBuscado);
    }
}
