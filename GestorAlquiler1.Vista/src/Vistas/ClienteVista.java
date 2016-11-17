/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Presentadores.Interfaces.IClientePresentador;
import Productos.Cliente;
import Provedor.ClienteProveedor;
import Provedor.Interfaces.IClienteProveedor;
import Vistas.Interfaces.IClienteVista;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author gokud
 */
public class ClienteVista implements IClienteVista
{
    BufferedReader console;
    IClientePresentador clientePresenter;
    IClienteProveedor clienteProvider;
    ClienteProveedor mostrar = new ClienteProveedor();
    public ClienteVista(IClientePresentador diseño)
    {
    clientePresenter = diseño;
    console = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public Cliente GetClienteDetails() throws IOException//detalles para cuando te hayas metido en cliente.
    {
        Cliente newCLiente = new Cliente();
        String continuamos;
        do{
            newCLiente.SetDni(GetClienteDni());
            System.out.println("introduce el nombre");
            newCLiente.SetNombre(console.readLine());
            System.out.println("introduce los appelidos");
            newCLiente.SetApellidos(console.readLine()); 
            System.out.println("¿Deseea introducir un nuevo cliente(S/N)?");
            continuamos = console.readLine();
            return newCLiente;
           } while (continuamos.startsWith("s") || continuamos.startsWith("S"));    
    }
    public String GetClienteDni() throws IOException//pedir dni
    {
        System.out.println("Introduzca el DNI: ");
    
        return console.readLine();
    }
    public int GetClienteAction() throws IOException//switch 
    {
        
        console.readLine();
        
        int op;
        String menu="";
        Cliente cliente;
            menu="";
            menu+="****** Menú ******\n";
            menu+="1.- Añadir Cliente \n";
            menu+="2.- Borrar Cliente \n";
            menu+="3.- Modificar Cliente \n";
            menu+="4.- Buscar Cliente \n";
            menu+="5.- Mostrar Clientes \n";
            menu+="6.- Salir \n";
            
            System.out.println(menu);
            op=Integer.parseInt(console.readLine());
            
            switch(op)
            {
                case 1:
                cliente = GetClienteDetails();
                clientePresenter.AñadirCliente(cliente);
                if(clientePresenter.AñadirCliente(cliente) == false)
                {
                    
                } 
                    break;
                case 2:
                
                if(clientePresenter.BorrarCliente(GetClienteDni()) == false)
                {
                    System.out.println("El cliente no existe");
                }
                    
                    break;  
                case 3:
                    cliente = GetClienteDetails();
                    clientePresenter.ModificarCliente(cliente);
                    if(clientePresenter.ModificarCliente(cliente) == false)
                    {
                        System.out.println("El cliente ha sido modificado");
                    }
                    break;
                case 4:
                    /*cliente = GetClienteDetails();
                    clientePresenter.BuscarCliente(cliente);
                    if(clientePresenter.BuscarCliente(cliente) == false)
                    break;*/
                case 5:
                    mostrar.mostrarClientes();
                    break;
                case 6:
                    break;
                 
            }
            return op;
        
    }
    public void Run() throws IOException//while bucle
    { 
        while(GetClienteAction() != 6)
        {
        
        }
        
    }
}
