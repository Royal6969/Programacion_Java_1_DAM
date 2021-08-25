package Ejer_4_Palabras_Ejer2_v2;

import java.util.Scanner;

public class Prueba_Ejer_4 {

/* 
 * 4. Construye un m�todo calculaInversa que devuelva invertida una lista pasada como par�metro. 
 * A�ade esta opci�n al ejercicio 3.
 * 
 * 3. Realiza un programa equivalente al ejercicio 1 pero en esta ocasi�n, 
 * el programa debe manipular palabras en lugar de n�meros. 
 * A�adir la opci�n de ordenar
 *
 * Ejer 1:
 * Realiza un programa que introduzca 20 valores aleatorios (entre 0 y 100) en un ArrayList 
 * y que luego calcule la suma, la media, el m�ximo y el m�nimo de esos n�meros. 
 */

static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Palabras_v2 palabras = new Lista_Palabras_v2();
		String word;
		
		for(int i=0; i<4; i++) { //voy a pedir 4 palabras para tmp hacer demasiado tedioso las pruebas (play)
			System.out.println((i+1)+" Introduzca una palabra");
			word = sc.next();
			palabras.getObjeto().add(new Palabras_v2(word));
		}
		System.out.println();
		
		//para mostrar
		for(int i=0; i<palabras.getObjeto().size(); i++) {
			System.out.print(palabras.getObjeto().get(i).getPalabra()+" ");
		}
		System.out.println();
		
		palabras.ordenarPalabras();
		
		//para mostrar ahora el resultado de haber ordenado las palabras
		for(int i=0; i<palabras.getObjeto().size(); i++) {
			System.out.print(palabras.getObjeto().get(i).getPalabra()+" ");
		}
		System.out.println();
		
		//para mostrar ahora el resultado AL REV�S
		palabras.calculaInversa();
		
		
	}

}
