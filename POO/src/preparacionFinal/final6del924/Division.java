package preparacionFinal.final6del924;

public class Division extends Operacion{

    public Division(Expresion izq, Expresion der) {
        super(izq, der);
    }

    @Override
    public Character getSimbolo(){
        return '/';
    }
    @Override
    public Double getValor(){
        return izquierda.getValor()/ derecha.getValor();
    }

    @Override
    public Expresion getOpuesta(){
        return new Multiplicacion(izquierda, derecha);
    }
    @Override
    public Expresion getCopia(){
        return new Division(izquierda.getCopia(), derecha.getCopia());
    }
}
