package ar.com.unpaz.refac;

/**
 * Alumno: Toconás Matias.
 *
 */
public class Principal {

	// Se modifica el nombre de la clase Init por otro llamado Principal.
	public static void main(String[] args) {
		
		//Se crea un objeto Suma, en el cual me permitirá llamar dentro de la clase Suma, el método sumarDeEnteros.
		//De esta manera logro una mejor eficiencia dentro de mi Principal y además una lectura más comprensibl
		Suma sumar = new Suma();
		sumar.sumaDeEnteros();
	}

}
