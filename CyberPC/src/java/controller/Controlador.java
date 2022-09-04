/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;
import modelDAO.*;


public class Controlador extends HttpServlet {
    
    Factura fac = new Factura();
    FacturaDAO facDAO = new FacturaDAO();
    Producto producto = new Producto();
    ProductoDAO productoDAO = new ProductoDAO();
    Clientes cliente = new Clientes();
    ClientesDAO clienteDAO = new ClientesDAO();
    FormaDePago fdp = new FormaDePago();
    FormaDePagoDAO fdpDAO = new FormaDePagoDAO();
    TipoProducto tProducto = new TipoProducto();
    TipoProductoDAO tProductoDAO = new TipoProductoDAO();
    TipoUsuario tUsuario = new TipoUsuario();
    TipoUsuarioDAO tUsuarioDAO = new TipoUsuarioDAO();
    Marcas marca = new Marcas();
    MarcasDAO marcaDAO = new MarcasDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);  
        }else if (menu.equals("Factura")) {
            try {
                if (accion.equals("Listar")) {
                    List listaFacturas = facDAO.listar();
                    request.setAttribute("facturas", listaFacturas);
                }else if (accion.equals("Agregar")) {
                    String fechaFactura = request.getParameter("dtFechaFactura");
                    int codigoCliente = Integer.parseInt(request.getParameter("txtCodigoCliente"));
                    int codigoFormaPago = Integer.parseInt(request.getParameter("txtCodigoFormaPago"));
                    fac.setFechaFactura(new SimpleDateFormat("yyyy-MM-dd").parse(fechaFactura));
                    fac.setCodigoCliente(codigoCliente);
                    fac.setCodigoFormaPago(codigoFormaPago);
                    facDAO.agregar(fac);
                    request.getRequestDispatcher("Controlador?menu=Factura&accion=Listar").forward(request, response);
                }
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            request.getRequestDispatcher("Factura.jsp").forward(request, response);
        }else if (menu.equals("Home")) {
            request.getRequestDispatcher("PrincipalCarousel.jsp").forward(request, response);
        }else if(menu.equals("Producto")){
            
                switch(accion){
                case "Listar" :
                    List listaProductos = productoDAO.listar();
                    request.setAttribute("productos", listaProductos);
                    
                break;
                case "Agregar":
                   String nombre = request.getParameter("txtNombreProducto");
                   String stock = request.getParameter("txtStock");
                   String precio = request.getParameter("txtPrecio");
                   String codigoTipoProducto = request.getParameter("txtTipoProducto");
                   producto.setNombreProducto(nombre);
                   producto.setStock(Integer.parseInt(stock));
                   producto.setPrecio(Integer.parseInt(precio));
                   producto.setCodigoTipoProducto(Integer.parseInt(codigoTipoProducto));
                   productoDAO.Agregar(producto);
                   request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                  
                break;
                
                
                }
             
            request.getRequestDispatcher("Producto.jsp").forward(request, response);
            
        }else if (menu.equals("Cliente")) {
            switch (accion) {
                case "Listar":
                    List listaClientes = clienteDAO.listar();
                    request.setAttribute("clientes", listaClientes);
                    break;
                case "Agregar":
                    String nombreCliente = request.getParameter("txtNombreCliente");
                    String apellidoCliente = request.getParameter("txtApellidoCliente");
                    String telefonoCliente = request.getParameter("txtTelefonoCliente");
                    cliente.setNombreCliente(nombreCliente);
                    cliente.setApellidoCliente(apellidoCliente);
                    cliente.setTelefonoCliente(telefonoCliente);
                    clienteDAO.agregar(cliente);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                    break;
            }
            request.getRequestDispatcher("Clientes.jsp").forward(request, response);
        }else if (menu.equals("FormaDePago")) {
            switch (accion) {
                case "Listar":
                    List listaFDP = fdpDAO.listar();
                    request.setAttribute("formas", listaFDP);
                    break;
                case "Agregar":
                    String tipFP = request.getParameter("txtFormaDePago");
                    fdp.setFormaDePago(tipFP);
                    fdpDAO.agregar(fdp);
                    request.getRequestDispatcher("Controlador?menu=FormaDePago&accion=Listar").forward(request, response);
                    break;
            }
            request.getRequestDispatcher("FormaPago.jsp").forward(request, response);
        }else if (menu.equals("TipoProducto")) {
            switch (accion) {
                case "Listar":
                    List listaTProducto = tProductoDAO.listar();
                    request.setAttribute("tipoProductos", listaTProducto);
                    break;
                case "Agregar":
                    String marca = request.getParameter("txtMarca");
                    String descripcion = request.getParameter("txtDescripcion");
                    tProducto.setCodigoMarca(Integer.parseInt(marca));
                    tProducto.setDescripcion(descripcion);
                    tProductoDAO.agregar(tProducto);
                    request.getRequestDispatcher("Controlador?menu=TipoProducto&accion=Listar").forward(request, response);
                    break;
            }
            
            request.getRequestDispatcher("TipoProducto.jsp").forward(request, response);
        }else if (menu.equals("TipoUsuario")) {
            switch (accion) {
                case "Listar":
                    List listaTUsuario = tUsuarioDAO.listar();
                    request.setAttribute("tipoUsuarios", listaTUsuario);
                    break;
                case "Agregar":
                    String tipUsuario = request.getParameter("txttipoUsuario");
                    tUsuario.setTipoUsuario(tipUsuario);;
                    tUsuarioDAO.agregar(tUsuario);
                    request.getRequestDispatcher("Controlador?menu=TipoUsuario&accion=Listar").forward(request, response);
                    break;
            }
            
            request.getRequestDispatcher("TipoUsuario.jsp").forward(request, response);
        }else if(menu.equals("Marcas")){
            switch(accion){
                case "Listar":
                        List listaMarca = marcaDAO.listar();
                        request.setAttribute("marcas", listaMarca);
                        break;
                case "Agregar":
                        String nombre = request.getParameter("txtNombreMarca");
                        String telefono = request.getParameter("txtNumeroContacto");
                        marca.setNombreMarca(nombre);
                        marca.setNumeroContacto(telefono);
                        marcaDAO.agregar(marca);
                        request.getRequestDispatcher("Controlador?menu=Marcas&accion=Listar").forward(request, response);
                        break;
                case "Editar":

                        break;
                case "Actualizar":

                        break;
                case "Eliminar":

                        break;        
            }
            
            request.getRequestDispatcher("Marca.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
