package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] listaNumero = new int [8];
		int num;
		
		for(int i = 0; i < listaNumero.length;i++) {
			System.out.println("Ingrese un numero");
			Scanner teclado = new Scanner(System.in);
			num = teclado.nextInt();
			listaNumero[i] = num;
		}
		

		for(int j = 0; j < listaNumero.length; j++) {
			if(listaNumero[j] % 2 == 0) {
				System.out.println(listaNumero[j] + " par");
			} else {
				System.out.println(listaNumero[j] + " impar");
			}
		}
	}

}
