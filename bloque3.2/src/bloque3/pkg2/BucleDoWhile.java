
package bloque3.pkg2;

import java.util.Scanner;


public class BucleDoWhile {

    public static void main(String[] args) 
    {
        int x,y;
        Scanner S = new Scanner(System.in);    
        
        System.out.println("introduce el primer numero");
        x = S.nextInt();
    
        System.out.println("introduce el segundo numero");
        y = S.nextInt();
        int i;
    
        do
        {
        System.out.print(x+"");
        x++;
        }while(x<=y);
    
    }
    
}
