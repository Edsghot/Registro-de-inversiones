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
	private String DNI;
	private String id;
	

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
	
	public boolean RegistrarInversion(String usuario,Float monto,String fecha,String id_empresa,String hora){
		try{
			PreparedStatement ps = cn.prepareStatement("insert into inversion values(?,?,?,?,?)");
			
			ps.setString(1, usuario);
			ps.setFloat(2, monto);
			ps.setString(3, fecha);
			ps.setString(4, id_empresa);
			ps.setString(5, hora);
			
			this.id = id_empresa;

			ps.executeUpdate();

			return true;
			
		}catch(SQLException ex){
			ex.printStackTrace();
			return false;
		}
	}
	
	public boolean registrar(String usuario,String contraseña,String nombre,String apellido,String correoElectronico,String telefono,String dni,int edad){
		try{
			PreparedStatement ps = cn.prepareStatement("insert into usuario values(?,?,?,?,?,?,?,?)");
			
			ps.setString(1, usuario);
			ps.setString(2, contraseña);
			ps.setString(3, nombre);
			ps.setString(4, apellido);
			ps.setString(5, correoElectronico);
			ps.setString(6, telefono);
			ps.setString(7, dni);
			ps.setInt(8, edad);
			ps.executeUpdate();
			this.DNI = dni;
			
			
			return true;
			
		}catch(SQLException ex){
			ex.printStackTrace();
			return false;
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
	public float getPorcentaje() {
		
		float porcentaje= 0;
		
		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM empresa");
			
			String cadena = " ";
			
				while(rs.next()) {
					
					if(id.equals(rs.getString(1))) {
						porcentaje = rs.getFloat(3);	
					}
			}
	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return porcentaje;
	}
	
	public String[] mostrar() {
		
		int c= 0;
		String arreglo[] = new String[30];
		
		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM usuario ");
			
			String cadena = " ";
			
				while(rs.next()) {
					
					if(DNI.equals(rs.getString(7))) {
						cadena = rs.getString(3);
						arreglo[0] = cadena;
						cadena = rs.getString(4);
						arreglo[1] = cadena;
						cadena = rs.getString(5);
						arreglo[2] = cadena;
						cadena = rs.getString(7);
						arreglo[3] = cadena;
						cadena =rs.getString(6);
						arreglo[4] = cadena;
						cadena =rs.getString(1);
						arreglo[5] = cadena;
						
					}
							
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return arreglo;
	}
	
	public String[] mostrarInversion() {
		
		int c= 0;
		String arreglo[] = new String[30];
		
		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM inversion ");
			
			String cadena = " ";
			
				while(rs.next()) {
					
					if(id.equals(rs.getString(4))) {
						
						cadena = rs.getString(1);
						arreglo[0] = cadena;
						cadena = ""+rs.getFloat(2);
						arreglo[1] = cadena;
						cadena = rs.getString(3);
						arreglo[2] = cadena;
						cadena = rs.getString(4);
						arreglo[3] = cadena;
						cadena =rs.getString(5);
						arreglo[4] = cadena;
						
					}
							
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return arreglo;
	}
	
	public String[] mostrarInversion(String fecha) {
		
		int c= 0;
		String arreglo[] = new String[30];
		
		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM inversion ");
			
			String cadena = " ";
			
				while(rs.next()) {
					
					if(fecha.equals(rs.getString(3))) {
						
						cadena = rs.getString(1);
						arreglo[0] = cadena;
						cadena = ""+rs.getFloat(2);
						arreglo[1] = cadena;
						cadena = rs.getString(3);
						arreglo[2] = cadena;
						cadena = rs.getString(4);
						arreglo[3] = cadena;
						cadena =rs.getString(5);
						arreglo[4] = cadena;
						
					}
							
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
						this.DNI = rs.getString(7);
					}
						
				}
	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return band;
	}
	

	

}
