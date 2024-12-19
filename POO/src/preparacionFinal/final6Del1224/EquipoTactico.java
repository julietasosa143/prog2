package preparacionFinal.final6Del1224;

import java.util.ArrayList;

public class EquipoTactico extends Equipo{

    public EquipoTactico (String nombre){
        super(nombre);
    }

    @Override
    public int getTalle() {
        int talleMenor=0;
        for(InterfazTraje t : componentes){
            int talleAux= t.getTalle();
            if(talleAux<talleMenor){
                talleMenor=talleAux;
            }
        }
        return talleMenor;
    }

    @Override
    public InterfazTraje getCopia(Modificador m){
        ArrayList<InterfazTraje> hijosModificados = new ArrayList<>();
        for(InterfazTraje comp : componentes){
            hijosModificados.add(comp.getCopia(m));
        }
        Equipo salida= new EquipoTactico(nombre);
        for(InterfazTraje hijo : hijosModificados){
            salida.agregarComponente(hijo);
        }
        return salida;
    }
}
