package models;

import utils.Generic_Clases;

public class Alumnos {
	private String name, passwd;
	private int tlfn;
	private Generic_Clases<Clases> clasesActuales;
	private Generic_Clases<Clases> clasesCompletadas;
	private boolean permiteClases;

	public Alumnos(String name, String passwd, int tlfn) {
		this.name = name;
		this.passwd = passwd;
		this.tlfn = tlfn;
		this.clasesActuales = new Generic_Clases<>();
		this.clasesCompletadas = new Generic_Clases<>();
		this.permiteClases = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getTlfn() {
		return tlfn;
	}

	public void setTlfn(int tlfn) {
		this.tlfn = tlfn;
	}

	public Generic_Clases<Clases> getClasesActuales() {
		return clasesActuales;
	}

	public Generic_Clases<Clases> getClasesAlmacen() {
		return clasesCompletadas;
	}

	public boolean getPermiteClases() {
		return permiteClases;
	}

	public void setPermiteClases(boolean bool) {
		permiteClases = bool;
	}

	@Override
	public String toString() {
		return "Alumno [name=" + name + ", passwd=" + passwd + ", tlfn=" + tlfn + "]";
	}

}
