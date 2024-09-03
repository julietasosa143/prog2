package preparacionFinal.trenmaritimoSA;

import java.util.ArrayList;

public class Asiento extends ElementoTren{
    int id;
    ArrayList<String> cualidades;
    boolean isDisponible;
    FiltroPasajero f;
    Pasajero p;

    private Asiento() {
    }

    public Asiento(int id, FiltroPasajero f){
        this.id = id;
        this.f = f;
        cualidades = new ArrayList<>();
        isDisponible = false;
        p=null;
    }

    public int getId() {
        return id;
    }

    public boolean isDisponible() {
        return isDisponible;
    }

    private void setDisponible(boolean disponible) {
        isDisponible = disponible;
    }

    public FiltroPasajero getF() {
        return f;
    }

    public ArrayList<String> getCualidades() {
        return new ArrayList<String>(cualidades);
    }

    public void setId(int id) {
        this.id = id;
    }
    public void ocupar(Pasajero p){
        if(isDisponible&& f.cumple(p)){
            isDisponible = false;
            this.p=p;
        }
    }

    public void setF(FiltroPasajero f) {
        this.f = f;
    }

    private void setP(Pasajero p) {
        this.p = p;
    }

    public void agregarCualidad(String cualidad){
        if(!cualidades.contains(cualidad)){
            cualidades.add(cualidad);
        }
    }

    @Override
    public ArrayList<Asiento> getAsientos() {
        ArrayList<Asiento> salida = new ArrayList<>();
        salida.add(new Asiento(id, f));
        return salida;
    }

    @Override
    public ArrayList<Asiento> getAsientosDisponibles() {
        ArrayList<Asiento> salida= new ArrayList<>();
        if(isDisponible){
            Asiento a= new Asiento(id, f);
            a.setDisponible(true);
            for(String cualidad: cualidades){
                a.agregarCualidad(cualidad);
            }
            salida.add(a);
            return salida;

        }else{
            return salida;
        }
    }

    @Override
    public ArrayList<Asiento> getAsientosOcupables(Pasajero p) {
        ArrayList<Asiento> salida = new ArrayList<>();
        if(isDisponible&& f.cumple(p)){
            Asiento a= new Asiento(id, f);
            a.setDisponible(true);
            for(String cualidad: cualidades){
                a.agregarCualidad(cualidad);
            }
            salida.add(a);
            return salida;
        }else{
            return salida;
        }
    }

    @Override
    public int getAsientosTotales() {
        return 1;
    }

    @Override
    public ElementoTren getCopia(FiltroPasajero f) {
        if (f.cumple(p)) {
            Asiento salida = new Asiento(id, this.f);
            salida.setP(p);
            salida.setDisponible(false);
            return salida;
        } else {
            return null;
        }
    }

    public Pasajero getPasajero() {
        return new Pasajero(p.getNombre(), p.getEdad(), p.getPreferencias());
    }
}
