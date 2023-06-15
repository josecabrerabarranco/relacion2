// Algoritmo que pida dos enteros y que indique el mayor y el menor, o si ambos son iguales. 

package Ej_2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Intro un numero: ");
		int num1 = teclado.nextInt();
		System.out.print("Intro otro numero: ");
		int num2 = teclado.nextInt();
		
		if (num1 < num2) {
			System.out.print("El numero " + num2 + " es mayor que " + num1);
		} else if (num1 > num2) {
			System.out.print("El numero " + num1 + " es mayor que " + num2);
		} else {
			System.out.print("** Los numeros " + num2 + " y " + num2 + " son iguales **");
		}
		
		teclado.close();
		
	}
}



