package preparacionFinal.trenmaritimoSA;

public class FiltroPNombre extends FiltroPasajero{
     String nombrebuscado;

     public FiltroPNombre(String nombrebuscado) {
         this.nombrebuscado = nombrebuscado;
     }

     @Override
    public boolean cumple(Pasajero p){
         return p.getNombre().equals(nombrebuscado);
     }
}
