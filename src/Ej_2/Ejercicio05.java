// Dadas dos casillas de un tablero de ajedrez por la fila y columna que ocupan, comprobar si están en la misma fila, 
//	columna, o en la misma diagonal

package Ej_2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		int n1_fila, n1_columna, n2_fila, n2_columna;
				
		System.out.print("Introduce ficha1 fila: ");
		n1_fila = teclado.nextInt();
		System.out.print("Introduce ficha1 columna: ");
		n1_columna = teclado.nextInt();
		System.out.print("Introduce ficha2 fila: ");
		n2_fila = teclado.nextInt();
		System.out.print("Introduce ficha2 columna: ");
		n2_columna = teclado.nextInt();
		
		if ((n1_fila > 8) || (n1_fila < 1) || (n2_fila > 8) || (n2_fila < 1) || 
				(n1_columna > 8) || (n1_columna < 1) || (n2_columna > 8) || (n2_columna < 1)) {
			
			System.out.println("Error en entrada");
			teclado.close();
			return;
		}
		
		if (n1_fila == n2_fila) {
			System.out.println("Las piezas están en la misma fila");
		} else if (n1_columna == n2_columna) {
			System.out.println("Las piezas están en la misma columna");
		} else if (Math.abs(n1_fila-n2_fila) == Math.abs(n1_columna-n2_columna)) {
			System.out.println("Diagonal");
		} else
			System.out.println("Piezas en casillas no relacionadas.");
		
		
		teclado.close();

	}

}
