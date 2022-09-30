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
import java.util.Date;
import java.awt.event.ActionEvent;

public class inversion extends JFrame {

	private JPanel contentPane;
	private JTextField txtMonto;
	private JTextField txtFecha;
	Date fecha = new Date();
	String fechaA;
	private JTextField txtHora;

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
		
		txtMonto = new JTextField();
		txtMonto.setBounds(194, 95, 126, 25);
		contentPane.add(txtMonto);
		txtMonto.setColumns(10);
		
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
		choice.addItem(Login.co.empresas()[0]);
		choice.addItem(Login.co.empresas()[1]);
		choice.addItem(Login.co.empresas()[2]);
		contentPane.add(choice);
		
		
		
		
		JLabel lblFechaDeInicio = new JLabel("Fecha de inicio:");
		lblFechaDeInicio.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		lblFechaDeInicio.setBounds(75, 206, 112, 25);
		contentPane.add(lblFechaDeInicio);
		
		txtFecha = new JTextField();
		txtFecha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFecha.setEditable(false);
		txtFecha.setBounds(194, 208, 126, 23);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		if(fecha.getDate()<=9) {
			fechaA = "0"+fecha.getDate()+"/0"+(fecha.getMonth()+1)+"/"+(fecha.getYear()+1900);
		}else {
			fechaA = fecha.getDate()+"/0"+(fecha.getMonth()+1)+"/"+(fecha.getYear()+1900);
		}
		
		txtFecha.setText(fechaA);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean band1 = true;
				String id_e = "";
				
				if(choice.getSelectedItem().charAt(2) == '1') {
					id_e = "001";
				}else if(choice.getSelectedItem().charAt(2) == '2') {
					id_e = "002";
				}else if((choice.getSelectedItem().charAt(2) == '3') ) {
					id_e = "003";
				}else {
					band1 = false;
					lblEscogaUnaEmpresa.setVisible(true);
				}
				
				
				if(band1 == true) {
					Login.co.RegistrarInversion(Login.co.mostrar()[5], Float.parseFloat(txtMonto.getText()), fechaA, id_e, txtHora.getText());
					
					dispose();
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
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(256, 296, 104, 32);
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
		btnNewButton_1.setBounds(28, 302, 98, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lbl = new JLabel("Escoja una opcion!!!");
		lbl.setVisible(false);
		lbl.setForeground(Color.RED);
		lbl.setBounds(204, 176, 116, 14);
		contentPane.add(lbl);
		
		JLabel lblHora = new JLabel("HORA:");
		lblHora.setFont(new Font("Tw Cen MT", Font.PLAIN, 16));
		lblHora.setBounds(120, 249, 53, 25);
		contentPane.add(lblHora);
		
		txtHora = new JTextField();
		txtHora.setText((String) null);
		txtHora.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHora.setEditable(false);
		txtHora.setColumns(10);
		txtHora.setBounds(194, 249, 126, 23);
		contentPane.add(txtHora);
		txtHora.setText(fecha.getHours()+":"+fecha.getMinutes());
	}
}
