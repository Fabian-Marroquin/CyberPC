
package model;

public class TipoUsuario {
    private int codigoTipoUsuario;
    private String tipoUsuario;

    public TipoUsuario() {
    }

    public TipoUsuario(int codigoTipoUsuario, String tipoUsuario) {
        this.codigoTipoUsuario = codigoTipoUsuario;
        this.tipoUsuario = tipoUsuario;
    }

    public int getCodigoTipoUsuario() {
        return codigoTipoUsuario;
    }

    public void setCodigoTipoUsuario(int codigoTipoUsuario) {
        this.codigoTipoUsuario = codigoTipoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
}
