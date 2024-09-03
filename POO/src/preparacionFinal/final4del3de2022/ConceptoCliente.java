package preparacionFinal.final4del3de2022;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ConceptoCliente {
    ArrayList<Compra> compras;
    public ConceptoCliente() {
        compras = new ArrayList<>();
    }


    public abstract ArrayList<ConceptoCliente> buscar(Filtro f);
    public abstract boolean aceptaRecomendacion(Libro l);
    public abstract double getMontoTotalGastado();
    public abstract int getAntiguedad();
    public abstract int getCantLibrosComprados();
    public void addCompra(Compra compra){
        compras.add(compra);
    }



}
