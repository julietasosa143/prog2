package preparacionFinal.final6Del1224;

import java.util.ArrayList;

public class MiembroDeEquipo {
    String nombreClave;
    double altura;
    ArrayList<String> metalesFavoritos;
    String habilidadPrincipal;

    public MiembroDeEquipo(String nombreClave, String habilidadPrincipal) {
        this.nombreClave = nombreClave;
        this.habilidadPrincipal = habilidadPrincipal;
        metalesFavoritos= new ArrayList<>();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombreClave() {
        return nombreClave;
    }

    public void setNombreClave(String nombreClave) {
        this.nombreClave = nombreClave;
    }

    public String getHabilidadPrincipal() {
        return habilidadPrincipal;
    }

    public void setHabilidadPrincipal(String habilidadPrincipal) {
        this.habilidadPrincipal = habilidadPrincipal;
    }

    public ArrayList<String> getMetalesFavoritos() {
        return new ArrayList<String>(metalesFavoritos);
    }
    public void agregarMetal(String metal) {
        metalesFavoritos.add(metal);
    }
}
