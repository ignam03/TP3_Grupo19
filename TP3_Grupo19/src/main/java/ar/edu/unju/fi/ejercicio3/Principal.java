package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] notas = new double[5];

		Alumno alumno1 = new Alumno();

		System.out.println("Ingrese nombre del alumno: ");
		Scanner teclado = new Scanner(System.in);
		alumno1.setNombre(teclado.nextLine());
		System.out.println("Ingrese apellido del alumno: ");
		alumno1.setApellido(teclado.nextLine());
		try {
			System.out.println("Ingrese libreta universitaria: ");
			alumno1.setLU(teclado.nextInt());

			for (int i = 0; i < notas.length; i++) {
				System.out.println("Ingrese notas: ");
				double num = teclado.nextDouble();
				notas[i] = num;
				alumno1.setNotas(notas[i]);
			}

			System.out.println("Nombre: " + alumno1.getNombre());
			System.out.println("Apellido: " + alumno1.getApellido());
			System.out.println("Libreta Universitaria: " + alumno1.getLU());
			System.out.println("Promedio de nota: " + alumno1.calcularPromedio(notas));
			System.out.println("Nota Maxima: " + alumno1.obtenerNotaMaxima(notas));
			
		} catch (Exception e) {
			System.out.println("Datos incorrectos");
		}

	}

}
