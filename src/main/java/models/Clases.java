package models;

public class Clases {
	private String nombre;
	private int nivel;
	private double precio;

	public Clases(String nombre, int nivel, double precio) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.precio = precio;
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

	private String getNombreNivel() {
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

	@Override
	public String toString() {
		return "Clase de " + nombre + "\n Nivel: " + getNombreNivel() + "\n Precio de " + precio + "€";
	}
}
