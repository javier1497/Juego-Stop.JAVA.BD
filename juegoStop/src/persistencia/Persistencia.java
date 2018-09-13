/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;


//RECORDAR QUE CADA TABLA DE MYSQL ES UNA CLASE AQUI EN JAVA.

//esto no presenta error ya que las librerira MYsql esta agregada 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Persistencia {
    public static Connection con;
    public static Statement areadb;
    
    
    public static boolean conectar()
    {
        //variable para el control de errores
        try
        {
            //esto captura errores tiene la capacidad de comprobar en tiempo real cualquier termino que agregemos.
            //y se puede tomar una decision apenas tome el error.
                Class.forName("com.mysql.jdbc.Driver").newInstance(); //Esta primera linea lo que hace es llamar al driver para podeme conectar.
                con=DriverManager.getConnection("jdbc:mysql://localhost/stop_juego", "root", "root");  //Esto es para conectarnos a la base de datos que queremos entrar.
                //demoadsi = nombre de la base de datos  /// root = el ususario  // dilove = contraseña.
                areadb = con.createStatement();
                System.out.println("Conectado");
        }
        //Esto captura si hay un error.
        catch(ClassNotFoundException se)
        {
               System.out.println("No se ha podido encontrar el driver para MySQL.");
               return false;
        }
        catch (Exception se)
        {
            System.out.println("No se ha podido conectar a la base de datos ");
            return false;
        }

        return true;
    }

    public static boolean desconectar()
    {
        
        try
        {
            //Esto cierra ambas cosas quiere decir que cierra java y msql al tiempo cuando sale.
            areadb.close();
            con.close();
            System.out.println("Desconectado");
            return true;
        } catch(SQLException ex )
            {
                //System.out.println("Conexion_Error");
                return false;
            }catch(NullPointerException u){
                System.out.println("No se ha conectado");
                return false;
            }
    }
}
