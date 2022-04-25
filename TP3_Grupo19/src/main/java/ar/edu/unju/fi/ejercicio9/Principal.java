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
					
					Producto producto = new Producto();
					try {

						System.out.println("Ingrese descripcion del producto: ");
						Scanner teclado2 = new Scanner(System.in);
						String desc = teclado2.nextLine();
						producto.setDescripcion(desc);
						System.out.println();
						System.out.println("Ingrese marca del producto: ");
						producto.setMarca(teclado2.nextLine());
						System.out.println();
						System.out.println("Ingrese codigo del producto: ");
						producto.setCodigo(teclado2.nextInt());
						System.out.println();
						System.out.println("Ingrese precio del producto: ");
						producto.setPrecio(teclado2.nextDouble());
						System.out.println();
						
					} catch (Exception e) {
						System.out.println("Datos incorrectos");
					}
					listaProductos.add(producto);
					System.out.println();
					break;
				case 2:
					for(int i = 0; i < listaProductos.size();i++) {
						System.out.println("Descripcion: " + listaProductos.get(i).getDescripcion());
						System.out.println("Marca: " + listaProductos.get(i).getMarca());
						System.out.println("Codigo: " + listaProductos.get(i).getCodigo());
						System.out.println("Precio: " + listaProductos.get(i).getPrecio());
					}
					System.out.println();
					break;
				case 3:
					double precioSumar ;
					
					System.out.println("Incrementar precios de los productos: ");
					precioSumar = teclado.nextInt();
					for(int i = 0; i < listaProductos.size();i++) {
						double resultadoPreciototal = 0;
						resultadoPreciototal = listaProductos.get(i).getPrecio() + precioSumar;
						System.out.println(resultadoPreciototal);
					}
					break;
				case 4:
					for(int i = 0; i < listaProductos.size();i++) {
						double montoTotal = 0;
						montoTotal = montoTotal + listaProductos.get(i).getPrecio();
						System.out.println(montoTotal);
					}
					System.out.println();
					break;
					
				case 5:
					System.out.println("Fin ");
					salir = true;
					System.out.println();
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
