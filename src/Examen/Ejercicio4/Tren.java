package Examen.Ejercicio4;

public class Tren {
	private int tipo;
	private int referencia;
	private int asientosOcupados;
	private int aniosActivo;
	
	
	public Tren(int tipo, int referencia, int asientosOcupados, int aniosActivo) {
		super();
		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.aniosActivo = aniosActivo;
	}
	
	
	
	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public int getReferencia() {
		return referencia;
	}


	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}


	public int getAsientosOcupados() {
		return asientosOcupados;
	}


	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}


	public int getAñosActivo() {
		return aniosActivo;
	}


	public void setAñosActivo(int aniosActivo) {
		this.aniosActivo = aniosActivo;
	}
	
	
	
	public boolean trenLleno() {
		boolean b;
		if(this.asientosOcupados>=400)
			b=true;
		else
			b=false;
		
		return b;
	}
	
	public String demasiadoViejo() {
		String cad;
		if(this.aniosActivo >=40)
			cad="FUERA DE CIRCULACION";
		else
			cad="EN CIRCULACION";
		
		return cad;
	}



	@Override
	public String toString() {
		return "Tren [tipo=" + tipo + ", referencia=" + referencia + ", asientosOcupados=" + asientosOcupados
				+ ", aniosActivo=" + aniosActivo + "]";
	}
	
	
	
}
