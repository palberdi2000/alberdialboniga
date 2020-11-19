
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author PabloAlberdi
 * @author JulenAlboni
 */
public class GestorBD {

    /**
     * Metodo creador de tablas
     */
    public static void createTables() {
        String db = "BarLink.db";
        String url = "jdbc:sqlite:" + db;

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String cr1 = "CREATE TABLE ALUMNO(ID_ALUMNO NUMBER NOT NULL PRIMARY KEY, NOMBRE VARCHAR2(25) NOT NULL, APELLIDO VARCHAR2(25) NOT NULL, CURSO VARCHAR2(25) NOT NULL)";
      	
            String cr2 = "CREATE TABLE PROFESOR(ID_PROFESOR NUMBER NOT NULL PRIMARY KEY, NOMBRE VARCHAR2(25) NOT NULL, APELLIDO VARCHAR2(25) NOT NULL)";

            String cr3 = "CREATE TABLE AULA(ID_AULA NUMBER NOT NULL PRIMARY KEY, NOMBRE VARCHAR2(25) NOT NULL, CAPACIDAD NUMBER NOT NULL)";

            String cr4 = "CREATE TABLE ASIGNATURA(ID_ASIGNATURA NUMBER NOT NULL PRIMARY KEY, NOMBRE VARCHAR(25) NOT NULL)";

            String cr5 = "CREATE TABLE ALUMNO_GRUPO(ID_ALUMNO NUMBER NOT NULL, ID_GRUPO NUMBER NOT NULL)";
            
            String cr6 = "CREATE TABLE GRUPO(ID_GRUPO NUMBER NOT NULL PRIMARY KEY, ID_ALUMNO NUMBER NOT NULL, ID_PROFESOR NUMBER NOT NULL, ID_AULA NUMBER NOT NULL, ID_ASIGNATURA NUMBER NOT NULL)";   
            
         
            stmt.execute(cr1);
            stmt.execute(cr2);
            stmt.execute(cr3);
            stmt.execute(cr4);
            stmt.execute(cr5);
            stmt.execute(cr6);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}