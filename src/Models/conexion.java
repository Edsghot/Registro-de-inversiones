package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	
	public String[] empresas() {
		
		int c= 0;
		String arreglo[] = new String[30];
		
		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM empresa");
			
			String cadena = " ";
			
				while(rs.next()) {
					
					cadena = rs.getString(1)+"  "+rs.getString(2)+"   "+rs.getString(3);
					arreglo[c] = cadena;
					c++;
					
			}
	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return arreglo;
	}
	
	public boolean getLogin(String usuario,String contraseña) {
		boolean band=false;
		
		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM usuario");
			
			String cadena = " ";
			
				while(rs.next()) {
					
					if(usuario.equals(rs.getString(1)) && contraseña.equals(rs.getString(2))) {
						band = true;
					}
						
				}
	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return band;
	}
	
	public String mostrar() {
		return "";
	}
	

}
