package zona_fit;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion
{
    public static Connection getConnection()
    {
        Connection connection = null;
        String     database   = "zona_fit_db";
        String     url        = "jdbc:mysql://localhost:3306/" + database;
        String     user       = "root";
        String     password   = "admin";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
        }
        catch (Exception e)
        {
            System.out.println("Error al conectarnos a la DB: " + e.getMessage());
        }
        return connection;
    }

    // public static void main(String[] args)
    // {
    //     var connection = Conexion.getConnection();
    //     if (connection != null)
    //         System.out.println("Conexion exitosa: " + connection);
    //     else
    //         System.out.println("No fue posible conectarse a la DB");
    // }
}
