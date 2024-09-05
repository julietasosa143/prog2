package preparacionFinal.recu2022_2c;

import java.util.ArrayList;

public class SeccionEspecial extends Seccion{
    ArrayList<String> categoriasAdmisibles;

    public SeccionEspecial(String titulo, String categoria){ //asumo que mas alla de las categorias admisibles la seccion tiene una propia
        super(titulo, categoria);
        categoriasAdmisibles = new ArrayList<>();
    }
    public ArrayList<String> getCategoriasAdmisibles(){
        return new ArrayList<>(categoriasAdmisibles);
    }
    public void agregarCategoria(String categoria){
        if(!categoriasAdmisibles.contains(categoria)){
            categoriasAdmisibles.add(categoria);
        }
    }
    @Override
    public void agregarElemento(ElementoNoticia e){
        boolean agregable = false;
        for(String s: categoriasAdmisibles){
            if(s.equals(e.getCategoria())){
                agregable= true;
            }
        }
        if (agregable){
            elementos.add(e);
        }
    }


}
