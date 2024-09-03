package preparacionFinal.elLibroDeJava.calculadorCosto;

import preparacionFinal.elLibroDeJava.Capitulo;

public class CriterioValorPreestablecido extends CriterioCosto{
    double valor;

    public CriterioValorPreestablecido(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcular(Capitulo c){
        return valor;
    }
}
