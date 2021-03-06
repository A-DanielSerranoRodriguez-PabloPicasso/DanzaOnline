package ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import models.Alumnos;
import models.Clases;
import models.Profesores;

/**
 * Main view of the classes available
 * 
 * @author Daniel Serrano Rodríguez
 *
 */
public class MainView {
	private Alumnos usuario;
	private int page = 0;

	private JFrame frame;
	private JPanel panelTitle;
	private Component hgTitle_1;
	private Component hgTitle_2;
	private JLabel lblTitle;
	private JPanel panelViews;
	private Box hbTitle;
	private Component vsTitle_1;
	private Box hbViews;
	private Box vbViews;
	private Component vgViews;
	private JButton btnProfs;
	private Component vgViews_1;
	private JButton btnClases;
	private Component vgViews_2;
	private Component horizontalStrut;
	private JPanel panelMain;
	private JPanel panelUser;
	private Box vbPanelUser;
	private Component hsPanelUser_1;
	private JButton btnConfig;
	private Component vsPanelUser_1;
	private Component vgPanelUser_1;
	private JButton btnClasesActivas;
	private Component vgPanelUser_2;
	private JPanel panelTeacherClass;
	private JButton btnBack;
	private JButton btnFront;
	private Component vsdynamic_2;
	private Box hbButtons;
	private JPanel panelTeachers;
	private JLabel lblPagina;
	private Component vsdynamic_1;
	private JPanel panelShow;
	private JPanel panelClasses;
	private Component verticalStrut;
	private JPanel panelUserClasses;
	private JPanel panelTopClass;
	private Box horizontalBox;
	private Component hgTopActive_1;
	private JLabel lblActualClass;
	private Component hgTopActive_2;
	private JButton btnReturnFromClass;
	private JPanel panelTheClasses;
	private JButton btnClassBack;
	private JButton btnClassFront;
	private JPanel panelConfig;
	private JButton btnReturnFromConfig;
	private JPanel panelTopConfig;
	private Component hgConfig_1;
	private JLabel lblConfig;
	private Component hgConfig_2;
	private JPanel panelMidConfig;
	private Component vgMidConfig_1;
	private Component vgMidConfig_3;
	private Box hbMidConfig_2;
	private Component hgHBmid;
	private JButton btnBorrarCuenta;
	private Component hgHBmid_3;
	private Component vgMidConfig;
	private Box hbMidConfig_1;
	private Component hbHBmid;
	private Component hbHBmid_3;
	private Component hsHBmid;
	private Component hsHBmid_1;
	private JLabel lblNombre;
	private JLabel lblContra;
	private JLabel lblTlfn;
	private Component vgPanelUser_3;
	private JButton btnExit;

	/**
	 * Create the application.
	 */
	public MainView(Alumnos usuario) {
		this.usuario = usuario;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setMinimumSize(new Dimension(800, 500));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setUIcomponents();
		setUIbehaviour();
	}

