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
import javax.swing.JPanel;

import models.Alumnos;
import models.Clases;

public class MainView {
	private Alumnos usuario;
	private int actualPage = 0;

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
	private JButton btnActualClass;
	private Component vsPanelUser_2;
	private JButton btnCompletedClass;
	private Component vgPanelUser_2;
	private JPanel panelTeacherClass;
	private JButton btnBack;
	private JButton btnFront;
	private Component vsDinamic_2;
	private Box hbButtons;
	private JPanel panelTeachers;
	private JLabel lblPagina;
	private Component vsDinamic_1;
	private JPanel panelShow;
	private JPanel panelTeacherInfo;
	private JPanel panelTeacherDesc;
	private Component vgTeacherDesc_1;
	private Box hbTeacherDesc_1;
	private Component ghHBDesc_1;
	private JLabel lblMayorClase;
	private Component ghHBDesc_2;
	private Component vgTeacherDesc_2;
	private JLabel lblClass;
	private Box hbTeacherDesc_2;
	private Component ghHBDesc_3;
	private JLabel lblDiff;
	private JLabel lblMediaDiff;
	private Component ghHBDesc_4;
	private Component vgTeacherDesc_3;
	private JPanel panelClasses;
	private Component verticalStrut;
	private JPanel panelUserClasses;
	private JPanel panelTopClass;
	private Box horizontalBox;
	private Component hgTopActive_1;
	private JLabel lblActualClass;
	private Component hgTopActive_2;
	private JButton btnReturn;
	private JPanel panelTheClasses;

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

		btnConfig = new JButton("Configuración");
		btnConfig.setMargin(new Insets(2, 24, 2, 24));
		vbPanelUser.add(btnConfig);

		vgPanelUser_1 = Box.createVerticalGlue();
		vbPanelUser.add(vgPanelUser_1);

		btnActualClass = new JButton("Clases activas");
		btnActualClass.setMargin(new Insets(2, 23, 2, 23));
		vbPanelUser.add(btnActualClass);

		vsPanelUser_2 = Box.createVerticalStrut(40);
		vbPanelUser.add(vsPanelUser_2);

		btnCompletedClass = new JButton("Clases completadas");
		btnCompletedClass.setMargin(new Insets(2, 2, 2, 2));
		vbPanelUser.add(btnCompletedClass);

		vgPanelUser_2 = Box.createVerticalGlue();
		vbPanelUser.add(vgPanelUser_2);

		hsPanelUser_1 = Box.createHorizontalStrut(20);
		panelUser.add(hsPanelUser_1);

		panelTeacherClass = new JPanel();
		panelMain.add(panelTeacherClass, BorderLayout.CENTER);
		panelTeacherClass.setLayout(new BoxLayout(panelTeacherClass, BoxLayout.Y_AXIS));

		vsDinamic_1 = Box.createVerticalStrut(35);
		panelTeacherClass.add(vsDinamic_1);

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

		vsDinamic_2 = Box.createVerticalStrut(35);
		panelTeacherClass.add(vsDinamic_2);

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

		panelTeacherInfo = new JPanel();
		frame.getContentPane().add(panelTeacherInfo, "name_23448689962911");
		panelTeacherInfo.setLayout(new BorderLayout(0, 0));

		panelTeacherDesc = new JPanel();
		panelTeacherInfo.add(panelTeacherDesc, BorderLayout.WEST);
		panelTeacherDesc.setLayout(new BoxLayout(panelTeacherDesc, BoxLayout.Y_AXIS));

		vgTeacherDesc_1 = Box.createVerticalGlue();
		panelTeacherDesc.add(vgTeacherDesc_1);

		hbTeacherDesc_1 = Box.createHorizontalBox();
		panelTeacherDesc.add(hbTeacherDesc_1);

		ghHBDesc_1 = Box.createHorizontalGlue();
		hbTeacherDesc_1.add(ghHBDesc_1);

		lblClass = new JLabel("Clase mas ofrecida:");
		hbTeacherDesc_1.add(lblClass);

		ghHBDesc_2 = Box.createHorizontalGlue();
		hbTeacherDesc_1.add(ghHBDesc_2);

		lblMayorClase = new JLabel("");
		panelTeacherDesc.add(lblMayorClase);

		vgTeacherDesc_2 = Box.createVerticalGlue();
		panelTeacherDesc.add(vgTeacherDesc_2);

