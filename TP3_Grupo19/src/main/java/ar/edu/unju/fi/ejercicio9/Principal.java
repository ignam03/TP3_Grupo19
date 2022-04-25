package ar.edu.unju.fi.ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		Scanner teclado = new Scanner(System.in);
		boolean salir = false;
		int op;

		while (!salir) {

			System.out.println("1. Nuevo Producto");
			System.out.println("2. Mostrar todos los Productos	");
			System.out.println("3. Incrementar precios de los Productos");
			System.out.println("4. Mostrar total de todos los Productos");
			System.out.println("5. Fin");

			try {
				System.out.println("Introduce un numero: ");
				op = teclado.nextInt();
				switch (op) {
				case 1:

					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 5:
					System.out.println("Fin ");
					salir = true;
					break;
				default:
					break;
				}

			} catch (Exception e) {
				System.out.println("opcion invalida ");
			}
		}

		System.out.println("Fin del menu");

	}

}
