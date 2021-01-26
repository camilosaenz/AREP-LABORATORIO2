package edu.escuelaing.arep.app;

public class Calculadora {
	
	/**
	 * Este metodo realizara la suma de los valores de cada nodo pertenecientes a la LinkedList.
	 * @param lista - Contiene la LinkedList con los valores de los nodos a evaluar.
	 * @return retorna el valor de la sumatoria de los valores de los nodos de la LinkedList.
	 */
	public static double sumatoria(LinkedList lista) {
		double sumatoria = 0;
		for (int i = 0; i < lista.longitud(); i++) {
			double valor = lista.removeNodo();
			sumatoria = sumatoria + valor;
			lista.add(valor);
		}
		return sumatoria;
	}
	
	/**
	 * Este metodo calculara la media de los valores de cada nodo de la LinkedList.
	 * @param lista - Contiene los valores de los nodos.
	 * @return retorna el valor de la media de los valores con dos deciamales de cada nodo de la LinkedList.
	 */
	public static double media(LinkedList lista) {
		if(lista.longitud() == 0) {
			return 0;
		}else {
			double media = sumatoria(lista) / lista.longitud();
			media = Math.round(media * 100) / 100d;
			return media;
		}
	}
	
	/**
	 * Este metodo calculara la Desviacion Estandar de los valores de cada nodo de la LinkedList.
	 * @param lista - LinkedList que tendra almacenada los valores de cada nodo.
	 * @return retorna la Desviacion Estandar de los valores de cada nodo cond dos decimales.
	 */
	public static double desviacionEstandar (LinkedList lista) {
		if(lista.longitud() < 2) {
			return 0;
		}else {
			double media = media(lista);
			LinkedList linked = lista.iterador((xi)->Math.pow(xi-media, 2));
			double sumatoria = sumatoria(linked);
			double desviacionEstandar = Math.sqrt(sumatoria/(lista.longitud()-1));
			desviacionEstandar = Math.round(desviacionEstandar * 100) / 100d;
			return desviacionEstandar;
		}
	}
}
