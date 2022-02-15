package mainApp;

import models.Clases;
import models.Profesores;
import ui.LauncherView;

public class MainApp {

	public static void main(String[] args) {
		for (int i = 0; i < 22; i++) {
			switch ((int) (Math.random() * 6)) {
			case 0:
				try {
					utils.Almacen.clases.add(new Clases("Salsa", 3, 59.99));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 1:
				try {
					utils.Almacen.clases.add(new Clases("Tacon", 2, 39.99));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 2:
				try {
					utils.Almacen.clases.add(new Clases("El robot", 1, 9.99));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 3:
				try {
					utils.Almacen.clases.add(new Clases("Free style", 2, 89.99));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 4:
				try {
					utils.Almacen.clases.add(new Clases("La conga", 1, 4.99));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 5:
				try {
					utils.Almacen.clases.add(new Clases("Flamenco", 3, 44.99));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
		}

		utils.Almacen.profesores.add(new Profesores("Paco"));
		utils.Almacen.profesores.add(new Profesores("Mario"));
		utils.Almacen.profesores.add(new Profesores("Sara"));
		utils.Almacen.profesores.add(new Profesores("Antonia"));
		utils.Almacen.profesores.add(new Profesores("Rodrigo"));
		utils.Almacen.profesores.add(new Profesores("Vachenka"));

		for (int i = 0; i < 22; i++)
			utils.Almacen.profesores.get((int) ((Math.random() * utils.Almacen.profesores.size()))).addClase(
					utils.Almacen.clases.get((int) ((Math.random() * utils.Almacen.clases.size()))).copyClases());
		
		utils.Almacen.rellenarClasesDisponibles();
		
		new LauncherView();
	}

}
