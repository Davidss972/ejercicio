//Sumar todos los numeros que hay entre dos numeros introducidos
package bloque3.pkg1;

import java.util.Scanner;

/**
 *
 * @author gokud
 */
public class Ejercicio2 
{
    public static void main(String[]arg)
    {
        int x,y,suma = 0;
        
        Scanner S = new Scanner(System.in);
        
        System.out.println("introduce el primer numero");
        x = S.nextInt();
        
        System.out.println("introduce el segundo numero");
        y = S.nextInt();
        
        for(int i = x; i < y; i++)
        {
            suma +=i;
        
        }
        
        System.out.print("el valor total es "+suma);
    }
}
