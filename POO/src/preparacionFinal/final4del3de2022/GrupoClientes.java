package preparacionFinal.final4del3de2022;

import java.util.ArrayList;

public class GrupoClientes extends ConceptoCliente{
    ArrayList<ConceptoCliente> integrantes;

    public GrupoClientes() {
        super();
        integrantes = new ArrayList<>();
    }

    @Override
    public ArrayList<ConceptoCliente> buscar(Filtro f) {
        ArrayList<ConceptoCliente> salida = new ArrayList<>();
        if(f.cumple(this)){
            salida.add(this);
        }else{
            for(ConceptoCliente c : integrantes){
                salida.addAll(c.buscar(f));
            }
        }
        return salida;
    }

    public ArrayList<ConceptoCliente> getIntegrantes() {
        return new ArrayList<>(integrantes);
    }

    @Override
    public boolean aceptaRecomendacion(Libro l) {
        boolean aceptaRecomendacion = false;
        for(ConceptoCliente c : integrantes) {
            if (c.aceptaRecomendacion(l)) {
                aceptaRecomendacion = true;
            }
        }
        return aceptaRecomendacion;
    }

    @Override
    public double getMontoTotalGastado() {
        double montoTotalGastado = 0;
        for(ConceptoCliente c : integrantes) {
            montoTotalGastado += c.getMontoTotalGastado();
        }
        return montoTotalGastado;
    }

    @Override
    public int getAntiguedad() {
        int antiguedadMayor = 0;
        for(ConceptoCliente c : integrantes) {
            if(c.getAntiguedad() > antiguedadMayor) {
                antiguedadMayor = c.getAntiguedad();
            }
        }
        return antiguedadMayor;
    }

    @Override
    public int getCantLibrosComprados() {
        int cantLibrosComprados = 0;
        for(ConceptoCliente c : integrantes) {
            cantLibrosComprados += c.getCantLibrosComprados();
        }
        return cantLibrosComprados;
    }



}
