package models;

import java.util.ArrayList;

/**
 * Class that represents teachers
 * 
 * @author Daniel Serrano Rodríguez
 *
 */
public class Profesores {
	private String nombre;
	private ArrayList<Clases> imparte;

	/**
	 * Constructor of the class
	 * 
	 * @param nombre String
	 */
	public Profesores(String nombre) {
		this.nombre = nombre;
		imparte = new ArrayList<Clases>();
	}

	/**
	 * Obtains the name of the teacher
	 * 
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtains the classes of the teacher
	 * 
	 * @return ArrayList<Clases>
	 */
	public ArrayList<Clases> getImparte() {
		return imparte;
	}

	/**
	 * Adds a class to the teacher classes
	 * 
	 * @param c Clases
	 */
	public void addClase(Clases c) {
		imparte.add(c);
	}

	/**
	 * Shows what classes the teachers does
	 */
	private void muestraImparte() {
		for (Clases clase : imparte) {
			System.out.println("- " + clase);
		}
	}

	/**
	 * Obtains how many classes the teacher does
	 * 
	 * @return Int
	 */
	public int getCantidadClases() {
		return imparte.size();
	}

	/**
	 * Obtains the level of the teacher, based on the average level of the teacher's
	 * classes
	 * 
	 * @return String
	 */
	public String getNivelMedio() {
		int contBas = 0, contMed = contBas, contAvz = contBas;

		for (Clases clase : imparte) {
			if (clase.getNivel() == 1)
				contBas++;
			if (clase.getNivel() == 2)
				contMed++;
			if (clase.getNivel() == 3)
				contAvz++;
		}

		if (contBas > contMed && contBas > contAvz)
			return "Basico";
		else if (contMed > contBas && contMed > contAvz)
			return "Medio";
		else if (contAvz > contMed && contAvz > contBas)
			return "Avanzado";
		else
			return "Medio variable";
	}

	/**
	 * Obtains the price of the teacher, based on the average price of the teacher's
	 * classes
	 * 
	 * @return String
	 */
	public double getPrecioMedio() {
		double prec = 0;

		for (Clases clase : imparte)
			prec += clase.getPrecio();

		prec /= imparte.size();
		prec *= 100;
		prec = (int) prec / (double) 100;

		return prec;
	}

	/**
	 * Prints the teacher data
	 */
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
