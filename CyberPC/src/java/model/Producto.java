package model;


public class Producto {
    
    private int codigoProducto;
    private String nombreProducto;
    private int stock;
    private int precio;
    private int codigoTipoProducto;

    public Producto() {
    }

    public Producto(int codigoProducto, String nombreProducto, int stock, int precio, int codigoTipoProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.stock = stock;
        this.precio = precio;
        this.codigoTipoProducto = codigoTipoProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCodigoTipoProducto() {
        return codigoTipoProducto;
    }

    public void setCodigoTipoProducto(int codigoTipoProducto) {
        this.codigoTipoProducto = codigoTipoProducto;
    }
    
    
    
    
    
    
}
