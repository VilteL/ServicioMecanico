package ar.edu.unlam.dominio;
import java.util.*;


public class ServiceMecanico {
	
	private String nombre;
	private List<Cliente> clientesEnEspera;
	private List<Cliente> clientesAtendidos;
	
	public ServiceMecanico(String nombre) {
		this.nombre = nombre;
		this.clientesEnEspera = new ArrayList<>();
		this.clientesAtendidos = new ArrayList<>();
		
	}
	
	public void añadirNuevoCliente(Cliente cliente) {
		
		Long fecha = Reloj.ahora();
		cliente.setFecha(fecha);
		
		this.clientesEnEspera.add(cliente);
	}
	public Cliente atenderCliente(Cliente cliente) throws noHayClienteQueAtenderException {
		
		if(this.clientesEnEspera.size()==0)
			throw new noHayClienteQueAtenderException();
		if(this.clientesEnEspera.size()!=0) {	
				cliente.setFechaAtencion(Reloj.ahora());
				this.clientesEnEspera.remove(cliente);
				this.clientesAtendidos.add(cliente);
				return cliente;
		}
		return null;
	}
	public Long obtenerTiempoMedioDeEsperaDeLosClientesQueAunNoHanSidoAtendidos() {
	
	Long sumaTiempos=0L;	
	Long promedio;
		for (Cliente cliente : clientesEnEspera) {
		sumaTiempos+=(Reloj.ahora()-cliente.getFecha());
		}
	promedio = sumaTiempos/this.clientesEnEspera.size();
		
	return promedio/60000;
	}
	
	public Long obtenerTiempoMedioDeEsperaDeLosClientesAtendidos() {
	
		Long sumaTiempos=0L;	
		Long promedio;
			for (Cliente cliente : clientesEnEspera) {
			sumaTiempos+=(cliente.getFechaAtencion()-cliente.getFecha());
			}
		promedio = sumaTiempos/this.clientesEnEspera.size();
		return promedio/60000;
	}
	
	public Integer obtenerCantidadDeClientesEnEspera() {
		return this.clientesEnEspera.size();
	}
	public Integer obtenerCantidadDeClienteAtendidos() {
		return this.clientesAtendidos.size();
	}
	
	
	
	
}
