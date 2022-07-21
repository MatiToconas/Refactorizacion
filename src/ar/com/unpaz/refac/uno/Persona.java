/**
 * 
 */
package ar.com.unpaz.refac.uno;

public class Persona {

	//Constructor de Persona para ingresar numeros telefónicos.
	String numeroTelefonico;

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}
		
	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}
	public Persona(String numeroTelefonico) {
		super();
		this.numeroTelefonico = numeroTelefonico;
	}
	
}
