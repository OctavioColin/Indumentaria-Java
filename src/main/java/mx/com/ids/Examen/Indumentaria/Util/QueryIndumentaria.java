package mx.com.ids.Examen.Indumentaria.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import mx.com.ids.Examen.Indumentaria.Config.DBConnection;
import mx.com.ids.Examen.Indumentaria.Entities.AccesorioDetalle;
import mx.com.ids.Examen.Indumentaria.Entities.Articulo;
import mx.com.ids.Examen.Indumentaria.Entities.CalzadoDetalle;
import mx.com.ids.Examen.Indumentaria.Entities.Cliente;
import mx.com.ids.Examen.Indumentaria.Entities.Factura;
import mx.com.ids.Examen.Indumentaria.Entities.FacturaDetalle;
import mx.com.ids.Examen.Indumentaria.Entities.RopaDetalle;

public class QueryIndumentaria {
	static Connection con = new DBConnection().connect();
	
	public static ArrayList<Articulo> queryArticulos() {
		ArrayList<Articulo> articulos = new ArrayList<>();
		try {
			String sql = "select * from articulos";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			Articulo articulo;
			while(rs.next()) {
				articulo = new Articulo(rs.getInt("id"),
										rs.getInt("stock"),
										rs.getInt("stockMinimo"),
										rs.getInt("stockMaximo"),
										rs.getDouble("precio"),
										rs.getDouble("costo"),
										rs.getString("categoria"),
										rs.getString("descripcion"));
				articulos.add(articulo);
				}
			for (Articulo a : articulos) {
				System.out.println("---------------------------------------");
				System.out.println("  id: " + Integer.toString(a.getId()));
				System.out.println("  categoria:" + a.getCategoria());
				System.out.println("  descripcion: " + a.getDescripcion());
				System.out.println("  precio: " + Double.toString(a.getPrecio()));
				System.out.println("  stock: " + Integer.toString(a.getStock()));
				System.out.println("  stock minimo: " + Integer.toString(a.getStockMin()));
				System.out.println("  stock maximo: " + Integer.toString(a.getStockMax()));
				System.out.println("  costo: " + Double.toString(a.getCosto()));
				System.out.println("---------------------------------------");
			}
		}catch(SQLException e) {
			System.err.println("Error en la consulta de Articulos.");
			e.printStackTrace();
		}
		return articulos;
	}
	
	public static ArrayList<AccesorioDetalle> queryAccesoriosDetalles() {
		ArrayList<AccesorioDetalle> accesoriosDetalles = new ArrayList<>();
		try {
			String sql = "select * from articulos_accesorios_detalles";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			AccesorioDetalle accesorioDetalle;
			while(rs.next()) {
				accesorioDetalle = new AccesorioDetalle(rs.getInt("id"),
										rs.getInt("idArticulo"),
										rs.getString("tipo"),
										rs.getString("color"));
				accesoriosDetalles.add(accesorioDetalle);
				}
			for (AccesorioDetalle a : accesoriosDetalles) {
				System.out.println("---------------------------------------");
				System.out.println("  id: " + Integer.toString(a.getId()));
				System.out.println("  idArticulo: " + Integer.toString(a.getIdArticulo()));
				System.out.println("  tipo:" + a.getTipo());
				System.out.println("  color: " + a.getColor());
				System.out.println("---------------------------------------");
			}
		}catch(SQLException e) {
			System.err.println("Error en la consulta de ArticulosAccesoriosDetalles.");
			e.printStackTrace();
		}
		return accesoriosDetalles;
	}
	
	public static ArrayList<CalzadoDetalle> queryCalzadosDetalles() {
		ArrayList<CalzadoDetalle> calzadosDetalles = new ArrayList<>();
		try {
			String sql = "select * from articulos_calzados_detalles";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			CalzadoDetalle calzadoDetalle;
			while(rs.next()) {
				calzadoDetalle = new CalzadoDetalle(rs.getInt("id"),
										rs.getInt("idArticulo"),
										rs.getString("tipo"),
										rs.getString("usabilidad"),
										rs.getString("numero"),
										rs.getString("color"));
				calzadosDetalles.add(calzadoDetalle);
				}
			for (CalzadoDetalle c : calzadosDetalles) {
				System.out.println("---------------------------------------");
				System.out.println("  id: " + Integer.toString(c.getId()));
				System.out.println("  idArticulo:" + Integer.toString(c.getIdArticulo()));
				System.out.println("  tipo: " + c.getTipo());
				System.out.println("  usabilidad: " + c.getUsabilidad());
				System.out.println("  numero: " + c.getNumero());
				System.out.println("  color: " + c.getColor());
				System.out.println("---------------------------------------");
			}
		}catch(SQLException e) {
			System.err.println("Error en la consulta de ArticulosCalzadosDetalles.");
			e.printStackTrace();
		}
		return calzadosDetalles;
	}
	
