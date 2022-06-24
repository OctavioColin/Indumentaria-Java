package mx.com.ids.Examen.Indumentaria.Entities;

public class CalzadoDetalle {
	
	private int id, idArticulo;
	private String tipo, usabilidad, numero, color;
	public CalzadoDetalle(int id, int idArticulo, String tipo, 
			String usabilidad, String numero, String color) {
		this.id = id;
		this.idArticulo = idArticulo;
		this.tipo = tipo;
		this.usabilidad = usabilidad;
		this.numero = numero;
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
	public String getUsabilidad() {
		return usabilidad;
	}
	public void setUsabilidad(String usabilidad) {
		this.usabilidad = usabilidad;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}	

}
