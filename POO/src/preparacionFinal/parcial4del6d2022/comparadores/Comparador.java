package preparacionFinal.parcial4del6d2022.comparadores;

import preparacionFinal.parcial4del6d2022.*;

import java.util.Comparator;

public class Comparador implements Comparator<ElementoJuego> {
    @Override
    public int compare(ElementoJuego o1, ElementoJuego o2) {
        return o1.compareTo(o2);
    }
}
