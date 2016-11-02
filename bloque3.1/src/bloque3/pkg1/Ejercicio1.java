//saber los numeros que hay entre dos numeros introducidos por pantalla
package bloque3.pkg1;

import java.util.Scanner;

public class Ejercicio1 
{
    public static void main(String[] args)
    {
        int x,y,i;
        Scanner S = new Scanner(System.in);
        System.out.println("introduce el primer numero");
        x = S.nextInt();
        System.out.println("introduce el segundo numero");
        y = S.nextInt();
        
        for(i = x;i < y; i++)
        {
            System.out.println(i+"");
        }
    }
}
