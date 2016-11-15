/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Proveedor.Vehiculo;
import Modelos.VehiculoDeTurismo;
import Modelos.Furgoneta;
import java.math.BigDecimal;
public class Principal 
{

    public static void main(String[] args)
    {
        VehiculoDeTurismo V1 = new VehiculoDeTurismo("BWM","R8" ,new BigDecimal("180000"), 5);
        System.out.println(V1);
        Furgoneta F1 = new Furgoneta("Citroen", "Partner", new BigDecimal("12000"), new BigDecimal ("8"));
        System.out.println(F1);
    }
    
}
