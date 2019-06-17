package Examen.Ejercicio4;

public class Tren {
	private int tipo;
	private int referencia;
	private int asientosOcupados;
	private int añosActivo;
	
	
	public Tren(int tipo, int referencia, int asientosOcupados, int añosActivo) {
		super();
		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.añosActivo = añosActivo;
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
		return añosActivo;
	}


	public void setAñosActivo(int añosActivo) {
		this.añosActivo = añosActivo;
	}
	
	
	
	public boolean trenLleno(int asiOcu) {
		boolean b;
		if(asiOcu>=400)
			b=true;
		else
			b=false;
		
		return b;
	}
	
	public String demasiadoViejo(int aActivo) {
		String cad;
		if(aActivo >=40)
			cad="FUERA DE CIRCULACION";
		else
			cad="EN CIRCULACION";
		
		return cad;
	}



	@Override
	public String toString() {
		return "Tren [tipo=" + tipo + ", referencia=" + referencia + ", asientosOcupados=" + asientosOcupados
				+ ", añosActivo=" + añosActivo + "]";
	}
	
	
	
}
