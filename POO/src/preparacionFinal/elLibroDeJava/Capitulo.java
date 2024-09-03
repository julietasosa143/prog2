package preparacionFinal.elLibroDeJava;

import preparacionFinal.elLibroDeJava.calculadorCosto.CriterioCosto;
import preparacionFinal.elLibroDeJava.filtros.Filtro;

import java.util.ArrayList;

public class Capitulo extends ElementoEditorial {
    ArrayList<Experto> autores;
    int cantPaginas;
    String tema;

    public Capitulo(String nombre, String tema, int cantPaginas, ArrayList<Experto> autores, Experto aCargo) {
        super(nombre, aCargo);
        this.tema = tema;
        this.cantPaginas = cantPaginas;
        if (!autores.contains(aCargo)) {
            this.autores= new ArrayList<Experto>(autores);
        }
    }

    @Override
    public double getCosto(CriterioCosto c) {
        return c.calcular(this);
    }

    @Override
    public ArrayList<String> getTemas() {
        ArrayList<String> salida= new ArrayList<String>();
        salida.add(tema);
        return salida;
    }

    @Override
    public ArrayList<Experto> getAutores() {
        return new ArrayList<Experto>(autores);
    }

    @Override
    public ArrayList<Experto> getExpertosaCargo() {
        ArrayList<Experto> salida= new ArrayList<Experto>();
        salida.add(aCargo);
        return salida;
    }

    @Override
    public int getCantPaginas() {
        return cantPaginas;
    }

    @Override
    public ElementoEditorial getCopia(Filtro f) {
        return new Capitulo(nombre, tema, cantPaginas, autores,aCargo);
    }


}
