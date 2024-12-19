package preparacionFinal.final6del924;

public class Multiplicacion extends Operacion{

    public Multiplicacion(Expresion izq, Expresion der){
        super(izq, der);
    }

    @Override
    public Character getSimbolo(){
        return '*';
    }
    @Override
    public Double getValor(){
        return izquierda.getValor()*derecha.getValor();
    }

    @Override
    public Expresion getOpuesta(){
        return new Division(izquierda,derecha);
    }
    @Override
    public Expresion getCopia(){
        return new Multiplicacion(izquierda.getCopia(), derecha.getCopia());
    }
}
