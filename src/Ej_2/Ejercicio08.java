package Ej_2;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int opcion = 0;
		float num1, num2, resultado;

		System.out.print("Introduce numero1: ");
		num1 = teclado.nextFloat();
		System.out.print("Introduce numero2: ");
		num2 = teclado.nextFloat();

		System.out.println("Selecciona opcion: ");
		System.out.println("1.suma\n2.resta\n3.multiplica");
		opcion = teclado.nextInt();

		switch (opcion) {
		case 1:
			resultado = num1 + num2;
			break;
		case 2:
			resultado = num1 - num2;
			break;
		case 3:
			resultado = num1 * num2;
			break;
		default:
			resultado = 0;
			System.out.println("Error");
		}
		
		System.out.printf("resultado %.2f", resultado);
		teclado.close();

	}

}
