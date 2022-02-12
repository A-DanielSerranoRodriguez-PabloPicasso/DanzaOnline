package ui;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginView {

	private JFrame frame;
	private JPanel loginPanel, registerPanel;
	private Box hbTitle, vbTitle, hbInnerTitle, hbName;
	private Component hgTitle_1, hgTitle_2, hgInnerTitle_1, hgInnerTitle_2;
	private Component vgTitle_1, vgTitle_2, vgLogin_1;
	private JLabel lblTitle;
	private Component hgName_1;
	private JLabel lblName;
	private Component hsName;
	private JTextField txtName;
	private Component hgName_2;
	private Box hbPasswd;
	private Component vsLogin;
	private Component hgPasswd_1;
	private JLabel lblPasswd;
	private Component hsPasswd;
	private JPasswordField pwfPasswd;
	private Component hgPasswd_2;
	private Component vgLogin_2;
	private Box hbSubTitle;
	private Component hgSubTitle_1;
	private JLabel lblSubTitle;
	private Component hgSubTitle_2;
	private Box hbButtons;
	private Component hgButtons_1;
	private JButton btnRegister;
	private Component hgButtons_2;
	private Component vgLogin_3;

	/**
	 * Create the application.
	 */
	public LoginView() {
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
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		setUIcomponents();
	}

	/**
	 * Initialize the components of the frame
	 */
	private void setUIcomponents() {
		loginPanel = new JPanel();
		frame.getContentPane().add(loginPanel, "name_19573713137962");
		loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));

		hbTitle = Box.createHorizontalBox();
		loginPanel.add(hbTitle);

		hgTitle_1 = Box.createHorizontalGlue();
		hbTitle.add(hgTitle_1);

		vbTitle = Box.createVerticalBox();
		hbTitle.add(vbTitle);

		vgTitle_1 = Box.createVerticalGlue();
		vbTitle.add(vgTitle_1);

		hbInnerTitle = Box.createHorizontalBox();
		vbTitle.add(hbInnerTitle);

		hgInnerTitle_1 = Box.createHorizontalGlue();
		hbInnerTitle.add(hgInnerTitle_1);

		lblTitle = new JLabel("DANZA ONLINE");
		hbInnerTitle.add(lblTitle);

		hgInnerTitle_2 = Box.createHorizontalGlue();
		hbInnerTitle.add(hgInnerTitle_2);

		vgTitle_2 = Box.createVerticalGlue();
		vbTitle.add(vgTitle_2);
		
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

		vgLogin_1 = Box.createVerticalGlue();
		loginPanel.add(vgLogin_1);

		hbName = Box.createHorizontalBox();
		loginPanel.add(hbName);
		
		hgName_1 = Box.createHorizontalGlue();
		hbName.add(hgName_1);
		
		lblName = new JLabel("Nombre");
		hbName.add(lblName);
		
		hsName = Box.createHorizontalStrut(47);
		hbName.add(hsName);
		
		txtName = new JTextField();
		txtName.setMaximumSize(new Dimension(100, 30));
		hbName.add(txtName);
		txtName.setColumns(16);
		
		hgName_2 = Box.createHorizontalGlue();
		hbName.add(hgName_2);
		
		vsLogin = Box.createVerticalStrut(5);
		loginPanel.add(vsLogin);
		
		hbPasswd = Box.createHorizontalBox();
		loginPanel.add(hbPasswd);
		
		hgPasswd_1 = Box.createHorizontalGlue();
		hbPasswd.add(hgPasswd_1);
		
		lblPasswd = new JLabel("Contraseña");
		hbPasswd.add(lblPasswd);
		
		hsPasswd = Box.createHorizontalStrut(20);
		hbPasswd.add(hsPasswd);
		
		pwfPasswd = new JPasswordField();
		pwfPasswd.setColumns(16);
		pwfPasswd.setMaximumSize(new Dimension(100, 30));
		hbPasswd.add(pwfPasswd);
		
		hgPasswd_2 = Box.createHorizontalGlue();
		hbPasswd.add(hgPasswd_2);
		
		vgLogin_2 = Box.createVerticalGlue();
		loginPanel.add(vgLogin_2);
		
		hbButtons = Box.createHorizontalBox();
		loginPanel.add(hbButtons);
		
		hgButtons_1 = Box.createHorizontalGlue();
		hbButtons.add(hgButtons_1);
		
		btnRegister = new JButton("Registrarse");
		hbButtons.add(btnRegister);
		
		hgButtons_2 = Box.createHorizontalGlue();
		hbButtons.add(hgButtons_2);
		
		vgLogin_3 = Box.createVerticalGlue();
		loginPanel.add(vgLogin_3);

		registerPanel = new JPanel();
		frame.getContentPane().add(registerPanel, "name_19592999477823");
	}

}
