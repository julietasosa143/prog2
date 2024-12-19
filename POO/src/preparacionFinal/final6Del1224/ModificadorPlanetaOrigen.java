package preparacionFinal.final6Del1224;

public class ModificadorPlanetaOrigen extends Modificador{
    String planetaNuevo;

    public ModificadorPlanetaOrigen(String planetaNuevo) {
        this.planetaNuevo = planetaNuevo;
    }

    @Override
    public TrajeEspacial modificar(TrajeEspacial e){
        e.setPlanetaOrigen(planetaNuevo);
        return e;
    }
}
