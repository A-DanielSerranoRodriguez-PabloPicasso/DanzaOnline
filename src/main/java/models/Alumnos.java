package models;

public class Alumnos {
	private String name, passwd;
	private int tlfn;
	
	public Alumnos(String name, String passwd, int tlfn) {
		this.name = name;
		this.passwd = passwd;
		this.tlfn = tlfn;
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

	@Override
	public String toString() {
		return "Alumno [name=" + name + ", passwd=" + passwd + ", tlfn=" + tlfn + "]";
	}
	
}
