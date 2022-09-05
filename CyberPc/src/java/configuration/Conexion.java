package configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection conexion;
    
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBCyberPc?useSSL=false", "root", "admin"); //cambiar la contraseña si tiene otra
        }catch(Exception e){       
            e.printStackTrace();
            System.out.println("La conexión no se pudo establecer por:"+ e);
        }
    }
    
    public Connection getConection(){
        return conexion;
    }
}
