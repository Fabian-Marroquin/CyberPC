/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Windows 10
 */
public class FormaDePago {
    private int codigoFormaPago;
    private String formaDePago;

    public FormaDePago() {
    }

    public FormaDePago(int codigoFormaPago, String formaDePago) {
        this.codigoFormaPago = codigoFormaPago;
        this.formaDePago = formaDePago;
    }

    public int getCodigoFormaPago() {
        return codigoFormaPago;
    }

    public void setCodigoFormaPago(int codigoFormaPago) {
        this.codigoFormaPago = codigoFormaPago;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    

    
    
}
