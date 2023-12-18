package conexionBD;

import java.sql.*;


/**
 *
 * @author Cecilia
 */
public class conexionBD {

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void Conectar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Institucion", "root", "1999");

            //          JOptionPane.showMessageDialog(null, "BD: Driver existoso");
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException ex) {
            System.out.println("Falló la conexión");
            // JOptionPane.showMessageDialog(null, "BD: Error en driver");
        } catch (SQLException ex) {
//             JOptionPane.showMessageDialog(null, "BD: Error en login");
            System.out.println("Error en Login");

        }
        
    }

}
