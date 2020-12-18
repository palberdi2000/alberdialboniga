package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Alumno;
import Clases.GestorBD;

import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;

public class VentanaMostrarGrupo extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumGrupo;
	private ArrayList<Alumno>listaAlumnos;

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
		cargarLista();
		
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
		
		DefaultListModel<String>model = new DefaultListModel<String>();
		for (int i = 0; i < listaAlumnos.size(); i++)
		{
			model.add(i, listaAlumnos.get(i).toString());
		}
		
		JList listAlumGrupo = new JList(model);
		listAlumGrupo.setBounds(79, 75, 288, 161);
		contentPane.add(listAlumGrupo);
		
	}
	
	public void cargarLista()
	{
		int grupo = Integer.parseInt(txtNumGrupo.getText());
		listaAlumnos = GestorBD.getAlumnosPorGrupo(grupo);
	}
}
