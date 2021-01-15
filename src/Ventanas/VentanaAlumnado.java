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


	/**
	 * Create the frame.
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
		DefaultListModel<String> model = new DefaultListModel<String>();
		for (int i = 0; i < listaAlumnos.size(); i++)
		{
			model.add(i, listaAlumnos.get(i).toString());
		}

		JList listaAlumnado = new JList(model);
		listaAlumnado.setBounds(54, 65, 322, 151);
		contentPane.add(listaAlumnado);
		
		JButton retroceder = new JButton("Volver");
		retroceder.addActionListener(e -> {
			VentanaAlumnado.this.dispose();
			ventanaAnterior.setVisible(true);
			
		});
		retroceder.setBounds(304, 228, 117, 29);
		contentPane.add(retroceder);
		
		
	}
}
