package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mostrar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mostrar frame = new mostrar();
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
	public mostrar() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 449);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setVisible(false);
		panel_1.setBounds(31, 25, 449, 360);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("BIEVENIDO ");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 22));
		lblNewLabel_1.setBounds(79, 30, 273, 30);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Buscar Registro");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Buscar frame = new Buscar();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_1.setBounds(130, 95, 166, 51);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Registrar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
					try {
						inversion frame = new inversion();
						frame.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				
			}
			
		});
		btnNewButton_1_1.setBounds(130, 174, 166, 51);
		panel_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Ver empresas");
		btnNewButton_1_2.setBounds(130, 255, 166, 51);
		panel_1.add(btnNewButton_1_2);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setBounds(346, 327, 89, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Ver datos");
		
		btnNewButton_3.setBounds(20, 327, 89, 23);
		panel_1.add(btnNewButton_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(31, 26, 448, 354);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATOS DE USUARIO");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		lblNewLabel.setBounds(128, 25, 141, 26);
		panel.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		lblNombre.setBounds(95, 80, 72, 26);
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("APELLIDO:");
		lblApellido.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		lblApellido.setBounds(89, 116, 78, 26);
		panel.add(lblApellido);
		
		JLabel lblCorreoElectronico = new JLabel("CORREO ELECTRONICO:");
		lblCorreoElectronico.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		lblCorreoElectronico.setBounds(10, 156, 145, 26);
		panel.add(lblCorreoElectronico);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		lblDni.setBounds(123, 197, 32, 26);
		panel.add(lblDni);
		
		JLabel lblNTelefono = new JLabel("N\u00BA TELEFONO:");
		lblNTelefono.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		lblNTelefono.setBounds(61, 241, 94, 26);
		panel.add(lblNTelefono);
		
		JButton btnNewButton = new JButton("Siguiente");
		
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(321, 306, 97, 26);
		panel.add(btnNewButton);
		
		JLabel lblNombre_1 = new JLabel("____________________");
		lblNombre_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		lblNombre_1.setBounds(172, 92, 246, 26);
		panel.add(lblNombre_1);
		
		JLabel lblNombre_1_1 = new JLabel("____________________");
		lblNombre_1_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		lblNombre_1_1.setBounds(172, 116, 246, 26);
		panel.add(lblNombre_1_1);
		
		JLabel lblNombre_1_2 = new JLabel("____________________");
		lblNombre_1_2.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		lblNombre_1_2.setBounds(172, 153, 246, 26);
		panel.add(lblNombre_1_2);
		
		JLabel lblNombre_1_3 = new JLabel("____________________");
		lblNombre_1_3.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		lblNombre_1_3.setBounds(172, 197, 246, 26);
		panel.add(lblNombre_1_3);
		
		JLabel lblNombre_1_4 = new JLabel("____________________");
		lblNombre_1_4.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 21));
		lblNombre_1_4.setBounds(165, 241, 246, 26);
		panel.add(lblNombre_1_4);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				panel.setVisible(false);
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				panel_1.setVisible(false);
			}
		});
	}
}
