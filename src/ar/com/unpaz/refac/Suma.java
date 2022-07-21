package ar.com.unpaz.refac;

/**
 * Alumno: Toconás Matias.
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Suma {
	
	public int sumaDeEnteros()
	{
		int num1 = 0;
		int num2 = 0;
		int resultado = 0;	
		
		//Se modifica el nombre de la variable br por otro llamado numeroEntero.
		BufferedReader numeroEntero = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escribe un numero entero:");
		String entrada = null;
		try {
			entrada = numeroEntero.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		num1 = Integer.valueOf(entrada);	
		System.out.println("Escribe un numero entero:");
		String entrada2 = null;
		try {
			entrada2 = numeroEntero.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		num2 = Integer.valueOf(entrada2);
		resultado = num1 + num2;
		System.out.println("La suma de "+num1+" y "+num2+" es "+resultado);	
		
		//Retorno el resultado de la suma de numeros enteros.
		return resultado;
	}
}