	/**
	 * Initializes the components of the frame
	 */
	private void setUIcomponents() {
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		panelMain = new JPanel();
		frame.getContentPane().add(panelMain, "name_26800433875065");
		panelMain.setLayout(new BorderLayout(0, 0));
		panelTitle = new JPanel();
		panelMain.add(panelTitle, BorderLayout.NORTH);
		panelTitle.setLayout(new BoxLayout(panelTitle, BoxLayout.Y_AXIS));

		vsTitle_1 = Box.createVerticalStrut(40);
		panelTitle.add(vsTitle_1);

		hbTitle = Box.createHorizontalBox();
		panelTitle.add(hbTitle);

		hgTitle_1 = Box.createHorizontalGlue();
		hbTitle.add(hgTitle_1);

		lblTitle = new JLabel("Profesores");
		hbTitle.add(lblTitle);

		hgTitle_2 = Box.createHorizontalGlue();
		hbTitle.add(hgTitle_2);

		panelViews = new JPanel();
		panelMain.add(panelViews, BorderLayout.WEST);
		panelViews.setLayout(new BoxLayout(panelViews, BoxLayout.Y_AXIS));

		hbViews = Box.createHorizontalBox();
		panelViews.add(hbViews);

		horizontalStrut = Box.createHorizontalStrut(20);
		hbViews.add(horizontalStrut);

		vbViews = Box.createVerticalBox();
		hbViews.add(vbViews);

		vgViews = Box.createVerticalGlue();
		vbViews.add(vgViews);

		btnProfs = new JButton("Profesores");
		btnProfs.setEnabled(false);
		btnProfs.setMargin(new Insets(2, 2, 2, 2));
		vbViews.add(btnProfs);

		vgViews_1 = Box.createVerticalGlue();
		vbViews.add(vgViews_1);

		btnClases = new JButton("Clases");
		btnClases.setMargin(new Insets(2, 17, 2, 17));
		vbViews.add(btnClases);

		vgViews_2 = Box.createVerticalGlue();
		vbViews.add(vgViews_2);

		panelUser = new JPanel();
		panelMain.add(panelUser, BorderLayout.EAST);
		panelUser.setLayout(new BoxLayout(panelUser, BoxLayout.X_AXIS));

		vbPanelUser = Box.createVerticalBox();
		panelUser.add(vbPanelUser);

		vsPanelUser_1 = Box.createVerticalStrut(20);
		vbPanelUser.add(vsPanelUser_1);

		btnConfig = new JButton("Configuracion");
		btnConfig.setMargin(new Insets(2, 24, 2, 24));
		vbPanelUser.add(btnConfig);

		vgPanelUser_1 = Box.createVerticalGlue();
		vbPanelUser.add(vgPanelUser_1);

		btnClasesActivas = new JButton("Clases activas");
		btnClasesActivas.setMargin(new Insets(2, 23, 2, 23));
		vbPanelUser.add(btnClasesActivas);

		vgPanelUser_2 = Box.createVerticalGlue();
		vbPanelUser.add(vgPanelUser_2);

		btnExit = new JButton("Salir");
		btnExit.setMargin(new Insets(2, 45, 2, 45));
		vbPanelUser.add(btnExit);

		vgPanelUser_3 = Box.createVerticalGlue();
		vbPanelUser.add(vgPanelUser_3);

		hsPanelUser_1 = Box.createHorizontalStrut(20);
		panelUser.add(hsPanelUser_1);

		panelTeacherClass = new JPanel();
		panelMain.add(panelTeacherClass, BorderLayout.CENTER);
		panelTeacherClass.setLayout(new BoxLayout(panelTeacherClass, BoxLayout.Y_AXIS));

		vsdynamic_1 = Box.createVerticalStrut(35);
		panelTeacherClass.add(vsdynamic_1);

		hbButtons = Box.createHorizontalBox();
		panelTeacherClass.add(hbButtons);
		hbButtons.setMaximumSize(new Dimension(1000, 1000));
		hbButtons.add(Box.createHorizontalStrut(10));

		lblPagina = new JLabel();

		hbButtons.add(btnBack = new JButton("<"));
		hbButtons.add(Box.createHorizontalGlue());
		hbButtons.add(lblPagina);
		hbButtons.add(Box.createHorizontalGlue());
		hbButtons.add(btnFront = new JButton(">"));

		vsdynamic_2 = Box.createVerticalStrut(35);
		panelTeacherClass.add(vsdynamic_2);

		panelShow = new JPanel();
		panelTeacherClass.add(panelShow);
		panelShow.setLayout(new CardLayout(0, 0));

		panelTeachers = new JPanel();
		panelShow.add(panelTeachers, "name_21270092553029");
		panelTeachers.setLayout(new BoxLayout(panelTeachers, BoxLayout.Y_AXIS));
		panelTeachers.setVisible(true);

		panelTeachers.add(Box.createVerticalStrut(20));

		panelClasses = new JPanel();
		panelShow.add(panelClasses, "name_24534861939470");
		panelClasses.setLayout(new BoxLayout(panelClasses, BoxLayout.Y_AXIS));

		verticalStrut = Box.createVerticalStrut(20);
		panelClasses.add(verticalStrut);

		panelUserClasses = new JPanel();
		frame.getContentPane().add(panelUserClasses, "name_29523138366773");
		panelUserClasses.setLayout(new BorderLayout(0, 0));

		panelTopClass = new JPanel();
		panelUserClasses.add(panelTopClass, BorderLayout.NORTH);

		horizontalBox = Box.createHorizontalBox();
		panelTopClass.add(horizontalBox);

		btnClassBack = new JButton("<");
		horizontalBox.add(btnClassBack);

		hgTopActive_1 = Box.createHorizontalGlue();
		horizontalBox.add(hgTopActive_1);

		lblActualClass = new JLabel("");
		horizontalBox.add(lblActualClass);

		hgTopActive_2 = Box.createHorizontalGlue();
		horizontalBox.add(hgTopActive_2);

		btnClassFront = new JButton(">");
		horizontalBox.add(btnClassFront);

		panelTheClasses = new JPanel();
		panelUserClasses.add(panelTheClasses, BorderLayout.CENTER);
		panelTheClasses.setLayout(new BoxLayout(panelTheClasses, BoxLayout.Y_AXIS));

		btnReturnFromClass = new JButton("Atras");
		panelUserClasses.add(btnReturnFromClass, BorderLayout.EAST);

		panelConfig = new JPanel();
		frame.getContentPane().add(panelConfig, "name_12970451335130");
		panelConfig.setLayout(new BorderLayout(0, 0));

		btnReturnFromConfig = new JButton("Atras");
		panelConfig.add(btnReturnFromConfig, BorderLayout.EAST);

		panelTopConfig = new JPanel();
		panelConfig.add(panelTopConfig, BorderLayout.NORTH);
		panelTopConfig.setLayout(new BoxLayout(panelTopConfig, BoxLayout.X_AXIS));

		hgConfig_1 = Box.createHorizontalGlue();
		panelTopConfig.add(hgConfig_1);

		lblConfig = new JLabel("");
		panelTopConfig.add(lblConfig);

		hgConfig_2 = Box.createHorizontalGlue();
		panelTopConfig.add(hgConfig_2);

		panelMidConfig = new JPanel();
		panelConfig.add(panelMidConfig, BorderLayout.CENTER);
		panelMidConfig.setLayout(new BoxLayout(panelMidConfig, BoxLayout.Y_AXIS));

		vgMidConfig_1 = Box.createVerticalGlue();
		panelMidConfig.add(vgMidConfig_1);

		hbMidConfig_1 = Box.createHorizontalBox();
		panelMidConfig.add(hbMidConfig_1);

		hbHBmid = Box.createHorizontalGlue();
		hbMidConfig_1.add(hbHBmid);

		lblNombre = new JLabel("Nombre: " + usuario.getName());
		hbMidConfig_1.add(lblNombre);

		hsHBmid = Box.createHorizontalStrut(15);
		hbMidConfig_1.add(hsHBmid);

		lblContra = new JLabel("Contrasenya: " + usuario.getPasswd());
		hbMidConfig_1.add(lblContra);

		hsHBmid_1 = Box.createHorizontalStrut(15);
		hbMidConfig_1.add(hsHBmid_1);

		lblTlfn = new JLabel("Telefono: " + Integer.toString(usuario.getTlfn()));
		hbMidConfig_1.add(lblTlfn);

		hbHBmid_3 = Box.createHorizontalGlue();
		hbMidConfig_1.add(hbHBmid_3);

		vgMidConfig = Box.createVerticalGlue();
		panelMidConfig.add(vgMidConfig);

		hbMidConfig_2 = Box.createHorizontalBox();
		panelMidConfig.add(hbMidConfig_2);

		hgHBmid = Box.createHorizontalGlue();
		hbMidConfig_2.add(hgHBmid);

		btnBorrarCuenta = new JButton("Borrar cuenta");
		hbMidConfig_2.add(btnBorrarCuenta);

		hgHBmid_3 = Box.createHorizontalGlue();
		hbMidConfig_2.add(hgHBmid_3);

		vgMidConfig_3 = Box.createVerticalGlue();
		panelMidConfig.add(vgMidConfig_3);

		mainTeachers();
	}

