package ar.com.unpaz.refac;

/**
 * Alumno: Tocon�s Matias.
 *
 */
public class Principal {

	// Se modifica el nombre de la clase Init por otro llamado Principal.
	public static void main(String[] args) {
		
		//Se crea un objeto Suma, en el cual me permitir� llamar dentro de la clase Suma, el m�todo sumarDeEnteros.
		//De esta manera logro una mejor eficiencia dentro de mi Principal y adem�s una lectura m�s comprensibl
		Suma sumar = new Suma();
		sumar.sumaDeEnteros();
	}

}
