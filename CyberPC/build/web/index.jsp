<%-- 
    Document   : index
    Created on : 30/08/2022, 09:52:49 PM
    Author     : Aarón Matta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
        <link rel="icon" href="img/SoloLogoPestaña.png">
        <link rel=stylesheet type="text/css" href="css/styleIndex.css">
        
        <title> Login </title>
        
    </head>
    
    <body>
        
        <div class="container mt-4 col-lg-4">
            
            <div class="card col-sm-10">
                
                <div class="card-body">
                    
                    <form class="form-sign" action="Validar" method="POST">
                        
                        <div class="form-group text-center">
                            
                            <img src="img/Logo.png" alt="70" width="170">
                            
                        </div>
                        
                        <br>
                        
                        <div class="form-group">
                            
                            <label>Usuario:</label>
                            <input type="text" name="txtuser" class="form-control">
                            
                        </div>
                        
                        <br>
                        
                        <div class="form-group">
                            
                            <label>Password:</label>
                            <input type="password" name="txtpass" class="form-control">
                            
                        </div>
                        
                        <br>
                        
                        <input type="submit" name="accion" value="ingresar" class="btn btn-primary btn-block">
                    </form>
                    
                </div>
                
            </div>
            
        </div>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
         
    </body>
</html>
