package preparacionFinal.final4del3de2022;

public class ClienteExigente extends Cliente{
    public ClienteExigente(String nombre) {
        super(nombre);
    }
    @Override
    public boolean aceptaRecomendacion(Libro l){
        boolean aceptada = false;
        for(String autor:autores){
            if(l.getAutor().equals(autor)){
                aceptada = true;
            }
        }
        return l.getGeneros().containsAll(this.getGeneros())&&aceptada;

    }
}
