package ar.edu.unju.fi.ejercicio3;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private int LU;
	private double notas;
	
	
	public Alumno() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getLU() {
		return LU;
	}
	public void setLU(int lU) {
		LU = lU;
	}
	public double getNotas() {
		return notas;
	}
	public void setNotas(double notas) {
		this.notas = notas;
	}
	
	public double calcularPromedio(double [] notas) {
		double promedio = 0;
		
		for(int i = 0; i < notas.length;i++) {
			promedio += notas[i] / notas.length;
		}
		return promedio;
	}

	public double obtenerNotaMaxima(double[]notas) {
		double numMax=0;
		double numMin = 0;
		for(int j = 0; j < notas.length; j++) {
			if(notas[j] > numMax) {
				numMax = notas[j];
			}
		}
		return  numMax ;
	}
}
