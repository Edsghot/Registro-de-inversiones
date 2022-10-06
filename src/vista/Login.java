package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Models.conexion;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField password;
	public static conexion co;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
	public Login() {
		setAutoRequestFocus(false);
		setUndecorated(true);
		co = new conexion();
		co.conexionBS();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("X");
		lbl.setBackground(Color.RED);
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setLabelFor(this);
		lbl.setForeground(Color.WHITE);
		lbl.setFont(new Font("Arial", Font.BOLD, 27));
		lbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl.setForeground(Color.RED);
			}
			
		
			@Override
			public void mouseExited(MouseEvent e) {
				lbl.setForeground(Color.white);
			}
		});
		lbl.setBounds(369, 0, 32, 32);
		contentPane.add(lbl);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\UNIVERSIDAD\\QUINTO SEMESTRE\\INGENIERIA DE SOFTWARE\\proyectos\\Registro-de-inversiones\\src\\img\\LogoUser.jpg"));
		lblNewLabel.setBounds(158, 37, 117, 103);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(27, 217, 106, 26);
		contentPane.add(lblNewLabel_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(139, 182, 150, 26);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(137, 219, 150, 26);
		contentPane.add(password);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(new Color(0, 128, 128));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(Color.white);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(co.getLogin(txtUsuario.getText(), password.getText())) {
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
					txtUsuario.setText("Incorrecta!!");
				}
			}
		});
		btnNewButton.setBounds(74, 279, 92, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_1.setBackground(new Color(0, 128, 128));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				 btnNewButton_1.setBackground(Color.white);
			}
		});
		btnNewButton_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 11));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Registrar frame = new Registrar();
							frame.setVisible(true);
							frame.setLocationRelativeTo(null);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_1.setBounds(232, 279, 117, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Usuario:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(50, 180, 70, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("fondo");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/img/fondo.png")));
		lblNewLabel_2.setBounds(0, 0, 401, 347);
		contentPane.add(lblNewLabel_2);
	}
}
