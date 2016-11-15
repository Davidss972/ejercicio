/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.math.BigDecimal;
import Proveedor.Vehiculo;
/**
 *
 * @author gokud
 */
public class VehiculoDeTurismo extends Vehiculo
{
    int numeroDePlazas;
    public VehiculoDeTurismo(String marca, String modelo,
                             BigDecimal precio, int numeroDePlazas)
    {
        super(marca, modelo, precio);
        this.numeroDePlazas = numeroDePlazas;
    }
    
    public String toString()
    {
        return super.toString()+""+numeroDePlazas;
    }
        public int getNumeroDePlazas() {
        return numeroDePlazas;
    }

    /**
     * @param numeroDePlazas the numeroDePlazas to set
     */
    public void setNumeroDePlazas(int numeroDePlazas) {
        this.numeroDePlazas = numeroDePlazas;
    }
}
