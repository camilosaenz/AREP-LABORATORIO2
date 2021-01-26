package edu.escuelaing.arep.app;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

	@Test
	public void verificarMedia() {
		LinkedList lista = new LinkedList();
		lista.add(160);
		lista.add(591);
		lista.add(114);
		lista.add(229);
		lista.add(230);
		lista.add(270);
		lista.add(128);
		lista.add(1657);
		lista.add(624);
		lista.add(1503);
		double media = Calculadora.media(lista);
		double desviacionEstandar = Calculadora.desviacionEstandar(lista);
		assertEquals(media, 550.6, 0.0);
		
	}

}
