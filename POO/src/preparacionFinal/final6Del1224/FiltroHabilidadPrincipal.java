package preparacionFinal.final6Del1224;

public class FiltroHabilidadPrincipal extends Filtro{
    String habilidadBuscada;

    public FiltroHabilidadPrincipal(String habilidadBuscada) {
        this.habilidadBuscada = habilidadBuscada;
    }

    @Override
    public boolean cumple(MiembroDeEquipo m){
        return m.getHabilidadPrincipal().equals(habilidadBuscada);
    }
}
