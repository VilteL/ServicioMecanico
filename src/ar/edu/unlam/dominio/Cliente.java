package ar.edu.unlam.dominio;

public class Cliente {
	
	private String nombre;
	private Integer numTelefono;
	private String fecha;
	private String fechaAtencion;
	
	public String getFechaAtencion() {
		return fechaAtencion;
	}

	public void setFechaAtencion(String fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}

	public Cliente(String nombre, Integer numTelefono,String fecha) {
		this.nombre=nombre; 
		this.numTelefono= numTelefono;
		this.fecha=fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(Integer numTelefono) {
		this.numTelefono = numTelefono;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}
