
package bloque2.pkg4;

import java.util.Scanner;


public class CondicionesMultiples {


    public static void main(String[] args) 
    {
        int x;
        Scanner S = new Scanner(System.in);
    
        System.out.println("introduce un numero");
        x = S.nextInt();
    
        if(x > 0 || x < 10)
        /*El simbolo '&&' es equivalente a AND en lógica
        El simbolo '||' es equivalente a OR en lógica*/
        {
            System.out.println("El numero se encuentra entre 0 y 10");
        }
        else
        {
            System.out.println("El numero introducido no esta entre 0 y 10");
        }
    }
    
}
