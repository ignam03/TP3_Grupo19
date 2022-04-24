package ar.edu.unju.fi.ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> listaFrutas = new ArrayList<String>();
		String nameFrutas;
		boolean salir = false;
		String salir1;
		int numEliminarIndi;
		int contador = 0;
		
		Scanner teclado = new Scanner(System.in);

		while (contador < 6) {

			System.out.println("Ingrese otra fruta: ");
			nameFrutas = teclado.nextLine();
			listaFrutas.add(nameFrutas);

			contador +=1;
		}
		
		System.out.println();

		for (int i = 0; i < listaFrutas.size(); i++) {
			if (listaFrutas.indexOf(listaFrutas.get(i)) % 2 == 0) {
				System.out.println(listaFrutas.get(i) + " inidice par");
			}
		}
		
		System.out.println();

		try {
			System.out.println("Ingrese un numero: ");
			numEliminarIndi = teclado.nextInt();
			if (numEliminarIndi >= 0 && numEliminarIndi <= listaFrutas.size()) {
				listaFrutas.remove(numEliminarIndi);
				for(int i = 0; i < listaFrutas.size();i++) {
					System.out.println(listaFrutas.get(i));
				}
				System.out.println("Cantidad de elementos: " + listaFrutas.size());
			}
		} catch (Exception e) {
			System.out.println("Ingreso un numero que esta fuera del rango");
		}
	}

}
