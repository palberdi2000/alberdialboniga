package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.GestorBD;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaNuevoAlumno extends JFrame {

	private JPanel contentPane;
	private JTextField textNom;
	private JTextField textApellido;
	private JTextField textCurso;
	private JTextField textId;

	/**
	 * Create the frame.
	 */
	public VentanaNuevoAlumno(JFrame MenuPrincipal) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inserte nombre:");
		lblNewLabel.setBounds(45, 91, 129, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Inserte Apellidos:");
		lblNewLabel_1.setBounds(45, 136, 110, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inserte Curso:");
		lblNewLabel_2.setBounds(45, 176, 110, 16);
		contentPane.add(lblNewLabel_2);
		
		textNom = new JTextField();
		textNom.setBounds(205, 86, 130, 26);
		contentPane.add(textNom);
		textNom.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setBounds(205, 131, 130, 26);
		contentPane.add(textApellido);
		textApellido.setColumns(10);
		
		textCurso = new JTextField();
		textCurso.setBounds(205, 171, 130, 26);
		contentPane.add(textCurso);
		textCurso.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("NUEVO ALUMNO");
		lblNewLabel_3.setBounds(141, 6, 123, 16);
		contentPane.add(lblNewLabel_3);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int idAl = Integer.parseInt(textId.getText());
				GestorBD.nuevoAlumno(idAl,textNom.getText(), textApellido.getText(), textCurso.getText());
			
			}
		});
		btnCrear.setBounds(104, 221, 117, 29);
		contentPane.add(btnCrear);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaNuevoAlumno.this.dispose();
				MenuPrincipal.setVisible(true);
			}
		});
		btnVolver.setBounds(283, 221, 117, 29);
		contentPane.add(btnVolver);
		
		JLabel lblNewLabel_4 = new JLabel("Inserte IdAlumno:");
		lblNewLabel_4.setBounds(47, 49, 127, 16);
		contentPane.add(lblNewLabel_4);
		
		textId = new JTextField();
		textId.setBounds(205, 44, 130, 26);
		contentPane.add(textId);
		textId.setColumns(10);
	}
}