	public static ArrayList<RopaDetalle> queryRopaDetalles() {
		ArrayList<RopaDetalle> ropaDetalles = new ArrayList<>();
		try {
			String sql = "select * from articulos_ropa_detalles";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			RopaDetalle ropaDetalle;
			while(rs.next()) {
				ropaDetalle = new RopaDetalle(rs.getInt("id"),
										rs.getInt("idArticulo"),
										rs.getString("tipo"),
										rs.getString("usabilidad"),
										rs.getString("talle"),
										rs.getString("temporada"),
										rs.getString("color"));
				ropaDetalles.add(ropaDetalle);
				}
			for (RopaDetalle r : ropaDetalles) {
				System.out.println("---------------------------------------");
				System.out.println("  id: " + Integer.toString(r.getId()));
				System.out.println("  idArticulo:" + Integer.toString(r.getIdArticulo()));
				System.out.println("  tipo: " + r.getTipo());
				System.out.println("  usabilidad: " + r.getUsabilidad());
				System.out.println("  talle: " + r.getTalle());
				System.out.println("  temporada: " + r.getTemporada());
				System.out.println("  color: " + r.getColor());
				System.out.println("---------------------------------------");
			}
		}catch(SQLException e) {
			System.err.println("Error en la consulta de ArticulosRopaDetalles.");
			e.printStackTrace();
		}
		return ropaDetalles;
	}
	
	public static ArrayList<Cliente> queryClientes() {
		ArrayList<Cliente> clientes = new ArrayList<>();
		try {
			String sql = "select * from clientes";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			Cliente cliente;
			while(rs.next()) {
				cliente = new Cliente(rs.getInt("id"),
										rs.getInt("edad"),
										rs.getString("nombre"),
										rs.getString("apellido"),
										rs.getString("direccion"),
										rs.getString("email"),
										rs.getString("telefono"),
										rs.getString("tipoDocumento"),
										rs.getString("numeroDocumento"));
				clientes.add(cliente);
				}
			for (Cliente c : clientes) {
				System.out.println("---------------------------------------");
				System.out.println("  id: " + Integer.toString(c.getId()));
				System.out.println("  nombre:" + c.getNombre());
				System.out.println("  apellido: " + c.getApellido());
				System.out.println("  edad: " + Integer.toString(c.getEdad()));
				System.out.println("  direccion: " + c.getDireccion());
				System.out.println("  email: " + c.getEmail());
				System.out.println("  telefono: " + c.getTelefono());
				System.out.println("  tipo de documento: " + c.getTipoDocumento());
				System.out.println("  numero de documento: " + c.getNumeroDocumento());
				System.out.println("---------------------------------------");
			}
		}catch(SQLException e) {
			System.err.println("Error en la consulta de Clientes.");
			e.printStackTrace();
		}
		return clientes;
	}
	
	public static ArrayList<Factura> queryFacturas() {
		ArrayList<Factura> facturas = new ArrayList<>();
		try {
			String sql = "select * from facturas";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			Factura factura;
			while(rs.next()) {
				factura = new Factura(rs.getInt("id"),
										rs.getInt("idCliente"),
										rs.getInt("idArticulo"),
										rs.getInt("cantidad"),
										rs.getDouble("precio"));
				facturas.add(factura);
				}
			for (Factura f : facturas) {
				System.out.println("---------------------------------------");
				System.out.println("  id: " + Integer.toString(f.getId()));
				System.out.println("  idCliente: " + Integer.toString(f.getIdCliente()));
				System.out.println("  idArticulo:" + Integer.toString(f.getIdArticulo()));
				System.out.println("  precio: " + Double.toString(f.getPrecio()));
				System.out.println("  cantidad:" + Integer.toString(f.getCantidad()));
				System.out.println("---------------------------------------");
			}
		}catch(SQLException e) {
			System.err.println("Error en la consulta de Facturas.");
			e.printStackTrace();
		}
		return facturas;
	}
	
	public static ArrayList<FacturaDetalle> queryFacturasDetalles() {
		ArrayList<FacturaDetalle> facturasDetalles = new ArrayList<>();
		try {
			String sql = "select * from facturas_detalles";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			FacturaDetalle facturaDetalle;
			while(rs.next()) {
				facturaDetalle = new FacturaDetalle(rs.getInt("id"),
										rs.getInt("idFactura"),
										rs.getLong("numero"),
										rs.getString("tipo"),
										rs.getString("medioDePago"),
										rs.getString("descripcion"),
										rs.getDate("fechaEmision"));
				facturasDetalles.add(facturaDetalle);
				}
			for (FacturaDetalle f : facturasDetalles) {
				System.out.println("---------------------------------------");
				System.out.println("  id: " + Integer.toString(f.getId()));
				System.out.println("  idFactura: " + Integer.toString(f.getIdFactura()));
				System.out.println("  tipo:" + f.getTipo());
				System.out.println("  numero: " + Long.toString(f.getNumero()));
				System.out.println("  fecha de emision: " + f.getFechaEmision().toGMTString());
				System.out.println("  medio de pago:" + f.getMedioDePago());
				System.out.println("  descripcion:" + f.getDescripcion());
				System.out.println("---------------------------------------");
			}
		}catch(SQLException e) {
			System.err.println("Error en la consulta de FacturasDetalles.");
			e.printStackTrace();
		}
		return facturasDetalles;
	}
}
