<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>Ventana Producto</title>
    </head>
    <body>
        
        
        <div class="d-flex">
            
        <div class="card col-sm-4">
            <div class = card-body">
                
                <form action="Controlador?menu=Producto" method="POST">
                        <div class="form-group">
                        <label> NOMBRE:</label>
                            <input type = "text" name = "txtNombreProducto" class="form-control">
                        </div>
                         <div class="form-group">
                             <label> STOCK:</label>
                            <input type = "text" name = "txtStock" class="form-control">
                        </div>
                        <div class="form-group">
                            <label> PRECIO:</label>
                            <input type = "text" name = "txtPrecio" class="form-control">
                        </div>
                        <div class="form-group">
                            <label> TIPO DE PRODUCTO:</label>
                            <input type = "text" name = "txtTipoProducto" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                        <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                    </form>
                </div>
                
            </div>
                
            <div class="col-sm-8">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <td>CODIGO</td>
                            <td>NOMBRE</td>
                            <td>STOCK</td>
                            <td>PRECIO</td>
                            <td>TIPO DE PRODUCTO</td>
                            <td>ACCIONES</td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="producto" items="${productos}">
                        
                        <tr>
                            <td>${producto.getCodigoProducto()}</td>
                            <td>${producto.getNombreProducto()}</td>
                            <td>${producto.getStock()}</td>
                            <td>${producto.getPrecio()}</td>
                            <td>${producto.getCodigoTipoProducto()}</td>
                            <td>
                                <a class="btn btn-warning" href="">Editar</a>
                                <a class="btn btn-danger" href="">Eliminar</a>
                            </td>
                        </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
           
        </div>
    </body>
</html>