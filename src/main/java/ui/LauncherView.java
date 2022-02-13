package ui;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import models.Alumnos;

public class LauncherView {
	private JFrame frame;
	private Box hbTitle;
	private Component hgTitle_1;
	private Box vbTitle;
	private Box hbInnerTitle;
	private Component hgInnerTitle_1;
	private JLabel lblTitle;
	private Component hgInnerTitle_2;
	private Box hbSubTitle;
	private Component hgSubTitle_1;
	private JLabel lblSubTitle;
	private Component hgSubTitle_2;
	private Component hgTitle_2;
	private JPanel panels;
	private Component vsTitle_1;
	private JPanel loginPanel;
	private Component vgLogin_1;
	private Component vsTitle_2;
	private JPanel registerPanel;
	private Box hbLoginName;
	private Component hgLoginName_1;
	private JLabel lblLoginName;
	private Component hsLoginName;
	private JTextField txtLoginName;
	private Component hgLoginName_2;
	private Component vgLogin_2;
	private Box hbLoginPasswd;
	private Component hgLoginPasswd_1;
	private Component hgLoginPasswd_2;
	private JLabel lblLoginPasswd;
	private Component hsLoginPasswd;
	private JPasswordField pwfLoginPasswd;
	private Component vsLogin_1;
	private Box hbLoginButtons;
	private Box vbLoginButtons;
	private Box hbLogin;
	private Component hgLogin_1;
	private Component hgLogin_2;
	private Box hbRegister;
	private Component hgRegister_2;
	private Component hgRegister_1;
	private JButton btnLogin;
	private JButton btnRegister;
	private Component vgLogin_3;
	private Component vsLoginButtons;
	private Component vgRegister_1;
	private Box hbRegisterName;
	private Component hgRegisterName_1;
	private JLabel lblRegisterName;
	private Component hsRegisterName;
	private JTextField txtRegisterName;
	private Component hgRegisterName_2;
	private Component vsRegister_1;
	private Box hbRegisterPasswd;
	private Component hgRegisterPasswd_1;
	private JLabel lblRegisterPasswd;
	private Component hsRegisterPasswd;
	private JPasswordField pwfRegisterPasswd;
	private Component hgRegisterPasswd_2;
	private Component vgRegister_2;
	private Box hbRegisterButtons;
	private Box vbRegisterButtons;
	private Box hbRegisterConfirm;
	private Component hgRegisterConfirm_1;
	private JButton btnRegisterConfirm;
	private Component hgRegisterConfirm_2;
	private Component vsRegisterConfirm;
	private Box hbCancel;
	private Component hgCancel_1;
	private JButton btnCancel;
	private Component hgCancel_2;
	private Component vgRegister_3;
	private Component vsRegister_3;
	private Box hbRegisterConfPass;
	private Component hgRegisterConfPass_1;
	private JLabel lblRegisterConfPass;
	private Component hsRegisterConfPass;
	private JPasswordField pwfRegisterConfPass;
	private Component hgRegisterConfPass_2;
	private Box hbRegisterPhone;
	private Component hgRegisterPhone_1;
	private JLabel lblRegisterPhone;
	private Component hsRegisterPhone;
	private Component hgRegisterPhone_2;
	private Component vsRegister_2;
	private JTextField txtRegisterPhone;

