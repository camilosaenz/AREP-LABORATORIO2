## INTRODUCCIÓN A SISTEMAS COMPLEJOS JAVA, MAVEN Y GIT
Este laboratorio tiene como objetivo implementar en Java un programa que permita calcular tanto la Media como la Desviación Estandar de un grupo de N números reales, estos estan almacenados en un archivo .txt.
Para la implementacion de estas operaciones se debera usar una LinkedList esta tiene como concepto utilizar una cabeza y unos nodos para poder recorrer la lista, la cabeza tiene un apuntador tanto al primer como al ultimo nodo y luego cada nodo apunto al nodo siguiente ya el ultimo nodo apunta directamente a null, pero es importante aclarar que la LinkedList no debe ser importada de ninguna librería, y el objetivo es implementar una para poder cumplir  con las operaciones especificadas.

## PRERREQUISITOS
Para la realización y Ejecución de este programa es necesario tener los siguiente programas:
* Maven
* GIT
* Java
* Plataforma de Codigo (Eclise, NetBeans, etc...)

## INSTALACIÓN
Para poder descargar e instalar el laboratorio es necesario seguir los siguientes pasos:
1. Abrimos desde nuestros Computadores un Interprete de Comandos (Ejempo: CMD de Windows).
2. nos ubicamos en la carpeta donde se desea descargar el laboratorio.
3. Para descargar el laboratorio utilizamos el siguiente comando desde nuestro Interprete de Comandos:
```
git clone https://github.com/camilosaenz/AREP-LABORATORIO1
```
4. Finalmente ya podemos abrir.

## EJECUTAR

Para poder ejecutar el laboratorio nos ubicamos en el directorio del laboratorio y luego abrimos un Interprete de Comandos y ejecutamos el siguiente comando:
```
mvn package
```

## PRUEBAS

Para poder compilar las pruebas tenemos 2 opciones;
1. La primera es con el Interprete de Comandos y ejecutar el siguiente comando:
```
mvn test
```
2. Y la otra opcion es desde la plataforma de codigo utilizada para abrir el laboratorio y desde allí ejecutar las pruebas utilizando JUnit.

Las pruebas que encontraran en este laboratorio son las siguientes:
* **TestCase1** - Esta prueba abre el archivo testCase1.txt y lo ejecuta.
* **TestCase2** - Esta prueba abre el archivo testCase2.txt y lo ejecuta.
* **CalcularOperaciones** - Esta prueba comprueba el funcionamiento de las operaciones (Media y Desviacion Estandar) pero sin necesidad de abrirlo desde un archiv .txt.
* **TestAdd** - Comprueba que se añadan correctamente los valores de los Nodos a la LinkedList.
* **TestRemove** - Comprueba que se elimina el valor del primer Nodo de la LinkedList.

## DOCUMENTACIÓN
Para poder generar la Documentación del laboratorio es necesario escribir el siguiente comando en el Interprte de Comandos.
```
mvn javadoc:javadoc
```
Para poder abrir los archivos de la Documentacion javadoc, es necesario ir al directorio del proyecto:
```
LABORATORIO1\target\site\apidocs
```

## DESARROLO

Este laboratorio fue construido con las siguiente herramientas:
* [Maven](https://maven.apache.org/)
* [Java](https://www.java.com/es/)
* [GIT](https://git-scm.com/)

## LICENCIA

[Licencia **GNU General Public License v3.0**](https://github.com/camilosaenz/AREP-LABORATORIO1/blob/master/LICENSE)

## DERECHOS DE AUTOR

Programa desarrollado por:
[RUBIAN CAMILO SAENZ RODRIGUEZ](https://github.com/camilosaenz)
