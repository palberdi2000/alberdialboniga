package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Pablo Alberdi
 * @author Julen Alboniga-menor
 *
 */
public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void MenuPrincipal() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel txtInicioSesion = new JLabel("Bienvenido ADMINISTRADOR");
		txtInicioSesion.setBounds(115, 23, 227, 16);
		contentPane.add(txtInicioSesion);
		
		JButton btnMostrarGrupo = new JButton("Mostrar Grupo");
		btnMostrarGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaMostrarGrupo pantalla=new VentanaMostrarGrupo();
				pantalla.setVisible(true);
				MenuPrincipal.this.setVisible(false);
			}
		});
		btnMostrarGrupo.setBounds(147, 65, 117, 29);
		contentPane.add(btnMostrarGrupo);
		
		JButton btnAlumado = new JButton("Listado de alumno");
		btnAlumado.addActionListener(e -> {
			MenuPrincipal.this.setVisible(false);
			VentanaAlumnado a=new VentanaAlumnado(MenuPrincipal.this);
			a.setVisible(true);
		});
		btnAlumado.setBounds(123, 110, 169, 29);
		contentPane.add(btnAlumado);
		
		JButton btnNewButton = new JButton("Nuevo alumno");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuPrincipal.this.setVisible(false);
				VentanaNuevoAlumno vent=new VentanaNuevoAlumno(MenuPrincipal.this);
				vent.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(147, 158, 117, 29);
		contentPane.add(btnNewButton);
	}
}
