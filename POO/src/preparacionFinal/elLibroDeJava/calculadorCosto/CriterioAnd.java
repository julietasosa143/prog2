package preparacionFinal.elLibroDeJava.calculadorCosto;

import preparacionFinal.elLibroDeJava.Capitulo;

public class CriterioAnd extends CriterioCosto{
    CriterioCosto c1;
    CriterioCosto c2;

    public CriterioAnd(CriterioCosto c1, CriterioCosto c2) {
        this.c1=c1;
        this.c2=c2;
    }

    @Override
    public double calcular(Capitulo c){
        return c1.calcular(c)+c1.calcular(c);
    }
}
