package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Models.conexion;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registrar extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCorreo;
	private JTextField txtTelefono;
	private JTextField txtDni;
	private JTextField txtEdad;
	private JTextField txtUsuario;
	private JTextField txtContraseña;
	

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

		setResizable(false);
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(84, 75, 77, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(84, 116, 77, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Correo electronico:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 160, 141, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("N\u00BA Telefono:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(55, 202, 106, 22);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("DNI:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(106, 235, 45, 37);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Edad:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(98, 283, 54, 22);
		contentPane.add(lblNewLabel_1_4);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(158, 78, 132, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(158, 119, 132, 20);
		contentPane.add(txtApellido);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(158, 163, 132, 20);
		contentPane.add(txtCorreo);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(158, 205, 132, 20);
		contentPane.add(txtTelefono);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(158, 245, 132, 20);
		contentPane.add(txtDni);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(158, 286, 132, 20);
		contentPane.add(txtEdad);
		
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean band = Login.co.registrar(txtUsuario.getText(), txtContraseña.getText(), txtNombre.getText(), txtApellido.getText(),txtCorreo.getText(), txtTelefono.getText(), txtTelefono.getText(), Integer.parseInt(txtEdad.getText()));
				
				if(band) {
					dispose();
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								mostrar frame = new mostrar();
								frame.setVisible(true);
								frame.setLocationRelativeTo(null);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});	
				}else {
					System.out.println("Ya existe esta registrado, revise si ingreso bien los datos");
				}
								
				
			}
			
		});
		btnRegistrar.setBounds(89, 391, 89, 23);
		contentPane.add(btnRegistrar);
		
		JButton btnCancelar = new JButton("cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Login frame = new Login();
							frame.setVisible(true);
							frame.setLocationRelativeTo(null);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnCancelar.setBounds(220, 391, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsuario.setBounds(84, 39, 77, 22);
		contentPane.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(158, 44, 132, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4_1.setBounds(55, 326, 96, 22);
		contentPane.add(lblNewLabel_1_4_1);
		
		txtContraseña = new JTextField();
		txtContraseña.setColumns(10);
		txtContraseña.setBounds(158, 329, 132, 20);
		contentPane.add(txtContraseña);
	}
}

