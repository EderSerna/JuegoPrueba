package Examen.Ejercicio4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrenTest {
	Tren t1=new Tren(0,0,350,39);
	@Test
	public void testTrenLleno() {
		boolean b;
		b=t1.trenLleno(400);
		assertEquals(true, b);
		b=t1.trenLleno(350);
		assertEquals(false, b);
	}

	@Test
	public void testDemasiadoViejo() {
		String cad=t1.demasiadoViejo(39);
		assertEquals("EN CIRCULACION",cad);
		cad=t1.demasiadoViejo(40);
		assertEquals("FUERA DE CIRCULACION", cad);
	}

}
