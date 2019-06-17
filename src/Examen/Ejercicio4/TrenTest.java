package Examen.Ejercicio4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrenTest {
	Tren t1=new Tren(0,0,350,39);
	
	
	@Test
	public void testTrenLleno() {
		boolean b;
		b=t1.trenLleno();
		assertEquals(true, b);
		b=t1.trenLleno();
		assertEquals(false, b);
	}

	@Test
	public void testDemasiadoViejo() {
		String cad=t1.demasiadoViejo();
		assertEquals("EN CIRCULACION",cad);
		cad=t1.demasiadoViejo();
		assertEquals("FUERA DE CIRCULACION", cad);
	}

}
