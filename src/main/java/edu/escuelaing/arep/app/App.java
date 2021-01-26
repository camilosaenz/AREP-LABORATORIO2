package edu.escuelaing.arep.app;

/**
 * Hello world!
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
	    System.out.print("La Media de la LinkedList es: " + media + "\n");
	    System.out.print("La Desviacion Estandar de la LinkedList es: " + desviacionEstandar);
    }

}
