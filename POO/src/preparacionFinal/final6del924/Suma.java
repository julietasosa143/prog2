package preparacionFinal.final6del924;

public class Suma extends Operacion{

    public Suma(Expresion izq, Expresion der) {
        super(izq, der);
    }

    @Override
    public Character getSimbolo(){
        return '+';
    }

    @Override
    public Double getValor(){
        return izquierda.getValor()+ derecha.getValor();
    }

    @Override
    public Expresion getOpuesta(){
        return new Resta(izquierda,derecha);
    }
    @Override
    public Expresion getCopia(){
        return new Suma(izquierda.getCopia(),derecha.getCopia());
    }
}
