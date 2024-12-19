package preparacionFinal.final6del924;

import java.util.ArrayList;

public abstract class Expresion {
    public abstract Double getValor();
    public abstract ArrayList<Double> getNumeros();
    public abstract ArrayList<Character> getOperadores();
    public abstract Expresion getOpuesta();
    public abstract Expresion getCopia();

    public abstract String imprimirNormal();
    public abstract String imprimirPolaca();
    public abstract String imprimirPolacaInversa();
}
