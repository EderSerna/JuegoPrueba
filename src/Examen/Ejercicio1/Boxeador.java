package Examen.Ejercicio1;

public class Boxeador {
	/**
	 * Declaracion de variables La categoria se calculara automaticamente segun se
	 * cree el boxeador
	 */
	private int id;
	private int peso;
	private String categoria;

	/**
	 * Contrustor con 2 parametros
	 * 
	 * @param id
	 * @param peso
	 */
	public Boxeador(int id, int peso) {
		this.id = id;
		this.peso = peso;
		this.categoria = calcularCategoria(peso);
	}

	/**
	 * Metodo que recoge el peso y calcula su categoria
	 * 
	 * @param peso
	 * @return
	 */
	private String calcularCategoria(int peso) {
		String cat;
		if (peso > 90)
			cat = "pesado";
		else if (peso >= 65)
			cat = "medio";
		else if (peso >= 58)
			cat = "ligero";
		else if (peso >= 52)
			cat = "pluma";
		else
			cat = "mosca";

		return cat;

	}

	@Override
	public String toString() {
		return "Boxeador [peso=" + peso + ", catgoria=" + categoria + "]";
	}

	// getters & setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
