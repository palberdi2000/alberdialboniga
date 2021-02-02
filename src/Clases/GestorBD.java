package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author PabloAlberdi
 * @author JulenAlboni
 */
public class GestorBD {
	
	private static String db = "Academia.db";
    private static String url = "jdbc:sqlite:" + db;
    private static Connection conn;

    /**
     * Method to create a new table in the BarLink database.
     */
    public static void createTables() {
        

        try (Statement stmt = conn.createStatement()) {

            String cr1 = "CREATE TABLE IF NOT EXISTS ALUMNO(ID_ALUMNO INTEGER NOT NULL PRIMARY KEY, NOMBRE TEXT NOT NULL, APELLIDO TEXT NOT NULL, CURSO TEXT NOT NULL)";
      	
            String cr2 = "CREATE TABLE IF NOT EXISTS PROFESOR(ID_PROFESOR INTEGER NOT NULL PRIMARY KEY, NOMBRE TEXT NOT NULL, APELLIDO TEXT NOT NULL)";

            String cr3 = "CREATE TABLE IF NOT EXISTS AULA(ID_AULA INTEGER NOT NULL PRIMARY KEY, NOMBRE TEXT NOT NULL, CAPACIDAD INTEGER NOT NULL)";

            String cr4 = "CREATE TABLE IF NOT EXISTS ASIGNATURA(ID_ASIGNATURA INTEGER NOT NULL PRIMARY KEY, NOMBRE TEXT NOT NULL)";

            String cr5 = "CREATE TABLE IF NOT EXISTS ALUMNO_GRUPO(ID_ALUMNO INTEGER NOT NULL, ID_GRUPO INTEGER NOT NULL)";
            
            String cr6 = "CREATE TABLE IF NOT EXISTS GRUPO(ID_GRUPO INTEGER NOT NULL PRIMARY KEY, ID_PROFESOR INTEGER NOT NULL, ID_AULA INTEGER NOT NULL, ID_ASIGNATURA INTEGER NOT NULL)";   
            
            String cr7 = "CREATE TABLE IF NOT EXISTS USUARIO(EMAIL TEXT NOT NULL PRIMARY KEY, PASSWORD TEXT NOT NULL)";

            // Create a the tables
            stmt.execute(cr1);
            stmt.execute(cr2);
            stmt.execute(cr3);
            stmt.execute(cr4);
            stmt.execute(cr5);
            stmt.execute(cr6);
            stmt.execute(cr7);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void conectar() {
    	try {
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        createTables();
    }
    
    public static boolean nuevoUsuario(String email, String password) {
    	boolean operacionCompletada = false;
    	try {
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO USUARIO VALUES (?,?)");
			pstmt.setString(0, email);
			pstmt.setString(1, password);
			pstmt.execute();
			operacionCompletada = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return operacionCompletada;
    }
    
    /**
     * Metodo para analizar si existe el usuario introducido
     * @param email direccion de correo del usuario
     * @return boolean de si se encuentra en la base
     */
    
    public static boolean existeUsuario(String email) {
    	boolean existe = false;
    	PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement("SELECT * FROM USUARIO WHERE EMAIL = ?");
			pstmt.setString(1, email);
			ResultSet res = pstmt.executeQuery();
			existe = res.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return existe;
    }
    /**
     * Metodo para comprobar si la contraseña introducida existe 
     * @param email direccion de correo del usuario
     * @param password contraseña del usuario
     * @return si ambas son correctas true
     */
    
    public static boolean comprobarContrasena(String email, String password) {
    	boolean correcto = false;
    	PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement("SELECT * FROM USUARIO WHERE EMAIL = ? AND PASSWORD = ?");
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			ResultSet res = pstmt.executeQuery();
			correcto = res.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return correcto;
    }
    
    /**
     * Metodo para obtener los alumnos de la academia
     * @return ArrayList de alumnos
     */
    
    public static ArrayList<Alumno> getAlumnos() {
    	Statement stmt;
    	ArrayList<Alumno> alumnos = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery("SELECT * FROM ALUMNO");
			while (res.next()) {
				alumnos.add(new Alumno(res.getInt("ID_ALUMNO"), res.getString("NOMBRE"), res.getString("APELLIDO")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alumnos;
    }
    
    /**
     * Metodo para mostrar los alumno del grupo solicitado
     * @param grupo id del grupo solicitado
     * @return ArrayList de alumnos
     */
    
    public static ArrayList<Alumno> getAlumnosPorGrupo(int grupo) {
    	PreparedStatement pstmt;
    	ArrayList<Alumno> alumnos = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement("SELECT * FROM ALUMNO WHERE ID_ALUMNO IN (SELECT ID_ALUMNO FROM ALUMNO_GRUPO WHERE ID_GRUPO = ?)");
			pstmt.setInt(1, grupo);
			ResultSet res = pstmt.executeQuery();
			while (res.next()) {
				alumnos.add(new Alumno(res.getInt("ID_ALUMNO"), res.getString("NOMBRE"), res.getString("APELLIDO")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alumnos;
    }
    /**
     * Metodo para añadir un alumno a la base de datos 
     * @param id del alumno nuevo
     * @param nombre del alumno nuevo
     * @param apellido del alumno nuevo
     * @param curso que esta cursando
     */
    public static void nuevoAlumno(int id,String nombre, String apellido, String curso) {
    	
    	try {
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO ALUMNO VALUES (?,?,?,?)");
			pstmt.setInt(1, id);
			pstmt.setString(2, nombre);
			pstmt.setString(3, apellido);
			pstmt.setString(4, curso);
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    	/**
    	 * Metodo para eliminar alumno del listado de la academia
    	 * @param idAlumnoElim identificador del alumno eliminado
    	 */
    public static void eliminarAlumno(int idAlumnoElim) {
    	
			PreparedStatement pstmt;
			try {
				pstmt = conn.prepareStatement("DELETE FROM ALUMNO WHERE ID_ALUMN0=?");
				pstmt.setInt(1, idAlumnoElim);
				pstmt.execute();
				    
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
    
    }
    
    /**
	 * Metodo para eliminar alumno del grupo
	 * @param idAlumnoElim identificador del alumno eliminado del grupo
	 */
    public static void eliminarAlumnoPorGrupo(int idAlumnoElim) {
	
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement("DELETE FROM ALUMNO_GRUPO WHERE ID_ALUMN0=?");
			pstmt.setInt(1, idAlumnoElim);
			pstmt.execute();
			    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
public static void nuevoAlumnoEnGrupo(int idgrupo,int alumno) {
    	
    	try {
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO ALUMNO_GRUPO VALUES (?,?)");
			pstmt.setInt(1, alumno);
			pstmt.setInt(2, idgrupo);
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
 }