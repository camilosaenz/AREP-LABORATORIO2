package edu.escuelaing.arep.app;

import static spark.Spark.*;
import java.text.DecimalFormat;
import spark.Request;
import spark.Response;

/**
 * Esta Clase es la clase prinsipal y es la escargada de ejecutar todo el proceso.
 *
 */
public class App {
	
	/**
	 * Este metodo sera el encargado de iniciar el proceso, al abrir en el navegador el puerto 4567 (Puerto de Spark).
	 * @param args - Iniciara el Proceso.
	 */
    public static void main( String[] args ){
        port(getPort());
        get("/", (request, response) -> inicio(request, response));
        get("/respuesta", (request, response) -> resultados(request, response));
        
    }
    
    /**
     * Este metodo se encarga de devolver si el puerto registrado esta disponible o no.
     * @return retorna el numero del puerto.
     */
    static int getPort(){
        if(System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    

    
    /**
     * Este metodo se encarga de poner en marcha la pagina de Inicio de la aplicacion web.
     * @param request - Hace la solicitud.
     * @param response - realiza la respuesta.
     * @return retorna la pagina .html que al abrir en un navegador sera la pagina de inicio de la app web.
     */
    public static String inicio(Request request, Response response) {
    	
    	String pageContent
    	
    	= "<!DOCTYPE html>"
                + "<html>"
    			+ "<head>"
                + "<title>Laboratorio 2 - AREP - 2021 - 1 </title>"
    			+ "</head>"
                + "<center>"
                + "<div style=\"padding:12px; width:100%; background:#0C0453; color:white; font-size:300%; position:absolute ; top:0px ; left:0px\">"
        		+ "CALCULADORA: "
        	    + "</div>"
                + "<form action=\"/respuesta\">"
                + "<div style=\"padding:30px; width:96.9%; background:#005a80; color:white; font-size:150%; position:absolute ; top:100px ; left:0px\">"
        		+ "Digite por favor los números que desee agregar a la LinkedList separados por comas."
        	    + "</div>"
        		+ "  <br>"
        		+ "<input style=\"width:74% ; font-size:65% ; position:absolute ; padding: 10px 10px; margin: 8px 0; top:200px ; text-align:center; left:12%\" type=\"text\" name=\"numeros\">"
                + "  <br>"
                + "<input style=\"width: 80%; background-color: #FF0000 ; color: white ; background-color: #FF0000; padding: 14px 20px; margin: 8px 0; border: none; border-radius: 4px; cursor: pointer; font-size:150% ; position:absolute ; top:250px ; text-align:center; left:10%\" type=\"submit\" value=\"Calcular Media y Desviacion Estandar\">"
                + "</form>"
                + "</center>"
                + "</body>"
                + "</html>";
    	
    	return pageContent;
    
    }

    /**
     * Este metodo tiene la pagina de respuestas segun los nuemros ingresados.
     * @param request - Hace la solicitud.
     * @param response - realiza la respuesta.
     * @return retorna - una pagina .html que mostrara los resultados de los numeros ingresados en la pagina anterior.
     */
    public static String resultados(Request request, Response response) {
    	
    	double numero;
    	LinkedList lista = new LinkedList();
    	String numeros = request.queryParams("numeros");
    	String [] result = numeros.split(",");
    	
    	for (String valor : result) {
    		numero = Double.parseDouble(valor);
            lista.add(numero);
        }
    	
    	String[] valores = calcular(lista).split(" ");
    	String pageResponse
    	
    	= "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<title>Laboratorio 2 - AREP - 2021 - 1 </title>"
    			+ "</head>"
                + "<body bgcolor=#11085E>"
                + "<center>"
                + "<div style=\"padding:30px; width:96.9%; background:#11085E; color:white; font-size:300%; position:absolute ; top:0px ; left:0px\">"
        		+ "RESULTADOS"
        	    + "</div>"
        	    + "<div style=\"padding:30px; width:96.9%; background:#005a80; color:white; font-size:150%; position:absolute ; top:100px ; left:0px\">"
        		+ "Los Números que componen la LinkedList son : " + numeros 
        	    + "</div>"
        	    + "<div style=\"padding:30px; width:96.9%; background:#005a80; color:white; font-size:150%; position:absolute ; top:200px ; left:0px\">"
        		+ "La Media del Conjunto de Números es: "
        	    + valores[0]
        	    + "</div>"
                + "<div style=\"padding:30px; width:96.9%; background:#005a80; color:white; font-size:150%; position:absolute ; top:300px ; left:0px\">"
        		+ "La Desviacion Estandar es: "
                + valores[1]
                + "<br><br>"
                + "<form>"
            	+ "<input type=\"button\" value=\"Volver\" onclick=\"history.back()\">"
            	+ "</form>"
            	+ "</div>"
                + "</center>"
                + "</body>"
                + "</html>";
    	
    	return pageResponse;
    }
    
    /**
     * Este metodo se encargara de realizar las operaciones (Media y Desviacion Estandar) y se comunicara con las demas clases para lograr esto.
     * @param lista - Lista que contiene los valores de cada nodo.
     * @return retorna un String con los valores de la Medis y la Desviacion Estandar.
     */
	public static String calcular(LinkedList lista) {
		DecimalFormat forma = new DecimalFormat("#.##");
		double media = Calculadora.media(lista);
	    double desviacionEstandar = Calculadora.desviacionEstandar(lista);
	    return forma.format(media) +" "+ forma.format(desviacionEstandar);
    }
    
}