		hbTeacherDesc_2 = Box.createHorizontalBox();
		panelTeacherDesc.add(hbTeacherDesc_2);

		ghHBDesc_3 = Box.createHorizontalGlue();
		hbTeacherDesc_2.add(ghHBDesc_3);

		lblDiff = new JLabel("Dificultad media:");
		hbTeacherDesc_2.add(lblDiff);

		ghHBDesc_4 = Box.createHorizontalGlue();
		hbTeacherDesc_2.add(ghHBDesc_4);

		lblMediaDiff = new JLabel("");
		panelTeacherDesc.add(lblMediaDiff);

		vgTeacherDesc_3 = Box.createVerticalGlue();
		panelTeacherDesc.add(vgTeacherDesc_3);

		panelUserClasses = new JPanel();
		frame.getContentPane().add(panelUserClasses, "name_29523138366773");
		panelUserClasses.setLayout(new BorderLayout(0, 0));

		panelTopClass = new JPanel();
		panelUserClasses.add(panelTopClass, BorderLayout.NORTH);

		horizontalBox = Box.createHorizontalBox();
		panelTopClass.add(horizontalBox);

		hgTopActive_1 = Box.createHorizontalGlue();
		horizontalBox.add(hgTopActive_1);

		lblActualClass = new JLabel("");
		horizontalBox.add(lblActualClass);

		hgTopActive_2 = Box.createHorizontalGlue();
		horizontalBox.add(hgTopActive_2);

		panelTheClasses = new JPanel();
		panelUserClasses.add(panelTheClasses, BorderLayout.CENTER);
		panelTheClasses.setLayout(new BoxLayout(panelTheClasses, BoxLayout.Y_AXIS));

		btnReturn = new JButton("back");
		panelUserClasses.add(btnReturn, BorderLayout.EAST);

