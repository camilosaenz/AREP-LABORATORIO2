## INTRODUCCIÓN AL DISEÑO DE SISTEMAS DE COMPUTADORES
Este laboratorio tiene como objetivo implementar en Java un programa que permita calcular tanto la Media como la Desviación Estandar de un grupo de N números reales, estos datos seran dados por cada usuario en la pagina de la aplicacion web de este laboratorio.
Para la implementacion de estas operaciones se debera usar una LinkedList esta tiene como concepto utilizar una cabeza y unos nodos para poder recorrer la lista, la cabeza tiene un apuntador tanto al primer como al ultimo nodo y luego cada nodo apunto al nodo siguiente ya el ultimo nodo apunta directamente a null, pero es importante aclarar que la LinkedList no debe ser importada de ninguna librería, y el objetivo es implementar una para poder cumplir  con las operaciones especificadas.

## PRERREQUISITOS
Para la realización y Ejecución de este programa es necesario tener los siguiente programas:
* Maven
* GIT
* Java
* Heroku
* CircleCI
* Plataforma de Codigo (Eclise, NetBeans, etc...)

## INSTALACIÓN
Para poder descargar e instalar el laboratorio es necesario seguir los siguientes pasos:
1. Abrimos desde nuestros Computadores un Interprete de Comandos (Ejempo: CMD de Windows).
2. nos ubicamos en la carpeta donde se desea descargar el laboratorio.
3. Para descargar el laboratorio utilizamos el siguiente comando desde nuestro Interprete de Comandos:
```
git clone https://github.com/camilosaenz/AREP-LABORATORIO2
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

<img src="https://github.com/camilosaenz/AREP-LABORATORIO1/blob/master/img/Test.PNG?raw=true">

2. Y la otra opcion es desde la plataforma de codigo utilizada para abrir el laboratorio en mi caso Eclipse y desde allí ejecutar las pruebas utilizando JUnit.

<img src="https://github.com/camilosaenz/AREP-LABORATORIO1/blob/master/img/junit.PNG?raw=true">

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
Se puede observar la ejecución del comando:

<img src="https://github.com/camilosaenz/AREP-LABORATORIO1/blob/master/img/javadoc_comand.PNG?raw=true">

Para poder abrir los archivos de la Documentacion javadoc, es necesario ir al directorio del proyecto:
```
LABORATORIO1\target\site\apidocs
```
El directorio debere contener los siguientes archivos:

<img src="https://github.com/camilosaenz/AREP-LABORATORIO1/blob/master/img/directorioJavadoc.PNG?raw=true">

luego de ejecutar el comando y verificar el directorio, podemos abrir los diferentes archivos, tales como "allclasses-index.html"

<img src="https://github.com/camilosaenz/AREP-LABORATORIO1/blob/master/img/javadoc.PNG?raw=true">

## HEROKU

A continuación se podra ver la aplicación web del laboratorio correr desde Heroku con el siguiente link.

[Calculadora Media y Desviación Estandar](https://calculator-arep-rcsr.herokuapp.com/)

## CIRCLECI

Esta aplicación cuenta con todas las restriciones de CircleCI.

 [![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/camilosaenz/AREP-LABORATORIO2)

## DESARROLO

Este laboratorio fue construido con las siguiente herramientas:
* [Maven](https://maven.apache.org/)
* [Java](https://www.java.com/es/)
* [GIT](https://git-scm.com/)
* [Eclipse](https://www.eclipse.org/)
* [Heroku](https://www.heroku.com/)
* [CircleCI](https://circleci.com/)

## LATEX

Este proyecto cuenta con un [archivo](https://github.com/camilosaenz/AREP-LABORATORIO1/blob/master/AREP%20-%20LABORATORIO1.pdf) realizado completamente utilizando LaTeX por medio de la aplicacion [Overleaf](https://www.overleaf.com/project) y ademas cuenta con el [Proyecto.zip](https://github.com/camilosaenz/AREP-LABORATORIO1/blob/master/AREP%20-%20LABORATORIO1%20-%20LATEX.zip) que contiene un archivo.tex que al abrir por cualquier compilador de LaTeX permite ver el documento .pdf realizado.

## LICENCIA

[Licencia **GNU General Public License v3.0**](https://github.com/camilosaenz/AREP-LABORATORIO1/blob/master/LICENSE)

## DERECHOS DE AUTOR

Programa desarrollado por:
[RUBIAN CAMILO SAENZ RODRIGUEZ](https://github.com/camilosaenz)
