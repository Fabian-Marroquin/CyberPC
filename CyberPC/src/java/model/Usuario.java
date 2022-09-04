/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author TheSn
 */
public class Usuario {
    
    /* FORMA DE MYSQL
    
    codigoUsuario int not null auto_increment,
    codigoTipoUsuario int not null,
    nombreUsuario varchar(150) not null,
    contrasena varchar(150) not null,
    
    primary key PK_codigoUsuario (codigoUsuario),
        constraint FK_Usuario_TipoUsuario foreign key (codigoTipoUsuario) references TipoUsuario (codigoTipoUsuario)
    
    */
    
    private int codigoUsuario;
    private int codigoTipoUsuario;
    private String nombreUsuario;
    private String contrasena;

    public Usuario() {
    }

    public Usuario(int codigoUsuario, int codigoTipoUsuario, String nombreUsuario, String contrasena) {
        this.codigoUsuario = codigoUsuario;
        this.codigoTipoUsuario = codigoTipoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public int getCodigoTipoUsuario() {
        return codigoTipoUsuario;
    }

    public void setCodigoTipoUsuario(int codigoTipoUsuario) {
        this.codigoTipoUsuario = codigoTipoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    
    
    
}
