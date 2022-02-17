package models;

public class Clases {
	private String nombre;
	private int nivel;
	private double precio;
	private boolean participando;
	private Profesores profesor;

	public Clases(String nombre, int nivel, double precio) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.precio = precio;
		this.participando = false;
		this.profesor = null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isParticipando() {
		return participando;
	}

	public void setParticipando(boolean participando) {
		this.participando = participando;
	}

	public Profesores getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesores profesor) {
		this.profesor = profesor;
	}

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
