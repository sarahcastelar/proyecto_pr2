package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Conectar {
    
    Connection conectar=null;
    public Connection conexion(){   
            try {
                Class.forName("org.gjt.mm.mysql.Driver");//.newInstance();
                conectar = DriverManager.getConnection("jdbc:mysql://localhost/proyectog", "root", "");
                JOptionPane.showMessageDialog(null, "conectado");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos");
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
            }
            return conectar;
    }
}
