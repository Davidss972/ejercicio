
package bloque6.pkg1constructores;


public class Principal {


    public static void main(String[] args) 
    {
    Coche coche1 = new Coche(0,0,"toyota");

    System.out.println("El nombre de mi coche es:"+coche1.getNombre()+" y tiene una velocidad de : "+coche1.getVelocidad());
    }
    
}
