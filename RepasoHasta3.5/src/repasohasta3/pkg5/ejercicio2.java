/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasohasta3.pkg5;

import java.util.Scanner;

/**
 *
 * @author gokud
 */
public class ejercicio2 
{
    public static void main(String[]args)
    {
    
        int x,y,z,max,min;
        Scanner S = new Scanner(System.in);
        System.out.println("introduce el primer numero");
        x = S.nextInt();
        System.out.println("introduce el segundo numero");
        y = S.nextInt();
        System.out.println("introduce el tercer numero");
        z = S.nextInt();
        max = x;
        if( max>y)
        max = y;
        if(max>z)
        max = z;
        System.out.println("el numero menor es:"+max);
        
        min = x;
        if(min<y)
        min = y;
        if(min<z)
        min = z;
        System.out.println("el numero mayor es:"+min);
    }
}
