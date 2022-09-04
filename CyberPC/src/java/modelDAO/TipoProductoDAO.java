package modelDAO;

import configuration.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.TipoProducto;

/**
 *
 * @author Gerson Matta
 * 
 */

public class TipoProductoDAO {
    
    Conexion cn = new Conexion();
    Connection con;
    
    PreparedStatement ps;
    ResultSet rs;
    
    int resp;
    
    
    // METODO DE LISTAR
    
    public List listar(){
        
        String sql = "select * from TipoProducto";
        List<TipoProducto> listaTipoProducto = new ArrayList<TipoProducto>();

        try{

            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()){

                TipoProducto tp = new TipoProducto();
                
                tp.setCodigoTipoProducto(rs.getInt(1));
                tp.setCodigoMarca(rs.getInt(2));
                tp.setDescripcion(rs.getString(3));

                listaTipoProducto.add(tp);

            }

        }catch(Exception e){

            e.printStackTrace();

        }

        return listaTipoProducto;
        
    }
    
    // METODO PARA AGREGAR
    
    public int agregar(TipoProducto tp){
    
        String sql = "insert into TipoProducto (codigoMarca, descripcion) values (?,?)";
        
        try{
            
            con = cn.Conexion();
            ps  = con.prepareStatement(sql);
            ps.setInt(1, tp.getCodigoMarca());
            ps.setString(2, tp.getDescripcion());
            ps.executeUpdate();
            
        }catch(Exception e){
            
            e.printStackTrace();
            System.out.println("No se pudo agregar el registro");
            
        }
        
        return resp;
    
    }
    
}
