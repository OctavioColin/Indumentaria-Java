package mx.com.ids.Examen.Indumentaria.Util;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import mx.com.ids.Examen.Indumentaria.Entities.AccesorioDetalle;
import mx.com.ids.Examen.Indumentaria.Entities.Articulo;
import mx.com.ids.Examen.Indumentaria.Entities.CalzadoDetalle;
import mx.com.ids.Examen.Indumentaria.Entities.Cliente;
import mx.com.ids.Examen.Indumentaria.Entities.Factura;
import mx.com.ids.Examen.Indumentaria.Entities.FacturaDetalle;
import mx.com.ids.Examen.Indumentaria.Entities.RopaDetalle;

public class FileIndumentaria {
	
	public static void fileArticulos(ArrayList<Articulo> articulos) {
		try {
			File articulosFile = new File("files" + File.separator + "archivoArticulos.txt");
			if(!articulosFile.exists()) {
				articulosFile.createNewFile();
			}
			FileWriter fw = new FileWriter(articulosFile);
			PrintWriter pw = new PrintWriter(fw);
			for (Articulo a : articulos) {
				String linea = Integer.toString(a.getId()) + "|" +
							   a.getCategoria() + "|" + 
							   a.getDescripcion() + "|" +
							   Double.toString(a.getPrecio()) + "|" + 
							   Integer.toString(a.getStock()) + "|" + 
							   Integer.toString(a.getStockMin()) + "|" +
							   Integer.toString(a.getStockMax()) + "|" +
							   Double.toString(a.getCosto()) + "\n";
				pw.write(linea);
			}
			System.out.println("Archivo creado exitosamente.");
			fw.close();
		}catch(Exception e) {
			System.err.println("Error al abrir archivo \'archivoArticulos.txt\'");
			e.printStackTrace();
		}
	} 

	public static void fileAccesoriosDetalles(ArrayList<AccesorioDetalle> accesoriosDetalles) {
		try {
			File accesorioDetalleFile = new File("files" + File.separator + "archivoAccesoriosDetalles.txt");
			if(!accesorioDetalleFile.exists()) {
				accesorioDetalleFile.createNewFile();
			}
			FileWriter fw = new FileWriter(accesorioDetalleFile);
			PrintWriter pw = new PrintWriter(fw);
			for (AccesorioDetalle a : accesoriosDetalles) {
				String linea = Integer.toString(a.getId()) + "|" +
							   Integer.toString(a.getIdArticulo()) + "|" + 
							   a.getTipo() + "|" +
							   a.getColor() + "\n";
				pw.write(linea);
			}
			System.out.println("Archivo creado exitosamente.");
			fw.close();
		}catch(Exception e) {
			System.err.println("Error al abrir archivo \'archivoAccesoriosDetalles.txt\'");
			e.printStackTrace();
		}
	}
	
