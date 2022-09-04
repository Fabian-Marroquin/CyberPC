package modelDAO;

import configuration.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.FormaDePago;


public class FormaDePagoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    public List listar(){
        String sql = "select * from FormasDePago";
        
        List<FormaDePago> listaFormaDePago = new ArrayList<FormaDePago>();
        
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                FormaDePago pa = new FormaDePago();
                
                pa.setCodigoFormaPago(rs.getInt(1));
                pa.setFormaDePago(rs.getString(2));
                
                listaFormaDePago.add(pa);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return listaFormaDePago;
    }
    
    public int agregar(FormaDePago pa){
        String sql = "Insert into FormasDePago (formaDePago) values(?)";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pa.getFormaDePago());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se pudo agregar el registro");
        }
        
        return resp;
    }
    
}
