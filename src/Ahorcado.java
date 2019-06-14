import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) throws InterruptedException {
		// VARIABLES
		Integer intentosMaximos = 7;
		Integer contIgual = 0;
		Integer contAci = 0;
		Integer contErr = 0;
		Integer contVictoria = 0;
		char[] palabra = { 'O', 'R', 'N', 'I', 'T', 'O', 'R', 'R', 'I', 'N', 'C', 'O' };
		char letra = ' ';
		String c;
		char[] incognita = new char[palabra.length];
		String secreto = "";
		char[] usadas = new char[intentosMaximos];
		String cUsadas = "";
		Scanner sc = new Scanner(System.in);

		for (int j = 0; j < palabra.length; j++) {
			incognita[j] = '_';
			secreto += " " + incognita[j];
		}

		do {
			do {
				mensaje(secreto, intentosMaximos, contErr, cUsadas);
				System.out.printf("\nIntroduce una letra: ");
				do {
					c = sc.nextLine().trim().toUpperCase();
				} while (c.isEmpty());

				letra = c.charAt(0);
				if (!Character.isLetter(letra)) {
					System.out.println("\n\n\n\n\n\n\n\n\nNO ES UNA LETRA\n\n\n\n\n\n");
					Thread.sleep(3000);
				}
			} while (!Character.isLetter(letra));

			for (int j = 0; j < palabra.length; j++) {
				if (letra == palabra[j]) {
					contAci++;
					incognita[j] = palabra[j];
				}

			}

			secreto = "";
			for (int j2 = 0; j2 < incognita.length; j2++) {
				secreto += " " + incognita[j2];

			}

			if (contAci != 0) {
				contAci = 0;
				contIgual = 0;
				for (int i = 0; i < palabra.length; i++) {
					if (incognita[i] == palabra[i]) {
						contIgual++;
					}
				}
				if (contIgual == palabra.length) {
					contVictoria++;
				}
				System.out.println("\n\n\n\n\n");
			} else {
				contErr++;
				usadas[contErr - 1] = letra;
				cUsadas += " " + usadas[contErr - 1];
				System.out.println("\nLo setinmos, has fallado");
				Thread.sleep(1000);
				System.out.println("\n\n\n\n\n\n\n");
			}

		} while (contErr != intentosMaximos && contVictoria != 1);

		sc.close();

		if (contVictoria > 0) {
			mensaje(secreto, intentosMaximos, contErr, cUsadas);
			System.out.println("\nFELICIDADES\t\tHAS GANADO");
		} else {
			secreto = "";
			for (int i = 0; i < palabra.length; i++) {
				secreto += " " + palabra[i];
			}

			System.out.println("\n\n\n\n\n\n\n\n\nLO SENTIMOS\t\tHAS PERDIDO");
			System.out.println("\nLA PALABRA SECRETA ERA:\t" + secreto);
		}

	}

	public static void mensaje(String secreto, Integer intentosMaximos, Integer contErr, String cUsadas) {
		System.out.println("\t\t================");
		System.out.println("\t\t|-- AHORCADO --|");
		System.out.println("\t\t================");
		System.out.println("======================================================");
		System.out.println("\nPALABRA: " + secreto + " \tINTENTOS RESTANTES: " + (intentosMaximos - contErr));
		System.out.println("\nLETRAS FALLADAS: " + cUsadas);
	}

}
