//ejercicio que al dar un numero del 1 al 7 te diga el dia de la semana
package repasohasta3.pkg5;

import java.util.Scanner;
public class ejercicio4 
{
    public static void main(String[]args)
    {
        Scanner S = new Scanner(System.in);
        int x;
        System.out.println("introduce un numero:");
        x = S.nextInt();
    
        switch(x)
        {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;                
            case 5:
                System.out.println("viernes");
                break; 
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;      
            default :
                System.out.println("el numero no corresponde a ningun dia de la semana");
            
        }   
    
    
    }
}
