package preparacionFinal.final6Del1224;

import java.util.ArrayList;

public class TrajeEspacial extends InterfazTraje{
    int talle;
    String planetaOrigen;
    ArrayList<String> metalesUsados;

    public TrajeEspacial(String nombre,int talle, String planetaOrigen) {
        super(nombre);
        this.talle = talle;
        this.planetaOrigen = planetaOrigen;
        metalesUsados = new ArrayList<>();
    }

    @Override
    public int getTalle() {
        return talle;
    }
    public void setTalle(int talle) {
        this.talle = talle;
    }

    public String getPlanetaOrigen() {
        return planetaOrigen;
    }

    public void setPlanetaOrigen(String planetaOrigen) {
        this.planetaOrigen = planetaOrigen;
    }
    @Override
    public ArrayList<String> getMetales() {
        return new ArrayList<>(metalesUsados);
    }
    public void agregarMetal(String metal) {
        metalesUsados.add(metal);
    }




    @Override
    public ArrayList<TrajeEspacial> seIndicanPara(MiembroDeEquipo m, Filtro f) {
        ArrayList<TrajeEspacial> salida= new ArrayList<>();
        if(f.cumple(m)){
            salida.add(this);
        }
        return salida;
    }

    @Override
    public InterfazTraje getCopia(Modificador m) {
        TrajeEspacial copia= new TrajeEspacial(nombre, talle, planetaOrigen);
        for(String metal:metalesUsados){
            copia.agregarMetal(metal);
        }
        TrajeEspacial copiaFinal= m.modificar(copia);
        return copiaFinal;
    }



}
