package preparacionFinal.elLibroDeJava.calculadorCosto;

import preparacionFinal.elLibroDeJava.Capitulo;

public class CriterioCostoFijoPorPag extends CriterioCosto{

    double costoXpag;

    public CriterioCostoFijoPorPag(double costoXpag) {
        this.costoXpag = costoXpag;
    }

    @Override
    public double calcular(Capitulo c){
        return costoXpag*c.getCantPaginas();
    }
}
