// Algoritmo que pida 3 números e indique cual es el menor de los tres

package Ej_2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n_menor;

		System.out.print("Intro un numero: ");
		int num1 = teclado.nextInt();
		System.out.print("Intro otro numero: ");
		int num2 = teclado.nextInt();
		System.out.print("Intro un tercer numero: ");
		int num3 = teclado.nextInt();

		if (num1 <= num2 && num2 <= num3) {
			n_menor = num1;
		} else if (num1 <= num2 && num1 >= num3) {
			n_menor = num3;
		} else {
			n_menor = num2;
		}

		System.out.print("El numero menor es " + n_menor);

		teclado.close();

	}
}
