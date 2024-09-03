package preparacionFinal.elLibroDeJava;
import java.time.Year;
public class Experto {
    String nombre, apellido, email;
    public Experto(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void crearLibroEnciclopedia(String titulo){
        LibroEnciclopedia libro1 = new LibroEnciclopedia(titulo, this, Year.now().getValue());
    }

    public void agregarAlibro(Capitulo c, LibroEnciclopedia libro){
        if(!libro.getElementos().contains(c)){
            libro.agregarElemento(c);
        }
    }

    public void agregarAenciclopedia(ElementoEditorial e, LibroEnciclopedia enciclopedia){
        if(!enciclopedia.getElementos().contains(e)){
            enciclopedia.agregarElemento(e);
        }
    }
}
