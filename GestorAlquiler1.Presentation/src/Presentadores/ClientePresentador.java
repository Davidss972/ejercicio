/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentadores;

import Presentadores.Interfaces.IClientePresentador;
import Productos.Cliente;
import Provedor.Interfaces.IClienteProveedor;

/**
 *
 * @author gokud
 */
public class ClientePresentador implements IClientePresentador
{
        private IClienteProveedor clienteProveedor;
       
        
        
        public ClientePresentador(IClienteProveedor Clientep)
        {
            clienteProveedor = Clientep;
        } 
        
        public boolean AñadirCliente(Cliente newCliente)
        {
            Cliente ClienteAAñadir = clienteProveedor.ConseguirCliente(newCliente.GetDni());
            
            if (ClienteAAñadir == null )
                {
                    clienteProveedor.AñadirCliente(newCliente);
                    System.out.println("El cliente ha sido creado");
                    return true;
                }
            else
                {   
                    return false;
                }
            
        }

    
        public boolean BorrarCliente(String dni) 
        {
            Cliente ClienteABorrar = clienteProveedor.ConseguirCliente(dni);
            
            if (ClienteABorrar != null )
                {
                    clienteProveedor.BorrarCliente(ClienteABorrar);
                    System.out.println("El cliente ha sido borrado");
                    return true;
                }
            else
                {
                    return false;
                }
            
          
        }

    
        public boolean ModificarCliente(Cliente modifyCliente) 
        {
            Cliente ClienteAModificar = clienteProveedor.ConseguirCliente(modifyCliente.GetDni());
            
            if (ClienteAModificar != null )
            {
                clienteProveedor.ModificarCliente(modifyCliente);
                return true;
            }
            else
            {
                return false;  
            }
        }  
}
