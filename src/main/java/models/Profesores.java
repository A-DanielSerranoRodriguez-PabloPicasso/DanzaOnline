package models;

import java.util.ArrayList;

public class Profesores {
	private String nombre;
	private ArrayList<Clases> imparte;

	public Profesores(String nombre) {
		this.nombre = nombre;
		imparte = new ArrayList<Clases>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Clases> getImparte() {
		return imparte;
	}
	
	public void addClase(Clases c) {
		imparte.add(c);
	}

	private void muestraImparte() {
		for (Clases clase : imparte) {
			System.out.println("- " + clase);
		}
	}

	public void imprimeDatos() {
		System.out.println("Profesor " + nombre + "\nImparte:");
		muestraImparte();
	}

	/**
	 * @deprecated Function substituted by 'imprimeDatos', that shows the data
	 *             without returning any strings
	 */
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", imparte=" + imparte + "]";
	}
}
