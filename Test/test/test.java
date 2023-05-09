package test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.dominio.Cliente;
import ar.edu.unlam.dominio.ServiceMecanico;
import ar.edu.unlam.dominio.noHayClienteQueAtenderException;

public class test {

	@Test
	public void queSePuedaAñadirUnCliente() {
		ServiceMecanico service = new ServiceMecanico("Raul");
		
		Cliente cliente = new Cliente("Hernan" ,11112222);
		
		service.añadirNuevoCliente(cliente);
		
		Integer valorEsperado = 1;
		Integer valorDevuelto = service.obtenerCantidadDeClientesEnEspera();
		
	assertEquals(valorEsperado, valorDevuelto);
	
	}
	@Test (expected = noHayClienteQueAtenderException.class )
	public void queNoSePuedaAtenderUnClienteSiNoHayClientes() throws noHayClienteQueAtenderException {
		
		ServiceMecanico service = new ServiceMecanico("Raul");
		
		Cliente cliente = new Cliente("Hernan" ,11112222);		
		service.atenderCliente(cliente);
	}
	@Test 
	public void queSePuedaAtenderUnCliente() {
		
		ServiceMecanico service = new ServiceMecanico("Raul");
		Cliente cliente = new Cliente("Hernan" ,11112222);

		
		service.añadirNuevoCliente(cliente);
		try {
			service.atenderCliente(cliente);
		} catch (noHayClienteQueAtenderException e) {

			e.printStackTrace();
		}
		Integer cantidadDeCLientesAtendidos = service.obtenerCantidadDeClienteAtendidos();
	
		assertEquals(cantidadDeCLientesAtendidos, (Integer) 1);
	}
}
