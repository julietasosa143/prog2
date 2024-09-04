package preparacionFinal.parcialCollectors;

public class ColeccionEspecial extends ColeccionTematica{
    Filtro condicion;
    public ColeccionEspecial(Filtro condicion,String nombre, double volumenExtra) {
        super(nombre, volumenExtra);
        this.condicion = condicion;
    }

    @Override
    public void agregarElemento(Coleccionable c){
        if(condicion.cumple(c)){
            elementos.add(c);
        }
    }
}
