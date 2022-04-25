package ar.edu.unju.fi.ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio3.Alumno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Alumno> listaAlumnos = new ArrayList<>();

		Scanner teclado = new Scanner(System.in);

		boolean salir = false;
		int opcion;

		while (!salir) {

			System.out.println("1. Nuevo Alumno");
			System.out.println("2. Eliminar Alumno");
			System.out.println("3. Modificar notas del Alumno");
			System.out.println("4. Mostrar todos los Alumnos");
			System.out.println("5. Mostrar los que superan el promedio de 6");
			System.out.println("6. salir");

			try {
				System.out.println("Introduce un numero: ");
				opcion = teclado.nextInt();
				switch (opcion) {
				case 1:
					double[] notas = new double[5];

					Alumno alumno1 = new Alumno();

					try {

						System.out.println("Ingrese nombre del alumno: ");
						Scanner teclado2 = new Scanner(System.in);
						alumno1.setNombre(teclado2.nextLine());
						System.out.println();
						System.out.println("Ingrese apellido del alumno: ");
						alumno1.setApellido(teclado2.nextLine());
						System.out.println();
						System.out.println("Ingrese libreta universitaria: ");
						alumno1.setLU(teclado2.nextInt());
						System.out.println();

						for (int i = 0; i < notas.length; i++) {
							System.out.println("Ingrese notas: ");
							double num = teclado2.nextDouble();
							notas[i] = num;
							alumno1.setNotas(notas[i]);

						}

					} catch (Exception e) {
						System.out.println("Datos incorrectos");
					}
					listaAlumnos.add(alumno1);
					System.out.println();
					break;
				case 2:
					System.out.println("Ingrese lu del alumno que desea eleminar");
					int eliminarLU = teclado.nextInt();

					for (int i = 0; i < listaAlumnos.size(); i++) {
						if (listaAlumnos.get(i).getLU() == eliminarLU) {
							listaAlumnos.remove(listaAlumnos.get(i));
						}
					}
					System.out.println();
					System.out.println("Se elemino correctamente el alumno");
					System.out.println();
					break;
				case 3:
					System.out.println("Ingrese lu del alumno para modificar notas");
					int modiAlumnoLu = teclado.nextInt();
					double[] nuevasNotasA = new double[5];
					for (int i = 0; i < listaAlumnos.size(); i++) {
						if (listaAlumnos.get(i).getLU() == modiAlumnoLu) {
							for (int j = 0; j < nuevasNotasA.length; j++) {
								System.out.println("ingrese nuevas notas: ");
								double nuevasNotas = teclado.nextDouble();
								nuevasNotasA[j] = nuevasNotas;
								listaAlumnos.get(i).setNotas(nuevasNotasA[j]);
							}
						} else {
							System.out.println();
							System.out.println("No se encontre el alumno con esa LU");
						}
					}

					System.out.println();
					break;
				case 4:
					for (int i = 0; i < listaAlumnos.size(); i++) {
						System.out.println("Nombre: " + listaAlumnos.get(i).getNombre());
						System.out.println("Apellido: " + listaAlumnos.get(i).getApellido());
						System.out.println("LU: " + listaAlumnos.get(i).getLU());
						System.out.println("Notas: " + listaAlumnos.get(i).getNotas());
						System.out.println();
					}
					System.out.println();
					break;
				case 5:
					//System.out.println(listaAlumnos.stream().filter(x -> x.calcularPromedio(nuevasNotasA) > 6));
					System.out.println();
					break;
				case 6:
					salir = true;
					break;
				default:
					System.out.println("Opcion no valida");
					salir = true;
					break;
				}
			} catch (Exception e) {
				System.out.println("Opcion invalida");
				salir=true;
			}
		}
		System.out.println("Fin del menu");
	}

}
