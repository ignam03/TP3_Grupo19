package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lista1 = new int[5];
		int[] lista2 = new int[5];

		int num;
		int num2;

		try {
			for (int i = 0; i < lista1.length; i++) {
				System.out.println("ingrese cincos numeros: ");
				Scanner teclado = new Scanner(System.in);
				num = teclado.nextInt();
				lista1[i] = num;
			}

			System.out.println();

			System.out.println("ingrese otros 5 numeros");
			System.out.println();
			for (int j = 0; j < lista2.length; j++) {
				System.out.println("ingrese cinco numeros: ");
				Scanner teclado = new Scanner(System.in);
				num2 = teclado.nextInt();
				lista2[j] = num2;
			}

			System.out.println(resDiv(lista1, lista2));

		} catch (Exception e) {
			System.out.println("Ingreso otro tipo de dato");
		} 
	}

	public static String resDiv(int[] lista1, int[] lista2) {
		int resultadoDiv = 0;
		int resultadoDiv1 = 0;
		int resultadoDiv2 = 0;
		int resultadoDiv3 = 0;
		int resultadoDiv4 = 0;

		
		resultadoDiv = lista1[0] / lista2[0];
		resultadoDiv1 = lista1[1] / lista2[1];
		resultadoDiv2 = lista1[2] / lista2[2];
		resultadoDiv3 = lista1[3] / lista2[3];
		resultadoDiv4 = lista1[4] / lista2[4];

		return "Resultados de las divisiones: " + resultadoDiv + ", " + resultadoDiv1 + ", " + resultadoDiv2 + ", "+resultadoDiv3 + ", "+ resultadoDiv4;
	}

}
