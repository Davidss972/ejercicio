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
public class ejercicio3 
{
    public static void main(String[]args)
    {

        double x,y,i;
        char opera;
        Scanner S = new Scanner(System.in);
  
        System.out.print("ingrese el primer numero: ");
        x = S.nextDouble();
  
        do
        {
            System.out.print("ingrese una operacion: ( + , - , * , / )");
            opera = S.next().charAt(0); 
        }while ((opera != '+') && (opera != '-') && (opera != '*') && (opera != '/'));
  
        System.out.print("ingrese el segundo numero: ");
        y = S.nextDouble();
  
        switch (opera)
        {
            case '+':
            i=x+y;
            System.out.print(x+" + "+y+" = "+i);
            break;
            case '-':
            i=x-y;
            System.out.print(x+" - "+y+" = "+i);
            break;
            case '*':
            i=x*y;
            System.out.print(x+" - "+y+" = "+i);
            break;
            case '/':
            i=x/y;
            System.out.print(x+" - "+y+" = "+i);
            break;
        }
    }
} 
        
        
                
       
