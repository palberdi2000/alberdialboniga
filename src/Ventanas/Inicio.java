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

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTextField txtBienvenidoALa;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		
		txtBienvenidoALa = new JTextField();
		txtBienvenidoALa.setBackground(Color.ORANGE);
		txtBienvenidoALa.setText("BIENVENIDO A LA ACADEMIA");
		txtBienvenidoALa.setBounds(120, 25, 195, 26);
		contentPane.add(txtBienvenidoALa);
		txtBienvenidoALa.setColumns(10);
		
		JButton btnNewButton = new JButton("Iniciar sesion");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login login=new Login();
				setVisible(false);
				login.setVisible(true);
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
	}
}
