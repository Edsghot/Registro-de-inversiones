package Models;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class driver {
	
	conexion co;
		
	public driver() {
		co.conexionBS();
	}

	public void registrar(String usuario,String contraseņa,String nombre,String apellido,String correoElectronico,String telefono,String dni,int edad){
		co.registrar(usuario,contraseņa,nombre,apellido,correoElectronico,telefono,dni,edad);
	}
	
	
}
