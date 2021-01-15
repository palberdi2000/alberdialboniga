package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Alumno;
import Clases.GestorBD;
import Clases.Mergesort;

import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaMostrarGrupo extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumGrupo;

	/**
	 * Launch the application.
	 */
	public static void VentanaMostrarGrupo() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMostrarGrupo frame = new VentanaMostrarGrupo();
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
	public VentanaMostrarGrupo() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumGrup = new JLabel("Numero de Grupo:");
		lblNumGrup.setBounds(30, 28, 150, 16);
		contentPane.add(lblNumGrup);
		
		txtNumGrupo = new JTextField();
		txtNumGrupo.setBounds(200, 23, 73, 26);
		contentPane.add(txtNumGrupo);
		txtNumGrupo.setColumns(10);
		
		final JList listAlumGrupo = new JList();
		listAlumGrupo.setBounds(79, 75, 288, 161);
		contentPane.add(listAlumGrupo);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(e -> {
				String text = txtNumGrupo.getText();
				if(text.equals("")) {
					JOptionPane("RELLENE TEXTO");
				} else {
					int grupo = Integer.parseInt(text);
					ArrayList<Alumno> listaAlumnos = GestorBD.getAlumnosPorGrupo(grupo);
					listaAlumnos = Mergesort.mergesort(listaAlumnos);
					DefaultListModel<String> model = new DefaultListModel<String>();
					for (int i = 0; i < listaAlumnos.size(); i++)
					{
						model.add(i, listaAlumnos.get(i).toString());
					}
					listAlumGrupo.setModel(model);
				}
		});
		btnMostrar.setBounds(287, 22, 115, 29);
		contentPane.add(btnMostrar);
		
	}

	private void JOptionPane(String string) {
		// TODO Auto-generated method stub
		
	}
}
