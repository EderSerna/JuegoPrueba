package Examen.Ejercicio1;

import java.util.Scanner;

public class BoxeadorCategoria {

	public static void main(String[] args) {
		// Variables
		int peso;
		Scanner sc = new Scanner(System.in);

		/**
		 * For en el que se mete el peso de los boxeadores Se controla una exeption al
		 * meter los datos y finaliza el programa si salta
		 */
		for (int i = 1; i <= 30; i++) {
			System.out.println("Introduce el peso del boxeador " + i);
			try {
				peso = sc.nextInt();
				Boxeador b = new Boxeador(i, peso);
				System.out.println(b);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Ha introducido datos sin el formato indicado o fuera de rango");
				System.exit(0);
			}
		}
		sc.close();

	}

}
