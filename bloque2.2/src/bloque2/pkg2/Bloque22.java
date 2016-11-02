
package bloque2.pkg2;

import java.util.Scanner;

/**
 *
 * @author gokud
 */
public class Bloque22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    double temp;
    Scanner S = new Scanner(System.in);
    
    System.out.println("introduce una temperatura: ");
    temp = S.nextDouble();
    
    if(temp > 30)
        {
        System.out.println("hace calor");
        }
    else if(temp > 25)
        {
        System.out.println("la temperatura es normal");
        }
    else if(temp > 15)
        {
        System.out.println("hace frio");
        }
    else
        {
        System.out.println("Madre de dios te vas a congelar");
        }
    }
    
}
