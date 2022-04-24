package ar.edu.unju.fi.ejercicio6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] listaNum = new int[10];
		int[] listaReverse = new int [10];
		int num;

		try {
			for (int i = 0; i < listaNum.length; i++) {
				System.out.println("Ingrese 10 numeros: ");
				Scanner teclado = new Scanner(System.in);
				num = teclado.nextInt();
				listaNum[i] = num;
			}

			for(int j = listaNum.length-1; j >= 0; j--) {
				listaReverse[j] = listaNum[j];
				System.out.println("Array invertido: " + listaReverse[j]);
			}
		} catch (Exception e) {
			System.out.println("Dato incorrecto");
		}
	}

}
