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
public class ejercicio1 
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        int x,i;
        
        
        System.out.println("introduce un numero");
        x = S.nextInt();
        i = x%2;
        if(i == 0 )
        {
        System.out.println("El numero es par");
        }
        else
        {
        System.out.println("El numero no es par");
        }
    }    
}//no conseguido
