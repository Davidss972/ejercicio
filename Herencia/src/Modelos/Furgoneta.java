/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;


import java.math.BigDecimal;
import Proveedor.Vehiculo;

public class Furgoneta extends Vehiculo
{

    BigDecimal capacidad;

    public Furgoneta(String marca, String modelo, BigDecimal precio, BigDecimal capacidad)
    {
        super(marca,modelo,precio);
        this.capacidad = capacidad;
    }
    @Override
    public String toString()
    {
     return super.toString()+""+capacidad;
     
    }
    
}
