package modelDAO;

import configuration.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Clientes;


public class ClientesDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;

    //OPERACIONES DEL CRUD

    //MÉTODO DE LISTAR
    
    public List listar(){
    String sql = "select * from cliente";
    List<Clientes> listaCliente = new ArrayList<Clientes>();
    try{
        con = cn.Conexion();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while(rs.next()){
            Clientes cl = new Clientes();
            cl.setCodigoCliente(rs.getInt(1));
            cl.setNombreCliente(rs.getString(2));
            cl.setApellidoCliente(rs.getString(3));
            cl.setTelefonoCliente(rs.getString(4));
            listaCliente.add(cl);
        }
        
    }catch(Exception e){
        e.printStackTrace();
    }

    return listaCliente;
}
    
    //METODO PARA AGREGAR
    public int agregar(Clientes cl){
       String sql = "Insert into cliente (nombreCliente, apellidoCliente, telefonoCliente) values(?,?,?)";
       try{
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           ps.setString(1, cl.getNombreCliente());
           ps.setString(2, cl.getApellidoCliente());
           ps.setString(3, cl.getTelefonoCliente());
           ps.executeUpdate();
       }catch(Exception e){
           e.printStackTrace();
       
       System.out.println("No se pudo agregar el registro");
    }
    return resp;
    }
    
    
}
