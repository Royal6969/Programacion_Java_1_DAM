package Ejer_10_ComparadorLongitud;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ejercicio_10 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//ARIBUTOS
		SortedSet<String> Diccionario = new TreeSet<String>();
		SortedSet<String> newDiccionario = new TreeSet<String>(new Comparador_Longitud());

		int opcion;
/*
 * 9. Implemente una clase llamada Ejercicio10 que tenga los m�todos siguientes:
 */ 		
		do {
			System.out.println("Introduzca una opci�n del men�");
			System.out.println("1. m�todo a�adirPalabras");
			System.out.println("2. m�todo mostrarSubconjunto");
			System.out.println("3. m�todo mayoresOigualesQue");
			System.out.println("4. m�todo menoresQue");
			System.out.println("0. Salir");
		
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				a�adirPalabras(newDiccionario);
				System.out.println();
				break;
				
			case 2:
				mostrarSubconjunto(newDiccionario);
				System.out.println();
				break;
				
			case 3:
				mayoresOigualesQue(newDiccionario);
				System.out.println();
				break;
				
			case 4:
				menoresQue(newDiccionario);
				System.out.println();
				break;
				
			case 0:
				System.out.println("Gracias y hasta luego!");
				System.out.println();
				break;
			}
			
			
		}while(opcion!=0);
		
	}

	//M�TODOS
	
	public static void a�adirPalabras(SortedSet<String> newDiccionario) {
/*
 * a. Un m�todo a�adirPalabras que reciba como par�metro un conjunto ordenado y a�ada cadenas a este conjunto. 
 * Las cadenas se leer�n por teclado y el bucle estar� controlado por una variable booleana tambi�n le�da por teclado.
 */ 
		Scanner sc = new Scanner(System.in);
		
		boolean salir = false;
		
		do {
			String p1;
			System.out.println("Introduzca una palabra... escriba NO para salir");
			p1 = sc.next();
			
			if(p1.equalsIgnoreCase("NO")) {
				salir = true;
			}else {
				newDiccionario.add(p1);
			}
			
		}while(salir==false);
	}
	
	public static void mostrarSubconjunto(SortedSet<String> newDiccionario){	
/*
 * b. Un m�todo mostrarSubconjunto que reciba un conjunto ordenado de objetos de la clase String como par�metro 
 * y muestre en la pantalla el subconjunto de cadenas comprendidas entre dos cadenas le�das por el teclado. 
 * Para poder mostrar el subconjunto, la cadena primera tiene que ser menor que la segunda, 
 * si no, se eleva una excepci�n de tipo IllegalArgumentException que se debe capturar.
 */
		Scanner sc = new Scanner(System.in);

		String p1;
		System.out.println("Escriba una palabra del conjunto de antes");
		p1 = sc.next();
		String p2;
		System.out.println("Escriba otra palabra del conjunto de antes");
		p2 = sc.next();
		
		try{
			Comparador_Longitud test1 = new Comparador_Longitud();
			
			if(test1.compare(p1, p2)>0) {
				throw new PalabrasException();
			}else {
				System.out.println(newDiccionario.subSet(p1, p2));
			}
		}catch(PalabrasException ex){
			System.out.println(ex.toString());
		}
		
		
		
	}
	public static void mayoresOigualesQue(SortedSet<String> newDiccionario) {
/*
 * c. Un m�todo mayoresOigualesQue que reciba un conjunto ordenado de objetos de la clase String como par�metro 
 * y muestre en la pantalla las cadenas del conjunto mayores o iguales a una cadena le�da por el teclado.
 */
		Scanner sc = new Scanner(System.in);
		String p1;
		System.out.println("Escriba una palabra del conjunto de antes");
		p1 = sc.next();
		
		if(newDiccionario.contains(p1)) {
			System.out.println(newDiccionario.tailSet(p1));
		}else {
			System.out.println("Esa palabra no se haya en el conjunto de palabras");
		}
		
	}

	public static void menoresQue(SortedSet<String> newDiccionario) {	
 /* 
 * d. Un m�todo menoresQue que reciba un conjunto ordenado de objetos de la clase String como par�metro 
 * y muestre en la pantalla las cadenas del conjunto menores estrictamente que una cadena le�da por el teclado.
 */ 
		
		Scanner sc = new Scanner(System.in);
		String p1;
		System.out.println("Escriba una palabra del conjunto de antes");
		p1 = sc.next();
		
		if(newDiccionario.contains(p1)) {
			System.out.println(newDiccionario.headSet(p1));
		}else {
			System.out.println("Esa palabra no se haya en el conjunto de palabras");
		}
	}
	
/* 
 * e. Un m�todo main en el que se cree un conjunto ordenado llamado newDiccionario  
 * y se prueben los m�todos anteriores. 
 * Adem�s mu�strese en la pantalla el tama�o del newDiccionario, 
 * la primera y �ltima cadena del newDiccionario 
 * y el comparador con el que est�n ordenadas las cadenas que forman parte de �l.
 */


}
