package preparacionFinal.final4del3de2022;
import java.util.ArrayList;
public class Libro {
    String autor, resumen;
    ArrayList<String> generos;
    double precio;
    public Libro(String autor, String resumen, double precio) {
        this.autor = autor;
        this.resumen = resumen;
        this.generos = new ArrayList<>();
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public ArrayList<String> getGeneros() {
        return new ArrayList<>(generos);
    }
}
