package preparacionFinal.recu2022_2c;

import java.util.ArrayList;

public class Portal {
    ArrayList<ElementoNoticia> noticiasysecciones;
    ArrayList<Suscriptor> suscriptores;
    String nombre;
    public Portal(String nombre) {
        this.nombre = nombre;
        noticiasysecciones = new ArrayList<>();
        suscriptores = new ArrayList<>();
    }

    public ArrayList<ElementoNoticia> getNoticiasysecciones() {
        return noticiasysecciones;
    }

    public ArrayList<Suscriptor> getSuscriptores() {
        return suscriptores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void recomendarNoticia(Suscriptor s, ElementoNoticia e) {
        s.agregarNoticia(e);
    }
}
