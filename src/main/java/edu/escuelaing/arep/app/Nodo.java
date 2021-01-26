package edu.escuelaing.arep.app;

/**
 * Clase Nodo, esta clase es importante ya que de esta clase se obtendran los valores y se podra conocer la posición de los nodos en la LinkedList.
 * @author Camilo
 *
 */
public class Nodo {
	
	private double valor;
	private Nodo siguiente;

	/**
	 * Constructor de la Clase Nodo
	 * @param valor - Este contiene el que sera el valor para cada uno de los nodos de la LinkedList.
	 */
	public Nodo (double valor) {
		this.valor = valor;
	}
	
	/**
	 * Este metodo retorna el valor del nodo.
	 * @return retorna el valor del nodo.
	 */
	public double getValor() {
		return valor;
	}
	
	/**
	 * Este metodo retorna el apuntador del siguiente nodo.	
	 * @return el valor del siguiente nodo.
	 */
	public Nodo getSiguiente() {
		return siguiente;
	}

	/**
	 * Este metodo cambia el apuntador a el siguiente nodo.
	 * @param siguiente - Este contiene el valor del siguiente nodo.
	 */
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	/**
	 * Este metodo guardara el valor del nodo al final de la lista.
	 * @param nodo - Este contiene el nodo actual.
	 */
	public void addNodo(Nodo nodo) {
		if (siguiente == null) {
			siguiente = nodo;			
		}else {
			siguiente.addNodo(nodo);
		}
	}
	
	/**
	 * Este metodo buscara si el valor ingresado es el del nodo en el que este apuntando o el valor del siguiente nodo
	 * @param valorNodo - Contiene el valor del nodo a ser buscado en la lista.
	 * @return retorna un booleano si el valor ingresado corresponde a el nodo en el que este apuntado o a el valor del siguiente nodo.
	 */
	public boolean buscarNodo(double valorNodo) {
		if (siguiente == null) {
			return valor == valorNodo;
		}else {
			return valorNodo == valor || siguiente.buscarNodo(valorNodo);
		}
	}
	
}
