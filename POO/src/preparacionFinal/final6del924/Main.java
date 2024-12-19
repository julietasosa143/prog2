package preparacionFinal.final6del924;

public class Main {
    public static void main (String[] args) {
        try{
            Numero uno= new Numero(1.0);
            Numero dos= new Numero(2.0);
            Suma unomasdos = new Suma(uno, dos);
            Resta dosmenosuno= new Resta(dos, uno);
            Multiplicacion unopordos = new Multiplicacion(uno,dos);
            Division dosdividiouno= new Division(dos, uno);

            Multiplicacion compuesta = new Multiplicacion(unomasdos, unopordos);

            System.out.println("La suma "+ unomasdos.imprimirNormal()+" es igual a " + unomasdos.getValor()+ "\nPuede ser escrita en su notacion polaca "+unomasdos.imprimirPolaca()+"\nO polaca inversa "+unomasdos.imprimirPolacaInversa());
            System.out.println("La resta "+ dosmenosuno.imprimirNormal()+" es igual a "+dosmenosuno.getValor()+"\nPuede ser escrita en su notacion polaca "+dosmenosuno.imprimirPolaca()+"\nO polaca inversa "+dosmenosuno.imprimirPolacaInversa());
            System.out.println("La multiplicacion "+ unopordos.imprimirNormal()+" es igual a "+unopordos.getValor()+"\nPuede ser escrita en su notacion polaca "+unopordos.imprimirPolaca()+"\nO polaca inversa "+unopordos.imprimirPolacaInversa());
            System.out.println("La division "+ dosdividiouno.imprimirNormal()+" es igual a "+dosdividiouno.getValor()+"\nPuede ser escrita en su notacion polaca "+dosdividiouno.imprimirPolaca()+"\nO polaca inversa "+dosdividiouno.imprimirPolacaInversa());

            System.out.println("La expresion " +compuesta.imprimirNormal()+ " es igual a "+ compuesta.getValor()+" tiene como numeros "+ compuesta.getNumeros() +" y como operadores "+compuesta.getOperadores());

            System.out.println("Cada expresion tiene su expresion opuesta, por ejemplo:\n" +unomasdos.imprimirNormal() + " opuesta " + unomasdos.getOpuesta().imprimirNormal()+"\n"+ dosmenosuno.imprimirNormal()+" opuesta "+ dosmenosuno.getOpuesta().imprimirNormal() + "\n"+ unopordos.imprimirNormal()+" opuesta "+unopordos.getOpuesta().imprimirNormal()+"\n"+ dosdividiouno.imprimirNormal()+" opuesta "+dosdividiouno.getOpuesta().imprimirNormal());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
