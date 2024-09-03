package preparacionFinal.elLibroDeJava.calculadorCosto;

import preparacionFinal.elLibroDeJava.Capitulo;

public class CriterioCostoFijoPorAutores extends CriterioCosto {
    double costoXautor;

    public CriterioCostoFijoPorAutores(double costoXautor) {
        this.costoXautor = costoXautor;
    }
    @Override
    public double calcular(Capitulo c) {
        return costoXautor*(c.getAutores().size());
    }
}
