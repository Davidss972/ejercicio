/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloque2.pkg3;

/**
 *
 * @author gokud
 */
public class Switch 
{
    public static void main(String[] arg)
    {
        char letra;
        
        letra = 'a';
        
        switch(letra)
        {
            case 'b':
                System.out.println("el valor es b");
                break;
            case 'a'://si queremos que solo se ejecute uno deberemos de poner break
                System.out.println("el valor es a");
                break;//si queremos que se ejecute desde el valor hasta abajo no pondremos el break como en el case d y 3.
            case 'd':
                System.out.println("el valor es c");
            case '3':
                System.out.println("el valor es p");
            
                
            default:
                System.out.println("el valor no existe");
        }
    }
}
