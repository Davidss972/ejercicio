
package Proveedor;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Vehiculo 
{
    private String marca;
    private String modelo;
    private BigDecimal precio;
    
    public Vehiculo(String marca, String modelo, BigDecimal precio)
    {
    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio;
    }

    public String getMarca() 
    {
        return marca;
    }

    
    public void setMarca(String marca) 
    {
        this.marca = marca;
    }


    public String getModelo()
    {
        return modelo;
    }


    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public BigDecimal getPrecio() 
    {
        return precio;
    }

    public void setPrecio(BigDecimal precio)
    {
        this.precio = precio;
    }
        @Override
    public String toString()
    {
        Locale espanna = new Locale("es", "ES");
        NumberFormat fn = NumberFormat.getCurrencyInstance(espanna);
        return marca + " " + modelo + " " + fn.format(precio) + " ";
    }
}
