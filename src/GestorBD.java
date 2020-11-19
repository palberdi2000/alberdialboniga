
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
     * Method to create a new table in the BarLink database.
     */
    public static void createTables() {
        String db = "BarLink.db";
        String url = "jdbc:sqlite:" + db;

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String cr1 = "CREATE TABLE ALUMNO";

            String cr2 =

            String cr3 = 

            String cr4 = 

            String cr5 = 
            
            String sql6 = 
            
         //--------------------------------------------------------
            
            String sql7 = "CREATE TABLE IF NOT EXISTS RECEIPT (\n"
                    + "    idReceipt integer NOT NULL,\n"
                    + "    idCommand integer NOT NULL,\n"
                    + "    hour DATETIME NOT NULL,\n"
                    + "    price real,\n"
                    + "    FOREIGN KEY(idCommand) REFERENCES COMMAND(idCommand),\n"
                    + "    PRIMARY KEY(idReceipt, idCommand)\n"
                    + ");";
            String sql8 = "CREATE TABLE IF NOT EXISTS WAREHOUSE_CATEGORY (\n"
                    + "    idWCategory integer NOT NULL PRIMARY KEY,\n"
                    + "    name text NOT NULL\n"
                    + ");";
            String sql9 = "CREATE TABLE IF NOT EXISTS WAREHOUSE_PRODUCT (\n"
                    + "    idWProduct integer NOT NULL,\n"
                    + "    idWCategory integer NOT NULL,\n"
                    + "    name text NOT NULL,\n"
                    + "    amount integer NOT NULL,\n"
                    + "    minimumAmount integer NOT NULL,\n"
                    + "    FOREIGN KEY(idWCategory) REFERENCES WAREHOUSE_CATEGORY(idWCategory),\n"
                    + "    PRIMARY KEY(idWProduct, idWCategory)\n"
                    + ");";

            // Create a the tables
            stmt.execute(cr1);
            stmt.execute(cr2);
            stmt.execute(cr3);
            stmt.execute(cr4);
            stmt.execute(cr5);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createTables();
    }
}