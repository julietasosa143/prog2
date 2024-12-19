package preparacionFinal.final6Del1224;

import java.util.ArrayList;

public class EquipoTacticoEspecial extends Equipo{

    public EquipoTacticoEspecial (String nombre){
        super(nombre);
    }

    @Override
    public int getTalle() {
        return componentes.getFirst().getTalle();
    }

    @Override
    public InterfazTraje getCopia(Modificador m){
        ArrayList<InterfazTraje> hijosModificados = new ArrayList<>();
        for(InterfazTraje comp : componentes){
            hijosModificados.add(comp.getCopia(m));
        }
        Equipo salida= new EquipoTacticoEspecial(nombre);
        for(InterfazTraje hijo : hijosModificados){
            salida.agregarComponente(hijo);
        }
        return salida;
    }
}