	/**
	 * Create the application.
	 */
	public LauncherView() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setMinimumSize(new Dimension(600, 400));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setUIcomponents();
		setUIbehaviour();
	}

	/**
	 * Initialize the components of the frame
	 */
	private void setUIcomponents() {
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

		hbTitle = Box.createHorizontalBox();
		frame.getContentPane().add(hbTitle);

		hgTitle_1 = Box.createHorizontalGlue();
		hbTitle.add(hgTitle_1);

		vbTitle = Box.createVerticalBox();
		hbTitle.add(vbTitle);

		vsTitle_1 = Box.createVerticalStrut(40);
		vbTitle.add(vsTitle_1);

		hbInnerTitle = Box.createHorizontalBox();
		vbTitle.add(hbInnerTitle);

		hgInnerTitle_1 = Box.createHorizontalGlue();
		hbInnerTitle.add(hgInnerTitle_1);

		lblTitle = new JLabel("DANZA ONLINE");
		lblTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		hbInnerTitle.add(lblTitle);

		hgInnerTitle_2 = Box.createHorizontalGlue();
		hbInnerTitle.add(hgInnerTitle_2);

		vsTitle_2 = Box.createVerticalStrut(30);
		vbTitle.add(vsTitle_2);

		hbSubTitle = Box.createHorizontalBox();
		vbTitle.add(hbSubTitle);

		hgSubTitle_1 = Box.createHorizontalGlue();
		hbSubTitle.add(hgSubTitle_1);

		lblSubTitle = new JLabel("Inicie sesion para continuar");
		hbSubTitle.add(lblSubTitle);

		hgSubTitle_2 = Box.createHorizontalGlue();
		hbSubTitle.add(hgSubTitle_2);

		hgTitle_2 = Box.createHorizontalGlue();
		hbTitle.add(hgTitle_2);

		panels = new JPanel();
		frame.getContentPane().add(panels);
		panels.setLayout(new CardLayout(0, 0));

		loginPanel = new JPanel();
		panels.add(loginPanel, "name_6009080753432");
		loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));

		vgLogin_1 = Box.createVerticalGlue();
		loginPanel.add(vgLogin_1);

		hbLoginName = Box.createHorizontalBox();
		loginPanel.add(hbLoginName);

		hgLoginName_1 = Box.createHorizontalGlue();
		hbLoginName.add(hgLoginName_1);

		lblLoginName = new JLabel("Nombre");
		hbLoginName.add(lblLoginName);

		hsLoginName = Box.createHorizontalStrut(47);
		hbLoginName.add(hsLoginName);

		txtLoginName = new JTextField();
		txtLoginName.setMaximumSize(new Dimension(100, 25));
		hbLoginName.add(txtLoginName);
		txtLoginName.setColumns(20);

		hgLoginName_2 = Box.createHorizontalGlue();
		hbLoginName.add(hgLoginName_2);

		vsLogin_1 = Box.createVerticalStrut(10);
		loginPanel.add(vsLogin_1);

		hbLoginPasswd = Box.createHorizontalBox();
		loginPanel.add(hbLoginPasswd);

		hgLoginPasswd_1 = Box.createHorizontalGlue();
		hbLoginPasswd.add(hgLoginPasswd_1);

		lblLoginPasswd = new JLabel("Contraseña");
		hbLoginPasswd.add(lblLoginPasswd);

		hsLoginPasswd = Box.createHorizontalStrut(20);
		hbLoginPasswd.add(hsLoginPasswd);

		pwfLoginPasswd = new JPasswordField();
		pwfLoginPasswd.setColumns(20);
		pwfLoginPasswd.setMaximumSize(new Dimension(100, 25));
		hbLoginPasswd.add(pwfLoginPasswd);

		hgLoginPasswd_2 = Box.createHorizontalGlue();
		hbLoginPasswd.add(hgLoginPasswd_2);

		vgLogin_2 = Box.createVerticalGlue();
		loginPanel.add(vgLogin_2);

		hbLoginButtons = Box.createHorizontalBox();
		loginPanel.add(hbLoginButtons);

		vbLoginButtons = Box.createVerticalBox();
		hbLoginButtons.add(vbLoginButtons);

		hbLogin = Box.createHorizontalBox();
		vbLoginButtons.add(hbLogin);

		hgLogin_1 = Box.createHorizontalGlue();
		hbLogin.add(hgLogin_1);

		btnLogin = new JButton("Entrar");
		hbLogin.add(btnLogin);

		hgLogin_2 = Box.createHorizontalGlue();
		hbLogin.add(hgLogin_2);

		vsLoginButtons = Box.createVerticalStrut(20);
		vbLoginButtons.add(vsLoginButtons);

		hbRegister = Box.createHorizontalBox();
		vbLoginButtons.add(hbRegister);

		hgRegister_1 = Box.createHorizontalGlue();
		hbRegister.add(hgRegister_1);

		btnRegister = new JButton("Registrarse");
		hbRegister.add(btnRegister);

		hgRegister_2 = Box.createHorizontalGlue();
		hbRegister.add(hgRegister_2);

		vgLogin_3 = Box.createVerticalGlue();
		loginPanel.add(vgLogin_3);

		registerPanel = new JPanel();
		panels.add(registerPanel, "name_6380854933809");
		registerPanel.setLayout(new BoxLayout(registerPanel, BoxLayout.Y_AXIS));

		vgRegister_1 = Box.createVerticalGlue();
		registerPanel.add(vgRegister_1);

		hbRegisterName = Box.createHorizontalBox();
		registerPanel.add(hbRegisterName);

		hgRegisterName_1 = Box.createHorizontalGlue();
		hbRegisterName.add(hgRegisterName_1);

		lblRegisterName = new JLabel("Nombre");
		hbRegisterName.add(lblRegisterName);

		hsRegisterName = Box.createHorizontalStrut(120);
		hbRegisterName.add(hsRegisterName);

		txtRegisterName = new JTextField();
		txtRegisterName.setMaximumSize(new Dimension(100, 25));
		txtRegisterName.setColumns(20);
		hbRegisterName.add(txtRegisterName);

		hgRegisterName_2 = Box.createHorizontalGlue();
		hbRegisterName.add(hgRegisterName_2);

		vsRegister_1 = Box.createVerticalStrut(10);
		registerPanel.add(vsRegister_1);
		
		hbRegisterPhone = Box.createHorizontalBox();
		registerPanel.add(hbRegisterPhone);
		
		hgRegisterPhone_1 = Box.createHorizontalGlue();
		hbRegisterPhone.add(hgRegisterPhone_1);
		
		lblRegisterPhone = new JLabel("Telefono");
		hbRegisterPhone.add(lblRegisterPhone);
		
		hsRegisterPhone = Box.createHorizontalStrut(110);
		hbRegisterPhone.add(hsRegisterPhone);
		
		txtRegisterPhone = new JTextField();
		txtRegisterPhone.setMaximumSize(new Dimension(100, 25));
		txtRegisterPhone.setColumns(20);
		hbRegisterPhone.add(txtRegisterPhone);
		
		hgRegisterPhone_2 = Box.createHorizontalGlue();
		hbRegisterPhone.add(hgRegisterPhone_2);
		
		vsRegister_2 = Box.createVerticalStrut(10);
		registerPanel.add(vsRegister_2);

		hbRegisterPasswd = Box.createHorizontalBox();
		registerPanel.add(hbRegisterPasswd);

		hgRegisterPasswd_1 = Box.createHorizontalGlue();
		hbRegisterPasswd.add(hgRegisterPasswd_1);

		lblRegisterPasswd = new JLabel("Contraseña");
		hbRegisterPasswd.add(lblRegisterPasswd);

		hsRegisterPasswd = Box.createHorizontalStrut(90);
		hbRegisterPasswd.add(hsRegisterPasswd);

		pwfRegisterPasswd = new JPasswordField();
		pwfRegisterPasswd.setMaximumSize(new Dimension(100, 25));
		pwfRegisterPasswd.setColumns(20);
		hbRegisterPasswd.add(pwfRegisterPasswd);

		hgRegisterPasswd_2 = Box.createHorizontalGlue();
		hbRegisterPasswd.add(hgRegisterPasswd_2);

		vsRegister_3 = Box.createVerticalStrut(10);
		registerPanel.add(vsRegister_3);

		hbRegisterConfPass = Box.createHorizontalBox();
		registerPanel.add(hbRegisterConfPass);

		hgRegisterConfPass_1 = Box.createHorizontalGlue();
		hbRegisterConfPass.add(hgRegisterConfPass_1);

		lblRegisterConfPass = new JLabel("Confirmar contraseña");
		hbRegisterConfPass.add(lblRegisterConfPass);

		hsRegisterConfPass = Box.createHorizontalStrut(20);
		hbRegisterConfPass.add(hsRegisterConfPass);

		pwfRegisterConfPass = new JPasswordField();
		pwfRegisterConfPass.setMaximumSize(new Dimension(100, 25));
		pwfRegisterConfPass.setColumns(20);
		hbRegisterConfPass.add(pwfRegisterConfPass);

		hgRegisterConfPass_2 = Box.createHorizontalGlue();
		hbRegisterConfPass.add(hgRegisterConfPass_2);

		vgRegister_2 = Box.createVerticalGlue();
		registerPanel.add(vgRegister_2);

		hbRegisterButtons = Box.createHorizontalBox();
		registerPanel.add(hbRegisterButtons);

		vbRegisterButtons = Box.createVerticalBox();
		hbRegisterButtons.add(vbRegisterButtons);

		hbRegisterConfirm = Box.createHorizontalBox();
		vbRegisterButtons.add(hbRegisterConfirm);

		hgRegisterConfirm_1 = Box.createHorizontalGlue();
		hbRegisterConfirm.add(hgRegisterConfirm_1);

		btnRegisterConfirm = new JButton("Registrarse");
		hbRegisterConfirm.add(btnRegisterConfirm);

		hgRegisterConfirm_2 = Box.createHorizontalGlue();
		hbRegisterConfirm.add(hgRegisterConfirm_2);

		vsRegisterConfirm = Box.createVerticalStrut(20);
		vbRegisterButtons.add(vsRegisterConfirm);

		hbCancel = Box.createHorizontalBox();
		vbRegisterButtons.add(hbCancel);

		hgCancel_1 = Box.createHorizontalGlue();
		hbCancel.add(hgCancel_1);

		btnCancel = new JButton("Cancelar");
		hbCancel.add(btnCancel);

		hgCancel_2 = Box.createHorizontalGlue();
		hbCancel.add(hgCancel_2);

		vgRegister_3 = Box.createVerticalGlue();
		registerPanel.add(vgRegister_3);
	}

	private void setUIbehaviour() {
		// LoginPanel
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});

		btnLogin.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
					login();
			}
		});

		txtLoginName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
					login();
			}
		});

		pwfLoginPasswd.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
					login();
			}
		});

		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPanel.setVisible(false);
				registerPanel.setVisible(true);
				lblSubTitle.setText("Introduzca sus datos");
			}
		});

		// RegisterPanel
		btnRegisterConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register();
			}
		});

		btnRegisterConfirm.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
					register();
			}
		});

		txtRegisterName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
					register();
			}
		});

		pwfRegisterPasswd.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
					register();
			}
		});

		pwfRegisterConfPass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
					register();
			}
		});

		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exitRegister();
			}
		});
	}

	private void login() {
		if (loginCheck(txtLoginName.getText(), new String(pwfLoginPasswd.getPassword()))) {
			// TODO lanzar nueva vista pasando el usuario
//			frame.dispose();
		} else {
			JFrame wrongCredentials = new JFrame();
			JOptionPane.showMessageDialog(wrongCredentials, "Datos incorrectos");
		}
	}

	private boolean loginCheck(String name, String passwd) {
		for (Alumnos alumno : utils.Almacen.alumnos)
			if (alumno.getName().equals(name))
				if (alumno.getPasswd().equals(passwd))
					return true;
		return false;
	}

	private void register() {
		if (registerCheck(txtRegisterName.getText(), new String(pwfRegisterPasswd.getPassword()),
				new String(pwfRegisterConfPass.getPassword()))) {
			txtLoginName.setText(txtRegisterName.getText());
			utils.Almacen.alumnos
					.add(new Alumnos(txtRegisterName.getText(), new String(pwfRegisterPasswd.getPassword()), 0));
			exitRegister();
		}
	}

	private boolean registerCheck(String name, String passwd, String confirmPasswd) {
		for (Alumnos alumno : utils.Almacen.alumnos)
			if (alumno.getName().equals(name)) {
				JFrame nameExists = new JFrame();
				JOptionPane.showMessageDialog(nameExists, "El usuario ya existe");
				return false;
			}

		if (!passwd.isEmpty() && !confirmPasswd.isEmpty() && name.isEmpty())
			if (passwd.equals(confirmPasswd))
				return true;
			else {
				JFrame wrongPasswd = new JFrame();
				JOptionPane.showMessageDialog(wrongPasswd, "Las contraseñas no coinciden");
			}
		else {
			JFrame emptyField = new JFrame();
			JOptionPane.showMessageDialog(emptyField, "Tiene que rellenar todos los campos");
		}
		return false;
	}

	private void exitRegister() {
		registerPanel.setVisible(false);
		loginPanel.setVisible(true);
		txtRegisterName.setText("");
		pwfRegisterPasswd.setText("");
		pwfRegisterConfPass.setText("");
		lblSubTitle.setText("Inicie sesion para continuar");
	}
}