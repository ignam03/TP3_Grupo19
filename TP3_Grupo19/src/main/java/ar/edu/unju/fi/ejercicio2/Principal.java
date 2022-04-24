package ar.edu.unju.fi.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] guardarNums = new int[10];
		int num;

		System.out.println("Ingrese un numero entre 1-9");
		Scanner teclado = new Scanner(System.in);
		num = teclado.nextInt();

		while (num >= 1 && num <= 9) {
			for (int i = 0; i <= num; i++) {
				System.out.println("Tabla de multiplicar del: " + num);
				for (int j = 0; j <= guardarNums.length;j++ ) {
					System.out.println(i + " * " + j + " = " + i * j);
				}
				
			}
			System.out.println("Desea ingresar otro numero?");
			num = teclado.nextInt();

		}

		System.out.println("Numero fuera de rango");
	}

}
