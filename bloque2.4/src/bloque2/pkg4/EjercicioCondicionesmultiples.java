
package bloque2.pkg4;

import java.util.Scanner;


public class EjercicioCondicionesmultiples 
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        int hora,min,seg;
        
        System.out.println("introduce la hora");
        hora = S.nextInt();
        System.out.println("Introduce los minutos");
        min = S.nextInt();
        System.out.println("introduce los segundos");
        seg = S.nextInt();
        
        if(hora < 24 && min < 60 && seg < 60 && hora > 0 && min > 0 && seg > 0 )
        {
            seg += 1;
            if(seg == 60)
            {
                min += 1;
                seg = 0;
            }
            if(min == 60)
            {
                hora += 1;
                min = 0;
            }
            if(hora == 24)
            {
                hora += 0;
            }
            System.out.print(hora+":"+min+":"+seg);
        } else 
            {
                System.out.println("la hora introducida es incorrecta");
            }
    }
}
