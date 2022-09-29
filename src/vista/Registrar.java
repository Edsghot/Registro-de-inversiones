package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Registrar extends JFrame {

	private JPanel contentPane;
	private JTextField txtRegistrarNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrar frame = new Registrar();
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
	public Registrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(105, 111, 70, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(105, 138, 70, 34);
		contentPane.add(lblApellido);
		
		JLabel lblCorreoElectronico = new JLabel("Correo electronico:");
		lblCorreoElectronico.setBounds(28, 184, 147, 15);
		contentPane.add(lblCorreoElectronico);
		
		JLabel lblNTelefono = new JLabel("N° Telefono:");
		lblNTelefono.setBounds(79, 222, 96, 15);
		contentPane.add(lblNTelefono);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(139, 259, 70, 15);
		contentPane.add(lblDni);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(127, 290, 70, 15);
		contentPane.add(lblEdad);
		
		txtRegistrarNombre = new JTextField();
		txtRegistrarNombre.setText("registrar nombre");
		txtRegistrarNombre.setBounds(178, 109, 114, 19);
		contentPane.add(txtRegistrarNombre);
		txtRegistrarNombre.setColumns(10);
	}

}
