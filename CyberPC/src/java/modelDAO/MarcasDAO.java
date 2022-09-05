package modelDAO;

import configuration.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Marcas;


public class MarcasDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
public List listar(){
    String sql = "select * from  Marcas";
    List<Marcas> listaMarca = new ArrayList<>();
    try{
        con = cn.Conexion();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while(rs.next()){
            Marcas mc = new Marcas();
            mc.setCodigoMarca(rs.getInt(1));
            mc.setNombreMarca(rs.getString(2));
            mc.setNumeroContacto(rs.getString(3));
            listaMarca.add(mc);
        }
    }catch(Exception e){
        e.printStackTrace();
    }
    return listaMarca;
    }
    
//MÉTODO PARA AGREGAR
    public int agregar(Marcas mar){
        String sql = "insert into Marcas (nombreMarca, numeroContacto) values (?,?)";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, mar.getNombreMarca());
            ps.setString(2, mar.getNumeroContacto());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se pudo agregar marca");
        }
        return resp;
    }
        
         public int actualizar(Marcas mar){
        String sql ="Update Marcas set codigoMarca = ?, nombreMarca = ?,numeroContacto = ?, where codigoMarca";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, mar.getCodigoMarca());
            ps.setString(2, mar.getNombreMarca());
            ps.setString(3, mar.getNumeroContacto());
            ps.executeUpdate();
        }catch(Exception e ){
            e.printStackTrace();
        }
        
        return resp;
    }
}
