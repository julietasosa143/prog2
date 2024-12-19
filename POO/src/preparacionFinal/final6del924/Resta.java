package preparacionFinal.final6del924;

public class Resta extends Operacion{

    public Resta(Expresion izquierda, Expresion derecha) {
        super(izquierda, derecha);
    }

    @Override
    public Character getSimbolo(){
        return '-';
    }
    @Override
    public Double getValor() {
        return izquierda.getValor() - derecha.getValor();
    }
    @Override
    public Expresion getOpuesta(){
        return new Suma(izquierda, derecha);
    }
    @Override
    public Expresion getCopia(){
        return new Resta(izquierda.getCopia(), derecha.getCopia());
    }
}
