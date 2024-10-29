/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * @author rbr - 291024
 *
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 291024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int numero;
		Scanner sc = new Scanner(System.in);
		
		//Genero el número aleatorio
		int numAleatorio = (int) (Math.random() * 100) + 1;
		
		do {
			System.out.println("Escriba un número entero: ");
			numero = sc.nextInt();
			
			if(numero>numAleatorio) {
				System.out.println("El número a adivinar es menor.");
			}else if(numero==numAleatorio) {
				
			}else{
				System.out.println("El número a adivinar es mayor.");
			}
		}while (numero!=numAleatorio);
		
		System.out.println("¡¡Felicidades!! Has adivinado el número.");
		
		sc.close();

	}

}
