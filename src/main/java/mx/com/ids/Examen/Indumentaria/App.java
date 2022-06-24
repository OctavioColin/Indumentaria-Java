package mx.com.ids.Examen.Indumentaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import mx.com.ids.Examen.Indumentaria.Util.FileIndumentaria;
import mx.com.ids.Examen.Indumentaria.Util.QueryIndumentaria;


public class App 
{
    public static void main( String[] args )
    {
    	Scanner lector = new Scanner(System.in);
        int option = 10;
        while(option != 0) {
        	System.out.println("---MENU DE OPCIONES---");
        	System.out.println("[1] Consulta Articulos");
        	System.out.println("[2] Consulta Articulos Accesorios Detalles");
        	System.out.println("[3] Consulta Articulos Calzados Detalles");
        	System.out.println("[4] Consulta Articulos Ropa Detalles");
        	System.out.println("[5] Consulta Clientes");
        	System.out.println("[6] Consulta Facturas");
        	System.out.println("[7] Consulta Facturas Detalles");
        	System.out.println("[0] Salir");
        	try {
        		System.out.print("--> ");
        		option = lector.nextInt();
        		switch(option) {
        			case 1:
        				FileIndumentaria.fileArticulos(QueryIndumentaria.queryArticulos());
        				break;
        			case 2:
        				FileIndumentaria.fileAccesoriosDetalles(QueryIndumentaria.queryAccesoriosDetalles());
        				break;
        			case 3:
        				FileIndumentaria.fileCalzadosDetalles(QueryIndumentaria.queryCalzadosDetalles());
        				break;
        			case 4:
        				FileIndumentaria.fileRopaDetalles(QueryIndumentaria.queryRopaDetalles());
        				break;
        			case 5:
        				FileIndumentaria.fileClientes(QueryIndumentaria.queryClientes());
        				break;
        			case 6:
        				FileIndumentaria.fileFacturas(QueryIndumentaria.queryFacturas());
        				break;
        			case 7:
        				FileIndumentaria.fileFacturasDetalles(QueryIndumentaria.queryFacturasDetalles());
        				break;
        			case 0:
        				System.out.println("Programa terminado. Gracias.");
        				break;
    				default:
    					System.out.println("Opción no válida.");
    					break;
        		}
        	
        	}catch (InputMismatchException e){
        		System.err.println("Entrada inválida. Intente nuevamente.");
        		lector.next();
        	}
        }
    }
}
