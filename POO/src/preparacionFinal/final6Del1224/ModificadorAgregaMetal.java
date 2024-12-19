package preparacionFinal.final6Del1224;

public class ModificadorAgregaMetal extends Modificador{
    String metalAagregar;

    public ModificadorAgregaMetal(String metalAagregar) {
        this.metalAagregar = metalAagregar;
    }

    @Override
    public TrajeEspacial modificar(TrajeEspacial t){
        t.agregarMetal(metalAagregar);
        return t;
    }
}
