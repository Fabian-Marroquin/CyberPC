
package modelDAO;
import configuration.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.TipoUsuario;

public class TipoUsuarioDAO {
    Conexion cn = new Conexion(); 
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    //operaciones del crud
    //metodo de listar
    
    public List listar(){
        String sql = "select * from tipoUsuario";
        List<TipoUsuario> listaTipoUsuario = new ArrayList<TipoUsuario>();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                TipoUsuario tp = new TipoUsuario();
                tp.setCodigoTipoUsuario(rs.getInt(1));
                tp.setTipoUsuario(rs.getString(2));
                listaTipoUsuario.add(tp);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return listaTipoUsuario;
    }
    
    //metodo para agregar
    
    public int agregar(TipoUsuario tp){
        String sql = "Insert into tipousuario(tipoUsuario) values (?)";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, tp.getTipoUsuario());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se puedo agregar el registro");
        }
        return resp;
    }
    
    // buscar por codigo
    
    public TipoUsuario listarCodigoTipoUsuario (int id){
        TipoUsuario tu = new TipoUsuario();
        String sql = "Select * from tipousuario where codigoTipoUsuario ="+id;
        
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                tu.setTipoUsuario(rs.getString(2));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return tu;
    }
    
    // metodo para editar
    public int actualizar (TipoUsuario tu){
        String sql = "Update tipousuario set tipousuario = ? where codigoTipoUsuario";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, tu.getTipoUsuario());
            ps.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return resp;
    }
    
    // metodo para eliminar usuario
    public void eliminar(int id){
        String sql = "delete from tipousuario where codigoTipoUsuario ="+id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
