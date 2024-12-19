package preparacionFinal.recu2022_2c;

import java.util.ArrayList;

public class Suscriptor {
    String nombre, apellido, email;
    Filtro preferencia;
    ArrayList<ElementoNoticia> noticiasRecibidas;

    public Suscriptor(String nombre, String apellido, String email, Filtro preferencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.preferencia = preferencia;
        noticiasRecibidas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Filtro getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(Filtro preferencia) {
        this.preferencia = preferencia;
    }

    public ArrayList<ElementoNoticia> getNoticiasRecibidas() {
        return new ArrayList<>(noticiasRecibidas);
    }
    public void agregarNoticia(ElementoNoticia noticia) {
        if(preferencia.cumple((Noticia) noticia)){
            noticiasRecibidas.add(noticia);
        }
    }
}
