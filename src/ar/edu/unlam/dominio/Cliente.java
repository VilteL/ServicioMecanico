package ar.edu.unlam.dominio;


public class Cliente {
	
	private String nombre;
	private Integer numTelefono;
	private Long fecha;
	private Long fechaAtencion;
	


	public Cliente(String nombre, Integer numTelefono) {
		this.nombre=nombre; 
		this.numTelefono= numTelefono;
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

	public Long getFecha() {
		return fecha;
	}

	public void setFecha(Long fecha) {
		this.fecha = fecha;
	}

	public Long getFechaAtencion() {
		return fechaAtencion;
	}

	public void setFechaAtencion(Long fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}

	

	
	
}
