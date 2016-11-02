//hacer un programa que pida dos numeros y debe ser mayor que otro
package bloque3.pkg2;

import java.util.Scanner;


public class Ejercicio1 
{
    public static void main(String[] args)
    {
        int x,y;
        Scanner S = new Scanner(System.in);
    
        System.out.println("Introduce el primer numero");
        x = S.nextInt();
    
        
        
        
        do
        {
        System.out.println("Introduce el segundo numero");
        y = S.nextInt();
        }while(x<y);
        
    }
}
