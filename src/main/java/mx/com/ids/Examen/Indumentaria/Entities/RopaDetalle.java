package mx.com.ids.Examen.Indumentaria.Entities;

public class RopaDetalle {
	private int id, idArticulo;
	private String tipo, usabilidad, talle, temporada, color;
	public RopaDetalle(int id, int idArticulo, String tipo, 
			String usabilidad, String talle, String temporada,
			String color) {
		this.id = id;
		this.idArticulo = idArticulo;
		this.tipo = tipo;
		this.usabilidad = usabilidad;
		this.talle = talle;
		this.temporada = temporada;
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
	public String getTalle() {
		return talle;
	}
	public void setTalle(String talle) {
		this.talle = talle;
	}
	public String getTemporada() {
		return temporada;
	}
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
