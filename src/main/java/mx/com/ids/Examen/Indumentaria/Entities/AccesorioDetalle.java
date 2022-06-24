package mx.com.ids.Examen.Indumentaria.Entities;

public class AccesorioDetalle {
	private int id, idArticulo;
	private String tipo, color;
	
	public AccesorioDetalle(int id, int idArticulo, String tipo, String color) {
		this.id = id;
		this.idArticulo = idArticulo;
		this.tipo = tipo;
		this.color = color;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
