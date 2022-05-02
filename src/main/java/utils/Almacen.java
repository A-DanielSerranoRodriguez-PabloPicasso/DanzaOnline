package utils;

import java.util.ArrayList;

import models.Alumnos;
import models.Clases;
import models.Profesores;

/**
 * Class used to store everything needed
 * 
 * @author Daniel Serrano Rodríguez
 *
 */
public class Almacen {
	public static ArrayList<Alumnos> alumnos = new ArrayList<>();
	public static ArrayList<Profesores> profesores = new ArrayList<>();
	public static ArrayList<Clases> clases = new ArrayList<>();
	public static ArrayList<Clases> clasesDisponibles = new ArrayList<>();

	/**
	 * Takes all the classes assigned to all teachers and puts them in an
	 * ArrayList<Clases>
	 */
	public static void rellenarClasesDisponibles() {
		for (int i = 0; i < profesores.size(); i++)
			for (Clases clases : profesores.get(i).getImparte()) {
				clases.setProfesor(profesores.get(i));
				clasesDisponibles.add(clases);
			}
	}
}
