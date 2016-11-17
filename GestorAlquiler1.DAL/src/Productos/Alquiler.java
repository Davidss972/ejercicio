
package Productos;

public class Alquiler 
{
    String dni;
    String matricula;
    private int fecha;
    private double precio;
    
    public void SetDni(String dni)
    {
        this.dni = dni;
    }
    public String GetDni()
    {
        return dni;
    }
    public void SetMatricula(String matricula)
    {
        this.matricula = matricula;
    }
    public String GetMatricula()
    {
        return matricula;
    }

    public void setFecha(int fecha)
    {
        this.fecha = fecha;
    }
    
    public int getFecha() 
    {
        return fecha;
    }

    public void setPrecio(double precio) 
    {
        this.precio = precio;
    }
    public double getPrecio() 
    {
        return precio;
    }
}
