package mx.com.ids.Examen.Indumentaria.Entities;

public class Factura {
	
	private int id, idCliente, idArticulo, cantidad;
	private double precio;
	
	public Factura(int id, int idCliente, int idArticulo, 
			int cantidad, double precio) {
		this.id = id;
		this.idCliente = idCliente;
		this.idArticulo = idArticulo;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
