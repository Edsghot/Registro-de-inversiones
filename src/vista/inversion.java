package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class inversion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inversion frame = new inversion();
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
	public inversion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese monto a invertir:");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		lblNewLabel.setBounds(29, 94, 158, 25);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(194, 95, 126, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblRegistreSuInversion = new JLabel("REGISTRE SU INVERSION");
		lblRegistreSuInversion.setForeground(new Color(0, 0, 0));
		lblRegistreSuInversion.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblRegistreSuInversion.setBounds(148, 31, 172, 25);
		contentPane.add(lblRegistreSuInversion);
		
		JLabel lblEscogaUnaEmpresa = new JLabel("Escoga una empresa:");
		lblEscogaUnaEmpresa.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		lblEscogaUnaEmpresa.setBounds(40, 150, 146, 25);
		contentPane.add(lblEscogaUnaEmpresa);
		
		Choice choice = new Choice();
		choice.setBounds(194, 150, 126, 25);
		contentPane.add(choice);
		
		JLabel lblFechaDeInicio = new JLabel("Fecha de inicio:");
		lblFechaDeInicio.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		lblFechaDeInicio.setBounds(75, 206, 112, 25);
		contentPane.add(lblFechaDeInicio);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_1.setEditable(false);
		textField_1.setBounds(194, 208, 126, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(249, 275, 104, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Regresar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
					try {
						mostrar frame = new mostrar();
						frame.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			
		});
		btnNewButton_1.setBounds(29, 282, 98, 25);
		contentPane.add(btnNewButton_1);
	}
}
