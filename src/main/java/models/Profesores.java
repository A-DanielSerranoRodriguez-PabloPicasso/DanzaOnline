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

	public int getCantidadClases() {
		return imparte.size();
	}

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
	
	public double getPrecioMedio() {
		double prec=0;
		
		for(Clases clase: imparte)
			prec+=clase.getPrecio();
		
		prec/=imparte.size();
		prec*=100;
		prec=(int)prec/(double)100;
		
		return prec;
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
