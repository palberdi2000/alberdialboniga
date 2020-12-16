package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_1;
	private JLabel txtBienvenida;

	/**
	 * Launch the application.
	 */
	public static void Inicio() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Iniciar sesion");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				Login login=new Login();
				login.setVisible(true);
				Inicio.this.dispose();
			}
		});
		btnNewButton.setBounds(62, 112, 117, 29);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(270, 112, 117, 29);
		contentPane.add(btnNewButton_1);
		
		txtBienvenida = new JLabel("BIENVENIDO A LA ACADEMIA");
		txtBienvenida.setBackground(Color.RED);
		txtBienvenida.setBounds(131, 51, 194, 16);
		contentPane.add(txtBienvenida);
	}
}
