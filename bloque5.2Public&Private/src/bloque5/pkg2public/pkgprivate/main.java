
package bloque5.pkg2public.pkgprivate;

public class main 
{
    public static void main(String[]args)
    {
        libro Libro1 = new libro();
        libro Libro2 = new libro();
        
        Libro1.titulo ="El ultimo deseo";
        Libro2.titulo ="El testamento maya";
        
        System.out.println("El titulo del primer libro es:"+Libro1.titulo);
        System.out.println("El titulo del segundo libro es:"+Libro2.titulo);
    }

}
