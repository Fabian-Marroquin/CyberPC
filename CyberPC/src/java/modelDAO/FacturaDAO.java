
package modelDAO;

import configuration.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Factura;

public class FacturaDAO {
    
    Conexion conSQL = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    //Metodo de Listar
    public List listar(){
        String sql = "SELECT * FROM Factura";
        List<Factura> listaFactura = new ArrayList<Factura>();
        try {
            con = conSQL.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Factura fac = new Factura();
                fac.setCodigoFactura(rs.getInt(1));
                fac.setFechaFactura(rs.getDate(2));
                fac.setCodigoCliente(rs.getInt(3));
                fac.setCodigoFormaPago(rs.getInt(4));
                listaFactura.add(fac);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        
        return listaFactura;
    }
    
    //Metodo para Agregar
    public int agregar(Factura fac){
        String sql = "INSERT INTO Factura(fechaFactura, codigoCliente, codigoFormaPago) VALUES (?,?,?)";
        try{
            con = conSQL.Conexion();
            ps = con.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(fac.getFechaFactura().getTime()));
            ps.setInt(2, fac.getCodigoCliente());
            ps.setInt(3, fac.getCodigoFormaPago());
            ps.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }
}
