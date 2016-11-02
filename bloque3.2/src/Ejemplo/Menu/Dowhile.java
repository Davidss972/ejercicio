/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo.Menu;

import java.util.Scanner;

/**
 *
 * @author gokud
 */
public class Dowhile 
{
    public static void main(String[] args)
    {
        int x;
        Scanner S = new Scanner(System.in);
        
        do
        {
            System.out.println("1.enseñar por pantalla hola");
            System.out.println("2.enseñar numeros entre 5 y 10");
            System.out.println("3.Subscribete a empieza a programar");
            System.out.print("introduce una opcion:");
            x = S.nextInt();
        }while(x > 3 || x < 1);/*mientras x sea mayor que 3 el bucle se repetira, en el caso de que quisieramos hacer un menu
        deberiamos  de poner un numero en el while equivalente a las opciones*/
        switch(x)
        {
            case 1 :
                System.out.println("Hola mundo");
                break;
            case 2 :
                for(int i = 5; i<10;i++)
                {
                    System.out.print(i+"");
                }
                break;
            case 3 :
                System.out.println("Subscribete");
                break;
            default :
                System.out.println("no has introducido nada");
                
        }
    }
}
