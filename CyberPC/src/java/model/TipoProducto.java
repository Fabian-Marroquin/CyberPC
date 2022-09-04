package model;

/**
 *
 * @author Gerson Matta
 * 
 */

public class TipoProducto {
    
    /* FORMA MYSQL
    
    codigoTipoProducto int not null,
    codigoMarca int not null,
    descripcion varchar (255)  not null,
    primary key PK_codigoTipoProducto (codigoTipoProducto),
	constraint FK_TipoProducto_Marcas foreign key (codigoMarca) references Marcas(codigoMarca)
    
    */
    
    private int codigoTipoProducto;
    private int codigoMarca;
    private String descripcion;

    public TipoProducto() {
    }

    public TipoProducto(int codigoTipoProducto, int codigoMarca, String descripcion) {
        this.codigoTipoProducto = codigoTipoProducto;
        this.codigoMarca = codigoMarca;
        this.descripcion = descripcion;
    }

    public int getCodigoTipoProducto() {
        return codigoTipoProducto;
    }

    public void setCodigoTipoProducto(int codigoTipoProducto) {
        this.codigoTipoProducto = codigoTipoProducto;
    }

    public int getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(int codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

    
    
    
    
    
}
