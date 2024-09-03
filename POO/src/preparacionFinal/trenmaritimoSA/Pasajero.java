package preparacionFinal.trenmaritimoSA;

import java.util.ArrayList;

public class Pasajero {
    String nombre;
    int edad;
    ArrayList<String> preferencias;

    public Pasajero(String nombre, int edad, ArrayList<String> preferencias) {
        this.nombre = nombre;
        this.edad = edad;
        this.preferencias = new ArrayList<>(preferencias);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<String> getPreferencias() {
        return new ArrayList<String>(preferencias);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