	private void setUIbehaviour() {
		/**
		 * Exits the view and takes the user back to the login
		 */
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exit();
			}
		});

		/**
		 * Adds 1 to the page counter, updating the contents
		 */
		btnFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nextPage();
			}
		});

		/**
		 * Subtracts 1 to the page counter, updating the contents
		 */
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				previousPage();
			}
		});

		/**
		 * Adds 1 to the page counter, updating the contents
		 */
		btnClassFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nextClassPage();
			}
		});

		/**
		 * Subtracts 1 to the page counter, updating the contents
		 */
		btnClassBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				previousClassPage();
			}
		});

		/**
		 * Shows the teachers
		 */
		btnProfs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chngToProfs();
			}
		});

		/**
		 * Shows the classes
		 */
		btnClases.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chngToClasses();
			}
		});

		/**
		 * Shows the users configuration view
		 */
		btnConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goToConf();
			}
		});

		/**
		 * Exits the users configuration view
		 */
		btnReturnFromConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				returnFromConf();
			}
		});

		/**
		 * Shows the users classes in a different view
		 */
		btnClasesActivas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goToActiveClasses();
			}
		});

		/**
		 * Exits the users classes view
		 */
		btnReturnFromClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				returnFromActiveClasses();
			}
		});

		/**
		 * Deletes the user
		 */
		btnBorrarCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteUser();
			}
		});
	}

	/**
	 * Inserts all the teachers in their panel dynamically
	 */
	public void mainTeachers() {
		panelTeachers.removeAll();

		// Takes 4 teachers of the storage and puts the info
		for (int i = page * 4; i < ((page + 1) * 4); i++) {
			if (i < utils.Almacen.profesores.size()) {
				Profesores prof = utils.Almacen.profesores.get(i);
				Box vbdynamic = Box.createVerticalBox();
				Box hbdynamic_1 = Box.createHorizontalBox();
				Box hbdynamic_2 = Box.createHorizontalBox();
				vbdynamic.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				JLabel dynamic_1 = new JLabel(prof.getNombre());
				JLabel dynamic_2 = new JLabel(
						"Nivel medio: " + prof.getNivelMedio() + "    Precio medio: " + prof.getPrecioMedio());

				panelTeachers.add(vbdynamic);
				vbdynamic.add(hbdynamic_1);
				vbdynamic.add(Box.createVerticalStrut(5));
				vbdynamic.add(hbdynamic_2);
				hbdynamic_1.add(Box.createHorizontalStrut(20));
				hbdynamic_1.add(dynamic_1);
				hbdynamic_1.add(Box.createHorizontalStrut(20));
				hbdynamic_2.add(Box.createHorizontalStrut(20));
				hbdynamic_2.add(dynamic_2);
				hbdynamic_2.add(Box.createHorizontalStrut(20));
				panelTeachers.add(Box.createVerticalGlue());
			}
		}
		updateMainText();
	}

	/**
	 * Inserts all the classes in their panel dynamically
	 */
	public void mainClasses() {
		panelClasses.removeAll();

		for (int i = page * 4; i < ((page + 1) * 4); i++) {
			if (i < utils.Almacen.clasesDisponibles.size()) {
				Clases clase = utils.Almacen.clasesDisponibles.get(i);
				Box vbdynamic = Box.createVerticalBox();
				Box hbdynamic_1 = Box.createHorizontalBox();
				Box hbdynamic_2 = Box.createHorizontalBox();
				vbdynamic.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				JLabel dynamic_1 = new JLabel(clase.getNombre() + "  -  Profesor: " + clase.getProfesor().getNombre());
				JLabel dynamic_2 = new JLabel(
						"Nivel: " + clase.getNombreNivel() + "    Precio: " + clase.getPrecio() + "    Participar: ");
				JCheckBox chkdynamic = new JCheckBox();
				chkdynamic.setVisible(false);
				JButton btndynamic = new JButton("Comprar");

				if (clase.isComprada()) {
					chkdynamic.setVisible(true);
					btndynamic.setVisible(false);
				}

				if (clase.isParticipando())
					chkdynamic.setSelected(true);

				/**
				 * If the checkbox is checked, the class is added. If not, is removed
				 */
				chkdynamic.addItemListener(new ItemListener() {
					@Override
					public void itemStateChanged(ItemEvent e) {
						if (e.getStateChange() == ItemEvent.SELECTED) {// checkbox has been selected
							if (usuario.getClases().addClaseActual(clase)) {
								clase.setParticipando(true);
							} else
								chkdynamic.setSelected(false);
						} else {// checkbox has been deselected
							usuario.getClases().remove(clase);
							clase.setParticipando(false);
						}
						updateMainText();
					}
				});

				/**
				 * Activates the payment process
				 */
				btndynamic.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JPanel selTipoPago = new JPanel();
						String[] pagos = { "Tarjeta de credito", "Bizum", "Cancelar" };
						int option = JOptionPane.showOptionDialog(selTipoPago, "Como quieres pagar?",
								"Estación de pago", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
								null, pagos, pagos[2]);
						switch (option) {
						case 0:

						case 1:
							clase.setComprada(true);
							btndynamic.setVisible(false);
							chkdynamic.setVisible(true);
							break;

						case 2:
							break;
						}

					}
				});

				panelClasses.add(vbdynamic);
				vbdynamic.add(hbdynamic_1);
				vbdynamic.add(Box.createVerticalStrut(5));
				vbdynamic.add(hbdynamic_2);
				hbdynamic_1.add(Box.createHorizontalStrut(20));
				hbdynamic_1.add(dynamic_1);
				hbdynamic_1.add(Box.createHorizontalStrut(20));
				hbdynamic_2.add(Box.createHorizontalStrut(20));
				hbdynamic_2.add(dynamic_2);
				hbdynamic_2.add(Box.createHorizontalStrut(5));
				hbdynamic_2.add(chkdynamic);
				hbdynamic_2.add(btndynamic);
				hbdynamic_2.add(Box.createHorizontalStrut(20));
				panelClasses.add(Box.createVerticalGlue());
			}
		}
		updateMainText();
	}

	/**
	 * Inserts all the classes in their panel dynamically
	 */
	public void userActualClasses() {
		panelTheClasses.removeAll();
		for (int i = page * 4; i < ((page + 1) * 4); i++) {
			if (i < usuario.getClases().size()) {
				Clases clase = usuario.getClases().get(i);
				Box vbdynamic = Box.createVerticalBox();
				Box hbdynamic_1 = Box.createHorizontalBox();
				Box hbdynamic_2 = Box.createHorizontalBox();
				vbdynamic.setBorder(BorderFactory.createLineBorder(Color.BLACK));
				JLabel dynamic_1 = new JLabel(clase.getNombre() + "  -  Profesor: " + clase.getProfesor().getNombre());
				JLabel dynamic_2 = new JLabel(
						"Nivel: " + clase.getNombreNivel() + "    Precio: " + clase.getPrecio() + "    Participando: ");
				JCheckBox chkdynamic = new JCheckBox();

				if (clase.isParticipando())
					chkdynamic.setSelected(true);

				/**
				 * If the checkbox is checked, the class is added. If not, is removed
				 */
				chkdynamic.addItemListener(new ItemListener() {
					@Override
					public void itemStateChanged(ItemEvent e) {
						if (e.getStateChange() == ItemEvent.SELECTED) {// checkbox has been selected
							if (usuario.getClases().addClaseActual(clase)) {
								clase.setParticipando(true);
							} else
								chkdynamic.setSelected(false);
						} else {// checkbox has been deselected
							usuario.getClases().remove(clase);
							clase.setParticipando(false);
						}
						updateClassText();
					}
				});

				panelTheClasses.add(vbdynamic);
				vbdynamic.add(hbdynamic_1);
				vbdynamic.add(Box.createVerticalStrut(5));
				vbdynamic.add(hbdynamic_2);
				hbdynamic_1.add(Box.createHorizontalStrut(20));
				hbdynamic_1.add(dynamic_1);
				hbdynamic_1.add(Box.createHorizontalStrut(20));
				hbdynamic_2.add(Box.createHorizontalStrut(20));
				hbdynamic_2.add(dynamic_2);
				hbdynamic_2.add(Box.createHorizontalStrut(5));
				hbdynamic_2.add(chkdynamic);
				hbdynamic_2.add(Box.createHorizontalStrut(20));
				panelTheClasses.add(Box.createVerticalGlue());
			}
		}
		updateClassText();
	}

	/**
	 * Updates the classes and teachers view
	 */
	public void updateMainText() {
		if (page > 0)
			btnBack.setVisible(true);
		else
			btnBack.setVisible(false);

		if (lblTitle.getText().equals("Profesores"))
			lblPagina.setText(
					"Pagina " + (page + 1) + " de " + (int) (Math.ceil(utils.Almacen.profesores.size() / (double) 4)));
		else
			lblPagina.setText(
					"Pagina " + (page + 1) + " de " + (int) (Math.ceil(utils.Almacen.clases.size() / (double) 4)));

		if (usuario.getClases().size() == 0)
			btnClasesActivas.setEnabled(false);
		else
			btnClasesActivas.setEnabled(true);

		if (lblTitle.getText().equals("Profesores"))
			if ((page + 1) * 4 < utils.Almacen.profesores.size())
				btnFront.setVisible(true);
			else
				btnFront.setVisible(false);
		else if ((page + 1) * 4 < utils.Almacen.clases.size())
			btnFront.setVisible(true);
		else
			btnFront.setVisible(false);

		frame.repaint();
	}

	/**
	 * Updates the view of the users classes
	 */
	public void updateClassText() {
		if (page > 0)
			btnClassBack.setVisible(true);
		else
			btnClassBack.setVisible(false);

		if ((page + 1) * 4 < usuario.getClases().size())
			btnClassFront.setVisible(true);
		else
			btnClassFront.setVisible(false);

		frame.repaint();
	}

	/**
	 * Shows the teachers
	 */
	public void chngToProfs() {
		page = 0;
		btnProfs.setEnabled(false);
		btnClases.setEnabled(true);
		panelTeachers.setVisible(true);
		panelClasses.setVisible(false);
		lblTitle.setText("Profesores");
		mainTeachers();
	}

	/**
	 * Shows the classes
	 */
	public void chngToClasses() {
		page = 0;
		btnProfs.setEnabled(true);
		btnClases.setEnabled(false);
		lblTitle.setText("Clases");
		panelTeachers.setVisible(false);
		panelClasses.setVisible(true);
		mainClasses();
	}

	/**
	 * Shows the users configuration page
	 */
	public void goToConf() {
		panelMain.setVisible(false);
		panelConfig.setVisible(true);
	}

	/**
	 * Returns from the users configuration page
	 */
	public void returnFromConf() {
		panelMain.setVisible(true);
		panelConfig.setVisible(false);
	}

	/**
	 * Shows the active classes of the users
	 */
	public void goToActiveClasses() {
		lblActualClass.setText("Clases activas");
		panelUserClasses.setVisible(true);
		panelMain.setVisible(false);
		page = 0;
		userActualClasses();
	}

	/**
	 * Returns from the active classes
	 */
	public void returnFromActiveClasses() {
		panelUserClasses.setVisible(false);
		panelMain.setVisible(true);
		page = 0;
		if (lblTitle.getText().equals("Profesores"))
			mainTeachers();
		else
			mainClasses();
	}

	/**
	 * Closes the application
	 */
	public void exit() {
		frame.dispose();
		new LauncherView();
	}

	/**
	 * Checks if the text matches "Profesores"
	 * 
	 * @param text String to check
	 * @return True or false
	 */
	public boolean checkMainText(String text) {
		return text.equals("Profesores");
	}

	/**
	 * Increments the page counter and updates the text in the teachers/classes view
	 */
	public void nextPage() {
		page++;
		if (checkMainText(lblTitle.getText()))
			mainTeachers();
		else
			mainClasses();
	}

	/**
	 * Decrements the page counter and updates the text in the teachers/classes view
	 */
	public void previousPage() {
		page--;
		if (checkMainText(lblTitle.getText()))
			mainTeachers();
		else
			mainClasses();
	}

	/**
	 * Increments the page counter and updates the text in the own classes view
	 */
	public void nextClassPage() {
		page++;
		userActualClasses();
	}

	/**
	 * Decrements the page counter and updates the text in the own classes view
	 */
	public void previousClassPage() {
		page--;
		userActualClasses();
	}

	/**
	 * Deletes the user
	 */
	public void deleteUser() {
		utils.Almacen.alumnos.remove(usuario);
		frame.dispose();
		new LauncherView();
	}

	/**
	 * Return the frame of the view
	 * 
	 * @return JFrame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * Return the panels of the main view (panelMain, panelTeachers, panelClasses)
	 * 
	 * @return Array of JPanel
	 */
	public JPanel[] getMainPanels() {
		JPanel[] panels = { panelMain, panelTeachers, panelClasses };
		return panels;
	}

	/**
	 * Return the panel of the users classes
	 * 
	 * @return JPanel
	 */
	public JPanel getUserPanel() {
		return panelUserClasses;
	}

	/**
	 * Return the panel of the user configuration
	 * 
	 * @return JPanel
	 */
	public JPanel getConfigPanel() {
		return panelConfig;
	}

	/**
	 * Returns the user of the account
	 * 
	 * @return Alumnos object
	 */
	public Alumnos getUser() {
		return usuario;
	}

	/**
	 * Returns the actual page
	 * 
	 * @return Integer
	 */
	public int getPage() {
		return page;
	}

	/**
	 * Returns the buttons used for navigation in the main view
	 * 
	 * @return Array of JButton (btnBack, btnFront)
	 */
	public JButton[] getMainPageButtons() {
		JButton[] buttons = { btnBack, btnFront };
		return buttons;
	}

	/**
	 * Returns the buttons used to change from teachers to classes, classes to
	 * teachers, and from any of those views to the active classes
	 * 
	 * @return Array of JButton (btnProfs, btnClases, btnClasesActivas)
	 */
	public JButton[] getMainSelButtons() {
		JButton[] buttons = { btnProfs, btnClases, btnClasesActivas };
		return buttons;
	}

	/**
	 * Returns the text of the label in the teachers/classes view
	 * 
	 * @return String
	 */
	public String getMainLabel() {
		return lblTitle.getText();
	}

	/**
	 * Returns the text of the users configuration labels
	 * 
	 * @return Array of String (lblNombre, lblTlfn, lblContra)
	 */
	public String[] getConigLabels() {
		String[] labels = { lblNombre.getText(), lblTlfn.getText(), lblContra.getText() };
		return labels;
	}

	/**
	 * Lets the user dispose of the frame
	 */
	public void dispose() {
		frame.dispose();
	}

}
