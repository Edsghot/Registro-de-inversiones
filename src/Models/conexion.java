package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class conexion {
	
	Connection cn;
	

	public void conexionBS() {
		String url = "jdbc:sqlite:Registro.db";
		
		try {
			cn = DriverManager.getConnection(url);
			if(cn != null) {
				System.out.println("conectado a base de datos");
			}
		}catch(SQLException ex){
			System.out.println(ex.toString());
		}
	}
	
	
	public void registrar(String usuario,String contraseña,String nombre,String apellido,String correoElectronico,String telefono,String dni,int edad){
		try{
			PreparedStatement ps = cn.prepareStatement("insert into usuario values(?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, usuario);
			ps.setString(2, contraseña);
			ps.setString(3, nombre);
			ps.setString(4, apellido);
			ps.setString(5, correoElectronico);
			ps.setString(6, telefono);
			ps.setString(7, dni);
			ps.setInt(8, edad);
			ps.executeUpdate();
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
	
	

}
