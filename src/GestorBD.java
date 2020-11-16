package sqlite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import ventanas.Alerta;

/**
 * Clase GestorBD. Funciona para preparar la base de datos que se va a utilizar en la aplicación.
 * @author Unai Arambarri
 * @author Iñaki Segurola
 *
 */
public class GestorBD
{
	private static String nombreBD;
	private static Connection conn;
	
	/**
	 * Método para realizar la conexión con la BD
	 * @param nombreBD El nombre de la BD sin incluir la extensión
	 */
	public static void conectar(String nombreBD)
	{
		GestorBD.nombreBD = nombreBD; 
		
		boolean existeBD = false;
		File baseDeDatos = new File(GestorBD.nombreBD+".db");

		if(baseDeDatos.exists() && !baseDeDatos.isDirectory()) 
		{ 
			existeBD = true;
		}
		
		try 
		{
			conn = DriverManager.getConnection("jdbc:sqlite:"+nombreBD+".db");
		} 
		catch (SQLException e) 
		{
			Alerta.errorSistema("Parece que ha habido un error al establecer conexión con la Base de Datos");
        	e.printStackTrace();
		}
    
		if(!existeBD)
		{
			inicializarBD();
		}
	}
	/**
	 * Metodo para cerrar la conexion con la base de datos
	 */
	public static void desconectar()
	{
		try 
		{
			conn.close();
		} 
		catch (SQLException e) 
		{
			Alerta.errorSistema("Parece que ha habido un error al cerrar la conexión con la Base de Datos");
        	e.printStackTrace();
		}
	}
	/**
	 * Realiza la lectura del sql base de la base de datos y
	 * va llamando a ejecutarSql por cada sentencia de Sql que detecta
	 * @return
	 */
    private static String inicializarBD()
    {
    	String sql = "";
        File ficheroSql = new File("resources/sql/Deusys.sql");

        try 
		{
			FileReader fr = new FileReader(ficheroSql);
			BufferedReader br = new BufferedReader(fr);

			String linea = br.readLine();
			while(linea!=null)
			{
				sql = sql + linea + "\n";
				if(linea.length() >= 2)
				{
					if(linea.substring(linea.length() - 2).equals(");"))
					{
						ejecutarSql(sql);
						sql = "";
					}
				}

				linea = br.readLine();
			}
			br.close();
			fr.close();
		}
		catch (FileNotFoundException e) 
		{
			Alerta.errorSistema("Parece que el fichero SQL no existe");
        	e.printStackTrace();
		} 
		catch (IOException e) 
		{
			Alerta.errorSistema("Parece que ha habido algún problema:\n"+e.getMessage());
        	e.printStackTrace();
		}
		
		return sql;
    }
    
/**
 * Ejecuta una sql para hacer una select
 * @param sql sql que se quiera ejecutar
 * @return El resultado de Select
 */
    public static ResultSet selectSql(String sql)
    {	
    	ResultSet rs = null;
		try 
		{
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} 
		catch (SQLException e) 
		{
			Alerta.errorSistema("Parece que ha habido algún problema:\n"+e.getMessage());
        	e.printStackTrace();
		}
		return rs;
    }
    /**
     * Ejecuta una sql y devuelve si se ha ejecutado correctamente. Cuando se ejecuta la sql no se espera ningun tipo de respuesta que no sea boolean
     * @param sql El codigo sql que se quiera ejecutar
     * @return boolean si se ha hecho correctamente o no.
     */
    public static boolean ejecutarSql(String sql)
    {	
    	boolean ejecucionDone = false;
		try 
		{
			Statement stmt = conn.createStatement();
			int i = stmt.executeUpdate(sql);
			
	        if (i > 0) 
	        {
	        	ejecucionDone = true;
	        } 
		} 
		catch (SQLException e) 
		{
			Alerta.errorSistema("Parece que ha habido algún problema:\n"+e.getMessage());
        	e.printStackTrace();
		}
		return ejecucionDone;
    }
}