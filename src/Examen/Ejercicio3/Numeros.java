package Examen.Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		/**
		 * Declaracion de variables El arraylist se llenara con los multiplos de 7
		 */
		Integer[] numeros = new Integer[10];
		Integer numero;
		Double media = 0d;
		Integer suma = 0;
		ArrayList<Integer> multiplos = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce 10 numeros enteros\n");
		/**
		 * For para llenar el array de numeros
		 */
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el numero " + (i + 1));
			numero = sc.nextInt();
			numeros[i] = numero;
		}
		sc.close();
		/**
		 * Comprobamos cuantos numeros multiplos de 7 hay y vamos sumando todos para
		 * sacar una media
		 */
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 7 == 0)
				multiplos.add(numeros[i]);
			suma += numeros[i];
		}

		/**
		 * Imprimir por pantalla todos los multiplos
		 */
		System.out.println("Hay un total de " + multiplos.size() + " multiplos de 7\n");
		for (int i = 0; i < multiplos.size(); i++) {
			System.out.println("Multiplo numero " + (i + 1) + ": " + multiplos.get(i));
		}
		/**
		 * Calcular media y imprimirla por pantalla
		 */
		media = (((double) suma) / ((double) numeros.length));
		System.out.printf("La media de los numeros es: %.2f", media);
	}

}
