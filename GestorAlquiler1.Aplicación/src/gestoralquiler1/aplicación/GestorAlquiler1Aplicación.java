
package gestoralquiler1.aplicación;

import Presentadores.ClientePresentador;
import Presentadores.CochePresentador;
import Presentadores.Interfaces.IClientePresentador;
import Presentadores.Interfaces.ICochePresentador;
import Provedor.ClienteProveedor;
import Provedor.CocheProveedor;
import Provedor.Interfaces.IClienteProveedor;
import Provedor.Interfaces.ICocheProveedor;
import Vistas.ClienteVista;
import Vistas.CocheVista;
import Vistas.Interfaces.IClienteVista;
import Vistas.Interfaces.ICocheVista;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GestorAlquiler1Aplicación 
{

    public static void main(String[] args) throws IOException 
    {
        BufferedReader console;
        console = new BufferedReader(new InputStreamReader(System.in));
        console.readLine();
        int op;
        String menu=";";
        do{
            menu="";
            menu+="****** Menú ******\n";
            menu+="1.- Añadir Clientes \n";
            menu+="2.- Añadir Coches \n";
            menu+="3.- Añadir Alquileres \n";
            menu+="4.- Salir \n";
            
            System.out.println(menu);
            op=Integer.parseInt(console.readLine());//hacer un try catch para capturar la excepcion de poner enter
            switch(op)
            {
                case 1:
                    IClienteProveedor clienteproveedor = new ClienteProveedor();
                    IClientePresentador clientepresentador = new ClientePresentador(clienteproveedor);
                    IClienteVista clientsview =  new ClienteVista(clientepresentador);
                    clientsview.Run();
                   
                    break;
                case 2:
                    ICocheProveedor cocheproveedor = new CocheProveedor();
                    ICochePresentador cochepresentador = new CochePresentador(cocheproveedor);
                    ICocheVista cochevista = new CocheVista(cochepresentador);
                    cochevista.Run();
                    break;  
                case 3 :
                    
                    break;
                case 4 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("introduzca una opcion");
                    break;
                        
            }
        }while(op!=4);
        
        
        
    }
    
}
