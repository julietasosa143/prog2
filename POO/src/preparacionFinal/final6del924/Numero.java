package preparacionFinal.final6del924;

import java.util.ArrayList;

public class Numero extends Expresion{
    Double valor;
    public Numero(Double valor){
        this.valor = valor;
    }

    @Override
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    @Override
    public ArrayList<Double> getNumeros(){
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(valor);
        return numeros;
    }
    @Override
    public ArrayList<Character> getOperadores(){
        return new ArrayList<>();
    }
    @Override
    public Expresion getOpuesta(){
        return new Numero(valor);
    }
    @Override
    public Expresion getCopia(){
        return new Numero(valor);
    }
    @Override
    public String imprimirNormal(){
        return valor.toString();
    }
    @Override
    public String imprimirPolaca(){
        return valor.toString();
    }
    @Override
    public String imprimirPolacaInversa(){
        return valor.toString();
    }











}
