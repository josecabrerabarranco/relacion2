/* Algoritmo que determine si un año dado es bisiesto o no, teniendo en cuenta que son 
 * años bisiestos los múltiplos de 4, excepto los que son también múltiplos de 100 pero no lo son de 400. */

package Ej_2;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int anio;
		String bisiesto = "falso";

		System.out.print("Introduce año: ");
		anio = teclado.nextInt();
		
		if (anio % 4 == 0) {
			bisiesto = "verdadero";
			if ((anio % 100 == 0) && (anio % 400 != 0)) {
				bisiesto = "false";
			}
		}
		System.out.println(bisiesto);
		teclado.close();
	}
}