	public static void fileCalzadosDetalles(ArrayList<CalzadoDetalle> calzadosDetalles) {
		try {
			File calzadoDetalleFile = new File("files" + File.separator + "archivoCalzadosDetalles.txt");
			if(!calzadoDetalleFile.exists()) {
				calzadoDetalleFile.createNewFile();
			}
			FileWriter fw = new FileWriter(calzadoDetalleFile);
			PrintWriter pw = new PrintWriter(fw);
			for (CalzadoDetalle c : calzadosDetalles) {
				String linea = Integer.toString(c.getId()) + "|" +
						   	   Integer.toString(c.getIdArticulo()) + "|" + 
							   c.getTipo() + "|" + 
							   c.getUsabilidad() + "|" +
							   c.getNumero() + "|" + 
							   c.getColor() + "\n";
				pw.write(linea);
			}
			System.out.println("Archivo creado exitosamente.");
			fw.close();
		}catch(Exception e) {
			System.err.println("Error al abrir archivo \'archivoCalzadosDetalles.txt\'");
			e.printStackTrace();
		}
	}
	public static void fileRopaDetalles(ArrayList<RopaDetalle> ropaDetalles) {
		try {
			File ropaDetalleFile = new File("files" + File.separator + "archivoRopaDetalles.txt");
			if(!ropaDetalleFile.exists()) {
				ropaDetalleFile.createNewFile();
			}
			FileWriter fw = new FileWriter(ropaDetalleFile);
			PrintWriter pw = new PrintWriter(fw);
			for (RopaDetalle r : ropaDetalles) {
				String linea = Integer.toString(r.getId()) + "|" +
						   	   Integer.toString(r.getIdArticulo()) + "|" + 
							   r.getTipo() + "|" + 
							   r.getUsabilidad() + "|" +
							   r.getTalle() + "|" + 
							   r.getTemporada() + "|" + 
							   r.getColor() + "\n";
				pw.write(linea);
			}
			System.out.println("Archivo creado exitosamente.");
			fw.close();
		}catch(Exception e) {
			System.err.println("Error al abrir archivo \'archivoRopaDetalles.txt\'");
			e.printStackTrace();
		}
	}
	public static void fileClientes(ArrayList<Cliente> clientes) {
		try {
			File clientesFile = new File("files" + File.separator + "archivoClientes.txt");
			if(!clientesFile.exists()) {
				clientesFile.createNewFile();
			}
			FileWriter fw = new FileWriter(clientesFile);
			PrintWriter pw = new PrintWriter(fw);
			for (Cliente c : clientes) {
				String linea = Integer.toString(c.getId()) + "|" +
							   c.getNombre() + "|" + 
							   c.getApellido() + "|" +
							   Integer.toString(c.getEdad()) + "|" + 
							   c.getDireccion() + "|" + 
							   c.getEmail() + "|" +
							   c.getTelefono() + "|" +
							   c.getTipoDocumento() + "|" +
							   c.getNumeroDocumento() + "\n";
				pw.write(linea);
			}
			System.out.println("Archivo creado exitosamente.");
			fw.close();
		}catch(Exception e) {
			System.err.println("Error al abrir archivo \'archivoClientes.txt\'");
			e.printStackTrace();
		}
	} 
	
	public static void fileFacturas(ArrayList<Factura> facturas) {
		try {
			File facturaFile = new File("files" + File.separator + "archivoFacturas.txt");
			if(!facturaFile.exists()) {
				facturaFile.createNewFile();
			}
			FileWriter fw = new FileWriter(facturaFile);
			PrintWriter pw = new PrintWriter(fw);
			for (Factura f : facturas) {
				String linea = Integer.toString(f.getId()) + "|" +
							   Integer.toString(f.getIdCliente()) + "|" + 
							   Integer.toString(f.getIdArticulo()) + "|" + 
							   Double.toString(f.getPrecio()) + "|" +
							   Integer.toString(f.getCantidad()) + "\n";
				pw.write(linea);
			}
			System.out.println("Archivo creado exitosamente.");
			fw.close();
		}catch(Exception e) {
			System.err.println("Error al abrir archivo \'archivoFacturas.txt\'");
			e.printStackTrace();
		}
	}
	
	public static void fileFacturasDetalles(ArrayList<FacturaDetalle> facturasDetalles) {
		try {
			File facturaDetalleFile = new File("files" + File.separator + "archivoFacturasDetalles.txt");
			if(!facturaDetalleFile.exists()) {
				facturaDetalleFile.createNewFile();
			}
			FileWriter fw = new FileWriter(facturaDetalleFile);
			PrintWriter pw = new PrintWriter(fw);
			for (FacturaDetalle f : facturasDetalles) {
				String linea = Integer.toString(f.getId()) + "|" +
							   Integer.toString(f.getIdFactura()) + "|" + 
							   f.getTipo() + "|" + 
							   Long.toString(f.getNumero()) + "|" +
							   f.getFechaEmision().toGMTString() + "|" +
							   f.getMedioDePago() + "|" +
							   f.getDescripcion() + "\n";
				pw.write(linea);
			}
			System.out.println("Archivo creado exitosamente.");
			fw.close();
		}catch(Exception e) {
			System.err.println("Error al abrir archivo \'archivoFacturasDetalles.txt\'");
			e.printStackTrace();
		}
	}
}
