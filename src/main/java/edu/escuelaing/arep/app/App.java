package edu.escuelaing.arep.app;

/**
 * Esta Clase es la clase prinsipal y es la escargada de ejecutar todo el proceso.
 *
 */
public class App {
	
	/**
	 * Este metodo sera el encargado de iniciar el proceso, tenidno el archivo para cargar los datos de cada nodo, el nombre del archivo es (archivo.txt).
	 * @param args - Iniciara el Proceso.
	 */
    public static void main( String[] args ){
    	String archivo = "archivo.txt";
    	LinkedList lista = new LinkedList();
    	LectorArchivo file = new LectorArchivo();
    	lista = file.leerValores(archivo);
		double media = Calculadora.media(lista);
	    double desviacionEstandar = Calculadora.desviacionEstandar(lista);
	    System.out.println("La Media de la LinkedList es: " + media);
	    System.out.println("La Desviacion Estandar de la LinkedList es: " + desviacionEstandar);
    }

}
