package mx.com.ids.Examen.Indumentaria.Entities;

import java.util.Date;

public class FacturaDetalle {
	private int id, idFactura;
	private long numero;
	private String tipo, medioDePago, descripcion;
	private Date fechaEmision;
	
	public FacturaDetalle(int id, int idFactura, 
			long numero, String tipo, String medioDePago, 
			String descripcion,
			Date fechaEmision) {
		this.id = id;
		this.idFactura = idFactura;
		this.numero = numero;
		this.tipo = tipo;
		this.medioDePago = medioDePago;
		this.descripcion = descripcion;
		this.fechaEmision = fechaEmision;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}	
	
}
