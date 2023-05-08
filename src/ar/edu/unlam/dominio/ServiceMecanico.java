package ar.edu.unlam.dominio;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class ServiceMecanico {
	
	private String nombre;
	private List<Cliente> clientesEnEspera;
	private List<Cliente> clientesAtendidos;
	private Reloj reloj;
	
	
	public ServiceMecanico(String nombre) {
		this.nombre = nombre;
		this.clientesEnEspera = new ArrayList<>();
		this.clientesAtendidos = new ArrayList<>();
		this.reloj = new Reloj();
	}
	
	public void añadirNuevoCliente(String nombre,Integer numTelefono) {
	
		
		String fecha = fechaActual();
		Cliente nuevoCliente = new Cliente(nombre, numTelefono,fecha );
		
		this.clientesEnEspera.add(nuevoCliente);
	}
	public Cliente atenderCliente(Cliente cliente) throws noHayClienteQueAtenderException {
		
		if(this.clientesEnEspera.size()==0)
			throw new noHayClienteQueAtenderException();
		if(this.clientesEnEspera.size()!=0) {	
				cliente.setFechaAtencion(fechaActual());
				this.clientesEnEspera.remove(cliente);
				this.clientesAtendidos.add(cliente);
				return cliente;
		}
		return null;
	}
	
	
	
	
	
	private String fechaActual() {
		DateFormat dateFormat = new SimpleDateFormat("MMM d, YYYY, HH:MM:ss");
		
		String fecha = dateFormat.format(Calendar.getInstance().getTime());
		return fecha;
	}
}
