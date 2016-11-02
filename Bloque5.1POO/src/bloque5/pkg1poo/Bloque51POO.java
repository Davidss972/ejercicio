//solamente existe un main
package bloque5.pkg1poo;

public class Bloque51POO 
{

    public static void main(String[] args) 
    {
    //vamos a crear un objeto
    Guerrero g1 = new Guerrero();
    Guerrero g2 = new Guerrero();
    //por decirlo asi guerrero pasaria a ser el tipo y g1 como llamaremos al atributo es decir
    // seria equivalente a guerrero = int y g1 = x
    
    g1.nombre = "Goku";
    g1.fuerza = 99;
    g1.salud = 100;
    
    g2.nombre = "Vegetta";
    g2.fuerza = 80;
    g2.salud = 80;
    
    System.out.println("el nombre de mi guerrero es :"+g1.nombre);
    System.out.println("el nombre de mi guerrero es :"+g2.nombre);
    }
    
}
