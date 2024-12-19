package preparacionFinal.final6del924;

import java.util.ArrayList;

public abstract class Operacion extends Expresion{
    Expresion izquierda;
    Expresion derecha;

    public Operacion(Expresion izq, Expresion der){
        this.izquierda = izq;
        this.derecha = der;
    }
    public abstract Character getSimbolo();
    @Override
    public ArrayList<Double> getNumeros(){
        ArrayList<Double> numeros= new ArrayList<>();
        numeros.addAll(izquierda.getNumeros());
        numeros.addAll(derecha.getNumeros());
        return numeros;
    }
    @Override
    public ArrayList<Character> getOperadores(){
        ArrayList<Character> operadores= new ArrayList<>();
        operadores.addAll(izquierda.getOperadores());
        operadores.addAll(derecha.getOperadores());
        operadores.add(getSimbolo());
        return operadores;
    }

    @Override
    public String imprimirNormal(){
        String salida = "(";
        salida+= izquierda.imprimirNormal();
        salida +=" ";
        salida+= getSimbolo().toString();
        salida +=" ";
        salida+= derecha.imprimirNormal();
        salida+= ")";
        return salida;
    }
    @Override
    public String imprimirPolaca(){
        String salida = "(";
        salida+= getSimbolo().toString();
        salida +=" ";
        salida+= izquierda.imprimirPolaca();
        salida +=" ";
        salida+= derecha.imprimirPolaca();
        salida+= ")";
        return salida;
    }
    @Override
    public String imprimirPolacaInversa(){
        String salida = "(";
        salida+= izquierda.imprimirPolacaInversa();
        salida +=" ";
        salida+= derecha.imprimirPolacaInversa();
        salida+= " ";
        salida+= getSimbolo().toString();
        salida+= ")";
        return salida;
    }

}
