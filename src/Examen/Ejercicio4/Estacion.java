package Examen.Ejercicio4;

public class Estacion {

	public static void main(String[] args) {
		int lleno1 = 350, lleno2 = 400;
		int viejo1 = 39, viejo2 = 40;
		Tren t1 = new Tren(0, 0, lleno1, viejo1);
		Tren t2 = new Tren(1, 1, lleno2, viejo2);
		String cad;

		if (t1.trenLleno(lleno1))
			cad = "Tren lleno";
		else
			cad = "Aún quedan asientos";
		System.out.println(t1 + " " + t1.demasiadoViejo(viejo1) + " " + cad);

		if (t2.trenLleno(lleno2))
			cad = "Tren lleno";
		else
			cad = "Aún quedan asientos";
		System.out.println(t2 + " " + t2.demasiadoViejo(viejo2) + " " + cad);
	}

}
