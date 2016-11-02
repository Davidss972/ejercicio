//comprobar si un numero daado por teclado es par
package bloque2.pkg1;


import java.util.Scanner;
public class ejercicio 
{//
    public static void main(String[] args)
    {
    int x;
    int i;
    
    Scanner S = new Scanner(System.in);
    
    System.out.print("introduce el valor para el atributo A:");
    x = S.nextInt();
    i = x%2;
    if(i == 0 )
        {
        System.out.println("el numero es par");
        }
    else
        {
        System.out.println("el numero no es par");
        }
    }
}
