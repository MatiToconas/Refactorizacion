/**
 * 
 */
package ar.com.unpaz.refac.uno;

import java.util.List;

/**
 * Alumno: Toconás Matias.
 *
 */
public class Profesor  extends Persona{
     
	String nombre;
	int edad;
	//Se agrega la letra "e" en el nombre de la variable "numeroTelefonico".
	String numeroTelefonico;
	List<Prestamo> prestamos;
	
	public Profesor(String numeroTelefonico) {
		super(numeroTelefonico);
	}
	//Se elimina la palabra print en el nombre del metodo para dejarle solamente informaciónPersonal(). 
	//En mi opinión me parece innecesario la palabra print.
	public void informacionPersonal() {
		System.out.println("Nombre : " + nombre);
		System.out.println("Edad : " + edad);
		System.out.println("Telefono : " + numeroTelefonico);
	}
	public void todaLaInformacion() {
		System.out.println("Nombre : " + nombre);
		System.out.println("Edad : " + edad);
		System.out.println("Telefono : " + numeroTelefonico);
		for (Prestamo prestamo : prestamos) {
			System.out.println("Descripcion : " + prestamo.descripcion);
		}
		
	}

}
