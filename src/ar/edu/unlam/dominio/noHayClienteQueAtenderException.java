package ar.edu.unlam.dominio;

public class noHayClienteQueAtenderException extends Exception {
	
	public noHayClienteQueAtenderException(String msj) {
		super(msj);
	}
	public noHayClienteQueAtenderException() {}
}
