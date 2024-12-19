package preparacionFinal.final6Del1224;

import java.util.ArrayList;

public abstract class Equipo extends InterfazTraje{
    ArrayList<InterfazTraje> componentes;

    public Equipo(String nombre){
        super(nombre);
        componentes = new ArrayList<>();
    }
    public void agregarComponente(InterfazTraje comp){
        componentes.add(comp);
    }
    @Override
    public ArrayList<String> getMetales(){
        ArrayList<String> metales = new ArrayList<>();
        for(InterfazTraje comp : componentes){
            ArrayList<String> aux = comp.getMetales();
            for(String met : aux){
                if(!metales.contains(met)){
                    metales.add(met);
                }
            }
        }
        return metales;
    }
    @Override
    public ArrayList<TrajeEspacial> seIndicanPara(MiembroDeEquipo m, Filtro f){
        ArrayList<TrajeEspacial> salida= new ArrayList<>();
        for(InterfazTraje comp : componentes){
            salida.addAll(comp.seIndicanPara(m,f));
        }
        return salida;
    }


}












