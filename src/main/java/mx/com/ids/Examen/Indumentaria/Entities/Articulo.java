package mx.com.ids.Examen.Indumentaria.Entities;

public class Articulo {
	private int id, stock, stockMin, stockMax;
	private double precio, costo;
	private String categoria, descripcion;
	
	public Articulo(int id, int stock, int stockMin, 
			int stockMax, double precio, double costo, 
			String categoria, String descripcion) {
		this.id = id;
		this.stock = stock;
		this.stockMin = stockMin;
		this.stockMax = stockMax;
		this.precio = precio;
		this.costo = costo;
		this.categoria = categoria;
		this.descripcion = descripcion;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getStockMin() {
		return stockMin;
	}
	public void setStockMin(int stockMin) {
		this.stockMin = stockMin;
	}
	public int getStockMax() {
		return stockMax;
	}
	public void setStockMax(int stockMax) {
		this.stockMax = stockMax;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
