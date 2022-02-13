package ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Panel;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import models.Alumnos;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainView {
	private Alumnos usuario;
	private int teacherPage = 0, classPage = 0;

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
	private Panel panelBoth;
	private JButton btnBackTeacher;
	private JButton btnFrontTeacher;
	private JButton backClass;
	private JButton frontClass;
	private Component vsDinamic_1;
	private Box hbButtons;
	private JPanel panelTeachers;
	private JLabel lblPagina;

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
		panelTeacherClass.setLayout(new CardLayout(0, 0));
		
				vsDinamic_1 = Box.createVerticalStrut(70);
				panelTeacherClass.add(vsDinamic_1, "name_35883575747997");
								
										hbButtons = Box.createHorizontalBox();
										panelTeacherClass.add(hbButtons, "name_35891438318897");
										hbButtons.setMaximumSize(new Dimension(1000, 1000));
										hbButtons.add(Box.createHorizontalStrut(10));
										
												lblPagina = new JLabel();
												
														hbButtons.add(btnBackTeacher = new JButton("<"));
														hbButtons.add(Box.createHorizontalGlue());
														hbButtons.add(lblPagina);
														hbButtons.add(Box.createHorizontalGlue());
														hbButtons.add(btnFrontTeacher = new JButton(">"));
								
										panelBoth = new Panel();
										panelTeacherClass.add(panelBoth, "name_28469364791226");
								panelBoth.setLayout(new CardLayout(0, 0));
						
								panelTeachers = new JPanel();
								panelBoth.add(panelTeachers, "name_39164762834440");
								panelTeachers.setLayout(new BoxLayout(panelTeachers, BoxLayout.Y_AXIS));
								
										panelTeachers.add(Box.createVerticalStrut(20));

		createTeachers();
	}

	private void setUIbehaviour() {
		btnFrontTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacherPage++;
				createTeachers();
			}
		});

		btnBackTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacherPage--;
				createTeachers();
			}
		});

		btnProfs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				classPage = 0;
				btnProfs.setEnabled(false);
				btnClases.setEnabled(true);
				
				panelTeachers.setVisible(false);

				createTeachers();
			}
		});
		
		btnClases.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacherPage = 0;
				btnProfs.setEnabled(true);
				btnClases.setEnabled(false);

				createTeachers();
			}
		});
	}

	private void createTeachers() {
		panelTeachers.removeAll();

		for (int i = 0; i < 4; i++) {
			if ((teacherPage * 4) + i < utils.Almacen.profesores.size()) {
				Box hbDinamic = Box.createHorizontalBox();
				JLabel dinamic = new JLabel(utils.Almacen.profesores.get((teacherPage * 4) + i).getNombre());
				panelTeachers.add(hbDinamic);
				hbDinamic.add(Box.createHorizontalGlue());
				hbDinamic.add(dinamic);
				hbDinamic.add(Box.createHorizontalGlue());
				panelTeachers.add(Box.createVerticalGlue());
			}
		}
		updateText();
	}
	
	private void createClasses() {
		panelTeachers.removeAll();

		panelTeachers.add(Box.createVerticalStrut(20));

		for (int i = 0; i < 4; i++) {
			if ((teacherPage * 4) + i < utils.Almacen.profesores.size()) {
				Box hbDinamic = Box.createHorizontalBox();
				JLabel dinamic = new JLabel(utils.Almacen.profesores.get((teacherPage * 4) + i).getNombre());
				panelTeachers.add(hbDinamic);
				hbDinamic.add(Box.createHorizontalGlue());
				hbDinamic.add(dinamic);
				hbDinamic.add(Box.createHorizontalGlue());
				panelTeachers.add(Box.createVerticalGlue());
			}
		}
		updateText();
	}

	private void updateText() {
		if (teacherPage > 0)
			btnBackTeacher.setVisible(true);
		else
			btnBackTeacher.setVisible(false);

		lblPagina.setText("Página " + (teacherPage + 1) + " de "
				+ (int) (Math.ceil(utils.Almacen.profesores.size() / (double) 4)));

		if ((teacherPage + 1) * 4 < utils.Almacen.profesores.size())
			btnFrontTeacher.setVisible(true);
		else
			btnFrontTeacher.setVisible(false);
	}

}
