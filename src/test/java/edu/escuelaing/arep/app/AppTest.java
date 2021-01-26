package edu.escuelaing.arep.app;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
	
	/**
	 * Esta prueba contiene los valores del caso 1 del Laboratorio en un archivo .txt.
	 */
	@Test
	public void TestCase1() {
		LinkedList lista = new LinkedList();
		String archivo = "testCase1.txt";
		LectorArchivo file = new LectorArchivo();
		lista = file.leerValores(archivo);
		double media = Calculadora.media(lista);
		double desviacionEstandar = Calculadora.desviacionEstandar(lista);
		assertEquals(media, 550.6, 0.0);
		assertEquals(desviacionEstandar, 572.03, 0.0);
	}
	
	/**
	 * Esta prueba contiene los valores del caso 2 del Laboratorio en un archivo .txt.
	 */
	@Test
	public void TestCase2() {
		LinkedList lista = new LinkedList();
		String archivo = "testCase2.txt";
		LectorArchivo file = new LectorArchivo();
		lista = file.leerValores(archivo);
		double media = Calculadora.media(lista);
		double desviacionEstandar = Calculadora.desviacionEstandar(lista);
		assertEquals(media, 60.32, 0.0);
		assertEquals(desviacionEstandar, 62.26, 0.0);
	}

	/**
	 * Esta prueba comprueba que las operaciones sean correctas si los valores son ingresados sin necesidad de un archivo .txt.
	 */
	@Test
	public void CalcularOperaciones() {
		LinkedList lista = new LinkedList();
		lista.add(87.1);
		lista.add(83.1);
		lista.add(11.6);
		lista.add(18.3);
		lista.add(24.2);
		lista.add(23.7);
		lista.add(50.5);
		lista.add(49.3);
		lista.add(22.1);
		lista.add(24.6);
		double media = Calculadora.media(lista);
		double desviacionEstandar = Calculadora.desviacionEstandar(lista);
		assertEquals(media, 39.45, 0.0);
		assertEquals(desviacionEstandar, 27.12, 0.0);
	}
	
	/**
	 * Esta prueba verifica primero que los valores sean ingresados dentro de la LinkedList.
	 */
	@Test
	public void TestAdd() {
		LinkedList lista = new LinkedList();
		lista.add(23);
		lista.add(18);
		assertTrue(lista.longitud() == 2 && lista.buscar(23) && lista.buscar(18));
	}
	
	/**
	 * Esta prueba verifica que si se elimina el valor del primer nodo de la LinkedList.
	 */
	@Test
	public void TestRemove() {
		LinkedList lista = new LinkedList();
		lista.add(69);
		lista.add(33);
		assertEquals(lista.longitud(), 2);
		double valor = lista.removeNodo();
		assertTrue(valor == 69 && lista.longitud() == 1);
		valor = lista.removeNodo();
		assertTrue(valor == 33 && lista.longitud() == 0);
	}
}
