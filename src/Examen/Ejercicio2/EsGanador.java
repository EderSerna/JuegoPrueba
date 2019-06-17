package Examen.Ejercicio2;

import java.util.Scanner;

public class EsGanador {

	public static void main(String[] args) {
		// Variables
		Double puntos;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero de puntos");
		puntos = sc.nextDouble();

		sc.close();
		if (ganar(puntos))
			System.out.println("Puedes ganar el campeonato");
		else
			System.out.println("Ponte las pilas si quieres ganar");

	}

	/**
	 * Recoge una cantidad de puntos y devuelve true si se cree que es ganador y
	 * false si no
	 * 
	 * @param pt es un int que refleja los puntos que le pasas
	 * @return devuelve true si pt es mayor igual a 70
	 */
	public static boolean ganar(double pt) {
		boolean b;
		if (pt >= 70)
			b = true;
		else
			b = false;

		return b;
	}
}
