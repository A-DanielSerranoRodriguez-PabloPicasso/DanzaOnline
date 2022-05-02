package models;

/**
 * Class that represents the classes that the students can be in and teachers do
 * 
 * @author Daniel Serrano Rodríguez
 *
 */
public class Clases {
	private String nombre;
	private int nivel;
	private double precio;
	private boolean participando, comprada;
	private Profesores profesor;

	/**
	 * Constructor of the class
	 * 
	 * @param nombre String
	 * @param nivel  Int
	 * @param precio Double
	 */
	public Clases(String nombre, int nivel, double precio) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.precio = precio;
		this.comprada = false;
		this.participando = false;
		this.profesor = null;
	}

	/**
	 * Obtains the name of the class
	 * 
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtains the level of the class
	 * 
	 * @return Int
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * Obtains the price of the class
	 * 
	 * @return Double
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Obtains if the class has someone in
	 * 
	 * @return Boolean
	 */
	public boolean isParticipando() {
		return participando;
	}

	/**
	 * Sets if someone is participating or not
	 * 
	 * @param participando True or false
	 */
	public void setParticipando(boolean participando) {
		this.participando = participando;
	}

	/**
	 * Obtains if someone bought the class
	 * 
	 * @return Boolean
	 */
	public boolean isComprada() {
		return comprada;
	}

	/**
	 * Sets if someone has bought it or not
	 * 
	 * @param comprada True or false
	 */
	public void setComprada(boolean comprada) {
		this.comprada = comprada;
	}

	/**
	 * Obtains the teacher that imparts the class
	 * 
	 * @return
	 */
	public Profesores getProfesor() {
		return profesor;
	}

	/**
	 * Sets what teacher does the class
	 * 
	 * @param profesor Profesores
	 */
	public void setProfesor(Profesores profesor) {
		this.profesor = profesor;
	}

	/**
	 * Obtains the name of how hard the class is
	 * 
	 * @return String
	 */
	public String getNombreNivel() {
		switch (nivel) {
		case 1:
			return "Basico";

		case 2:
			return "Medio";

		case 3:
			return "Profesional";

		default:
			return "Nivel erroneo";
		}
	}

	/**
	 * Gives us a copy of the classes
	 * 
	 * @return Object 'Clases'
	 */
	public Clases copyClases() {
		try {
			Clases c = new Clases(nombre, nivel, precio);
			c.participando = this.participando;
			c.profesor = this.profesor;
			return c;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String toString() {
		return "Clase de " + nombre + ":\n\t-Nivel: " + getNombreNivel() + "\n\t-Precio de " + precio
				+ "\n\t-Profesor: " + getProfesor().getNombre();
	}
}
