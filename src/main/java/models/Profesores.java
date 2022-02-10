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

	private void muestraImparte() {
		for (Clases clase : imparte) {
			System.out.println("\t\t" + clase);
		}
	}

	public void imprimeDatos() {
		System.out.println("Profesor:\n\t- Nombre: " + nombre + "\n\t- Imparte:");
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