		mainTeachers();
	}

	private void setUIbehaviour() {
		btnFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualPage++;
				if (lblTitle.getText().equals("Profesores"))
					mainTeachers();
				else
					mainClasses();
			}
		});

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualPage--;
				if (lblTitle.getText().equals("Profesores"))
					mainTeachers();
				else
					mainClasses();
			}
		});

		btnProfs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualPage = 0;
				btnProfs.setEnabled(false);
				btnClases.setEnabled(true);
				panelTeachers.setVisible(true);
				panelClasses.setVisible(false);
				lblTitle.setText("Profesores");

				mainTeachers();
			}
		});

		btnClases.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualPage = 0;
				btnProfs.setEnabled(true);
				btnClases.setEnabled(false);
				lblTitle.setText("Clases");
				panelTeachers.setVisible(false);
				panelClasses.setVisible(true);
				mainClasses();
			}
		});

		btnActualClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblActualClass.setText("Clases activas");
				panelUserClasses.setVisible(true);
				panelMain.setVisible(false);
				actualPage = 0;
				userClasses();
			}
		});

		btnCompletedClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblActualClass.setText("Clases completadas");
				panelUserClasses.setVisible(true);
				panelMain.setVisible(false);
				actualPage = 0;
				userClasses();
			}
		});

		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelUserClasses.setVisible(false);
				panelMain.setVisible(true);
				actualPage = 0;
				if (lblTitle.getText().equals("Profesores"))
					mainTeachers();
				else
					mainClasses();
			}
		});
	}

	private void mainTeachers() {
		panelTeachers.removeAll();

		for (int i = actualPage * 4; i < ((actualPage + 1) * 4); i++) {
			if (i < utils.Almacen.profesores.size()) {
				Box hbDinamic = Box.createHorizontalBox();
				JLabel dinamic = new JLabel(utils.Almacen.profesores.get(i).getNombre());
				panelTeachers.add(hbDinamic);
				hbDinamic.add(Box.createHorizontalGlue());
				hbDinamic.add(dinamic);
				hbDinamic.add(Box.createHorizontalGlue());
				panelTeachers.add(Box.createVerticalGlue());
			}
		}
		updateMainText();
	}

	private void mainClasses() {
		panelClasses.removeAll();

		for (int i = actualPage * 4; i < ((actualPage + 1) * 4); i++) {
			if (i < utils.Almacen.clasesDisponibles.size()) {
				int id = i;
				Box hbDinamic = Box.createHorizontalBox();
				hbDinamic.setBorder(BorderFactory.createLineBorder(Color.black));
				JLabel dinamic = new JLabel(utils.Almacen.clasesDisponibles.get(i).getNombre() + "    Nivel: "
						+ utils.Almacen.clasesDisponibles.get(i).getNombreNivel() + "    Precio: "
						+ utils.Almacen.clasesDisponibles.get(i).getPrecio() + "€    Profesor: "
						+ utils.Almacen.clasesDisponibles.get(i).getProfesor().getNombre());
				JCheckBox chkDinamic = new JCheckBox();
				if (utils.Almacen.clasesDisponibles.get(i).isParticipando())
					chkDinamic.setSelected(true);

				chkDinamic.addItemListener(new ItemListener() {
					@Override
					public void itemStateChanged(ItemEvent e) {
						if (e.getStateChange() == ItemEvent.SELECTED) {// checkbox has been selected
							if (usuario.getClasesActuales().addClaseActual(utils.Almacen.clasesDisponibles.get(id)))
								utils.Almacen.clasesDisponibles.get(id).setParticipando(true);
							else
								chkDinamic.setSelected(false);
						} else {// checkbox has been deselected
							usuario.getClasesActuales().remove(utils.Almacen.clasesDisponibles.get(id));
							utils.Almacen.clasesDisponibles.get(id).setParticipando(false);
						}
					}
				});

				panelClasses.add(hbDinamic);
				hbDinamic.add(Box.createHorizontalStrut(20));
				hbDinamic.add(dinamic);
				hbDinamic.add(chkDinamic);
				hbDinamic.add(Box.createHorizontalStrut(20));
				panelClasses.add(Box.createVerticalGlue());
			}
		}
		updateMainText();
	}

	private void userClasses() {
		panelTheClasses.removeAll();
		if (lblActualClass.getText().equals("Clases activas"))
			for (int i = actualPage * 4; i < ((actualPage + 1) * 4); i++) {
				if (i < usuario.getClasesActuales().size()) {
					Clases clase = usuario.getClasesActuales().get(i);
					Box hbDinamic = Box.createHorizontalBox();
					hbDinamic.setBorder(BorderFactory.createLineBorder(Color.black));
					JLabel dinamic = new JLabel(usuario.getClasesActuales().get(i).getNombre() + "    Nivel: "
							+ usuario.getClasesActuales().get(i).getNombreNivel() + "    Precio: "
							+ usuario.getClasesActuales().get(i).getPrecio() + "€    Profesor: "
							+ usuario.getClasesActuales().get(i).getProfesor().getNombre());
					JCheckBox chkDinamic = new JCheckBox();
					if (usuario.getClasesActuales().get(i).isParticipando())
						chkDinamic.setSelected(true);

					chkDinamic.addItemListener(new ItemListener() {
						@Override
						public void itemStateChanged(ItemEvent e) {
							if (e.getStateChange() == ItemEvent.SELECTED) {// checkbox has been selected
								if (usuario.getClasesActuales().addClaseActual(clase))
									clase.setParticipando(true);
								else
									chkDinamic.setSelected(false);
							} else {// checkbox has been deselected
								usuario.getClasesActuales().remove(clase);
								clase.setParticipando(false);
							}
						}
					});

					panelTheClasses.add(hbDinamic);
					hbDinamic.add(Box.createHorizontalStrut(20));
					hbDinamic.add(dinamic);
					hbDinamic.add(chkDinamic);
					hbDinamic.add(Box.createHorizontalStrut(20));
					panelTheClasses.add(Box.createVerticalGlue());
				}
			}
		else if (lblActualClass.getText().equals("Clases completadas"))
			System.out.println("hell");
	}

	private void updateMainText() {
		if (actualPage > 0)
			btnBack.setVisible(true);
		else
			btnBack.setVisible(false);

		if (lblTitle.getText().equals("Profesores"))
			lblPagina.setText("Página " + (actualPage + 1) + " de "
					+ (int) (Math.ceil(utils.Almacen.profesores.size() / (double) 4)));
		else
			lblPagina.setText("Página " + (actualPage + 1) + " de "
					+ (int) (Math.ceil(utils.Almacen.clases.size() / (double) 4)));

		if (lblTitle.getText().equals("Profesores"))
			if ((actualPage + 1) * 4 < utils.Almacen.profesores.size())
				btnFront.setVisible(true);
			else
				btnFront.setVisible(false);
		else if ((actualPage + 1) * 4 < utils.Almacen.clases.size())
			btnFront.setVisible(true);
		else
			btnFront.setVisible(false);

		frame.repaint();
	}
}
