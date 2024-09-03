package preparacionFinal.final23del32022;

public class EstacionDeTrabajo {
    Condicion especialidad;
    String nombre;

    public EstacionDeTrabajo(Condicion especialidad, String nombre) {
        this.especialidad = especialidad;
        this.nombre = nombre;
    }
    public EstacionDeTrabajo() {
        nombre=null;
        especialidad=null;
    }

    public void setEspecialidad(Condicion especialidad) {
        this.especialidad = especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Condicion getEspecialidad() {
        return especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean aceptaPreparar(Comida c){
        return especialidad.cumple(c);
    }
}
