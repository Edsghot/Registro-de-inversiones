package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(50, 217, 106, 26);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(156, 182, 150, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(156, 219, 150, 26);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.setBounds(184, 270, 92, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.setBounds(174, 316, 117, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Usuario:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(76, 180, 70, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("fondo");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/img/fondo.png")));
		lblNewLabel_2.setBounds(0, -23, 414, 381);
		contentPane.add(lblNewLabel_2);
	}
}
