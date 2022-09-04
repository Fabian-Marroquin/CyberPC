package modelDAO;

import configuration.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Producto;





public class ProductoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    
    //Operaciones del CRUD

    public List listar(){
        String sql = "select * from Productos";
        List<Producto> listaProducto = new ArrayList<>();
        
            try{
                con = cn.Conexion();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()){
                    Producto pd = new Producto();
                    pd.setCodigoProducto(rs.getInt(1));
                    pd.setNombreProducto(rs.getString(2));
                    pd.setStock(rs.getInt(3));
                    pd.setPrecio(rs.getInt(4));
                    pd.setCodigoTipoProducto(rs.getInt(5));
                    listaProducto.add(pd);
                }
            }catch(Exception e){
                e.printStackTrace();

            }
        return listaProducto;
    }
    
    //metodo Agregar
    
     public int Agregar(Producto prd){
    
        String sql = "insert into Productos(nombreProducto, stock, precio, codigoTipoProducto) values(?,?,?,?)";
        try{
            con = con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, prd.getNombreProducto());
            ps.setInt(2, prd.getStock());
            ps.setInt(3, prd.getPrecio());
            ps.setInt(4, prd.getCodigoTipoProducto());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se puedo establecer la conexion"+e);
        }
                
                return resp;
    }
    
    
    
}
