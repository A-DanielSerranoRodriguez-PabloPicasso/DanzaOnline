package models;

import utils.Generic_Clases;

/**
 * Class that represents the students of the classes
 * 
 * @author Daniel Serrano Rodríguez
 *
 */
public class Alumnos {
	private String name, passwd;
	private int tlfn;
	private Generic_Clases<Clases> clasesActuales;
	private boolean permiteClases;

	/**
	 * Constructor of the class
	 * 
	 * @param name   String
	 * @param passwd String
	 * @param tlfn   Integer
	 */
	public Alumnos(String name, String passwd, int tlfn) {
		this.name = name;
		this.passwd = passwd;
		this.tlfn = tlfn;
		this.clasesActuales = new Generic_Clases<>();
		this.permiteClases = true;
	}

	/**
	 * Obtains the name of the user
	 * 
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Obtains the password of the user
	 * 
	 * @return String
	 */
	public String getPasswd() {
		return passwd;
	}

	/**
	 * Obtains the phone of the user
	 * 
	 * @return Int
	 */
	public int getTlfn() {
		return tlfn;
	}

	/**
	 * Obtains the classes of the user
	 * 
	 * @return Generic_Clases<Clases>
	 */
	public Generic_Clases<Clases> getClases() {
		return clasesActuales;
	}

	/**
	 * Obtains if the user can add more classes
	 * 
	 * @return Boolean
	 */
	public boolean getPermiteClases() {
		return permiteClases;
	}

	/**
	 * Changes if the user can add more classes
	 * 
	 * @param bool True, false
	 */
	public void setPermiteClases(boolean bool) {
		permiteClases = bool;
	}

	@Override
	public String toString() {
		return "Alumno [name=" + name + ", passwd=" + passwd + ", tlfn=" + tlfn + "]";
	}

}
