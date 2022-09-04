
package model;

import java.util.Date;

public class Factura {
    private int codigoFactura;
    private Date fechaFactura;
    private int codigoCliente;
    private int codigoFormaPago;

    public Factura() {
    }

    public Factura(int codigoFactura, Date fechaFactura, int codigoCliente, int codigoFormaPago) {
        this.codigoFactura = codigoFactura;
        this.fechaFactura = fechaFactura;
        this.codigoCliente = codigoCliente;
        this.codigoFormaPago = codigoFormaPago;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoFormaPago() {
        return codigoFormaPago;
    }

    public void setCodigoFormaPago(int codigoFormaPago) {
        this.codigoFormaPago = codigoFormaPago;
    }
    
}
