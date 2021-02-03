package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Alumno;
import Clases.GestorBD;
import Clases.Mergesort;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Pablo Alberdi
 * @author Julen Alboniga-menor
 *
 */
public class VentanaAlumnado extends JFrame {

	private JPanel contentPane;
	private JList listaAlumnado;

	/**
	 * Distribucion de la ventana
	 */
	public VentanaAlumnado(JFrame ventanaAnterior) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tituloAlumnado = new JLabel("ALUMNADO DE LA ACADEMIA:");
		tituloAlumnado.setBounds(113, 22, 221, 16);
		contentPane.add(tituloAlumnado);
		
		
		ArrayList<Alumno> listaAlumnos = GestorBD.getAlumnos();
		listaAlumnos = Mergesort.mergesort(listaAlumnos);
		DefaultListModel<Alumno> model = new DefaultListModel<Alumno>();
		for (int i = 0; i < listaAlumnos.size(); i++)
		{
			model.add(i, listaAlumnos.get(i));
		}

		listaAlumnado = new JList(model);
		listaAlumnado.setBounds(54, 65, 322, 151);
		contentPane.add(listaAlumnado);
		
		JButton retroceder = new JButton("Volver");
		retroceder.addActionListener(e -> {
			VentanaAlumnado.this.dispose();
			ventanaAnterior.setVisible(true);
			
		});
		retroceder.setBounds(304, 228, 117, 29);
		contentPane.add(retroceder);
		
		JButton btnNewButton = new JButton("Eliminar Alumno");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Alumno x=(Alumno) listaAlumnado.getSelectedValue();
				GestorBD.eliminarAlumno(x.getNombre(), x.getApellido());
				
			}
		});
		btnNewButton.setBounds(63, 228, 148, 29);
		contentPane.add(btnNewButton); 
		
		
	}
}
