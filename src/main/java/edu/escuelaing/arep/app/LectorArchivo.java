package edu.escuelaing.arep.app;

import java.io.BufferedReader;
import java.io.FileReader;

public class LectorArchivo {

	/**
	 * Este metodo sera el encargado de leer los datos de un archivo .txt ubicado en la misma carpeta del Laboratorio, y luego los ira uno a uno agregando a una LinkedList para realizar el proceso de las operaciones. 
	 * @param file - archivo .txt que contiene los datos a ser operados para obtener la media y la desviacion estandar
	 * @return retorna una LinkedList con los valores de cada uno de los nodos.
	 */
	public LinkedList leerValores(String file){
    	try {
    		BufferedReader read = new BufferedReader(new FileReader(file));
    		String linea;
    		LinkedList lista = new LinkedList();
    		while((linea = read.readLine()) != null) {
    			lista.add(Double.parseDouble(linea));
    		}
    		read.close();
    		return lista;
    	}catch(Exception e) {
			System.out.println("Error " + e.getMessage());
		}
		return null;
	}
	
}
