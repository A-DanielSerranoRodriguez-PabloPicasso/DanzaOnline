package mainApp;

import models.Alumnos;
import models.Clases;
import models.Profesores;
import ui.LauncherView;

public class MainApp {

	public static void main(String[] args) {
		for (int i = 0; i < 22; i++) {
			switch ((int) (Math.random() * 6)) {
			case 0:
				utils.Almacen.clases.add(new Clases("Salsa", 3, 59.99));
				break;

			case 1:
				utils.Almacen.clases.add(new Clases("Tacon", 2, 39.99));
				break;

			case 2:
				utils.Almacen.clases.add(new Clases("El robot", 1, 9.99));
				break;

			case 3:
				utils.Almacen.clases.add(new Clases("Free style", 2, 89.99));
				break;

			case 4:
				utils.Almacen.clases.add(new Clases("La conga", 1, 4.99));
				break;

			case 5:
				utils.Almacen.clases.add(new Clases("Flamenco", 3, 44.99));
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
		
		utils.Almacen.alumnos.add(new Alumnos("d", "d", 123456789));

		new LauncherView();
	}

}
