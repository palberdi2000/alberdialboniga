package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.GestorBD;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton_1;
	private JTextField txtUsuario;
	private JLabel CONTRASENA;


	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField("Inserte los dastos:");
		textField.setBackground(Color.ORANGE);
		textField.setBounds(130, 19, 145, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(195, 164, 97, 26);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("SALIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(327, 237, 117, 29);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("ACCEDER");
		btnNewButton_1.addActionListener(e -> {
				String usuarioIntro = txtUsuario.getText();
				String contraIntro = passwordField.getText();
				boolean usuarioCorrecto = GestorBD.comprobarContrasena(usuarioIntro, contraIntro);
				if(usuarioCorrecto)
				{
					MenuPrincipal pantalla = new MenuPrincipal();
					pantalla.setVisible(true);
					Login.this.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(Login.this, "Usuario o contraseña incorrectos");
				}
		});
		btnNewButton_1.setBounds(186, 237, 117, 29);
		contentPane.add(btnNewButton_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(145, 86, 130, 26);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel EMAIL = new JLabel("EMAIL:");
		EMAIL.setBounds(75, 91, 61, 16);
		contentPane.add(EMAIL);
		
		CONTRASENA = new JLabel("CONTRASENA:");
		CONTRASENA.setBounds(75, 169, 61, 16);
		contentPane.add(CONTRASENA);
	}
}
