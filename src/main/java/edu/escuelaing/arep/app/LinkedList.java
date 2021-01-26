package edu.escuelaing.arep.app;

import java.util.function.Function;

/**
 * Esta clase es la encargada de crear, recorrer y realizar las funciones de la LinkedList.
 * @author Camilo
 *
 */
public class LinkedList {
	
	private Nodo nodoInicial;
	private Nodo nodoFinal;
	private int contador;
	
	/**
	 * Constructor de la Clase LinkedList
	 */
	public LinkedList() {
		contador = 0;
	}
	
	/**
	 * Este metodo retornara la cantidad de datos almacenados en la LinkedList.
	 * @return retorna el numero de datos almacenados en la LinkedList.
	 */
	public int longitud() {
		return contador;
	}
	
	/**
	 * Este metodo agregara el valor ingresado en el ultimo nodo, si el primer nodo es vacio lo agrega a este, si no agregara el valor a el siguiente nodo.
	 * @param valorNodo - Valor del nodo a ser agregado.
	 */
	public void add(double valorNodo) {
		Nodo nodo = new Nodo(valorNodo);
		if (nodoInicial == null) {
			nodoInicial = nodo;
		}else {
			nodoFinal.addNodo(nodo);
		}
		nodoFinal = nodo;
		contador = contador + 1;
		
	}
	
	/**
	 * Este metodo devolvera el valor del primer nodo de la LinkedList y luego se posicionara en el siguiente nodo.
	 * @return retorna el valor del nodo Inicial de la LinkedList.
	 */
	public double removeNodo() {
		contador = contador - 1;
		if (contador == 0) {
			nodoFinal = null;
		}
		double valor = nodoInicial.getValor();
		nodoInicial = nodoInicial.getSiguiente();
		return valor;
	}
	
	/**
	 * Este metodo buscara el valor dentro de la LinkedList.
	 * @param valor - Valor a buscar dentro de la LinkedList.
	 * @return retorna si el valor se encuentra en la LinkedList.
	 */
	public boolean buscar(double valor) {
		return nodoInicial.buscarNodo(valor);
	}
	
	/**
	 * Este metodo esta encargado de aplicar sobre cada uno de los valores de cada nodo de la LinkedList una operacion.
	 * @param funcion - Es la operacion a aplicar a cada valor del nodo.
	 * @return retorna la LinkedList ya con la operacion aplicada.
	 */
	public LinkedList iterador(Function<Double, Double> funcion) {
		LinkedList lista = new LinkedList();
		for (int i = 0; i < longitud(); i++) {
			double valor = removeNodo();
			lista.add(funcion.apply(valor));
			add(valor);
		}
		return lista;
	}
	
}
