package ar.edu.unju.fi.ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena ;
		ArrayList<Character> arregloCadena = new ArrayList<Character>();
		
		System.out.println("Ingrese una frase");
		Scanner teclado = new Scanner(System.in);
		cadena = teclado.nextLine();
		StringBuilder str = new StringBuilder();
		
		for(int i = 0; i < cadena.length();i++) {
			arregloCadena.add(cadena.charAt(i));
		}
		
		Collections.reverse(arregloCadena);
		str.append(arregloCadena);
		str.append(" ");
		System.out.println(str);
	
	}

}
