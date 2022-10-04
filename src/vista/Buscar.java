package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Buscar extends JFrame {

	private JPanel contentPane;
	private JTextField txtBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buscar frame = new Buscar();
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
	public Buscar() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 524);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblNewLabel.setBounds(167, 27, 103, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("___________________");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblNewLabel_1.setBounds(123, 71, 261, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingrese fecha( dia/mes/a\u00F1o ) registrada de la inversion:");
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(34, 125, 375, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Fecha:");
		lblNewLabel_1_1_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(44, 163, 67, 30);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btnNewButton.setBounds(81, 220, 95, 36);
		contentPane.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setBackground(new Color(0, 128, 128));
		btnCancelar.addActionListener(new ActionListener() {
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
		btnCancelar.setBounds(252, 220, 95, 36);
		contentPane.add(btnCancelar);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(123, 166, 155, 26);
		contentPane.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(34, 277, 375, 205);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("DATOS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(131, 11, 78, 30);
		panel.add(lblNewLabel_2);
		
		JLabel lbl = new JLabel("..");
		lbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl.setBounds(10, 51, 139, 32);
		panel.add(lbl);
		
		JLabel lbl_1 = new JLabel("..");
		lbl_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_1.setBounds(10, 94, 155, 30);
		panel.add(lbl_1);
		
		JLabel lbl_2 = new JLabel("..");
		lbl_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_2.setBounds(10, 128, 155, 30);
		panel.add(lbl_2);
		
		JLabel lbl_3 = new JLabel("..");
		lbl_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_3.setBounds(10, 164, 155, 30);
		panel.add(lbl_3);
		
		JLabel lbl_4 = new JLabel("..");
		lbl_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_4.setBounds(210, 164, 155, 30);
		panel.add(lbl_4);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lbl.setText("USUARIO: "+Login.co.mostrarInversion(txtBuscar.getText())[0]);
				
				lbl_1.setText("MONTO: "+Login.co.mostrarInversion(txtBuscar.getText())[1]);
				
				lbl_2.setText("FECHA: "+Login.co.mostrarInversion(txtBuscar.getText())[2]);
				
				lbl_3.setText("\nID_EMPRESA: "+Login.co.mostrarInversion(txtBuscar.getText())[3]);
				
				lbl_4.setText("\nHORA: "+Login.co.mostrarInversion(txtBuscar.getText())[4]);
			
				
			}
		});
	}
	

}
