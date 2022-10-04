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
import java.util.Date;
import java.awt.event.ActionEvent;

public class aviso extends JFrame {

	private JPanel contentPane;
	Date fecha = new Date();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aviso frame = new aviso();
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
	public aviso() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 429, 420);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(34, 34, 369, 321);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SE REGISTRO SU INVERSION");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 19));
		lblNewLabel.setBounds(55, 11, 234, 22);
		panel.add(lblNewLabel);
		
		JLabel lblDatos = new JLabel("Datos");
		lblDatos.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
		lblDatos.setBounds(135, 44, 61, 22);
		panel.add(lblDatos);
		
		JLabel lblNombre = new JLabel("Inversionista:");
		lblNombre.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblNombre.setBounds(31, 82, 132, 22);
		panel.add(lblNombre);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblCorreo.setBounds(31, 115, 92, 22);
		panel.add(lblCorreo);
		
		JLabel lblDni = new JLabel("Dni:");
		lblDni.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblDni.setBounds(31, 148, 92, 22);
		panel.add(lblDni);
		
		JLabel lblMontoInvertido = new JLabel("Monto Invertido:");
		lblMontoInvertido.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblMontoInvertido.setBounds(31, 181, 165, 22);
		panel.add(lblMontoInvertido);
		
		JLabel lblPosibleGanancia = new JLabel("Posible ganancia:");
		lblPosibleGanancia.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblPosibleGanancia.setBounds(31, 216, 165, 22);
		panel.add(lblPosibleGanancia);
		
		JLabel lblMontoInvertido_1_1 = new JLabel("porcentaje:");
		lblMontoInvertido_1_1.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblMontoInvertido_1_1.setBounds(31, 253, 107, 22);
		panel.add(lblMontoInvertido_1_1);
		
		JLabel lblMontoInvertido_1_2 = new JLabel("Fecha:");
		lblMontoInvertido_1_2.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		lblMontoInvertido_1_2.setBounds(31, 286, 92, 31);
		panel.add(lblMontoInvertido_1_2);
		
		JLabel lbl1 = new JLabel(Login.co.mostrar()[0]);
		lbl1.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
		lbl1.setBounds(171, 77, 188, 22);
		panel.add(lbl1);
		
		JLabel lbl2 = new JLabel(Login.co.mostrar()[2]);
		lbl2.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
		lbl2.setBounds(111, 110, 248, 22);
		panel.add(lbl2);
		
		JLabel lbl3 = new JLabel(Login.co.mostrar()[3]);
		lbl3.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
		lbl3.setBounds(88, 144, 255, 22);
		panel.add(lbl3);
		
		JLabel lbl4 = new JLabel(Login.co.mostrarInversion()[1]);
		lbl4.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
		lbl4.setBounds(186, 177, 173, 22);
		panel.add(lbl4);
		float por = Float.parseFloat(Login.co.mostrarInversion()[1]) + (Float.parseFloat(Login.co.mostrarInversion()[1])*((Login.co.getPorcentaje()/100)));
		JLabel lbl5 = new JLabel(por+"");
		lbl5.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
		lbl5.setBounds(195, 214, 164, 22);
		panel.add(lbl5);
		
		JLabel lbl6 = new JLabel(Login.co.getPorcentaje()+"");
		lbl6.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
		lbl6.setBounds(145, 249, 214, 22);
		panel.add(lbl6);
		
		JLabel lbl7 = new JLabel(fecha.toLocaleString());
		lbl7.setFont(new Font("Tw Cen MT", Font.PLAIN, 19));
		lbl7.setBounds(111, 286, 248, 22);
		panel.add(lbl7);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
			}
		});
		btnNewButton.setBounds(160, 367, 109, 27);
		contentPane.add(btnNewButton);
	}
}
