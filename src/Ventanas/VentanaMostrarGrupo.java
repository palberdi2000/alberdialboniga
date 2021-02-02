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

/**
 * 
 * @author Pablo Alberdi
 * @author Julen Alboniga-menor
 *
 */
public class VentanaMostrarGrupo extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumGrupo;
	private JTextField textnuevoAlum;

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
	 * Distribucion de la ventana
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
		
		textnuevoAlum = new JTextField();
		textnuevoAlum.setBounds(159, 240, 130, 26);
		contentPane.add(textnuevoAlum);
		textnuevoAlum.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("IdAlumno:");
		lblNewLabel.setBounds(82, 242, 65, 16);
		contentPane.add(lblNewLabel);
		
		final JList listAlumGrupo = new JList();
		listAlumGrupo.setBounds(30, 75, 288, 124);
		contentPane.add(listAlumGrupo);
		String text = txtNumGrupo.getText();
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(e -> {			//LAMBDA
				
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
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(333, 117, 117, 29);
		contentPane.add(btnEliminar);
		
		JButton btnAñadir = new JButton("Añadir");
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int grupo = Integer.parseInt(text);
				int alum= Integer.parseInt(textnuevoAlum.getText());
				GestorBD.nuevoAlumnoEnGrupo(alum, grupo);
			}
		});
		btnAñadir.setBounds(287, 240, 117, 29);
		contentPane.add(btnAñadir);
		
		
		
	}

	private void JOptionPane(String string) {
		// TODO Auto-generated method stub
		
	}
}
