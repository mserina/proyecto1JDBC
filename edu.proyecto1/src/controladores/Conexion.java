package controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	//Se especifica los datos necesarios para realizar la conexion con la base de datos
		static final String URL = "jdbc:postgresql://localhost:5432/clubMotos";
		static final String USER = "postgres";
		static final String PASS = "123";
		 
		public static Connection crearConexion() throws ClassNotFoundException, SQLException
		{
		//Cargamos los drivers para conectar el proyecto java a la base de datos de postgreSQL 
		Class.forName("org.postgresql.Driver");
		
		//Se mete dentro de una variable "Connection" la instancia del driverManager junto la URL,nombre del propietario y la contraseña de la base de dato 
		Connection conexion = DriverManager.getConnection(URL, USER, PASS);
		
		//Aqui se hace una comprobacion 
		if (conexion != null)
		{
		System.out.println("Conexion establecida...");
		return conexion;
		}
		return null;
		}
}
