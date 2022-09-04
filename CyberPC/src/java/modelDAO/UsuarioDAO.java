package modelDAO;


import configuration.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Usuario;


/**
 *
 * @author TheSn
 */
public class UsuarioDAO {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Usuario validar(String usuario, String contrasena){
    
        Usuario us = new Usuario();
        
        String sql = "select * from usuario where nombreUsuario=? and contrasena=?";
        
        try{
            
            con = cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contrasena);
            rs=ps.executeQuery();
            
            while(rs.next()){
                
                us.setCodigoUsuario(rs.getInt("codigoUsuario"));
                us.setCodigoTipoUsuario(rs.getInt("codigoTipoUsuario"));
                us.setNombreUsuario(rs.getString("nombreUsuario"));
                us.setContrasena(rs.getString("contrasena"));
            
            }
            
        
        }catch(Exception e){
        
            e.printStackTrace();
        
        }
        
        return us;
        
    }

    
}
