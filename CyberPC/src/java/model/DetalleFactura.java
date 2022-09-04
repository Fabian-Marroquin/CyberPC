package model;

/**
 *
 * @author dennis perez
 */
public class DetalleFactura {
    private int codigoDetalleFac;
    private String detalles;
    private int codigoFactura;
    private int codigoProducto;

    public DetalleFactura() {
    }

    public DetalleFactura(int codigoDetalleFac, String detalles, int codigoFactura, int codigoProducto) {
        this.codigoDetalleFac = codigoDetalleFac;
        this.detalles = detalles;
        this.codigoFactura = codigoFactura;
        this.codigoProducto = codigoProducto;
    }

    public int getCodigoDetalleFac() {
        return codigoDetalleFac;
    }

    public void setCodigoDetalleFac(int codigoDetalleFac) {
        this.codigoDetalleFac = codigoDetalleFac;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
}
